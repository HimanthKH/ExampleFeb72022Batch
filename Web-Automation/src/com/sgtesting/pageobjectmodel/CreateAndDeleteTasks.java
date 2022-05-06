package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAndDeleteTasks {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createCustomer();
		createProject();
		createTasks();
		deleteTasks();
		deleteProject();
		deleteCustomer();
		logout();
		closeBrowser();

	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SeleniumAutomation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
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
			oPage.getusername().sendKeys("admin");
			Thread.sleep(1000);
			oPage.getpassword().sendKeys("manager");
			Thread.sleep(1000);
			oPage.getloginbutton().click();
			Thread.sleep(1000);
			oPage.getflyoutwindow().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createCustomer()
	{
		try
		{
			oPage.getTask().click();
			Thread.sleep(1000);
			oPage.getCustomersorProjects().click();
			Thread.sleep(1000);
			oPage.getNewCustomer().click();
			Thread.sleep(1000);
			oPage.getNewCustomername().sendKeys("Customer1");
			Thread.sleep(1000);
			oPage.getNewCustomerdiscription().sendKeys("Customer is a multinational business holder");
			Thread.sleep(1000);
			oPage.getCreateCustomer().click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createProject()
	{
		try
		{
			oPage.getCustomersorProjects().click();
			Thread.sleep(1000);
			oPage.getNewProject().click();
			Thread.sleep(1000);
			oPage.getProjectnameenter().sendKeys("Project1");
			Thread.sleep(1000);
			oPage.getProjectdescriptionenter().sendKeys("The project is to give support");
			Thread.sleep(1000);
			oPage.getProjectcreated().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void createTasks()
	{
		try
		{
			oPage.getTasksAddnewbutton().click();
			Thread.sleep(1000);
			oPage.getTaskscreatenewButton().click();
			Thread.sleep(1000);
			oPage.getTasksname1().sendKeys("Task1 of 1");
			Thread.sleep(1000);
			oPage.getTasksname2().sendKeys("Task2 of 2");
			Thread.sleep(1000);
			oPage.getTaskscreated().click();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteTasks()
	{
		try
		{
			oPage.getTaskselectcheckbox().click();
			Thread.sleep(1000);
			
			oPage.getTasksdelete().click();
			Thread.sleep(1000);
			oPage.getTasksdeleteconfirmation().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteProject()
	{
		try
		{
			oPage.getProjectclickonsettings().click();
			Thread.sleep(1000);
			oPage.getProjectActions().click();
			Thread.sleep(1000);
			oPage.getProjectActionsdelete().click();
			Thread.sleep(1000);
			oPage.getProjectdeleteconfirmation().click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void deleteCustomer()
	{
		try
		{
			oPage.getCustomerSettings().click();
			Thread.sleep(1000);
			oPage.getCustomerActions().click();
			Thread.sleep(1000);
			oPage.getCustomerDelete1().click();
			Thread.sleep(1000);
			oPage.getCustomerDeleteconfirmation().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void logout()
	{
		try
		{
			oPage.getlogoutlink().click();
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
