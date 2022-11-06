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



class Register {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User have installed and  User open aplication mobile")
	def userHaveInstalledAndUserOpenAplicationMobile() {
		Mobile.startApplication('C:\\Users\\MyBook 14 F\\Downloads\\Telegram Desktop\\app-release.apk', true)
		
		Mobile.tap(findTestObject('Object Repository/RegisterMobile/android.widget.Button'), 0)
		
		Mobile.tap(findTestObject('RegisterMobile/android.widget.Button (1)'), 0)
	}

	@When("User Click widget button and User Click Register")
	def userClickWidgetButtonAndUserClickRegister() {
		Mobile.tap(findTestObject('RegisterMobile/android.widget.Button (1)'), 0)
		
		Mobile.tap(findTestObject('Object Repository/RegisterMobile/android.widget.EditText - Alex Under, Fullname'), 0)
		
	}

	@And("User fill the form with valid data (.*) and (.*) and (.*)")
	def userFillTheFormWithValidData(String Fullname, String Email, String Password) {
		println("fullname :"+ Fullname)
		println("email :"+ Email)
		println("password :"+ Password)
		Mobile.clearText(findTestObject('Object Repository/RegisterMobile/android.widget.EditText - Alex Under, Fullname (1)'),
			0)
		
		Mobile.setText(findTestObject('Object Repository/RegisterMobile/android.widget.EditText - Fullname'), 'shidan nur alliyin',
			0)
		
		Mobile.tap(findTestObject('Object Repository/RegisterMobile/android.widget.EditText - alexemail.com, Email'), 0)
		
		Mobile.clearText(findTestObject('Object Repository/RegisterMobile/android.widget.EditText - alexemail.com, Email (1)'),
			0)
		
		Mobile.setText(findTestObject('Object Repository/RegisterMobile/android.widget.EditText - Email'), 'shidan90@gmail.com',
			0)
		
		Mobile.tap(findTestObject('Object Repository/RegisterMobile/android.widget.EditText - 123123123, Password'), 0)
		
		Mobile.clearText(findTestObject('Object Repository/RegisterMobile/android.widget.EditText - 123123123, Password (1)'), 0)
		
		Mobile.setText(findTestObject('Object Repository/RegisterMobile/android.widget.EditText - Password'), 'shidan71', 0)
	}
	
	@Then("User Click Register")
	def userClickRegister() {
		Mobile.tap(findTestObject('Object Repository/RegisterMobile/android.widget.Button (2)'), 0)
		
		Mobile.closeApplication()
		
	}
}