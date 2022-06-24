package com.nexsoft.onelist.definitions;

import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import com.nexsoft.onelist.pom.MainActivity;
import com.nexsoft.onelist.pom.Utility;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OnelistDefine {
	
	private AndroidDriver driver;
	private DesiredCapabilities capabilities;
	private MainActivity main;
	private Utility util;
	
	@Before
	public void init() throws MalformedURLException {
		capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "11");
		capabilities.setCapability("uid", "emulator-5554");
		capabilities.setCapability("appPackage", "com.lolo.io.onelist");
		capabilities.setCapability("appActivity", "com.lolo.io.onelist.MainActivity");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		main = new MainActivity(driver);
		util = new Utility(driver);
	}
	
	@Given("User berada pada Menu Utama")
	public void atMainMenu() {
		System.out.println("at main menu");
		
		String actual = main.labelMainTitle.getText();
		String expected = "1List";
		
		Assert.assertEquals(actual, expected);
		util.screenshotAll();
		util.delay(1);
	}
	
	@When("User menekan tombol Tambah List")
	public void clickAddList() {
		main.btnAddList.click();
		System.out.println("click add list");
		util.delay(2);
		
		String actual = main.boxInputListTitle.getText();
		String expected = "List name";
		System.out.println("get title list box");
		
		Assert.assertEquals(actual, expected);
		util.screenshotAll();
		util.delay(1);
	}
	
	@And("^User memasukkan nama list (.*)$")
	public void insertListName(String namaList) throws Throwable {
		main.boxInputListTitle.sendKeys(namaList);
		System.out.println("input nama list");
		
		util.delay(1);
		String actual = main.boxInputListTitle.getText();
		String expected = namaList;
		
		Assert.assertEquals(actual, expected);
		util.screenshotAll();
		util.delay(1);
	}
	
	@And("User menekan tombol Save")
	public void clickBtnSave() {
		main.btnValidateEditList.click();
		System.out.println("hit save button");
		
		util.delay(1);
		String actual = main.labelMainTitle.getText();
		String expected = "1List";
		
		Assert.assertEquals(actual, expected);
		util.screenshotAll();
		util.delay(1);
	}
	
	@Then("^Nama List Baru tampil di Menu Utama (.*)$")
	public void getNewListInMain(String inString) throws Throwable {
		List<WebElement> lstElement = driver.findElements(
				By.xpath("//android.widget.TextView[@resource-id='com.lolo.io.onelist:id/textView']"));
		
		String expectedChar = inString;
		boolean checkData = false;
		for (WebElement webElement : lstElement) {
			if (webElement.getText().contains(expectedChar)) {
				checkData = true;
				break;
			}
		}
		assertTrue(checkData);
		util.screenshotAll();
		util.delay(1);
	}
	
	// tambahan untuk tag2
	@And("User memasukkan nama list2 {string}")
	public void insertListName2(String namaList)  throws Throwable {
		main.boxInputListTitle.sendKeys(namaList);
		System.out.println("input nama list");
		
		util.delay(1);
		String actual = main.boxInputListTitle.getText();
		String expected = namaList;
		
		Assert.assertEquals(actual, expected);
		util.screenshotAll();
		util.delay(1);
	}
	
	@Then("User menekan tombol Cancel")
	public void clickBtnCancel() {
		main.btnCancelEditList.click();
		System.out.println("hit cancel button");
		
		util.delay(1);
		String actual = main.labelMainTitle.getText();
		String expected = "1List";
		
		Assert.assertEquals(actual, expected);
		util.screenshotAll();
		util.delay(1);
	}
	
	// tag3
	@And("User memasukkan nama list {string}")
	public void insertListNameKosong(String namaList) throws Throwable {
		main.boxInputListTitle.sendKeys(namaList);
		System.out.println("input nama list");
		
		util.delay(1);
		String actual = main.boxInputListTitle.getText();
		String expected = namaList;
		
		Assert.assertEquals(actual, expected);
		util.screenshotAll();
		util.delay(1);
	}
	
	@And("User menekan tombol Save Kosong")
	public void clickBtnSaveKosong() {
		main.btnValidateEditList.click();
		System.out.println("hit save button");
		
		util.delay(1);
		String actual = main.boxInputListTitle.getText();
		String expected = "List name";
		System.out.println("get title list box");
		
		Assert.assertEquals(actual, expected);
		util.screenshotAll();
		util.delay(1);
	}
	
	
	
}
