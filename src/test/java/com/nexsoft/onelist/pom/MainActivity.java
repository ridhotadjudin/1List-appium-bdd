package com.nexsoft.onelist.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

@SuppressWarnings("deprecation")
public class MainActivity {
	
	private AndroidDriver driver;
	
	public MainActivity(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/title")
	public WebElement labelMainTitle;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/buttonAddList")
	public WebElement btnAddList;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/listTitle")
	public WebElement boxInputListTitle;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/validateEditList")
	public WebElement btnValidateEditList;
	
	@AndroidFindBy(id = "com.lolo.io.onelist:id/cancelEditList")
	public WebElement btnCancelEditList;
	
	
	
	
}
