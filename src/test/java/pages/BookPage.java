package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookPage {
	WebDriver driver = null;
	
	public BookPage(WebDriver driver) {
		  this.driver= driver;
	}
	
	By Book_price = By.cssSelector("#newBuyBoxPrice");
	By addToCartButton= By.cssSelector("#add-to-cart-button");

	  public String getBookPrice() {
		  String bookPrice=driver.findElement(Book_price).getAttribute("innerHTML");
		  return bookPrice;
	  }
	  public void AddBooktoCart() {
		  driver.findElement(addToCartButton).click();
	  }
}
