package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AmazonSearchPage;
import pages.AmazonSearchResultsPage;
import pages.BookPage;
import pages.PorceedToCheckoutPage;

public class AmazonSearchPageTest {	
	
	static WebDriver driver = null;
	static String searchPrice = null;
	static String selectedBookPrice = null;
	static String checkOutPrice = null;
	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		amazonSearch();

		searchResults();
		selectedBookPage();
		isBookPriceEqual(searchPrice, selectedBookPrice);
		ProceedToCheckout();
		isBookPriceEqual(selectedBookPrice, checkOutPrice);
		closePage();
	}

	public static void amazonSearch() {		
		AmazonSearchPage searchPageObjects = new AmazonSearchPage(driver);
		driver.get("https://www.amazon.com/");
		searchPageObjects.enterBookName("qa testing for beginners");
		searchPageObjects.hitEnterOnSearch();

	}
	
	  public static void searchResults() {
	  
	  //String capture_BookPrice = null;
		  AmazonSearchResultsPage bookresults= new AmazonSearchResultsPage(driver); 
		  searchPrice = bookresults.store_price_info();
		  bookresults.ClickOnFirstBook();
	  }
	  
	
	public static void selectedBookPage() {
		BookPage bookpage = new BookPage(driver);
		selectedBookPrice = bookpage.getBookPrice();
		bookpage.AddBooktoCart();
	}

	public static void ProceedToCheckout() {
		PorceedToCheckoutPage proceedPage = new PorceedToCheckoutPage(driver);
		checkOutPrice = proceedPage.checkout_price();
		proceedPage.clickOnProceedButton();
	}
	
	public static void isBookPriceEqual(String actualPrice, String expectedPrice) {
		Assert.assertEquals(actualPrice, expectedPrice);
	}
	
	public static void closePage() {
		driver.close();
	}

}
