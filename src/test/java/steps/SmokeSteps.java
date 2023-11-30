package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SmokeSteps {


    @Given("I print hello world")
    public void i_print_hello_world() {
        System.out.println("Hello world");

    }
    @Then("everybody is happy")
    public void everybody_is_happy() {
        System.out.println("We are happy");
    }

    @Given("I am run cucumber test")
    public void i_am_run_cucumber_test() {
        for (int i = 0 ; i<100 ; i ++){
            System.out.println("this is cucmber");
        }

    }
    @Then("verify this cucumber")
    public void verify_this_cucumber() {
       for (int i = 0; i<20; i ++){
           System.out.println("indeed this cucumber !!!!!!!");
       }
    }






}
