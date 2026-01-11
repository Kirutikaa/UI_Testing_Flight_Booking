package com.kirutikaa.uitesting.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.kirutikaa.uitesting.steps.CommonSteps.*;

public class End2End {

    @When("click the round trip radio button")
    public void click_the_round_trip_radio_button() throws InterruptedException {
       WebElement radio = webDriver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']"));
       Thread.sleep(2000);
       addOutLine(radio);
       radio.click();
       removeOutLine(radio);
    }
    @Then("select any one city from Departure city")
    public void select_any_one_city_from_departure_city() throws InterruptedException {
        WebElement depart = webDriver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
        Thread.sleep(2000);
        addOutLine(depart);
        depart.click();
        removeOutLine(depart);
        WebElement depart_city = webDriver.findElement(By.xpath("//a[@text='Ahmedabad (AMD)']"));
        addOutLine(depart_city);
        depart_city.click();
        removeOutLine(depart_city);
    }
    @Then("select any one city from arrival city")
    public void select_any_one_city_from_arrival_city() throws InterruptedException {
        WebElement arrival = webDriver.findElement(By.xpath("//input[@name='ctl00_mainContent_ddl_destinationStation1_CTXT']"));
        Thread.sleep(2000);
        addOutLine(arrival);
        arrival.click();
        WebElement arrival_city = webDriver.findElement(By.xpath("//div/ul/li[8]/a[@value='CJB']"));
        addOutLine(arrival_city);
        Thread.sleep(2000);
        arrival_city.click();
        removeOutLine(arrival_city);
    }
    @Then("select the date to travel & return")
    public void select_the_date_to_travel_return() throws InterruptedException {
        WebElement depart_date = webDriver.findElement(By.xpath("//a[@class='ui-state-default']"));
        Thread.sleep(2000);
        addOutLine(depart_date);
        depart_date.click();
        //removeOutLine(depart_date);

        WebElement arrival = webDriver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']"));
        Thread.sleep(2000);
        addOutLine(arrival);
        arrival.click();
        removeOutLine(arrival);

        WebElement arrival_date = webDriver.findElement(By.xpath("//a[@class='ui-state-default']"));
        Thread.sleep(2000);
        addOutLine(arrival_date);
        arrival_date.click();
        removeOutLine(arrival_date);

    }
    @Then("select the currency type")
    public void select_the_currency_type() throws InterruptedException {
        WebElement click_currency = webDriver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']//option[3]"));
        Thread.sleep(2000);
        addOutLine(click_currency);
        Thread.sleep(2000);
        click_currency.click();
        removeOutLine(click_currency);

    }
    @Then("click the search button")
    public void click_the_search_button() throws InterruptedException {
        WebElement click_submit = webDriver.findElement(By.xpath("//div//input[@type='submit']"));
        Thread.sleep(2000);
        addOutLine(click_submit);
        click_submit.click();
        Thread.sleep(2000);

    }
}
