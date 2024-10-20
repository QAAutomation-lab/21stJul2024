package day1.browseropening;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {

		//create an instance of ChromeDriver class
		ChromeDriver cdriver=new ChromeDriver();
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