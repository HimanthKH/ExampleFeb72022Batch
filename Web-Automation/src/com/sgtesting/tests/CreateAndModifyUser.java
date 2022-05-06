package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAndModifyUser {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createUser();
		modifyUser();
		deleteUser();
		logout();
		closeBrowser();

	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumAutomation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(1500);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1200);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(1500);
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1500);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Himanth");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("KH");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys("himanth@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("Himanth K H");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("Himanth123");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Himanth123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void modifyUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Preran");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("lastName")).sendKeys("KH");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("email")).sendKeys("preran@Gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("username")).sendKeys("Preran K H");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("Preran123");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Preran123");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=oBrowser.switchTo().alert();
			String str=oAlert.getText();
			System.out.println(str);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.xpath("//a[text()='Logout']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeBrowser()
	{
		try
		{
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
