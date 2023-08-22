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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObje

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qa.d342xyvxhwp6md.amplifyapp.com/')

WebUI.setText(findTestObject('Object Repository/AdminPanel/Organization/Page_Growloop Admin/Page_Growloop Admin/input_Email_email'), 
    'Sadhani@ideabits.se')

WebUI.setEncryptedText(findTestObject('Object Repository/AdminPanel/Organization/Page_Growloop Admin/Page_Growloop Admin/input_Password_password'), 
    '7Dxoto1EjKfQbGop/Ov+1g==')

WebUI.sendKeys(findTestObject('Object Repository/AdminPanel/Organization/Page_Growloop Admin/Page_Growloop Admin/input_Password_password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/AdminPanel/Organization/Page_Growloop Admin/Page_Growloop Admin/button_Login'))

WebUI.click(findTestObject('Object Repository/AdminPanel/Organization/Page_Growloop Admin/Page_Growloop Admin/span_Organization'))

WebUI.click(findTestObject('Object Repository/AdminPanel/Organization/Page_Growloop Admin/Page_Growloop Admin/button_Create Organization'))

WebUI.setText(findTestObject('Object Repository/AdminPanel/Organization/Page_Growloop Admin/Page_Growloop Admin/input_Name of Organization ()_episodeName'), 
    'Test Automation')

WebUI.click(findTestObject('Object Repository/AdminPanel/Organization/Page_Growloop Admin/Page_Growloop Admin/input_Organization website (Optional)_undefined'))

WebUI.click(findTestObject('Object Repository/AdminPanel/Organization/Page_Growloop Admin/Page_Growloop Admin/div_Select Industry ()_react-dropdown-selec_423435'))

WebUI.click(findTestObject('Object Repository/AdminPanel/Organization/Page_Growloop Admin/Page_Growloop Admin/span_Computer Software'))

WebUI.uploadFile(findTestObject('AdminPanel/Organization/Page_Growloop Admin/a_Choose'), file)

//WebUI.sendKeys(findTestObject('AdminPanel/Organization/Page_Growloop Admin/a_Choose'), '/Users/antonthushara/Downloads/Automation.png')
//def filePath = RunConfiguration.getProjectDir() + '/yourImage.jpg'
//WebUI.uploadFileWithDragAndDrop('AdminPanel/Organization/Page_Growloop Admin/Page_Growloop Admin/a_Choose file', '/Users/antonthushara/Downloads/Automation.png')
//WebUI.delay(5)
WebUI.click(findTestObject('Object Repository/AdminPanel/Organization/Page_Growloop Admin/Page_Growloop Admin/button_Create Organization'))

