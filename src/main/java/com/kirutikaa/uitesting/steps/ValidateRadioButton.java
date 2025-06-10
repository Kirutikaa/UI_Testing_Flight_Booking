package com.kirutikaa.uitesting.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.kirutikaa.uitesting.steps.CommonSteps.webDriver;

public class ValidateRadioButton {
    //Scenario: 1. As a user i want to validate the flight booking changes with represents radio button selection

    @When("^the radio button is selected as One Way$")
    public void the_radio_button_is_selected_as_one_way() throws InterruptedException {

        WebElement one_way = webDriver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']"));
        one_way.click();
        Thread.sleep(2000);
    }

    @Then("^check the FROM dropdown is displayed$")
    public void check_the_from_dropdown_is_displayed() throws InterruptedException {
        WebElement from_dropdown = webDriver.findElement(By.xpath("//div[@id='marketCityPair_1']//label"));
        from_dropdown.isDisplayed();
        Assert.assertEquals("FROM",from_dropdown.getText());
        Thread.sleep(1000);
        WebElement dropdown = webDriver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']//option[1]"));
        dropdown.isDisplayed();
        Thread.sleep(1000);

    }
    @Then("^check the TO dropdown is displayed$")
    public void check_the_to_dropdown_is_displayed()throws InterruptedException{
        WebElement to_dropdown = webDriver.findElement(By.xpath(""));
        to_dropdown.isDisplayed();
        Assert.assertEquals("TO",to_dropdown.getText());
        Thread.sleep(1000);
        WebElement dropdown = webDriver.findElement(By.xpath(""));
        to_dropdown.isDisplayed();
        Thread.sleep(1000);
    }
    @Then("^click the FROM dropdown$")
    public void click_the_from_dropdown(){

    }

    @Then("^check the FROM dropdown list is display with departure city list$")
    public void check_the_from_dropdown_list_is_display_with_departure_city_list() throws InterruptedException {
        //List<String> list
        for(int i=1; i<14; i++) {
            WebElement city_name = webDriver.findElement(By.xpath("//div[@class='dropdownDiv']//li["+i+"]"));
            Assert.assertEquals("FROM", city_name.getText());
            Thread.sleep(2000);
        }
    }

    @And("^click any city from the departure list$")
    public void click_any_city_from_the_departure_list() throws InterruptedException {
        webDriver.findElement(By.xpath("//div[@class='dropdownDiv']//li[1]")).click();
        Thread.sleep(1500);
    }

    @Then("^check the To dropdown list is present with expected text$")
    public void check_the_to_dropdown_list_is_present_with_expected_text() {

    }
    @Then("^select any city from the list$")
    public void select_any_city_from_the_list(){
        webDriver.findElement(By.xpath("")).click();

    }

    @Then("^hover over the FROM dropdown list it should not display any city$")
    public void hover_over_the_from_dropdown_list_it_should_not_display_any_city() {

    }

    @When("^try to select any one from the departure city list$")
    public void try_to_select_any_one_from_the_departure_city_list() {

    }


    @Then("^check the To dropdown list available to select$")
    public void check_the_To_dropdown_list_available_to_select(){

    }
    @Then("^check the depart date calender is visible and enable$")
    public void check_the_depart_date_calender_is_visible_and_enable() {

    }

    @Then("^check the return date calender is visible but it should be disable$")
    public void check_the_return_date_calender_is_visible_but_it_should_be_disable() {

    }

    @Then("^click the depart calender to select the date$")
    public void click_the_depart_calender_to_select_the_date() {

    }

    @Then("^check the selected date is present in the inbox$")
    public void check_the_selected_date_is_present_in_the_inbox() {

    }

}
