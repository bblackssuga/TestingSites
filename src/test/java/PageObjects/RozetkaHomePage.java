package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RozetkaHomePage extends BasePage {

    public RozetkaHomePage(WebDriver driver) {
        super(driver);
    }

    Actions actions = new Actions(driver);

    public void goToRozetka() {

        driver.get("https://rozetka.com.ua");
    }

    public WebElement getLogIn() {
        return waitElementToBeVisible("//button[@class='header__button ng-star-inserted']");
    }

    public WebElement getRegister() {
        return waitElementToBeVisible("//button[@class='auth-modal__register-link button button--link ng-star-inserted']");
    }

    public void getName() {

        waitElementToBeVisible("//input[@id='registerUserName']").sendKeys("Лілія");
    }

    public void getSurname() {

        waitElementToBeVisible("//input[@id='registerUserSurname']").sendKeys("Латишева");
    }

    public void getNumber() {

        waitElementToBeVisible("//input[@id='registerUserPhone']").sendKeys("0970981828");
    }

    public void getEmail() {
        waitElementToBeVisible("//input[@id='registerUserEmail']").sendKeys("liliyalatysheva1506@gmail.com");
    }

    public void getPassword() {

        waitElementToBeVisible("//input[@id='registerUserPassword']").sendKeys("Jiminie1506");
    }

    public WebElement getSubmit() {
        return waitElementToBeVisible("//button[@class='button button--large button--green auth-modal__submit']");
    }

    public void getCatalog() {

        waitElementToBeVisible("//button[@id='fat-menu']").click();
    }

    public void getChooseCategory() {
        waitElementToBeVisible("//a[contains(text(),'Смартфони, ТВ і електроніка')]").click();
    }

    public void getChooseType() {

        waitElementToBeVisible("//span[contains(text(),' Apple iPhone ')]").click();
    }

    public void getChooseIPhone() {
        waitElementToBeVisible("//a[@title='Мобільний телефон Apple iPhone 13 128GB Midnight (MLPF3HU/A)']").click();
    }

    public void getBuy2() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 150)", "");
        waitElementToBeVisible("//button[@class='buy-button button button--with-icon button--green button--medium buy-button--tile ng-star-inserted']").click();
    }

    public void getSubmit4() {
        waitElementToBeVisible("//a[@class='button button_size_large button_color_green cart-receipt__submit ng-star-inserted']").click();
    }

    public void getCity() {
        waitElementToBeVisible("//button[@class='button button--with-icon button--white deliveries__city ng-star-inserted']").click();
    }

    public void getChooseCity() {
        waitElementToBeVisible("//a[contains(text(),'Київ')]").click();
    }

    public void getApply() {
        waitElementToBeVisible("//button[contains(text(),'Застосувати')]").click();
    }

    public void getChooseDeliver() {
        waitElementToBeVisible("//span[contains(text(),'Самовивіз з Нової Пошти')]").click();
    }

    public void getDepartment() {
        waitElementToBeVisible("//button[@aria-label='Вибрати адресу доставки']").click();
    }

    public void getWriteDepartment() {
        waitElementToBeVisible("//input[@id='searchPickupDelivery']").sendKeys("№1, вул. Пирогівський шлях, 135");
    }

    public void getChooseDepartment() {
        waitElementToBeVisible("//span[contains(text(),'№1, вул. Пирогівський шлях, 135')]").click();
    }
}
