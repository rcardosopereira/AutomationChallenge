package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ShippingPage {

    private WebDriver driver;

    public ShippingPage(WebDriver driver) {
        this.driver = driver;
    }

    public String termsOfServiceSelector(){
        return "uniform-cgv";
    }

    public String proceedToCheckOutSelector(){
        return "//*[@id=\"form\"]/p/button/span";
    }

    public String typeOfPaymentSelector(){ return "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"; }

    public String finalPaymentSelector(){ return "//*[@id=\"cart_navigation\"]/button/span"; }

    public String valueTotalSelector(){ return  "//*[@id=\"total_price\"]"; }
    public String valueTotalIDSelector(){ return  "total_price"; }



    public WebElement getTermsOfService(WebDriverWait wait){
        WebElement termsOfService = wait.until(ExpectedConditions.elementToBeClickable(By.id(termsOfServiceSelector())));
        return termsOfService;
    }

    public WebElement getProceedToCheckOut(WebDriverWait wait){
        WebElement proceedToCheckOut = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(proceedToCheckOutSelector())));
        return proceedToCheckOut;
    }

    public WebElement getTypeOfPayment(WebDriverWait wait){
        WebElement typeOfPayment = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(typeOfPaymentSelector())));
        return typeOfPayment;
    }

    public WebElement getFinalPayment(WebDriverWait wait){
        WebElement finalPayment = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(finalPaymentSelector())));
        return finalPayment;
    }



///////////////////////
    public WebElement getValueTotalSelector(WebDriverWait wait){
        WebElement valueTotalSelector = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(valueTotalSelector())));
        return valueTotalSelector;
    }

    public WebElement getValueTotalID(WebDriverWait wait){
        WebElement valueTotalID = wait.until(ExpectedConditions.elementToBeClickable(By.id(valueTotalIDSelector())));
        return valueTotalID;
    }

}