package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private By registrationButton = By.id("bahmni.registration");
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToRegistrationScreen() throws InterruptedException {
        driver.findElement(registrationButton).click();
        Thread.sleep(3000);
    }
}
