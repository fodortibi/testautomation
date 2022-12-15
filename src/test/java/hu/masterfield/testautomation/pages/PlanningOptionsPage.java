package hu.masterfield.testautomation.pages;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.eo.Se;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlanningOptionsPage {

    SelenideElement txtOptions = $("h3.ui-accordion-header");
    //SelenideElement btnWalk = $("#mod-walk");
    //SelenideElement btnWalk = $x("//*[@id=\"ui-accordion-39-panel-0\"]/div[1]/div[1]/label");
    SelenideElement btnWalk = $x("//input[@id=\"mod-walk\"]/../label/span");
    SelenideElement btnBubi = $("#mod-rented-bicycle");
    SelenideElement btnBike = $("#mod-kerekpar");

    //SelenideElement btnModSubway = $("#mod-SUBWAY");
    SelenideElement btnModSubway = $x("//input[@id=\"mod-SUBWAY\"]/following-sibling::label");
    //SelenideElement btnModSubRail = $("#mod-SUBURBAN_RAILWAY");
    SelenideElement btnModSubRail = $x("//input[@id=\"mod-SUBURBAN_RAILWAY\"]/following-sibling::label");
    //SelenideElement btnModFerry = $("#mod-FERRY");
    SelenideElement btnModFerry = $x("//input[@id=\"mod-FERRY\"]/following-sibling::label");

    //SelenideElement btnModTram = $("#mod-TRAM");
    SelenideElement btnModTram = $x("//input[@id=\"mod-TRAM\"]/following-sibling::label");

    //SelenideElement btnModTrolley = $("#mod-TROLLEYBUS");
    SelenideElement btnModTrolley = $x("//input[@id=\"mod-TROLLEYBUS\"]/following-sibling::label");

    //SelenideElement btnModBus = $("#mod-BUS");
    SelenideElement btnModBus = $x("//input[@id=\"mod-BUS\"]/following-sibling::label");
    //SelenideElement btnModRail = $("#mod-RAIL");
    SelenideElement btnModRail = $x("//input[@id=\"mod-RAIL\"]/following-sibling::label");


    public void validatePlanningOptionsPage() {
        txtOptions.shouldBe(visible).shouldBe(enabled);
        assertEquals("Planning options", txtOptions.getText());
        btnWalk.shouldBe(visible).shouldBe(enabled);
        btnBubi.shouldBe(visible).shouldBe(enabled);
        btnBike.shouldBe(visible).shouldBe(enabled);
        //
        // mod ...
    }

    public void provideWalkOptions() {
        btnWalk.click();

        btnModSubway.click();
        btnModSubRail.click();
        btnModFerry.click();
        btnModTram.click();
        btnModTrolley.click();
        btnModBus.click();
        btnModRail.click();
    }

}
