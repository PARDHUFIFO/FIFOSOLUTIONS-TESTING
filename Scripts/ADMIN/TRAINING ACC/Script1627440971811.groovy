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

WebUI.setText(findTestObject('LOGIN/input_Login to your account_email'), findTestData('jobseeker and training').getValue(
        1, 1))

WebUI.setText(findTestObject('LOGIN/input_Login to your account_password'), findTestData('jobseeker and training').getValue(
        2, 1))

WebUI.selectOptionByIndex(findTestObject('LOGIN/select_Type of login Employee Vendor Benchsales job Seeker Training'), 5)

WebUI.click(findTestObject('LOGIN/button_Login'))

WebUI.delay(3)

WebUI.click(findTestObject('Training acc/Page_Fifo training account/a_Class Tab'))

WebUI.waitForElementPresent(findTestObject('Training acc/Page_Fifo training account/a_Class Tab'), 3)

WebUI.click(findTestObject('Training acc/Page_Fifo training account/a_Recordings'))

WebUI.waitForElementPresent(findTestObject('Training acc/Page_Fifo training account/a_Recordings'), 3)

WebUI.click(findTestObject('Training acc/Page_Fifo training account/a_Assignments'))

WebUI.waitForElementPresent(findTestObject('Training acc/Page_Fifo training account/a_Assignments'), 3)

WebUI.click(findTestObject('Training acc/Page_Fifo training account/a_Logout'))

WebUI.closeBrowser()

