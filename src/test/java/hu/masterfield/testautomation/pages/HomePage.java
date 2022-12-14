package hu.masterfield.testautomation.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    //wait.until(driver->driver.findElement(By.cssSelector("#logo-link")));
    SelenideElement logoLink = $(byClassName("logo-link"));

    SelenideElement btnPrivacyAccept = $(By.xpath("//button[text()='Accept' or text()='Elfogadom']"));
    SelenideElement btnPrivacyDetails = $(By.xpath("//button[text()='Details' or text()='Részletek']"));
    SelenideElement btnPrivacyReject = $(By.xpath("//button[text()='Reject' or text()='Elutasítom']"));

    public void validateHomePage() throws InterruptedException {
        logoLink.shouldBe(visible).shouldBe(enabled);
        Thread.sleep(5000);
    }

    public void acceptPrivacy() {
        btnPrivacyAccept.click();
    }

    public void rejectPrivacy() {
        btnPrivacyDetails.click();
        btnPrivacyReject.click();
    }
}
