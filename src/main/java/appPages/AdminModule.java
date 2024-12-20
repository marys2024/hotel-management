package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminModule {
    private static final By adminModuleBtn = By.xpath("//a[@id='bahmni.admin']");
    private static final By csvUploadBtn = By.xpath("//a[text()='CSV Upload']");
    private final WebDriver driver;

    public AdminModule(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnAdminModule() {
        driver.findElement(adminModuleBtn).click();
    }

    public WebElement csvUpload() {
        return driver.findElement(csvUploadBtn);
    }

    public WebElement getElemntByLinkText(String value) {
        return driver.findElement(By.xpath("//a[text()='" + value + "']"));
    }

    public void selectFile(String fileType) {
        driver.findElement(By.id(fileType)).click();
    }

}
