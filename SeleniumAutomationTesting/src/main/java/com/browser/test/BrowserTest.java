package com.browser.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\SDM\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        
        WebDriver w =new ChromeDriver();
        w.get("https://www.swiggy.com/");
        Thread.sleep(2000);
        w.findElement(By.className("x4bK8")).click();
        
        Thread.sleep(1000);
        w.findElement(By.name("mobile")).sendKeys("9011490563");
//        Thread.sleep(2000);
        w.findElement(By.className("a-ayg")).click();
//        w.findElement(By.className("_6luy _55r1 _1kbt")).sendKeys("abcd123");
	}

}
