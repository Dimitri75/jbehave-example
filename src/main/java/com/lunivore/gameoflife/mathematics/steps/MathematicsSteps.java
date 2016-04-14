package com.lunivore.gameoflife.mathematics.steps;

import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class MathematicsSteps {
    private double x;

    @Given("a variable x with value $value")
    @Aliases(values={"x = $value"})
    public void setX(double x) {
        this.x = x;
    }
    
    @When("I multiply x by $number")
    public void xMultiplyBy(double number) {
        x *= number;
    }

    @When("I add to x $number")
    public void addToX(double number) {
        x += number;
    }

    @When("I subtract to x $number")
    public void subtractToX(double number) {
        x -= number;
    }
    
    @Then("the result should be $number")
    public void theResultShouldBe(double number) {
        assertThat(x, equalTo(number));
    }
}
