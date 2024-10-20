package day2.basicOps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		//create an instance of required browser class and upcast it to WebDriver interface
		WebDriver driver=new ChromeDriver();
		//enter applicaion URL
		driver.get("https://www.google.com");
		//get application title
		String actualAppTitle=driver.getTitle();
		String expectedAppTitle="Google";
		System.out.println("Title is: "+actualAppTitle +" | number of characters in title: "+actualAppTitle.length());
		System.out.println("Is google search page opened? "+actualAppTitle.equals(expectedAppTitle));
		//get application url
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="www.google.com";
		System.out.println("Actual URL is: "+actualUrl);
		System.out.println("is url matched with required URL? "+actualUrl.contains(expectedUrl));
		//close driver instance
		driver.close();
	}
}
/*
Open chrome browser
enter application url
validate page is opened or not
	-title
	-url
close the browser


*/