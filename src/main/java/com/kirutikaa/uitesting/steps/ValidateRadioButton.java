package com.kirutikaa.uitesting.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static com.kirutikaa.uitesting.steps.CommonSteps.*;

public class ValidateRadioButton {
    //Scenario: 1. As a user i want to validate the flight booking changes with represents radio button selection

    @When("^the radio button is selected as One Way$")
    public void the_radio_button_is_selected_as_one_way() throws InterruptedException {

        WebElement one_way = webDriver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']"));
        addOutLine(one_way);
        one_way.click();
        removeOutLine(one_way);
        Thread.sleep(2000);
    }

    @Then("^check the FROM text and dropdown is displayed$")
    public void check_the_from_dropdown_is_displayed() throws InterruptedException {
        WebElement from_dropdown = webDriver.findElement(By.xpath("//div[@id='marketCityPair_1']//label"));
        addOutLine(from_dropdown);
        from_dropdown.isDisplayed();
        Assert.assertEquals("FROM",from_dropdown.getText());
        removeOutLine(from_dropdown);
        Thread.sleep(1000);
        WebElement dropdown = webDriver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']//option[1]"));
        addOutLine(dropdown);
        dropdown.isDisplayed();
        removeOutLine(dropdown);
        Thread.sleep(1000);

    }
    @Then("^check the TO text and dropdown is displayed$")
    public void check_the_to_dropdown_is_displayed()throws InterruptedException{
        WebElement to_dropdown = webDriver.findElement(By.xpath("//div[@class='right1']//label"));
        addOutLine(to_dropdown);
        to_dropdown.isDisplayed();
        Assert.assertEquals("TO",to_dropdown.getText());
        removeOutLine(to_dropdown);
        Thread.sleep(1000);
    }
    @Then("^click the FROM dropdown$")
    public void click_the_from_dropdown() throws InterruptedException {
        WebElement dropdown = webDriver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));
        addOutLine(dropdown);
        dropdown.click();
        removeOutLine(dropdown);
        Thread.sleep(1000);
    }

    @Then("^check the FROM dropdown list is display with departure city list$")
    public void check_the_from_dropdown_list_is_display_with_departure_city_list(DataTable dataTable) throws InterruptedException {

        List<String> data = dataTable.asList();
        for(int i=1; i<=data.size(); i++) {
            WebElement city_name = webDriver.findElement(By.xpath("//div[@class='dropdownDiv']/ul/li["+i+"]/a[@href='#']"));
            addOutLine(city_name);
            Assert.assertEquals(data.get(i-1), city_name.getText());
            removeOutLine(city_name);
            Thread.sleep(2000);

        }
    }
    @Then("^check the FROM dropdown list1 is display with departure city list$")
    public void check_the_from_dropdown_list1_is_display_with_departure_city_list(DataTable dataTable) throws InterruptedException {
        List<String> data = dataTable.asList();
        for (int i = 1; i <= data.size(); i++) {
            WebElement city_name = webDriver.findElement(By.xpath("//div[@class='dropdownDiv']/ul[2]/li[" + i + "]/a[@href='#']"));
            addOutLine(city_name);
            Assert.assertEquals(data.get(i - 1), city_name.getText());
            removeOutLine(city_name);
            Thread.sleep(2000);
        }
    }
    @Then("^check the FROM dropdown list2 is display with departure city list$")
    public void check_the_from_dropdown_list2_is_display_with_departure_city_list(DataTable dataTable) throws InterruptedException {
        List<String> data = dataTable.asList();
        for (int i = 1; i <= data.size(); i++) {
            WebElement city_name = webDriver.findElement(By.xpath("//div[@class='dropdownDiv']/ul[3]/li[" + i + "]/a[@href='#']"));
            addOutLine(city_name);
            Assert.assertEquals(data.get(i - 1), city_name.getText());
            removeOutLine(city_name);
            Thread.sleep(2000);
        }
    }
    @Then("^check the FROM dropdown list3 is display with departure city list$")
    public void check_the_from_dropdown_list3_is_display_with_departure_city_list(DataTable dataTable) throws InterruptedException {
        List<String> data = dataTable.asList();
        for (int i = 1; i <= data.size(); i++) {
            WebElement city_name = webDriver.findElement(By.xpath("//div[@class='dropdownDiv']/ul[4]/li[" + i + "]/a[@href='#']"));
            addOutLine(city_name);
            Assert.assertEquals(data.get(i-1), city_name.getText());
            removeOutLine(city_name);
            Thread.sleep(2000);
        }
    }

    //Scenario: 2. As a user i want to validate the flight booking changes with represents passenger selection

    @When("^check the passenger selection dropdown$")
    public void check_the_passenger_selection_dropdown(DataTable dataTable ) throws InterruptedException {
        List<String> data = dataTable.row(0);
        WebElement passenger = webDriver.findElement(By.xpath("//div[@id='divpaxinfo']"));
        addOutLine(passenger);
        passenger.isDisplayed();
        passenger.click();
        removeOutLine(passenger);
        Thread.sleep(2000);
        WebElement passenger_dropdown = webDriver.findElement(By.xpath("//div[@id='divpaxOptions']"));
        addOutLine(passenger_dropdown);
        WebElement passenger_options = webDriver.findElement(By.xpath("//div/label[@class='guestlbl']"));
        addOutLine(passenger_options);
        Assert.assertEquals(data.get(0),passenger_options.getText());
        Thread.sleep(2000);

        List<String> data_child = dataTable.row(1);
        WebElement passenger_options_child = webDriver.findElement(By.xpath("//div[@id='divChild']//label"));
        addOutLine(passenger_options_child);
        Assert.assertEquals(data_child.get(0),passenger_options_child.getText());
        Thread.sleep(2000);

        List<String> data_Infant = dataTable.row(2);
        WebElement passenger_options_infant = webDriver.findElement(By.xpath("//div[@id='divInfant']//label"));
        addOutLine(passenger_options_infant);
        Assert.assertEquals(data_Infant.get(0),passenger_options_infant.getText());
        removeOutLine(passenger_dropdown);
        Thread.sleep(2000);

        WebElement done = webDriver.findElement(By.xpath("//input[@id='btnclosepaxoption']"));
        addOutLine(done);
        Thread.sleep(2000);
        done.click();
    }
    @Then("^do some action with dropdown$")
    public void do_some_action_with_dropdown() throws InterruptedException {

        WebElement action = webDriver.findElement(By.xpath("//div[@class='paxinfo']"));
        Thread.sleep(2000);
        Assert.assertEquals("1 Adult",action.getText());
        action.click();
        WebElement add_passenger = webDriver.findElement(By.xpath("//div/span[@id='hrefIncAdt']"));
        addOutLine(add_passenger);
        add_passenger.click();

        WebElement add_child = webDriver.findElement(By.xpath("//div/span[@id='hrefIncChd']"));
        addOutLine(add_child);
        Thread.sleep(2000);
        add_child.click();

        WebElement done = webDriver.findElement(By.xpath("//input[@id='btnclosepaxoption']"));
        addOutLine(done);
        Thread.sleep(2000);
        done.click();
    }

    //Scenario: 3. As a user i want to validate the flight booking changes with represents currency selection

    @When("^check the currency selection dropdown is displayed$")
    public void check_the_currency_selection_dropdown_is_displayed(){
      WebElement currency = webDriver.findElement(By.xpath("//div[@ class='row1 padding-bottom-3 currency-dropdown-wrapper']//label"));
      addOutLine(currency);
      Assert.assertEquals("CURRENCY",currency.getText());
      removeOutLine(currency);
    }
    @Then("^click the dropdown check for the given list$")
    public void click_the_dropdown_check_for_the_given_list(DataTable dataTable) throws InterruptedException {
        WebElement action = webDriver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
        action.click();
        for (int i = 1; i <= 4; i++) {
            WebElement currency_dropdown = webDriver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']//option[" + i + "]"));
            addOutLine(currency_dropdown);
            Assert.assertEquals(dataTable.column(0).get(i - 1), currency_dropdown.getText());
            removeOutLine(currency_dropdown);
            Thread.sleep(2000);
        }
    }
    @Then("^do some action with currency dropdown$")
    public void do_some_action_with_currency_dropdown(){
        WebElement click_currency = webDriver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']//option[3]"));
        addOutLine(click_currency);
        click_currency.click();
        removeOutLine(click_currency);

    }
}
