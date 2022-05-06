package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	private WebElement username;
	public WebElement getusername()
	{
		return username;
	}
	
	private WebElement pwd;
	public WebElement getpassword()
	{
		return pwd;
	}
	
	@FindBy(xpath="//*[@id=\"loginButton\"]/div")
	private WebElement oLogin;
	public WebElement getloginbutton()
	{
		return oLogin;
	}
	
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getflyoutwindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement Userlink;
	public WebElement getUserlink()
	{
		return Userlink;
	}
	
	@FindBy(xpath="//*[@id=\"createUserDiv\"]/div/div[2]")
	private WebElement addUserlink;
	public WebElement getadduserlink()
	{
		return addUserlink;
	}
	
	private WebElement firstName;
	public WebElement getfirstname()
	{
		return firstName;
	}
	
	private WebElement lastName;
	public WebElement getlastnamelink()
	{
		return lastName;
	}
	
	private WebElement email;
	public WebElement getemaillink()
	{
		return email;
	}
	
	private WebElement userDataLightBox_usernameField;
	public WebElement getuserusernamelink()
	{
		return userDataLightBox_usernameField;
	}
	
	private WebElement userDataLightBox_passwordField;
	public WebElement getuserpasswordlink()
	{
		return userDataLightBox_passwordField;
	}
	
	private WebElement passwordCopy;
	public WebElement getuserreenterpasswordlink()
	{
		return passwordCopy;
	}
	
	@FindBy(xpath="//*[@id=\"userDataLightBox_commitBtn\"]/div/span")
	private WebElement createuser;
	public WebElement getCreateuserlink()
	{
		return createuser;
	}
	
	@FindBy(xpath="//span[text()='K H, Himanth']")
	private WebElement clickonexistinguser;
	public WebElement getclickonexistinguser()
	{
		return clickonexistinguser;
	}
	
	@FindBy(xpath="//span[text()='Save Changes']")
	private WebElement savechanges;
	public WebElement getsavechangeslink()
	{
		return savechanges;
	}
	
	@FindBy(xpath="//span[text()='something, somebody']")
	private WebElement clickonmodifieduser;
	public WebElement getclickonmodifieduser()
	{
		return clickonmodifieduser;
	}
	
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getdeleteuser()
	{
		return userDataLightBox_deleteBtn;
	}
	
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[2]")
	private WebElement GoTasks;
	public WebElement getTask()
	{
		return GoTasks;
	}
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement Addnew;
	public WebElement getCustomersorProjects()
	{
		return Addnew;
	}
	
	@FindBy(xpath="/html/body/div[14]/div[1]")
	private WebElement NewCustomer;
	public WebElement getNewCustomer()
	{
		return NewCustomer;
	}
	
	private WebElement customerLightBox_nameField;
	public WebElement getNewCustomername()
	{
		return customerLightBox_nameField;
	}
	
	private WebElement customerLightBox_descriptionField;
	public WebElement getNewCustomerdiscription()
	{
		return customerLightBox_descriptionField;
	}
	
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createcustomer;
	public WebElement getCreateCustomer()
	{
		return createcustomer;
	}
	
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement customerSettings;
	public WebElement getCustomerSettings()
	{
		return customerSettings;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")
	private WebElement customeractions;
	public WebElement getCustomerActions()
	{
		return customeractions;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")
	private WebElement deletecustomer;
	public WebElement getCustomerDelete1()
	{
		return deletecustomer;
	}
	
	private WebElement customerPanel_deleteConfirm_submitTitle;
	public WebElement getCustomerDeleteconfirmation()
	{
		return customerPanel_deleteConfirm_submitTitle;
	}
	
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement clickonexistingcustomer;
	public WebElement getCustomersettingsexisting()
	{
		return clickonexistingcustomer;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
	private WebElement modifycustomer;
	public WebElement getCustomerDescModify()
	{
		return modifycustomer;
	}
	
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")
	private WebElement closemodifycustomer;
	public WebElement getCustomerclose()
	{
		return closemodifycustomer;
	}
	
	@FindBy(xpath="/html/body/div[14]/div[2]")
	private WebElement newproject;
	public WebElement getNewProject()
	{
		return newproject;
	}
	
	private WebElement projectPopup_projectNameField;
	public WebElement getProjectnameenter()
	{
		return projectPopup_projectNameField;
	}
	
	private WebElement projectPopup_projectDescriptionField;
	public WebElement getProjectdescriptionenter()
	{
		return projectPopup_projectDescriptionField;
	}
	
	
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement createproject;
	public WebElement getProjectcreated()
	{
		return createproject;
	}
	
	
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement clickonexistingproject;
	public WebElement getProjectclickonsettings()
	{
		return clickonexistingproject;
	}
	
	
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")
	private WebElement projectActions;
	public WebElement getProjectActions()
	{
		return projectActions;
	}
	
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
	private WebElement projectActionsdelete;
	public WebElement getProjectActionsdelete()
	{
		return projectActionsdelete;
	}
	
	
	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement getProjectdeleteconfirmation()
	{
		return projectPanel_deleteConfirm_submitTitle;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement modifyprojectdescription;
	public WebElement getProjectDescmodify()
	{
		return modifyprojectdescription;
	}
	
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")
	private WebElement modifyprojectclosebutton;
	public WebElement getProjectclosebutton()
	{
		return modifyprojectclosebutton;
	}
	
	
	@FindBy(xpath="//div[text()='Add New Task']")
	private WebElement addnewtasks;
	public WebElement getTasksAddnewbutton()
	{
		return addnewtasks;
	}
	
	
	@FindBy(xpath="/html/body/div[13]/div[1]")
	private WebElement createnewtasks;
	public WebElement getTaskscreatenewButton()
	{
		return createnewtasks;
	}
	
	
	@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
	private WebElement taskname1;
	public WebElement getTasksname1()
	{
		return taskname1;
	}
	
	
//	@FindBy(xpath="//*[@id=\"ext-gen44\"]")
//	private WebElement taskdeadline;
//	public WebElement getTasksetdeadline()
//	{
//		return taskdeadline;
//	}
	
//	@FindBy(xpath="//*[@id=\"ext-gen242\"]/tbody/tr[2]/td/table/tbody/tr[5]/td[6]/a/em/span")
//	private WebElement taskdeadlinedate;
//	public WebElement getTasksetdeadlinedate()
//	{
//		return taskdeadlinedate;
//	}
	
//	@FindBy(xpath="//*[@id=\"ext-gen278\"]")
//	private WebElement taskdeadlinedateconfirm;
//	public WebElement getTasksetdeadlinedateconfirm()
//	{
//		return taskdeadlinedateconfirm;
//	}
	
	@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[2]/td[1]/input")
	private WebElement taskname2;
	public WebElement getTasksname2()
	{
		return taskname2;
	}
	
	@FindBy(xpath="//span[text()='Create Tasks']")
	private WebElement createtask;
	public WebElement getTaskscreated()
	{
		return createtask;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/table/tbody/tr/td[1]/div/div")
	private WebElement taskselectcheckbox;
	public WebElement getTaskselectcheckbox()
	{
		return taskselectcheckbox;
	}
	
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[3]/div/div/div[4]/span")
	private WebElement tasksdelete;
	public WebElement getTasksdelete()
	{
		return tasksdelete;
	}
	
	private WebElement deleteTaskPopup_deleteConfirm_submitTitle;
	public WebElement getTasksdeleteconfirmation()
	{
		return deleteTaskPopup_deleteConfirm_submitTitle;
	}
	
	
	
	@FindBy(xpath="//*[@id=\"logoutLink\"]")
	private WebElement oLogout;
	public WebElement getlogoutlink()
	{
		return oLogout;
	}
}
