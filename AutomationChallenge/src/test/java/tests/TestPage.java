package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import base.BaseTest;
import pageObject.*;

import static org.testng.Assert.assertEquals;


public class TestPage extends BaseTest {
    public BaseTest baseTest;
    public WebDriver driver;
    public HomePage homePage;
    public SearchResultsPage searchResultsPage;
    public ProductPage productPage;
    public ShoppingCartSummaryPage shoppingCartSummaryPage;
    public AuthenticationPage authenticationPage;
    public CreateAnAccountPage createAnAccountPage;
    public AddressPage addressPage;
    public ShippingPage shippingPage;

    @BeforeClass
    public void start(){
        baseTest = new BaseTest();
        driver = baseTest.setUp();
        homePage = new HomePage(driver);
        searchResultsPage = new SearchResultsPage(driver);
        productPage = new ProductPage(driver);
        shoppingCartSummaryPage = new ShoppingCartSummaryPage(driver);
        authenticationPage = new AuthenticationPage(driver);
        createAnAccountPage = new CreateAnAccountPage(driver);
        addressPage = new AddressPage(driver);
        shippingPage = new ShippingPage(driver);
    }

    @Test
    public void testSelect() {    //throws InterruptedException {
        baseTest.navigate("http://automationpractice.com/index.php", homePage.searchInputSelector());

        homePage.setSearchInput("Blouse");
        homePage.getSubmitSearch(baseTest.wait).click();

        searchResultsPage.getProductImage(baseTest.wait).click();

        productPage.getAddToCart(baseTest.wait).click();
        productPage.getProceedToCheckOut(baseTest.wait).click();

        shoppingCartSummaryPage.getShoppingCartSummary(baseTest.wait).click();

        authenticationPage.clickLogin().click();
        authenticationPage.emailCreate("rafaelteste@myemail.com");
        authenticationPage.submitCreate().click();

        createAnAccountPage.typeGender().click();
        createAnAccountPage.selectFirstname("Rafael");
        createAnAccountPage.selectLastname("Cardoso Pereira");
        createAnAccountPage.selectPassword("@teste123");
        createAnAccountPage.selectDay("21");
        createAnAccountPage.selectMonth("December");
        createAnAccountPage.selectYear("1982");
        createAnAccountPage.selectAddress("Rua Carlota 123");
        createAnAccountPage.selectCity("Porto Alegre");
        createAnAccountPage.selectState("Texas");
        createAnAccountPage.selectPostcode("90410");
        createAnAccountPage.selectCountry("United States");
        createAnAccountPage.selectPhoneMobile("51991748512");
        createAnAccountPage.selectSubmitAccount().click();

        addressPage.getProceedToCheckOut(baseTest.wait).click();
        addressPage.getProceedToCheckOut2(baseTest.wait).click();

        shippingPage.getTermsOfService(baseTest.wait).click();
        shippingPage.getProceedToCheckOut(baseTest.wait).click();
        shippingPage.getTypeOfPayment(baseTest.wait).click();
        shippingPage.getFinalPayment(baseTest.wait).click();

    }



    @AfterClass
    public void finishTest() {
        // driver.quit();
    }





}
