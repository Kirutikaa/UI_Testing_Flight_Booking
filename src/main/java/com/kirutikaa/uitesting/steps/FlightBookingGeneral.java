package com.kirutikaa.uitesting.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.PrintsPage;
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
    public void user_check_the_given_webElements_are_present_in_the_page(DataTable dataTable) throws InterruptedException {

        List<String> data = dataTable.row(0);
        WebElement flight = webDriver.findElement(By.xpath("//ul/li/a[@title='Flights']"));
        addOutLine(flight);
        Assert.assertEquals(data.get(0),flight.getText());
        removeOutLine(flight);
        Thread.sleep(1000);

        List<String> data_hotel = dataTable.row(1);
        WebElement hotel = webDriver.findElement(By.xpath("//ul/li[2]/a[@title='Hotels']"));
        addOutLine(hotel);
        Assert.assertEquals(data_hotel.get(1),hotel.getText());
        removeOutLine(hotel);
        Thread.sleep(5000);

        List<String> data_Packages  = dataTable.row(2);
        WebElement Packages = webDriver.findElement(By.xpath("//a[@title='Holiday Packages']"));
        addOutLine(Packages);
        Assert.assertEquals(data_Packages.get(0),Packages.getText());
        removeOutLine(Packages);
        Thread.sleep(5000);

        List<String> data_status  = dataTable.row(3);
        WebElement status = webDriver.findElement(By.xpath("//a[@title='Flight Status']"));
        addOutLine(status);
        Assert.assertEquals(data_status.get(0),status.getText());
        removeOutLine(status);
        Thread.sleep(5000);

        List<String> data_Check= dataTable.row(4);
        WebElement Check = webDriver.findElement(By.xpath("//li[@class='web-checkin']"));
        addOutLine(Check);
        Assert.assertEquals(data_Check.get(0),Check .getText());
        removeOutLine(Check);
        Thread.sleep(5000);

        List<String> data_Manage_Booking  = dataTable.row(5);
        WebElement Manage_Booking = webDriver.findElement(By.xpath("//li/a[@title='Manage Booking']"));
        addOutLine(Manage_Booking);
        Assert.assertEquals(data_Manage_Booking.get(0),Manage_Booking.getText());
        removeOutLine(Manage_Booking);
        Thread.sleep(5000);

    }

    @Then("^check the radio buttons are present with options$")
    public void check_the_radio_buttons_are_present_with_options(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

        webDriver.findElement(By.xpath("//table[@class='tblTrip']"));

        List<String> data = dataTable.row(0);
        WebElement one = webDriver.findElement(By.xpath("//label[@class='select-label']"));
        addOutLine(one);
        Assert.assertEquals(data.get(0),one.getText());
        removeOutLine(one);
        Thread.sleep(1000);

        List<String> data_two = dataTable.row(1);
        WebElement two = webDriver.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_1']"));
        addOutLine(two);
        Assert.assertEquals(data_two.get(0),two.getText());
        removeOutLine(two);
        Thread.sleep(5000);

        List<String> data_multi = dataTable.row(2);
        WebElement multi = webDriver.findElement(By.xpath("//label[@for='ctl00_mainContent_rbtnl_Trip_2']"));
        addOutLine(multi);
        Assert.assertEquals(data_multi.get(0),multi.getText());
        removeOutLine(multi);
        Thread.sleep(5000);
    }

    @Then("^check the submit button is present$")
    public void check_the_submit_button_is_present() {

        WebElement submit =webDriver.findElement(By.xpath("//div/span/input[@type='submit']"));
        addOutLine(submit);
        submit.isDisplayed();
        removeOutLine(submit);


    }

}
