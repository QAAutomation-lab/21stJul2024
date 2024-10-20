package day2.basicOps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.name("username")).sendKeys("Admin");//NoSuchElementException
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();
		String currentUrl=driver.getCurrentUrl();
		System.out.println("Is login successful? "+currentUrl.concat("dashboard"));
	}
}
/*
Scenario to Automate:
	Launch a new firefox browser.
	Open https://demowebshop.tricentis.com/login
	Get Page Title name and Title length
	Print Page Title and Title length on the Eclipse Console.
	Get Page URL and verify if it is a correct page opened
	Enter username as “tester01@vomoto.com”
	Enter password as “Abc@12345”
	Click on login button
	Get the page title and current URL, print on console
	Click on logout
	Close the Browser.

Scenario to Automate:
	open a chrome browser
	enter vtiger application url- https://demo.vtiger.com/vtigercrm/index.php
	validation login page open or not
	remove existing text from username field
	type username as 'admin'
	remove existing text from password field
	type password as 'admin'
	click on login button

Scenario to Automate:
	Open chrome browser
	Enter App url as https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
	Validate login page
	Enter user name as Admin
	Password as admin123
	Click on login button
	Validate home page



*/