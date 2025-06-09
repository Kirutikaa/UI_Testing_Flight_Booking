package com.kirutikaa.uitesting.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.List;

import static com.kirutikaa.uitesting.steps.CommonSteps.*;

public class FlightBookingGeneral {
    String title;
    @Given("^the user wants to call the flight booking site$")
    public void the_user_wants_to_call_the_flight_booking_site() throws InterruptedException {

        title = webDriver.getTitle();
        Thread.sleep(1000);

    }

    @When("^the flight booking site is displayed check the title of the page$")
    public void the_flight_booking_site_is_displayed_check_the_title_of_the_page() throws InterruptedException {
        Assert.assertEquals("QAClickJet - Flight Booking for Domestic and International, Cheap Air Tickets",title);
        Thread.sleep(1000);


    }

    @Then("^user check the given webElements are present in the page$")
    public void user_check_the_given_web_elements_are_present_in_the_page(DataTable dataTable) throws InterruptedException {

        List<String> data = dataTable.row(0);
        WebElement flight = webDriver.findElement(By.xpath("//ul/li/a[@title='Flights']"));
        //addOutLine(flight);
        Assert.assertEquals(data.get(0),flight.getText());
        Thread.sleep(1000);

        List<String> data_hotel = dataTable.row(1);
        WebElement hotel = webDriver.findElement(By.xpath("//ul/li[2]/a[@title='Hotels']"));
        Assert.assertEquals(data_hotel.get(0),hotel.getText());
        Thread.sleep(5000);

        List<String> data_Packages  = dataTable.row(2);
        WebElement Packages = webDriver.findElement(By.xpath("//a[@title='Holiday Packages']"));
        Assert.assertEquals(data_Packages.get(0),Packages.getText());
        Thread.sleep(5000);

        List<String> data_status  = dataTable.row(3);
        WebElement status = webDriver.findElement(By.xpath("//a[@title='Flight Status']"));
        Assert.assertEquals(data_status.get(0),status.getText());
        Thread.sleep(5000);

        List<String> data_Check= dataTable.row(4);
        WebElement Check = webDriver.findElement(By.xpath("//li[@class='web-checkin']"));
        Assert.assertEquals(data_Check.get(0),Check .getText());
        Thread.sleep(5000);

        List<String> data_Manage_Booking  = dataTable.row(5);
        WebElement Manage_Booking = webDriver.findElement(By.xpath("//li/a[@title='Manage Booking']"));
        Assert.assertEquals(data_Manage_Booking.get(0),Manage_Booking.getText());
        Thread.sleep(5000);

    }

    @Then("^check the radio buttons are present with options$")
    public void check_the_radio_buttons_are_present_with_options(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

        webDriver.findElement(By.xpath("//table[@class='tblTrip']"));

        List<String> data = dataTable.row(0);
        WebElement one = webDriver.findElement(By.xpath("//label[@class='select-label']"));
        Assert.assertEquals(data.get(0),one.getText());
        Thread.sleep(1000);

        List<String> data_two = dataTable.row(1);
        WebElement two = webDriver.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_1']"));
        Assert.assertEquals(data_two.get(0),two.getText());
        Thread.sleep(5000);

        List<String> data_multi = dataTable.row(2);
        WebElement multi = webDriver.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_2']"));
        Assert.assertEquals(data_multi.get(0),multi.getText());
        Thread.sleep(5000);
    }

    @Then("^check the submit button is present$")
    public void check_the_submit_button_is_present() {

        webDriver.findElement(By.xpath("//div/span/input[@type='submit']")).isDisplayed();

    }

    //Scenario: 2. As a user i want to validate the flight submit error check

    @Then("^click the submit button$")
    public void click_the_submit_button() throws InterruptedException {
        webDriver.findElement(By.xpath("//div/span/input[@type='submit']")).click();
        Thread.sleep(2000);
    }

    @And("^check for the error message$")
    public void check_for_the_error_messages() throws InterruptedException {

        WebElement error_departure_city = webDriver.findElement(By.xpath("//div[@id='view-origin-station']"));
        error_departure_city.isDisplayed();
        Assert.assertEquals("Select Departure City",error_departure_city.getText());
        Thread.sleep(2000);

        WebElement error_message = webDriver.findElement(By.xpath("//div[@id='view-destination-station']"));
        error_message.isDisplayed();
        Assert.assertEquals("Select Arrival City",error_message.getText());
        Thread.sleep(2000);
    }



    //Scenario: 3. As a user i want to validate the flight booking changes with represents radio button selection

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
