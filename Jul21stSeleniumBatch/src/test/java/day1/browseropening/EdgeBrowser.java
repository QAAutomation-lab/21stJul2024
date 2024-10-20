package day1.browseropening;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EdgeBrowser {

	public static void main(String[] args) {

		//create an instance of EdgeDriver class
		EdgeDriver eDriver=new EdgeDriver();
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