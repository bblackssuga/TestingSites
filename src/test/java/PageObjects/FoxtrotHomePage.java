package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FoxtrotHomePage extends BasePage {

    public FoxtrotHomePage(WebDriver driver) {
        super(driver);
    }

    Actions actions = new Actions(driver);

    public void goToFoxtrot() {
        driver.get("https://www.foxtrot.com.ua/uk");
    }

    public WebElement getCity() {
        return waitElementToBeVisible("//a[@class='button user-confirm-location-button']");
    }

    public void getGamer() {

        waitElementToBeVisible("(//p[contains(text(),'Для геймерів')])[2]").click();
    }

    public WebElement getLaptop() {
        return waitElementToBeVisible("(//a[contains(text(),'Ігрові ноутбуки')])[2]");
    }

    public void getShares() {

        waitElementToBeVisible("(//label[contains(text(),'Акції')])[2]").click();
    }

    public void getBrand() {

        waitElementToBeVisible("//label[@for='sidebar-check-input-9501=107996']").click();
    }

    public void getDiagonal() {

        waitElementToBeVisible("//label[contains(text(),'14\"-14.5')]").click();
    }

    public WebElement getSubmit() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-1000)", "");
        return waitElementToBeVisible("//div[@class='listing__sidebar-range']/following-sibling::input");
    }

    public void getModel() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)", "");
        waitElementToBeVisible("//label[contains(text(),'Lenovo Yoga')]").click();
    }

    public WebElement getShow() {

        return waitElementToBeVisible("//a[@class='listing__submit-apply']");
    }

    public WebElement getSubmitCity() {
        return waitElementToBeVisible("//a[@class='button user-confirm-location-button']");
    }

    public void getActions() {

        waitElementToBeVisible("(//span[@class='icon style-32030'])[2]").click();
    }

    public WebElement getSmartThings() {
        return waitElementToBeVisible("(//a[@title='Коли разом - краще! SmartThings'])[2]");
    }

    public WebElement getCategory() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 300)", "");
        return waitElementToBeVisible("(//p[contains(text(),'Смартфони')])[2]");
    }

    public void getSmartphone() {
        waitElementToBeVisible("//label[contains(text(),'Смартфони та мобільні телефони')]").click();
    }

    public void getChoosePhone() {
        waitElementToBeVisible("//a[@title='Смартфон SAMSUNG Galaxy S23 Ultra SM-S918B 12/512Gb Black (SM-S918BZKHSEK)']").click();
    }

    public WebElement getBuy() {

        return waitElementToBeVisible("(//p[contains(text(),'Купити')])[3]");
    }
}
