package Tests;

import PageObjects.PromHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestProm extends TestInit {

    @Test
    public void tryToSignIn() {
        PromHomePage promHomePage = new PromHomePage(driver);
        promHomePage.goToProm();
        Assert.assertTrue(promHomePage.getAccount().isDisplayed());
        promHomePage.getAccount().click();
        Assert.assertTrue(promHomePage.getSignIn().isDisplayed());
        promHomePage.getSignIn().click();
        sleep(2);
        promHomePage.getNumber();
        promHomePage.getWriteNumber();
        Assert.assertTrue(promHomePage.getSubmit().isDisplayed());
        promHomePage.getSubmit().click();
        sleep(2);
        promHomePage.getResendCode();
        sleep(2);
    }

    @Test
    public void searchItem() {
        PromHomePage promHomePage = new PromHomePage(driver);
        promHomePage.goToProm();
        promHomePage.getSearch();
        Assert.assertTrue(promHomePage.getSearchButton().isDisplayed());
        promHomePage.getSearchButton().click();
        sleep(2);
        Assert.assertTrue(promHomePage.getChooseCategory().isDisplayed());
        promHomePage.getChooseCategory().click();
        sleep(2);
        promHomePage.getCheeper();
        promHomePage.getSex();
        promHomePage.getChooseSex();
        promHomePage.getSeason();
        promHomePage.getChooseSeason();
        promHomePage.getProducer();
        promHomePage.getChooseProducer();
        promHomePage.getMaterial();
        promHomePage.getChooseMaterial();
        sleep(2);
        Assert.assertTrue(promHomePage.getChooseItem().isDisplayed());
        promHomePage.getChooseItem().click();
        promHomePage.getAddToBasket();
        sleep(2);
    }

    @Test
    public void checkSections() {
        PromHomePage promHomePage = new PromHomePage(driver);
        promHomePage.goToProm();
        promHomePage.getWrite();
        promHomePage.getSearching();
        sleep(2);
        Assert.assertTrue(promHomePage.getFemaleBags().isDisplayed());
        Assert.assertTrue(promHomePage.getMaleBags().isDisplayed());
        Assert.assertTrue(promHomePage.getSportBags().isDisplayed());
        Assert.assertTrue(promHomePage.getBeltBags().isDisplayed());
        Assert.assertTrue(promHomePage.getTravelBags().isDisplayed());
        Assert.assertTrue(promHomePage.getMilitaryBags().isDisplayed());
        sleep(2);
        promHomePage.getFemaleBags().click();
        promHomePage.getChooseBag();
        sleep(2);
    }
}
