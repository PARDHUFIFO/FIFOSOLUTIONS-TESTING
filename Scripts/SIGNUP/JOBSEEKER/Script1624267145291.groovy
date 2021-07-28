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

WebUI.click(findTestObject('SIGNUP/a_JobSeeker'))

WebUI.setText(findTestObject('JOB SEEKER/input_First name_fname'), findTestData('SIGNUP DETAILS').getValue(9, 1))

WebUI.setText(findTestObject('JOB SEEKER/input_Last name_lname'), findTestData('SIGNUP DETAILS').getValue(10, 1))

WebUI.setText(findTestObject('JOB SEEKER/input_Email_email'), findTestData('SIGNUP DETAILS').getValue(4, 1))

WebUI.setText(findTestObject('JOB SEEKER/input_Password_password'), findTestData('SIGNUP DETAILS').getValue(2, 1))

WebUI.setText(findTestObject('JOB SEEKER/input_Confirm Password_cpass'), findTestData('SIGNUP DETAILS').getValue(3, 1))

WebUI.setText(findTestObject('JOB SEEKER/input_Mobile number_mobile'), findTestData('SIGNUP DETAILS').getValue(5, 1))

WebUI.setText(findTestObject('JOB SEEKER/input_Current location_location'), findTestData('SIGNUP DETAILS').getValue(11, 
        1))

WebUI.setMaskedText(findTestObject('JOB SEEKER/input_Date of birth_date'), '01-01-1993')

WebUI.setText(findTestObject('JOB SEEKER/input_Job title_title'), 'intern')

WebUI.setText(findTestObject('JOB SEEKER/input_Experience_experience'), '6')

WebUI.uploadFile(findTestObject('JOB SEEKER/input_Resume_resume'), 'C:\\Users\\pardh\\OneDrive\\Desktop\\cv.docx')

WebUI.setText(findTestObject('JOB SEEKER/input_Desired salary_salary'), '111')

WebUI.selectOptionByIndex(findTestObject('JOB SEEKER/select_Select option            Full Time            Part Time            Contract            Third Party'), 
    1)

WebUI.selectOptionByIndex(findTestObject('JOB SEEKER/select_Select option            Yes              No'), 1)

WebUI.selectOptionByIndex(findTestObject('JOB SEEKER/VISA STATUS'), 5)

WebUI.click(findTestObject('JOB SEEKER/button_Save your profile'))

WebUI.closeBrowser()

