package day5.cssValidationAndMultipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MultipleElementHandling4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//to open browser on full screen
		driver.manage().window().maximize();
		//to avoid NoSuchElementException which is coming due to sync we will use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		//identify suggestions
		List<WebElement> suggestionList=driver.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
		System.out.println("Suggestion count: "+suggestionList.size());
		for(int i=0;i<suggestionList.size();i++) {
			System.out.println(suggestionList.get(i).getText()+":  ->"+suggestionList.get(i).getText().contains("selenium"));
		}
		//selecting 3rd suggestion 
		suggestionList.get(2).click();
		
		//to avoid StateElementException we are re-identifying search input field
		String searchedText=driver.findElement(By.name("q")).getText();
		System.out.println("*****Searched Text*****"+searchedText);
	}

}
/*
get suggestion count
check suggestion contains searched word or not
selected and validate selected value is represent in search page
*/