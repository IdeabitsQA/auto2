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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://qa.d342xyvxhwp6md.amplifyapp.com/')

WebUI.setText(findTestObject('Object Repository/AdminPanel/Login/Page_Growloop Admin/input_Email_email'), 'Sadhani@ideabits.se')

WebUI.setEncryptedText(findTestObject('Object Repository/AdminPanel/Login/Page_Growloop Admin/input_Password_password'), 
    '7Dxoto1EjKfQbGop/Ov+1g==')

WebUI.click(findTestObject('Object Repository/AdminPanel/Login/Page_Growloop Admin/img'))

WebUI.click(findTestObject('Object Repository/AdminPanel/Login/Page_Growloop Admin/button_Login'))

WebUI.waitForElementPresent(findTestObject('Object Repository/AdminPanel/Login/Page_Growloop Admin/span_Dashboard'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/AdminPanel/Login/Page_Growloop Admin/span_Dashboard'), 'Dashboard')

