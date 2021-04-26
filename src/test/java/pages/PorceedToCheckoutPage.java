package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PorceedToCheckoutPage {

WebDriver driver = null;

public PorceedToCheckoutPage(WebDriver driver) {
	  this.driver= driver;
}

By checkout_price= By.cssSelector(".a-color-price.hlb-price.a-inline-block.a-text-bold");
By proceedButton= By.cssSelector("#hlb-ptc-btn-native");


public String checkout_price() {
	return driver.findElement(checkout_price).getAttribute("innerHTML");
}

public void clickOnProceedButton() {
	driver.findElement(proceedButton).click();
}
}
