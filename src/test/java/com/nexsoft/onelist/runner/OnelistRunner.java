package com.nexsoft.onelist.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(tags = "", 	
features = "src/test/resources/Onelist.feature",
glue = "com.nexsoft.onelist.definitions")
public class OnelistRunner extends AbstractTestNGCucumberTests {

}
