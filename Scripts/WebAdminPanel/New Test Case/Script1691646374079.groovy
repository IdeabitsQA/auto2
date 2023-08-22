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

WebUI.navigateToUrl('https://qa.d342xyvxhwp6md.amplifyapp.com/')

WebUI.click(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/input_Email_email'))

WebUI.click(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/span_Select Loop'))

WebUI.click(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/div_Org'))

WebUI.click(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/div_Select Organization'))

WebUI.click(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/div_Dogfooding 0126 AAA edit_rc-virtual-lis_0ca628'))

WebUI.click(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/div_sssssssSSSSTest AutoTest Automationtest_a1b58f'))

WebUI.click(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/div_Test Automation'))

WebUI.setText(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/input_Question 1_questions_0_question'), 
    'r')

