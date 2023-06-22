package Tests;

import PageObjects.YakabooHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestYakaboo extends TestInit {

    @Test
    public void tryToRegister() {
        YakabooHomePage yakabooHomePage = new YakabooHomePage(driver);
        yakabooHomePage.goToYakaboo();
        Assert.assertTrue(yakabooHomePage.getAccount().isDisplayed());
        yakabooHomePage.getAccount().click();
        Assert.assertTrue(yakabooHomePage.getSignIn().isDisplayed());
        yakabooHomePage.getSignIn().click();
        sleep(2);
        yakabooHomePage.getFirstName();
        yakabooHomePage.getLastName();
        yakabooHomePage.getNumber();
        yakabooHomePage.getEmail();
        yakabooHomePage.getPassword();
        sleep(2);
        yakabooHomePage.getConfirm();
        Assert.assertTrue(yakabooHomePage.getSubmit().isDisplayed());
        yakabooHomePage.getSubmit().click();
        sleep(2);
    }

    @Test
    public void getChooseBook() {
        YakabooHomePage yakabooHomePage = new YakabooHomePage(driver);
        yakabooHomePage.goToYakaboo();
        Assert.assertTrue(yakabooHomePage.getCategory().isDisplayed());
        yakabooHomePage.getCategory().click();
        yakabooHomePage.getChooseType();
        yakabooHomePage.getChoiceReaders();
        Assert.assertTrue(yakabooHomePage.getGenre().isDisplayed());
        yakabooHomePage.getGenre().click();
        sleep(2);
        Assert.assertTrue(yakabooHomePage.getSalesHits().isDisplayed());
        yakabooHomePage.getSalesHits().click();
        yakabooHomePage.getAvailability();
        yakabooHomePage.getUkrainian();
        sleep(2);
        yakabooHomePage.getBook();
        Assert.assertTrue(yakabooHomePage.getBasket().isDisplayed());
        yakabooHomePage.getBasket().click();
        sleep(2);
    }

    @Test
    public void findAndChooseTheBook() {
        YakabooHomePage yakabooHomePage = new YakabooHomePage(driver);
        yakabooHomePage.goToYakaboo();
        yakabooHomePage.getSearch();
        Assert.assertTrue(yakabooHomePage.getFind().isDisplayed());
        yakabooHomePage.getFind().click();
        sleep(2);
        Assert.assertTrue(yakabooHomePage.getExistence().isDisplayed());
        yakabooHomePage.getExistence().click();
        yakabooHomePage.getChooseBook();
        sleep(2);
        Assert.assertTrue(yakabooHomePage.getPurchase().isDisplayed());
        yakabooHomePage.getPurchase().click();
        yakabooHomePage.getTheFirstName();
        yakabooHomePage.getTheLastName();
        yakabooHomePage.getPhone();
        yakabooHomePage.getTheEmail();
        sleep(2);
        yakabooHomePage.getSearchCity();
        Assert.assertTrue(yakabooHomePage.getChooseCity().isDisplayed());
        yakabooHomePage.getChooseCity().click();
        sleep(2);
    }
}
