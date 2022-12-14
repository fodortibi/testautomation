package hu.masterfield.testautomation.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class PanelPage {
    SelenideElement lnkAbout = $(byXpath("//a[@href='/about/']"));
    SelenideElement txtVersion = $(".version > span");

    public String getVersion() {
        lnkAbout.click();
        return txtVersion.getText();
    }
}
