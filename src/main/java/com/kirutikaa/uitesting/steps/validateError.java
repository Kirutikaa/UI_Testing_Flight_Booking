package com.kirutikaa.uitesting.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.kirutikaa.uitesting.steps.CommonSteps.*;

public class validateError {

    //Scenario: 1. As a user i want to validate the flight submit error check

    @Then("^click the submit button$")
    public void click_the_submit_button() throws InterruptedException {
        WebElement submit= webDriver.findElement(By.xpath("//div/span/input[@type='submit']"));
        addOutLine(submit);
        submit.click();
        removeOutLine(submit);
        Thread.sleep(2000);
    }

    @And("^check for the error message$")
    public void check_for_the_error_messages() throws InterruptedException {

        WebElement error_departure_city = webDriver.findElement(By.xpath("//div[@id='view-origin-station']"));
        addOutLine(error_departure_city);
        error_departure_city.isDisplayed();
        Assert.assertEquals("Select Departure City",error_departure_city.getText());
        removeOutLine(error_departure_city);
        Thread.sleep(2000);

        WebElement error_message = webDriver.findElement(By.xpath("//div[@id='view-destination-station']"));
        addOutLine(error_message);
        error_message.isDisplayed();
        Assert.assertEquals("Select Arrival City",error_message.getText());
        removeOutLine(error_message);
        Thread.sleep(2000);
    }
}
