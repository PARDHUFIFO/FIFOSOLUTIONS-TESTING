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

WebUI.mouseOver(findTestObject('SERVICES/a_Services'))

WebUI.click(findTestObject('SERVICES/a_Training'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('SERVICES/a_Services'))

WebUI.click(findTestObject('SERVICES/a_Placements'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('SERVICES/a_Services'))

WebUI.click(findTestObject('SERVICES/a_Marketing'))

WebUI.deleteAllCookies(FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('SERVICES/a_Services'))

WebUI.click(findTestObject('SERVICES/a_Cloud Computing'))

WebUI.delay(2)

WebUI.click(findTestObject('SERVICES/span_Talk to an Expert'))

WebUI.mouseOver(findTestObject('SERVICES/a_Services'))

WebUI.click(findTestObject('SERVICES/a_E-ecommerce'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('SERVICES/a_Services'))

WebUI.click(findTestObject('SERVICES/a_SAP'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('SERVICES/a_Services'))

WebUI.click(findTestObject('SERVICES/a_Data Analytics'))

WebUI.delay(2)

WebUI.refresh()

WebUI.closeBrowser()

