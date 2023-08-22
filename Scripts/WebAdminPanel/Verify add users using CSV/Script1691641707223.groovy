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

WebUI.callTestCase(findTestCase('WebAdminPanel/Verify admin login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/AdminPanel/Organization/Add users to organization/Page_Growloop Admin/span_Organization'))

WebUI.click(findTestObject('Object Repository/AdminPanel/Organization/Add users to organization/Page_Growloop Admin/svg'))

WebUI.setText(findTestObject('Object Repository/AdminPanel/Organization/Add users to organization/Page_Growloop Admin/input__ant-input'), 
    'test automation')

WebUI.click(findTestObject('Object Repository/AdminPanel/Organization/Add users to organization/Page_Growloop Admin/span_Search'))

WebUI.click(findTestObject('Object Repository/AdminPanel/Organization/Add users to organization/Page_Growloop Admin/mark_Test Automation'))

WebUI.click(findTestObject('Object Repository/AdminPanel/Organization/Add users to organization/Page_Growloop Admin/button_Add User'))

WebUI.uploadFile(findTestObject('AdminPanel/Organization/Add users to organization/Page_Growloop Admin/div_Choose CSV File'), 
    file)

WebUI.click(findTestObject('Object Repository/AdminPanel/Organization/Add users to organization/Page_Growloop Admin/button_Add Users to Organization'))

WebUI.verifyElementText(findTestObject('Object Repository/AdminPanel/Organization/Add users to organization/Page_Growloop Admin/span_hashaniideabits.se'), 
    'hashani@ideabits.se')

WebUI.verifyElementText(findTestObject('Object Repository/AdminPanel/Organization/Add users to organization/Page_Growloop Admin/span_sandunideabits.se'), 
    'sandun@ideabits.se')

