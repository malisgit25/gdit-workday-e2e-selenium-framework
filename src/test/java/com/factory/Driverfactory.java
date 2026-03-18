package com.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Note: This driver factory is not fully configured with base test yet. This class is done. next job is to link with base test.
public class Driverfactory {
		

	    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	    public static WebDriver initDriver(String browser){

	        if(browser.equalsIgnoreCase("chrome")){
	            WebDriverManager.chromedriver().setup();
	            driver.set(new ChromeDriver());
	        }

	        if(browser.equalsIgnoreCase("edge")){
	            WebDriverManager.edgedriver().setup();
	            driver.set(new EdgeDriver());
	        }

	        return driver.get();
	    }

	    public static WebDriver getDriver(){
	        return driver.get();
	    }
	

}
