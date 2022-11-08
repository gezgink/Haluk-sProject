package com.Xfleet.step_definitions;

import com.Xfleet.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class VehicleTableViewPage_StepDefinitions {

    public VehicleTableViewPage_StepDefinitions() {

        PageFactory.initElements(Driver.getDriver(),this);
    }
}
