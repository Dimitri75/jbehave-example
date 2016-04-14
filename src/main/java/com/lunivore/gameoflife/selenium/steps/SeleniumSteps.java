package com.lunivore.gameoflife.selenium.steps;

import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class SeleniumSteps {
    
    private WebDriver webDriver;

    @Given("the following website: $url")
    @Aliases(values={"the site $url"})
    public void webDriverStartedAt(String url) {
        webDriver = new FirefoxDriver();
        webDriver.get(url);
    }
    
    @When("I click to $xPath")
    public void clickTo(String xPath) {
        webDriver.findElement(By.xpath(xPath)).click();
    }
    
    @Then("the page title should be $pageTitle")
    public void thePageTitleShouldBe(String pageTitle) {
        assertThat(pageTitle, equalTo(pageTitle));
        webDriver.close();
    }
}
