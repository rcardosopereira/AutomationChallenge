package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProductPage {

    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String addToCartSelector(){
       return "//p[contains (@id, \"add_to_cart\")]/button";
    }

    public String proceedToCheckOutSelector(){
        return "//a[contains(@title,\"Proceed to checkout\")]";
    }

    public WebElement getAddToCart(WebDriverWait wait){
        WebElement addToCart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(addToCartSelector())));
        return addToCart;
    }

    public WebElement getProceedToCheckOut(WebDriverWait wait){
        WebElement proceedToCheckOut = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(proceedToCheckOutSelector())));
        return proceedToCheckOut;
    }



}