package com.bewgle;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestApp2 {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.html");
		
		driver.findElement(By.xpath("//a[text()='Services']")).click();
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/table[1]/tbody/tr[1]/td[2]/a")).click();
		driver.close();
	}
}
