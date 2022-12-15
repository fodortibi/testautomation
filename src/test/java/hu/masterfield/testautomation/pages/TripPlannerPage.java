package hu.masterfield.testautomation.pages;

import com.codeborne.selenide.ClickOptions;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TripPlannerPage {
    SelenideElement txtTitle = $("h2");
    SelenideElement txtFrom = $("input.planner-from");
    SelenideElement txtTo = $("input.planner-to");
    SelenideElement btnPlan = $("input.planner-plan");
    SelenideElement txtOptions = $("h3.ui-accordion-header");

    public void validateTripPlannerPage() {
        txtTitle.shouldBe(visible).shouldBe(enabled);
        assertEquals("Trip Planner", txtTitle.getText());
        txtFrom.shouldBe(visible).shouldBe(enabled);
        txtTo.shouldBe(visible).shouldBe(enabled);
        btnPlan.shouldBe(visible).shouldBe(enabled);
        txtOptions.shouldBe(visible).shouldBe(enabled);
        assertEquals("Planning options", txtOptions.getText());
    }

    public void provideBasicTripData() {
        txtFrom.sendKeys("Allende");
        txtFrom.pressTab();

        txtTo.sendKeys("Deutsche Telekom");
        txtTo.pressTab();
    }
    public void planTrip() {
        btnPlan.click();
    }

    public void planOptions() {
        txtOptions.click();
    }
}
