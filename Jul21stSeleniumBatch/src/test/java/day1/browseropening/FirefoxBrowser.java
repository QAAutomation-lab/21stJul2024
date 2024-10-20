package day1.browseropening;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {

		//create an instance of FirefoxDriver class
		FirefoxDriver fdriver=new FirefoxDriver();
	}
}
/*
selenium opens new browser for each run
browser opened by selenium will behave like a freshly installed browser hence it won't be having
	- browser history
	- cache
	- cookies
	- plugins
*/