import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:5000/')

WebUI.mouseOver(findTestObject('SIGNUP/a_Signup'))

WebUI.click(findTestObject('SIGNUP/a_Vendor'))

WebUI.setText(findTestObject('VENDOR/input_Vendor Registration_username'), findTestData('SIGNUP DETAILS').getValue(1, 1))

WebUI.setText(findTestObject('VENDOR/input_Vendor Registration_email'), findTestData('SIGNUP DETAILS').getValue(4, 1))

WebUI.setText(findTestObject('VENDOR/input_Vendor Registration_phone'), findTestData('SIGNUP DETAILS').getValue(5, 1))

WebUI.setText(findTestObject('VENDOR/input_Vendor Registration_password'), findTestData('SIGNUP DETAILS').getValue(2, 1))

WebUI.setText(findTestObject('VENDOR/input_Vendor Registration_cpass'), findTestData('SIGNUP DETAILS').getValue(3, 1))

WebUI.setText(findTestObject('VENDOR/input_Vendor Registration_cname'), findTestData('SIGNUP DETAILS').getValue(6, 1))

WebUI.setText(findTestObject('VENDOR/input_Vendor Registration_address'), findTestData('SIGNUP DETAILS').getValue(7, 1))

WebUI.setText(findTestObject('VENDOR/input_Vendor Registration_country'), findTestData('SIGNUP DETAILS').getValue(8, 1))

WebUI.click(findTestObject('VENDOR/input'))

WebUI.click(findTestObject('VENDOR/a_Please login'))

WebUI.closeBrowser()

