package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest {
	public SeleniumTest(WebElement findElement) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
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

		// Select droplist = new Select(driver.findElement(By.cssSelector("select")));

		WebElement radio1 = driver.findElement(By.id("Male"));

		WebElement radio2 = driver.findElement(By.id("Female"));
		radio2.click();
		Select s = new Select(driver
				.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select")));
		s.selectByVisibleText("HP");
		driver.findElement(By.id("password")).sendKeys("123456");

		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

		Alert al = driver.switchTo().alert();
		al.accept();

		// driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[2]/a/span")).click();
		// driver.get("file:///F:/DnyaneshTesting/Offline%20Website/pages/examples/users.html");
		driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();
		String ss = driver
				.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[2]"))
				.getText();
		System.out.println(ss);

		String ss1 = driver
				.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[3]"))
				.getText();
		System.out.println(ss1);

		String ss2 = driver
				.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[2]/td[4]"))
				.getText();
		System.out.println(ss2);

		String ss3 = driver
				.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr[3]/td[2]"))
				.getText();
		System.out.println(ss3);
		
//		WebElement user_link = driver.findElement(By.xpath("/html/body/div/aside[1]/section/ul/li[3]/a/span"));
	//	user_link.click();

		for (int i = 2; i <= 5; i++) {
			for (int j = 1; j <= 6; j++) {
				WebElement tabledata = driver
						.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/table/tbody/tr["
								+ i + "]/td[" + j + "]"));

				System.out.print("  " + tabledata.getText());
			}
			System.out.println();
		}

	}

}