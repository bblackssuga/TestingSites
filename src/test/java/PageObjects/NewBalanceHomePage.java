package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewBalanceHomePage extends BasePage {

    public NewBalanceHomePage(WebDriver driver) {

        super(driver);
    }

    public void goToNewBalance() {
        driver.get("https://newbalance.ua/");
    }

    public void getSignIn() {
        waitElementToBeVisible("//a[@class='js-login-popup icon-user auth auth_top-mobile']").click();
    }

    public void getRegistration() {
        waitElementToBeVisible("//a[@class='nb-popup__link nb-popup-register-link']").click();
    }

    public void getEmail() {
        waitElementToBeVisible("//input[@id='signupform-email']").sendKeys("Latyshevaliliya04@gmail.com");
    }

    public void getNumber() {
        waitElementToBeVisible("//input[@id='signupform-phone']").sendKeys("0970981828");
    }

    public void getPassword() {
        waitElementToBeVisible("//input[@id='signupform-password']").sendKeys("Jiminie1506");
    }

    public void getPasswordConfirm() {
        waitElementToBeVisible("//input[@id='signupform-passwordconfirm']").sendKeys("Jiminie1506");
    }

    public void getSubscribeNews() {
        waitElementToBeVisible("//label[@for='signupform-subscribesignupnews']").click();
    }

    public WebElement getSubmit() {

        return waitElementToBeVisible("//button[@name='signup-button']");
    }
}
