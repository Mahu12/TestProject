package Stepdefinitions;

import org.junit.runner.RunWith;   
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;  

@RunWith(Cucumber.class) 
@CucumberOptions(features="src/test/resources/Features",
glue={"Stepdefinitions"},
monochrome = true,
plugin = { "pretty", "html:target/reports"})

public class TestRunnner 
{
	

}
