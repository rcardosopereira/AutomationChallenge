package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ShoppingCartSummaryPage {

    private WebDriver driver;

    public ShoppingCartSummaryPage(WebDriver driver) {
        this.driver = driver;
    }

    public String addShoppingCartSummarySelector(){
       return "//*[@id=\"center_column\"]/p[2]/a[1]/span/i";
    }


    public WebElement getShoppingCartSummary(WebDriverWait wait){
        WebElement shoppingCartSummary = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(addShoppingCartSummarySelector())));
        return shoppingCartSummary;
    }





}