package appPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OperationTheatreModule extends BaseAction {
    private WebDriver driver;
    private final By btn_operationTheatre = By.id("bahmni.ot");
    private final By btn_OTScheduling = By.xpath("//span[text()='OT Scheduling']");
    private final By btn_newsurgical = By.xpath("//button[@class='back-btn dashboard-link ot-surgical-button']");
    //private final By selectsurgeon = By.cssSelector("select[ng-model='surgicalForm.provider']");
    private final By selectsurgeon = By.xpath("private final By selectsurgeon = By.cssSelector(\"select[ng-model='surgicalForm.provider']\");");
    private final By otTest = By.xpath("//label[@class='location-buttons']");
    private final By startDateTime_btn = By.cssSelector("input[ng-model='surgicalForm.startDatetime']");
    private final By endDateTime_btn = By.cssSelector("input[ng-model='surgicalForm.endDatetime']");

    public OperationTheatreModule(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToOT() throws InterruptedException {
        driver.findElement(btn_operationTheatre).click();
        Thread.sleep(3000);
    }

    public void navigatetoOTtxtbox() {
        driver.findElement(btn_OTScheduling).click();
    }

    public void navigateSurgical() {
        driver.findElement(btn_newsurgical).click();
    }

    public void createSurgicalBlock() {
        selectDropDownValue(driver.findElement(selectsurgeon), "Yogesh Kumar");
        driver.findElement(otTest).click();
        StartandEndTimeSelect(driver.findElement(startDateTime_btn), getCurrentSystemDate(0));
        sleep(1000);
        StartandEndTimeSelect(driver.findElement(endDateTime_btn), getCurrentSystemDate(1));
    }

    public void StartandEndTimeSelect(WebElement ele, String date) {
        ele.clear();
        ele.sendKeys(date + Keys.TAB + date.split(" ")[1]);
        ele.click();
        ele.sendKeys(Keys.TAB);
        ele.sendKeys(date.split(" ")[1]);
    }
}
