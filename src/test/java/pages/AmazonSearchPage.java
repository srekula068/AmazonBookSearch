package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class AmazonSearchPage {
	WebDriver driver = null;

  By textbox_search= By.xpath("//*[@id='twotabsearchtextbox']");
  
  
  public AmazonSearchPage(WebDriver driver) {
	  this.driver= driver;
  }
  
  public void enterBookName(String bookName) {
	  driver.findElement(textbox_search).sendKeys(bookName);
  }
  
  public void hitEnterOnSearch() {
	  
	  driver.findElement(textbox_search).sendKeys(Keys.ENTER);
  }

}
