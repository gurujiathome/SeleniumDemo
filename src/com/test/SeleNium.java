package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SeleNium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///F:/DnyaneshTesting/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
		driver.findElement(By.id("username")).sendKeys("123456");
		driver.findElement(By.id("mobile")).sendKeys("123456345");
		driver.findElement(By.id("email")).sendKeys("user@gmail.com");
		driver.findElement(By.id("course")).sendKeys("Java");
		
		//Select droplist = new Select(driver.findElement(By.cssSelector("select")));
		
		WebElement radio1=driver.findElement(By.id("Male"));
		

		WebElement radio2=driver.findElement(By.id("Female"));
		radio2.click();
		Select s = new Select(driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select")));
		s.selectByVisibleText("HP");
		driver.findElement(By.id("password")).sendKeys("123456");

		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		
		
	}
	
}

