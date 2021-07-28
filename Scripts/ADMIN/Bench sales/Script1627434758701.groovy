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

WebUI.click(findTestObject('LOGIN/a_Login'))

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('LOGIN/input_Login to your account_email'), findTestData('SIGNUP DETAILS').getValue(4, 1))

WebUI.setText(findTestObject('LOGIN/input_Login to your account_password'), findTestData('SIGNUP DETAILS').getValue(2, 1))

WebUI.selectOptionByIndex(findTestObject('LOGIN/select_Type of login Employee Vendor Benchsales job Seeker Training'), 3)

WebUI.click(findTestObject('LOGIN/button_Login'))

WebUI.delay(3, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('BENCH SALES/Page_Fifo benchsalesaccount/input_Enter candidate details_date'), findTestData(
        'LOGIN DETAILS').getValue(11, 1))

WebUI.setText(findTestObject('BENCH SALES/Page_Fifo benchsalesaccount/input_Enter candidate details_username'), findTestData(
        'LOGIN DETAILS').getValue(12, 1))

WebUI.setText(findTestObject('BENCH SALES/Page_Fifo benchsalesaccount/input_Enter candidate details_technology'), findTestData(
        'LOGIN DETAILS').getValue(13, 1))

WebUI.setText(findTestObject('BENCH SALES/Page_Fifo benchsalesaccount/input_Enter candidate details_experience'), findTestData(
        'LOGIN DETAILS').getValue(14, 1))

WebUI.setText(findTestObject('BENCH SALES/Page_Fifo benchsalesaccount/input_Enter candidate details_visa'), findTestData(
        'LOGIN DETAILS').getValue(15, 1))

WebUI.setText(findTestObject('BENCH SALES/Page_Fifo benchsalesaccount/input_Enter candidate details_email'), findTestData(
        'LOGIN DETAILS').getValue(2, 1))

WebUI.setText(findTestObject('BENCH SALES/Page_Fifo benchsalesaccount/input_Enter candidate details_phone'), findTestData(
        'LOGIN DETAILS').getValue(3, 1))

WebUI.setText(findTestObject('BENCH SALES/Page_Fifo benchsalesaccount/input_Enter candidate details_company'), findTestData(
        'LOGIN DETAILS').getValue(4, 1))

WebUI.click(findTestObject('BENCH SALES/Page_Fifo benchsalesaccount/input_Enter candidate details_form-control'))

WebUI.closeBrowser()

