package com.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"/Users/anick/eclipse-workspace/bddProject180812m/login.feature"}
,tags= {"@Smoke"},glue= {"com.test"},dryRun= true,format = {“json:target/cucumber.json“}

)

public class Runner {
	
	
	
	
	
	
	

}
