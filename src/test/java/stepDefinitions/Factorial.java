package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import config.Base;
import pageObjects.FaktorialPage;
import pageObjects.FaktorialPagePage;

public class Factorial {
    @Given("User access website")
    public void userAccessWebsite() {
        this.invokeBrowser();
        //set url
        driver.get(baseURL);
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("result"))
        );
    }

    @When("User fill number")
    public void userFillNumber() {
        FaktorialPage inputData = new FaktorialPage(driver);
        inputData.inputData("12");
    }

    @And("User clik count button")
    public void userClikCountButton() {
        FaktorialPage button = new FaktorialPage(driver);\
        button.clickHitung();
    }

    @Then("Result displayed")
    public void resultDisplayed() {
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("result"))
        );
    }
}
