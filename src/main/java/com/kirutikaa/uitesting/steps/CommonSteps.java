package com.kirutikaa.uitesting.steps;

import io.cucumber.java.After;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class CommonSteps {

    public static WebDriver webDriver;

    public static JavascriptExecutor javascriptExecutor;

    @BeforeAll
    public static void stepDriver(){
        webDriver = new ChromeDriver();
        webDriver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        webDriver.manage().window().maximize();
    }
    @After
    public static void stepCloser(){
        webDriver.quit();
    }

    public static void addOutLine(WebElement webElement){
        javascriptExecutor = (JavascriptExecutor) webDriver;
        javascriptExecutor.executeScript("arguments[0].setAttribute('style','border:3px solid black;');",webElement);
    }

    public static void removeOutLine(WebElement webElement){
        javascriptExecutor.executeScript("arguments[0].setAttribute('style','border:3px solid black;')",webElement);

    }
}
