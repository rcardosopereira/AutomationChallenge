package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CreateAnAccountPage {

    private WebDriver driver;

    public CreateAnAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement typeGender() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("id_gender")));
        return element;
    }

    public WebElement selectFirstname() {
        WebElement firstname = driver.findElement(By.id("customer_firstname"));
        return firstname;
    }

    public WebElement selectLastname() {
        WebElement lastname = driver.findElement(By.id("customer_lastname"));
        return lastname;
    }

    public WebElement selectPassword() {
        WebElement password = driver.findElement(By.id("passwd"));
        return password;
    }

    public WebElement selectDay() {
        WebElement day = driver.findElement(By.id("days"));
        return day;
    }

    public WebElement selectMonth() {
        WebElement month = driver.findElement(By.id("months"));
        return month;
    }

    public WebElement selectYear() {
        WebElement year = driver.findElement(By.id("years"));
        return year;
    }

    public WebElement selectAddress() {
        WebElement address = driver.findElement(By.id("address1"));
        return address;
    }

    public WebElement selectCity() {
        WebElement city = driver.findElement(By.id("city"));
        return city;
    }

    public WebElement selectState() {
        WebElement state = driver.findElement(By.id("id_state"));
        return state;
    }

    public WebElement selectPostcode() {
        WebElement code = driver.findElement(By.id("postcode"));
        return code;
    }

    public WebElement selectCountry() {
        WebElement country = driver.findElement(By.id("id_country"));
        return country;
    }

    public WebElement selectPhoneMobile() {
        WebElement phone = driver.findElement(By.id("phone_mobile"));
        return phone;
    }

    public WebElement selectSubmitAccount() {
        WebElement account = driver.findElement(By.id("submitAccount"));
        return account;
    }


    //SETTERS
    public void selectFirstname(String firstname) {
        WebElement selectFirstname = this.selectFirstname();
        selectFirstname.sendKeys(firstname);
    }

    public void selectLastname(String lastname) {
        WebElement selectLastname = this.selectLastname();
        selectLastname.sendKeys(lastname);
    }

    public void selectPassword(String password) {
        WebElement selectPassword = this.selectPassword();
        selectPassword.sendKeys(password);
    }

    public void selectDay(String day) {
        WebElement selectDay = this.selectDay();
        selectDay.sendKeys(day);
    }

    public void selectMonth(String month) {
        WebElement selectMonth = this.selectMonth();
        selectMonth.sendKeys(month);
    }

    public void selectYear(String year) {
        WebElement selectYear = this.selectYear();
        selectYear.sendKeys(year);
    }

    public void selectAddress(String address) {
        WebElement selectAddress = this.selectAddress();
        selectAddress.sendKeys(address);
    }

    public void selectCity(String city) {
        WebElement selectCity = this.selectCity();
        selectCity.sendKeys(city);
    }

    public void selectState(String state) {
        WebElement selectState = this.selectState();
        selectState.sendKeys(state);
    }

    public void selectPostcode(String code) {
        WebElement selectPostcode = this.selectPostcode();
        selectPostcode.sendKeys(code);
    }

    public void selectCountry(String country) {
        WebElement selectCountry = this.selectCountry();
        selectCountry.sendKeys(country);
    }

    public void selectPhoneMobile(String phone) {
        WebElement selectPhoneMobile = this.selectPhoneMobile();
        selectPhoneMobile.sendKeys(phone);
    }

    public void selectSubmitAccount(String account) {
        WebElement selectSubmitAccount = this.selectSubmitAccount();
        selectSubmitAccount.sendKeys(account);
    }

}