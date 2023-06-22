package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PromHomePage extends BasePage {

    public PromHomePage(WebDriver driver) {

        super(driver);
    }

    public void goToProm() {
        driver.get("https://prom.ua/ua/");
    }

    public WebElement getAccount() {
        return waitElementToBeVisible("//button[@title='Увійти']");
    }

    public WebElement getSignIn() {
        return waitElementToBeVisible("//button[@class='VS-Ex uTnwV YY-wN']");
    }

    public void getNumber() {
        waitElementToBeVisible("//input[@type='tel']").click();
    }

    public void getWriteNumber() {
        waitElementToBeVisible("//input[@type='tel']").sendKeys("970981828");
    }

    public WebElement getSubmit() {
        return waitElementToBeVisible("//button[@id='phoneConfirmButton']");
    }

    public void getResendCode() {
        waitElementToBeVisible("//button[@data-qaid='resend_link']").click();
    }

    public void getSearch() {

        waitElementToBeVisible("//input[@name='search_term']").sendKeys("Кросівки");
    }

    public WebElement getSearchButton() {

        return waitElementToBeVisible("//button[@data-qaid='search_btn']");
    }

    public WebElement getChooseCategory() {

        return waitElementToBeVisible("//a[@title='Кросівки та кеди']");
    }

    public void getCheeper() {
        waitElementToBeVisible("//span[@data-qaid='sort_by_price']").click();
    }

    public void getSex() {
        waitElementToBeVisible("//button[@data-qatype='Стать']").click();
    }

    public void getChooseSex() {
        waitElementToBeVisible("(//span[contains(text(),'Унісекс')])[2]").click();
    }

    public void getSeason() {
        waitElementToBeVisible("//button[@data-qatype='Сезон']").click();
    }

    public void getChooseSeason() {
        waitElementToBeVisible("(//span[contains(text(),'Демісезон')])[2]").click();
    }

    public void getProducer() {
        waitElementToBeVisible("//button[@data-qatype='Виробник']").click();
    }

    public void getChooseProducer() {
        waitElementToBeVisible("//span[contains(text(),'Reebok Classic')]").click();
    }

    public void getMaterial() {
        waitElementToBeVisible("//button[@data-qatype='Матеріал верху']").click();
    }

    public void getChooseMaterial() {
        waitElementToBeVisible("(//span[contains(text(),'Натуральна шкіра')])[2]").click();
    }

    public WebElement getChooseItem() {
        return waitElementToBeVisible("//a[@title='Кросівки унісекс Reebok Classic white білі 37 38 39 40 41 42 43 44 45 46']");
    }

    public void getAddToBasket() {

        waitElementToBeVisible("//button[@class='VS-Ex uTnwV YY-wN vtaL-']").click();
    }

    public void getWrite() {

        waitElementToBeVisible("//input[@name='search_term']").sendKeys("Сумка");
    }

    public void getSearching() {

        waitElementToBeVisible("//button[contains(text(),'Знайти')]").click();
    }

    public WebElement getFemaleBags() {
        return waitElementToBeVisible("//a[@title='Жіночі сумочки і клатчі']");
    }

    public WebElement getMaleBags() {

        return waitElementToBeVisible("//a[@title='Чоловічі сумки та барсетки']");
    }

    public WebElement getSportBags() {

        return waitElementToBeVisible("//a[@title='Міські та спортивні рюкзаки ']");
    }

    public WebElement getBeltBags() {
        return waitElementToBeVisible("//a[@title='Поясні сумки']");

    }

    public WebElement getTravelBags() {

        return waitElementToBeVisible("//a[@title='Дорожні сумки та валізи']");
    }

    public WebElement getMilitaryBags() {
        return waitElementToBeVisible("//a[@title='Армійські спецсумки і рюкзаки']");
    }

    public void getChooseBag() {
        waitElementToBeVisible("//a[@title='Жіноча сумка 3в1 Louis Vuitton Multi Pochette Rose']").click();
    }
}
