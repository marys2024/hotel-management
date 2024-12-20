package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
    private static final String REGISTRATION_DESK = "Registration Desk";
    private static final String FORM_REG_BUTTON = "//*[@id=\"view-content\"]/div[2]/form/div/div[2]/button";
    private WebDriver driver;
    private By textUsername = By.id("username");
    private By textPassword = By.id("password");
    private By selectLocation = By.id("location");
    private By buttonLogin = By.xpath("//button[@type='submit' and text()='Login']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginToGivenApp(String username, String password) throws InterruptedException {
        driver.findElement(textUsername).sendKeys(username);
        driver.findElement(textPassword).sendKeys(password);
        driver.findElement(buttonLogin).click();
        Select select = new Select(driver.findElement(selectLocation));
        select.selectByVisibleText(REGISTRATION_DESK);
        driver.findElement(By.xpath(FORM_REG_BUTTON)).click();
        Thread.sleep(5000);
    }
}
