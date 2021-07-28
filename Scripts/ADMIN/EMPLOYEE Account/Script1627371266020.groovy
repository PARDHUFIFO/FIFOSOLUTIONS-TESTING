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

WebUI.selectOptionByIndex(findTestObject('LOGIN/select_Type of login Employee Vendor Benchsales job Seeker Training'), 1)

WebUI.waitForElementPresent(findTestObject('LOGIN/select_Type of login Employee Vendor Benchsales job Seeker Training'), 
    3)

WebUI.click(findTestObject('LOGIN/button_Login'))

WebUI.delay(3, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('EMPLOYEE Account/Page_Fifo employeeaccount/a_Work report'))

WebUI.selectOptionByIndex(findTestObject('EMPLOYEE Account buttons/Canditate section1/S1/select_Candidate name'), 1)

WebUI.waitForElementPresent(findTestObject('EMPLOYEE Account buttons/Canditate section1/S1/select_Candidate name'), 3)

WebUI.setText(findTestObject('EMPLOYEE Account buttons/Canditate section1/S1/input_Submit the details_jobtitle'), findTestData(
        'LOGIN DETAILS').getValue(1, 1))

WebUI.setText(findTestObject('EMPLOYEE Account buttons/Canditate section1/S1/input_Submit the details_location'), findTestData(
        'LOGIN DETAILS').getValue(8, 1))

WebUI.setText(findTestObject('EMPLOYEE Account buttons/Canditate section1/S1/input_Submit the details_vendor'), findTestData(
        'LOGIN DETAILS').getValue(5, 1))

WebUI.setText(findTestObject('EMPLOYEE Account buttons/Canditate section1/S1/input_Submit the details_email'), findTestData(
        'LOGIN DETAILS').getValue(2, 1))

WebUI.setText(findTestObject('EMPLOYEE Account buttons/Canditate section1/S1/input_Submit the details_phone'), findTestData(
        'LOGIN DETAILS').getValue(3, 1))

WebUI.setText(findTestObject('EMPLOYEE Account buttons/Canditate section1/S1/input_Submit the details_client'), findTestData(
        'LOGIN DETAILS').getValue(4, 1))

WebUI.setText(findTestObject('EMPLOYEE Account buttons/Canditate section1/S1/input_Submit the details_payrate'), findTestData(
        'LOGIN DETAILS').getValue(6, 1))

WebUI.setText(findTestObject('EMPLOYEE Account buttons/Canditate section1/S1/textarea_Submit the details_text'), findTestData(
        'LOGIN DETAILS').getValue(7, 1))

WebUI.click(findTestObject('EMPLOYEE Account buttons/buttons/input_Submit the details_btn btn-primary'))

WebUI.delay(5)

WebUI.closeWindowIndex(2)

WebUI.switchToWindowIndex(1)

WebUI.selectOptionByIndex(findTestObject('EMPLOYEE Account buttons/Canditate section1/Canditate section2/S2/select_Candidate name'), 
    1)

WebUI.waitForElementPresent(findTestObject('EMPLOYEE Account buttons/Canditate section1/Canditate section2/S2/select_Candidate name'), 
    2)

WebUI.setText(findTestObject('EMPLOYEE Account buttons/Canditate section1/Canditate section2/S2/input_Submit the details_jobtitle'), 
    findTestData('LOGIN DETAILS').getValue(1, 1))

WebUI.setText(findTestObject('EMPLOYEE Account buttons/Canditate section1/Canditate section2/S2/input_Submit the details_jobportal'), 
    findTestData('LOGIN DETAILS').getValue(9, 1))

WebUI.setText(findTestObject('EMPLOYEE Account buttons/Canditate section1/Canditate section2/S2/input_Submit the details_application'), 
    findTestData('LOGIN DETAILS').getValue(10, 1))

WebUI.setText(findTestObject('EMPLOYEE Account buttons/Canditate section1/Canditate section2/S2/input_Submit the details_email'), 
    findTestData('LOGIN DETAILS').getValue(2, 1))

WebUI.setText(findTestObject('EMPLOYEE Account buttons/Canditate section1/Canditate section2/S2/input_Submit the details_phone'), 
    findTestData('LOGIN DETAILS').getValue(3, 1))

WebUI.setText(findTestObject('EMPLOYEE Account buttons/Canditate section1/Canditate section2/S2/input_Submit the details_client'), 
    findTestData('LOGIN DETAILS').getValue(4, 1))

WebUI.click(findTestObject('EMPLOYEE Account buttons/buttons/button_Submit for job portal'))

WebUI.closeWindowIndex(2)

WebUI.switchToWindowIndex(1)

WebUI.click(findTestObject('EMPLOYEE Account buttons/buttons/button_Date and Time'))

WebUI.click(findTestObject('EMPLOYEE Account buttons/buttons/button_Work History'))

WebUI.back()

WebUI.click(findTestObject('EMPLOYEE Account buttons/buttons/a_Candidate info'))

WebUI.click(findTestObject('EMPLOYEE Account buttons/buttons/a_SendMail'))

WebUI.waitForElementPresent(findTestObject('EMPLOYEE Account buttons/buttons/a_SendMail'), 3)

WebUI.back()

WebUI.click(findTestObject('EMPLOYEE Account buttons/buttons/a_Receive Mail'))

WebUI.waitForElementPresent(findTestObject('EMPLOYEE Account buttons/buttons/a_Receive Mail'), 3)

WebUI.back()

WebUI.mouseOver(findTestObject('EMPLOYEE Account buttons/buttons/a_Vendor info'))

WebUI.click(findTestObject('EMPLOYEE Account buttons/buttons/a_Benchsales'))

WebUI.mouseOver(findTestObject('EMPLOYEE Account buttons/buttons/a_PARDHU MUDUNURU'))

WebUI.click(findTestObject('EMPLOYEE Account buttons/buttons/a_Logout'))

WebUI.closeBrowser()

