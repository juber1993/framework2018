package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassWork {

	//Initialize browser
	@Test
	public void testingFirstName() {

		WebDriver driver = new ChromeDriver();

		//path of the chrome browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\JUBER AHMED\\Framework\\framework2018\\drivers\\chromedriver.exe");	
		driver.get("https://www.facebook.com/")	;
		
		//Test develop branch
	}

}
