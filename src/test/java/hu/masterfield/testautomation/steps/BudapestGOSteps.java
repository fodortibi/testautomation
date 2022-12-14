package hu.masterfield.testautomation.steps;

import hu.masterfield.testautomation.pages.HomePage;
import hu.masterfield.testautomation.pages.PanelPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.open;

public class BudapestGOSteps {

    HomePage homePage;

    @BeforeEach
    public void setup() {
        System.setProperty("wdm.proxy", "http://HE202194.emea2.cds.t-internal.com:3128");
    }

    @AfterEach
    public void cleanup() throws InterruptedException {
        Thread.sleep(5000);
    }

    @Given("^open main page$")
    public void openMainPage() throws InterruptedException {
        homePage = open("https://go.bkk.hu", HomePage.class);
        homePage.validateHomePage();
    }

    @Given("the browser language is set to {string}")
    public void theBrowserLanguageIsSetTo(String arg0) {
    }

    @When("cookies dialog is accepted")
    public void cookiesDialogIsAccepted() {
        homePage.acceptPrivacy();
    }

    @Then("it uses cookies")
    public void itUsesCookies() {
    }

    @When("cookies dialog is rejected")
    public void cookiesDialogIsRejected() {
        homePage.rejectPrivacy();
    }

    @Then("it does not use cookies")
    public void itDoesNotUseCookies() {
    }

    @And("accept cookies")
    public void acceptCookies() {
        homePage.acceptPrivacy();
    }

    @Given("language is set to {string}")
    public void languageIsSetTo(String arg0) {
    }

    @When("the about link has been clicked")
    public void theAboutLinkHasBeenClicked() throws IOException {
        // #panel-inner > p > span.about-link > a > span
        // //a[@href="/about/"]
        PanelPage panelPage = new PanelPage();
        String version = panelPage.getVersion();
        System.out.println(version);

        Properties prop = new Properties();
        //InputStream in = getClass().getResourceAsStream("/xyz.properties");
        FileInputStream in = new FileInputStream("xyz.properties");
        prop.load(in);
        in.close();

        if (prop.getProperty(version) == null)
        {
            prop.setProperty(version, LocalDateTime.now().toString());
            prop.store(new FileOutputStream("xyz.properties"), null);
        }
    }

    @Then("it shows the version of the BudapestGO")
    public void itShowsTheVersionOfTheBudapestGO() {
    }
}


