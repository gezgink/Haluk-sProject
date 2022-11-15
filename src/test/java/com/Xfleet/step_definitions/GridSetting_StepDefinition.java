package com.Xfleet.step_definitions;

import com.Xfleet.pages.GridSettingPage;
import com.Xfleet.utilities.BrowserUtils;
import com.Xfleet.utilities.ConfigurafionReader;
import com.Xfleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class GridSetting_StepDefinition {

    GridSettingPage gridSettingPage =new GridSettingPage();
    Actions actions = new Actions(Driver.getDriver());

    @When("HEthe user  navigates to {string} {string}")
    public void HEthe_user_navigates_to(String tab, String module) {
        gridSettingPage.navigateToModule(tab, module);

    }
    @When("HEthe user click on the grid settings icon")
    public void HEthe_user_click_on_the_grid_settings_icon() {
        BrowserUtils.sleep(10);
        gridSettingPage.gridIcon.click();
    }
    @When("HEGrid Settings should be visible")
    public void HE_grid_settings_should_be_visible() {
        gridSettingPage.gridSettingTitle.isDisplayed();
        BrowserUtils.sleep(2);

        Assert.assertTrue(gridSettingPage.gridSettingTitle.isDisplayed());
    }

    @When("HEthe user type any name on Quick Search box")
    public void HEthe_user_type_any_name_on_quick_search_box() {
        gridSettingPage.quickSearchBox.sendKeys("Id");

    }
    @When("HEthe user find any column")
    public void HEthe_user_find_any_column() {
        BrowserUtils.sleep(3);
        gridSettingPage.IdName.isDisplayed();

        Assert.assertTrue(gridSettingPage.IdName.isDisplayed());

    }
    @When("HEthe user can select any column by clicking")
    public void HEthe_user_can_select_any_column_by_clicking() {
       gridSettingPage.IdName.click();
       BrowserUtils.sleep(3);

    }
    @Then("HEthe user sees check box selected")
    public void HEthe_user_sees_check_box_selected() {
        gridSettingPage.checkBox.isSelected();

        Assert.assertTrue(gridSettingPage.checkBox.isSelected());
    }

    @When("HEthe user dragging and dropping the columns")
    public void HEthe_user_dragging_and_dropping_the_columns() {
        actions.dragAndDrop(gridSettingPage.drag, gridSettingPage.drop);

    }
    @Then("HEthe user arrange the order of the columns")
    public void HEthe_user_arrange_the_order_of_the_columns() {
    Assert.assertTrue(gridSettingPage.drag.isDisplayed());
    BrowserUtils.sleep(2);
    Assert.assertTrue(gridSettingPage.drop.isDisplayed());

    }

    @When("HEthe user make a changes on Grid Settings table")
    public void HEthe_user_make_a_changes_on_grid_settings_table() {
        BrowserUtils.sleep(2);
        gridSettingPage.driver.click();

    }
    @Then("HEthe user sees changes on the Fleet-Vehicles page")
    public void HEthe_user_sees_changes_on_the_fleet_vehicles_page() {
        BrowserUtils.waitFor(2);
        gridSettingPage.driverOnPage.isDisplayed();

        Assert.assertTrue(gridSettingPage.driverOnPage.isDisplayed());

    }
    @When("HEthe user get column name text")
    public void HEthe_user_get_column_name_text() {
        gridSettingPage.columnName.getText();

    }
    /*
    @Then("HEthe user sees column name as given")
    public void HEthe_user_sees_column_name_as_given() {
        Assert.assertTrue(gridSettingPage.columnName.getText());

    }
*/
}
