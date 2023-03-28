package StepDefinitions;

import Utilites.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void before() {

        System.out.println("Scenario starting");
    }

    @After // her scenariodan sonra isleyir
    public void after() {

        System.out.println("Scenario finished");
        GWD.quitDriver();
    }
}
