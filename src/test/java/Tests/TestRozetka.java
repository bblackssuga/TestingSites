package Tests;

import PageObjects.RozetkaHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRozetka extends TestInit {

    @Test
    public void getSignIn() {
        RozetkaHomePage rozetkaHomePage = new RozetkaHomePage(driver);
        rozetkaHomePage.goToRozetka();
        Assert.assertTrue(rozetkaHomePage.getLogIn().isDisplayed());
        rozetkaHomePage.getLogIn().click();
        sleep(2);
        Assert.assertTrue(rozetkaHomePage.getRegister().isDisplayed());
        rozetkaHomePage.getRegister().click();
        rozetkaHomePage.getName();
        rozetkaHomePage.getSurname();
        sleep(2);
        rozetkaHomePage.getNumber();
        rozetkaHomePage.getEmail();
        sleep(2);
        rozetkaHomePage.getPassword();
        sleep(2);
        Assert.assertTrue(rozetkaHomePage.getSubmit().isDisplayed());
        rozetkaHomePage.getSubmit().click();
        sleep(2);
    }
}
