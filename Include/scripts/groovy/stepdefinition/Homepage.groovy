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



class Homepage {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@When("I select Tokyo CURA Healthcare Center facility dropdown")
	public void i_select_Tokyo_CURA_Healthcare_Center_facility_dropdown() {
		WebUI.selectOptionByLabel(findTestObject('Object Repository/Homepage/Dropdown_Facility'), 'Tokyo CURA Healthcare Center', false)
	}
	
	@When("I tick Hospital Readmission checkbox")
	public void i_tick_Hospital_Readmission_checkbox() {
		WebUI.click(findTestObject('Object Repository/Homepage/Checkbox_Hospital readmission'))
	}
	
	@When("I select MedicaId Hospital program radio button")
	public void i_select_MedicaId_Hospital_program_radio_button() {
		WebUI.click(findTestObject('Object Repository/Homepage/Radio Button_Medicaid programs'))
	}
	
	@When("I select date on the Datepicker")
	public void i_select_date_on_the_Datepicker() {
		WebUI.click(findTestObject('Object Repository/Homepage/Datepicker_Visit Date'))
		WebUI.click(findTestObject('Object Repository/Homepage/Date'))
	}
	
	@When("I input (.*) on the Comment textarea")
	public void i_input_comment_on_the_Comment_textarea(String Comment) {
		WebUI.setText(findTestObject('Object Repository/Homepage/TextArea_Comment'), Comment)
	}
	
	@When("I click Book Appointment button")
	public void i_click_Book_Appointment_button() {
		WebUI.click(findTestObject('Object Repository/Homepage/Button_Book Appointment'))
	}
	
	@Then("I should be navigated to Appointment Confirmation page")
	public void i_should_be_navigated_to_Appointment_Confirmation_page() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Apointment Confirmation Page/Button_Go to Homepage'))
	}
}