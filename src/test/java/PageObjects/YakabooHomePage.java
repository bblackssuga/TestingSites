package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class YakabooHomePage extends BasePage {
    public YakabooHomePage(WebDriver driver) {
        super(driver);
    }

    Actions actions = new Actions(driver);

    public void goToYakaboo() {
        driver.get("https://www.yakaboo.ua/?gclid=CjwKCAjwkLCkBhA9EiwAka9QRt7NUkpvT29fnlNmCOR5hCUD-P3zaEVgp1FUAUF2viNUmrqVn1QjxRoC5HgQAvD_BwE");
    }

    public WebElement getAccount() {

        return waitElementToBeVisible("//button[@class='ui-btn-account']");
    }

    public WebElement getSignIn() {

        return waitElementToBeVisible("//button[@class='ui-btn-link']");
    }

    public void getFirstName() {
        waitElementToBeVisible("//input[@name='reg_firstname']").sendKeys("Ілоннеса");
    }

    public void getLastName() {

        waitElementToBeVisible("//input[@name='reg_lastname']").sendKeys("Коханша");
    }

    public void getNumber() {

        waitElementToBeVisible("//input[@type='tel']").sendKeys("0970981827");
    }

    public void getEmail() {

        waitElementToBeVisible("//input[@name='reg_email']").sendKeys("IlonaKohan@gmail.com");
    }

    public void getPassword() {

        waitElementToBeVisible("//input[@type='password']").sendKeys("I123456789_");
    }

    public void getConfirm() {

        waitElementToBeVisible("//label[@class='ui-default-checkbox']").click();
    }

    public WebElement getSubmit() {
        return waitElementToBeVisible("//button[@class='ui-btn-primary form-reg-submit']");
    }

    public WebElement getCategory() {
        return waitElementToBeVisible("//span[@class='ui-btn-book-categories__title']");
    }

    public void getChooseType() {

        waitElementToBeVisible("//button[contains(text(),'Паперові')]").click();
    }

    public void getChoiceReaders() {

        waitElementToBeVisible("//span[contains(text(),'Вибір читачів')]").click();
    }

    public WebElement getGenre() {
        return waitElementToBeVisible("(//span[contains(text(),'Фантастика та фентезі')])[2]");
    }

    public WebElement getSalesHits() {
        return waitElementToBeVisible("//span[contains(text(),'Хіти продажу')]");
    }

    public void getAvailability() {

        waitElementToBeVisible("//span[contains(text(),'Товари в наявності')]").click();
    }

    public void getUkrainian() {

        waitElementToBeVisible("//span[contains(text(),'Українська')]").click();
    }

    public void getBook() {

        waitElementToBeVisible("(//a[contains(text(),'Доки кава не охолоне')])[1]").click();
    }

    public WebElement getBasket() {
        return waitElementToBeVisible("(//button[contains(text(),'До кошика')])[2]");
    }

    public void getSearch() {

        waitElementToBeVisible("//input[@id='search']").sendKeys("Часодії");
    }

    public WebElement getFind() {

        return waitElementToBeVisible("//button[contains(text(),'Знайти')]");
    }

    public WebElement getExistence() {
        return waitElementToBeVisible("//label[@class='ui-default-checkbox ui-filter-checkbox']//span[contains(text(),'Товари в наявності')]");
    }

    public void getChooseBook() {
        waitElementToBeVisible("//a[@title='Часодії. У 6 книгах. Книга 2. Часове серце']").click();
    }

    public WebElement getPurchase() {
        return waitElementToBeVisible("//div[@class='product-sidebar__ordering']//button[contains(text(),'Купити зараз')]");
    }

    public void getTheFirstName() {
        waitElementToBeVisible("//input[@name='first name']").sendKeys("Лілія");
    }

    public void getTheLastName() {

        waitElementToBeVisible("//input[@name='last name']").sendKeys("Латишева");
    }

    public void getPhone() {

        waitElementToBeVisible("//input[@type='tel']").sendKeys("0970981828");
    }

    public void getTheEmail() {
        waitElementToBeVisible("//input[@name='email']").sendKeys("Latyshevaliliya04@gmail.com");
    }

    public void getSearchCity() {
        waitElementToBeVisible("//input[@placeholder='Введіть назву міста...']").sendKeys("Бровари");
    }

    public WebElement getChooseCity() {

        return waitElementToBeVisible("//li[contains(text(),'Бровари')]");
    }
}