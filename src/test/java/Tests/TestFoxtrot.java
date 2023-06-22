package Tests;

import PageObjects.FoxtrotHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFoxtrot extends TestInit {

    @Test
    public void chooseItem() {
        FoxtrotHomePage foxtrotHomePage = new FoxtrotHomePage(driver);
        foxtrotHomePage.goToFoxtrot();
        Assert.assertTrue(foxtrotHomePage.getCity().isDisplayed());
        foxtrotHomePage.getCity().click();
        sleep(2);
        foxtrotHomePage.getGamer();
        Assert.assertTrue(foxtrotHomePage.getLaptop().isDisplayed());
        foxtrotHomePage.getLaptop().click();
        sleep(2);
        foxtrotHomePage.getShares();
        foxtrotHomePage.getBrand();
        foxtrotHomePage.getDiagonal();
        Assert.assertTrue(foxtrotHomePage.getSubmit().isDisplayed());
        foxtrotHomePage.getSubmit().click();
        sleep(2);
        foxtrotHomePage.getModel();
        sleep(2);
        Assert.assertTrue(foxtrotHomePage.getShow().isDisplayed());
        foxtrotHomePage.getShow().click();
        sleep(2);
    }

    @Test
    public void choosePhone() {
        FoxtrotHomePage foxtrotHomePage = new FoxtrotHomePage(driver);
        foxtrotHomePage.goToFoxtrot();
        Assert.assertTrue(foxtrotHomePage.getSubmitCity().isDisplayed());
        foxtrotHomePage.getSubmitCity().click();
        sleep(2);
        foxtrotHomePage.getActions();
        Assert.assertTrue(foxtrotHomePage.getSmartThings().isDisplayed());
        foxtrotHomePage.getSmartThings().click();
        sleep(2);
        Assert.assertTrue(foxtrotHomePage.getCategory().isDisplayed());
        foxtrotHomePage.getCategory().click();
        foxtrotHomePage.getSmartphone();
        sleep(2);
        foxtrotHomePage.getChoosePhone();
        Assert.assertTrue(foxtrotHomePage.getBuy().isDisplayed());
        foxtrotHomePage.getBuy().click();
        sleep(2);
    }
}
