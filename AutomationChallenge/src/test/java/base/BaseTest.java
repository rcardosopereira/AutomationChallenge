package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;

    public WebDriver setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        return driver;
    }

    public void navigate(String url, String selector) {
        System.out.println("### Navigating to " +url+ " ...");
        driver.get(url);
        System.out.println("### Verifying if the element " +selector+ " is loaded...");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(selector)));
        if (element != null){
            System.out.println("=== Element " +selector+ " successfully loaded.");
        }

    }







}
