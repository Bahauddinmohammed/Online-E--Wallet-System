package Runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
                features = "Features/addamount.feature",
        
                glue= {"StepDefinition"}
               
                ,monochrome = true  
                    
        )
public class TestRunner {

}











