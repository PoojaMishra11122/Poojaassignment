package com.bewgle;


import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

class Applicationtest {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://parabank.parasoft.com/parabank/index.html");
		 Thread.sleep(5000);
		 driver1.findElement(By.xpath("//a[text()=\"Register\"]")).click();
		  Thread.sleep(3000);
		 driver1.findElement(By.id("customer.firstName")).sendKeys("pooja");
		 driver1.findElement(By.id("customer.lastName")).sendKeys("mishra");
		 driver1.findElement(By.id("customer.address.street")).sendKeys("basavangudi");
		 driver1.findElement(By.id("customer.address.city")).sendKeys("Bangalore");
		 driver1.findElement(By.id("customer.address.state")).sendKeys("Karnataka");
		 driver1.findElement(By.id("customer.address.zipCode")).sendKeys("560050");
		 driver1.findElement(By.id("customer.phoneNumber")).sendKeys("7828718933");
		 driver1.findElement(By.id("customer.ssn")).sendKeys("");
		 driver1.findElement(By.id("customer.username")).sendKeys("Pragya");
		 driver1.findElement(By.id("customer.password")).sendKeys("Pragya@123");
		 driver1.findElement(By.id("repeatedPassword")).sendKeys("Pragya@123");
		 driver1.findElement(By.xpath("//input[@value=\"Register\"]")).click();
		 Thread.sleep(3000);
	
		driver1.close();
	}
	}

		

	
		
	


	

	


	

