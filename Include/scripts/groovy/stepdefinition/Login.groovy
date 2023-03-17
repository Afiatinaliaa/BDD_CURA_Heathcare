package stepdefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@When("I input (.*) and (.*) on the username and password field")
	public void i_input_username_and_password_on_the_username_and_password_field(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/Login/TextField_Username'), username)
		WebUI.setText(findTestObject('Object Repository/Login/TextField_Password'), password)
	}
	
	@When("I click on the Login button")
	public void i_click_on_the_Login_button() {
		WebUI.click(findTestObject('Object Repository/Login/Button_Login'))
	}
	
	@Then("I should be navigated to Homepage")
	public void i_should_be_navigated_to_Homepage() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Homepage/Button_Book Appointment'))
	}
	
	@When("I input (.*) field on the password field")
	public void i_input_password_field_on_the_password_field(String password) {
		WebUI.setText(findTestObject('Object Repository/Login/TextField_Password'), password)
	}
	
	@Then("I should be able to see alert message")
	public void i_should_be_able_to_see_alert_message() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Login/Alert_Field is Required'))
	}
	
	@When("I input (.*) field on the username field")
	public void i_input_username_field_on_the_username_field(String username) {
		WebUI.setText(findTestObject('Object Repository/Login/TextField_Username'), username)
	}
}