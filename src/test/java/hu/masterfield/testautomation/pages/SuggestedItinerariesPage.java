package hu.masterfield.testautomation.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuggestedItinerariesPage {
    SelenideElement txtTitle = $("h2.noprint");
    // h1.itinerary-overview-header
    ElementsCollection results = $$("h1.itinerary-overview-header");
    public void validatePage() {
        assertEquals("Suggested itineraries", txtTitle.getText());
        assertEquals(4, results.size());
    }

    public void validatePageWalk() {
        assertEquals("Suggested itineraries", txtTitle.getText());
        assertEquals(1, results.size());
    }
}

