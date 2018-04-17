package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Classwork1 {
	//Initialize browser
	@Test
	public void testingFirstName() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JUBER AHMED\\Framework\\framework2018\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(800);

		String urlname=driver.getCurrentUrl(); //To confirm it is going to right url
		System.out.println(urlname);

		if(!urlname.equals("https://www.facebook.com/")) //Instead of using equal sign because of other symbols
			System.out.println("OPPS get out now!");

		String title=driver.getTitle();
		System.out.println(title);

		if(!title.equals("Facebook - Log In or Sign Up"))
			System.out.println("OPPS Wrong Title Loser");

		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Juber");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Ahmed");
		driver.findElement(By.cssSelector("input[name^='reg']")).sendKeys("juber1993@aol.com");
		driver.findElement(By.cssSelector("input[name$='confirmation__']")).sendKeys("juber1993@aol.com");
		driver.findElement(By.cssSelector("input[autocomplete*='pass']")).sendKeys("Test123456");

		WebElement month=driver.findElement(By.name("birthday_month"));
		Select setmonth= new Select(month);
		setmonth.selectByVisibleText("May");
		System.out.println(setmonth.getFirstSelectedOption().getText());
		System.out.println(month.getText());

		WebElement day=driver.findElement(By.name("birthday_day"));
		Select setday= new Select(day);
		setday.selectByIndex(6);
		System.out.println(setday.getFirstSelectedOption().getText());
		System.out.println(day.getText());

		WebElement year=driver.findElement(By.name("birthday_year"));
		Select setyear= new Select(year);
		setyear.selectByValue("1990");
		System.out.println(setyear.getFirstSelectedOption().getText());
		System.out.println(year.getText());

		WebElement ele=driver.findElement(By.xpath("//input[@value='1']"));
		boolean bol=ele.isDisplayed();
		if(bol==true)
			System.out.println("It exists");
		else
			System.out.println("Doesn't exists");

		System.out.println(ele.isEnabled());
		System.out.println(ele.isSelected());
		ele.click();

		driver.findElement(By.xpath("//*[@id=\'u_0_c\']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();

		if(!urlname.equals("https://www.facebook.com/confirmemail.php?next=https%3A%2F%2Fwww.facebook.com%2F&rd")) //Instead of using equal sign because of other symbols
			System.out.println("OPPS get out now!");

		String titleconfirm=driver.getTitle();
		System.out.println(titleconfirm);		
		if(!title.equals("Facebook - Log In or Sign Up"))
			System.out.println("OPPS Wrong Title Loser");



	}

}
