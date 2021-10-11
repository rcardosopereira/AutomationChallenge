package pageObject;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String searchInputSelector(){
       return "search_query_top";
    }

    public String submitSearchSelector(){
        return "submit_search";
    }

    //SETTERS
    public void setSearchInput(String searchValue) {
        WebElement searchInput = driver.findElement(By.id(searchInputSelector()));
        searchInput.sendKeys(searchValue);
    }

    public WebElement getSubmitSearch(WebDriverWait wait) {
        WebElement submitSearch = wait.until(ExpectedConditions.elementToBeClickable(By.name(submitSearchSelector())));
        return submitSearch;
    }

}