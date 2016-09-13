package com.pdxsethu.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Properties;

/**
 * Created by vlakshmi on 9/9/2016.
 */
public class GoogleHello {
    public static void main(String[] args) {
      //DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();  ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true); 
        setSystemProperty("ie");

      	WebDriver webDriver = new InternetExplorerDriver();

        webDriver.get("http://www.spsdemo.com");

        webDriver.findElement(By.id("Tile_WPQ3_5_3")).click();
        
        //webDriver.findElement(By.id("67,3028,0")).findElement(By.className("ms-ellipsis-icon")).click();
        
      //*[@id="86,3028,0"]/td[4]/div/a/img
       // #\38 6\2c 3028\2c 0 > td.ms-list-itemLink-td.ms-cellstyle > div > a > img
        //<img class="ms-ellipsis-icon" src="/_layouts/15/images/spcommon.png?rev=23" alt="Swiss Parliament Open Menu">
        //webDriver.findElement(By.name("signIn")).click();

    }
    protected static void setSystemProperty(String browser){
	if(browser.equals("ie")){
	        System.setProperty("webdriver.ie.driver", ".\\drivers\\IEDriverServer.exe");
	}else if(browser.equals("chrome")){
		System.setProperty("webdriver.ie.driver", ".\\drivers\\ChromeDriver.exe");
	}
    }
}
