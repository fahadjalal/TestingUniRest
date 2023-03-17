package StepDefsUniRest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class SD_unirestTest {
    @Given("GET and POST Request")
    public void getAndPOSTRequest() {
        HttpResponse <JsonNode> response =
                Unirest.get("https://reqres.in/api/users?page=2")
                        .asJson();
        assertEquals(200,response.getStatus());
    }

    @When("open the browser for get request")
    public void openTheBrowserForGetRequest() {


    }

    @Then("user will get the response as per the request.")
    public void userWillGetTheResponseAsPerTheRequest() {
    }
}
