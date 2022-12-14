package hu.masterfield.testautomation.steps;

import hu.masterfield.testautomation.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class BudapestGOSteps {

    @BeforeEach
    public void setup() {
        System.setProperty("wdm.proxy", "http://HE202194.emea2.cds.t-internal.com:3128");
    }

    @AfterEach
    public void cleanup() {

    }

    @Given("^open main page$")
    public void openMainPage() {
        HomePage homePage = open("https://go.bkk.hu", HomePage.class);
    }

    @Given("the browser language is set to {string}")
    public void theBrowserLanguageIsSetTo(String arg0) {
    }

    @When("cookies dialog is accepted")
    public void cookiesDialogIsAccepted() {
    }

    @Then("it uses cookies")
    public void itUsesCookies() {
    }

    @When("cookies dialog is rejected")
    public void cookiesDialogIsRejected() {
    }

    @Then("it does not use cookies")
    public void itDoesNotUseCookies() {
    }
}


