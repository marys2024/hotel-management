package stepDefinitions;

import appPages.AdminModule;
import drivers.DriverManager;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class AdminStepDefination {

    AdminModule adminModule = new AdminModule(DriverManager.getDriver());

    @Then("user click on the Admin module from the home page")
    public void user_click_on_the_admin_module_from_the_home_page() {
        adminModule.clickOnAdminModule();
    }

    @Then("user is on the admin module page")
    public void user_is_on_the_admin_module_page() {
        Assert.assertTrue(adminModule.csvUpload().isDisplayed());
    }

    @Then("user click on the {string}")
    public void user_click_on_the(String tabName) {
        adminModule.getElemntByLinkText(tabName).click();
    }

    @Then("user select file type as {string}")
    public void user_select_file_type(String fileType) {
        adminModule.selectFile(fileType);
    }
}
