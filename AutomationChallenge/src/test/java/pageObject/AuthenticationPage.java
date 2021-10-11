package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AuthenticationPage {

    private WebDriver driver;

    public AuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement emailCreate() {
        WebElement mail = driver.findElement(By.id("email_create"));
        return mail;
    }

    public WebElement submitCreate() {
        WebElement submit = driver.findElement(By.id("SubmitCreate"));
        return submit;
    }

    public WebElement clickLogin() {
        WebElement login = driver.findElement(By.className("login"));
        return login;
    }

    //SETTERS
    public void emailCreate(String mail) {
        WebElement emailCreate = this.emailCreate();
        emailCreate.sendKeys(mail);
    }
}
