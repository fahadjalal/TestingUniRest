package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class FirstStepDef {
    WebDriver driver;
    @Given("Launch the browser")
    public void launchTheBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @When("Hit Google on your browser")
    public void hitGoogleOnYourBrowser() {
        driver.navigate().to("https://www.google.com");

    }

    @Then("Enter {string} in the search text box.")
    public void enterInTheSearchTextBox(String arg0) {
         WebElement search = driver.findElement(By.name("q"));
         search.sendKeys("Cucumber for Java");
         search.sendKeys(Keys.RETURN);

    }

    @And("Select the first result.")
    public void selectTheFirstResult() {
    driver.findElements(By.xpath("/*")).get(0).click();
    }


}
