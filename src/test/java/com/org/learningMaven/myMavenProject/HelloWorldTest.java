package com.org.learningMaven.myMavenProject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HelloWorldTest {

	@Test 
	public void Login(){
		System.out.println("Logging into the acount");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		

	}

}
 