package Tests;

import PageObjects.NewBalanceHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNewBalance extends TestInit {

    @Test
    public void tryToRegister() {

        NewBalanceHomePage newBalanceHomePage = new NewBalanceHomePage(driver);
        newBalanceHomePage.goToNewBalance();
        sleep(2);
        newBalanceHomePage.getSignIn();
        newBalanceHomePage.getRegistration();
        sleep(2);
        newBalanceHomePage.getEmail();
        newBalanceHomePage.getNumber();
        newBalanceHomePage.getPassword();
        newBalanceHomePage.getPasswordConfirm();
        sleep(2);
        newBalanceHomePage.getSubscribeNews();
        Assert.assertTrue(newBalanceHomePage.getSubmit().isDisplayed());
        sleep(2);
    }
}
