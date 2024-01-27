package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//Launching the Browser
		EdgeDriver driver=new EdgeDriver();   
		
		//Loading the URL
		driver.get("https://www.google.com/");    
		
		 //Maximizing the window
		driver.manage().window().maximize();  
		
		//Searching for Samsung S24
		driver.findElement(By.id("APjFqb")).sendKeys("Samsung S24",Keys.ENTER);  
		
		//Closing the Window
		driver.close();   

	}

}
