package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AddressPage {

    private WebDriver driver;

    public AddressPage(WebDriver driver) {
        this.driver = driver;
    }

    public String proceedToCheckOutSelector(){
        return "//*[@id=\"center_column\"]/p[2]/a[1]/span";
    }

    public String proceedToCheckOutSelector2(){
        return "//*[@id=\"center_column\"]/form/p/button/span";
    }


    public WebElement getProceedToCheckOut(WebDriverWait wait){
        WebElement proceedToCheckOut = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(proceedToCheckOutSelector())));
        return proceedToCheckOut;
    }

    public WebElement getProceedToCheckOut2(WebDriverWait wait){
        WebElement proceedToCheckOut2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(proceedToCheckOutSelector2())));
        return proceedToCheckOut2;
    }

}