package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SearchResultsPage {

    private WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String productImageSelector(){
       return "product_img_link";
    }

    public WebElement getProductImage(WebDriverWait wait){
        WebElement productImage = wait.until(ExpectedConditions.elementToBeClickable(By.className(productImageSelector())));
        return productImage;
    }



}