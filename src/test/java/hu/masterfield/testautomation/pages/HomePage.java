package hu.masterfield.testautomation.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    //wait.until(driver->driver.findElement(By.cssSelector("#logo-link")));
    SelenideElement logoLink = $(byClassName("logo-link"));
}
