package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonSearchResultsPage {

	WebDriver driver = null;
	
	public AmazonSearchResultsPage(WebDriver driver) {
		  this.driver= driver;
	  }
	
	By GetFirstBookPrice= By.cssSelector(".a-size-base.a-link-normal.a-text-normal> .a-price > .a-offscreen");
	By clickOnFirstBook= By.cssSelector("img[data-image-index='1']");
	
	
	  public String store_price_info() { 
		String bookprice=  driver.findElement(GetFirstBookPrice).getAttribute("innerHTML"); 
		  return bookprice;
	  }
	 

	public void ClickOnFirstBook() {
		driver.findElement(clickOnFirstBook).click();
	}


}
