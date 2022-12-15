package hu.masterfield.testautomation.steps;

import hu.masterfield.testautomation.pages.PlanningOptionsPage;
import hu.masterfield.testautomation.pages.SuggestedItinerariesPage;
import hu.masterfield.testautomation.pages.TripPlannerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class BudapestGOTripSteps {

    @When("the user provides basic trip data")
    public void theUserProvidesBasicTripData() {
        TripPlannerPage tripPlannerPage = new TripPlannerPage();
        tripPlannerPage.validateTripPlannerPage();
        tripPlannerPage.provideBasicTripData();
    }
    @When("the user plans a trip")
    public void theUserPlansATrip() {
        TripPlannerPage tripPlannerPage = new TripPlannerPage();
        tripPlannerPage.validateTripPlannerPage();
        tripPlannerPage.planTrip();
    }

    @Then("the Trip Planner provides the suggested itineraries")
    public void theTripPlannerProvidesTheSuggestedItineraries() {
        SuggestedItinerariesPage p = new SuggestedItinerariesPage();

        p.validatePage();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @And("planning options are specified")
    public void planningOptionsAreSpecified() {
        TripPlannerPage tripPlannerPage = new TripPlannerPage();
        tripPlannerPage.validateTripPlannerPage();
        tripPlannerPage.planOptions();

        PlanningOptionsPage options = new PlanningOptionsPage();
        options.validatePlanningOptionsPage();
        options.provideWalkOptions();
    }

    @Then("the Trip Planner provides the suggested itineraries according to options")
    public void theTripPlannerProvidesTheSuggestedItinerariesAccordingToOptions() {

        SuggestedItinerariesPage p = new SuggestedItinerariesPage();

        p.validatePageWalk();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
