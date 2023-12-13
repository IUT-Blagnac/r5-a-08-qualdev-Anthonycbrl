package hellocucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {
    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    String actualAnswer = "";
    String expectedAnswer = "";

    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }

    @Given("today is Sunday")
    public void today_is_sunday() {
        this.actualAnswer = "Sunday";
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        this.expectedAnswer = "Friday";
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        String result = isItFriday(actualAnswer);
        assertEquals(string, result);
    }

    @Given("today is Friday")
    public void today_is_friday() {
        this.actualAnswer = "Friday";
    }

    @Given("today is {string}")
    public void today_is_anything(String today) {
        this.actualAnswer = today;
    }

}
