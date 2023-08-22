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

WebUI.click(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/span_Retrospective'))

WebUI.click(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/button_Create Retrospective'))

WebUI.click(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/span_Swedish'))

WebUI.click(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/div_English'))

WebUI.setText(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/input_Retrospective Name_name'), 
    'Test Automation Retrospective')

WebUI.uploadFile(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/div_Upload Cover Image'), 
    file)

WebUI.click(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/span_Select Loop'))

WebUI.click(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/div_Org'))

WebUI.scrollToElement(findTestObject('AdminPanel/Create Retrospective/Page_Growloop Admin/active label'), 0)

WebUI.click(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/div_Select Organization'))

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('AdminPanel/Create Retrospective/Page_Growloop Admin/dropdown'), 0)


//WebUI.selectOptionByLabel(findTestObject('AdminPanel/Create Retrospective/Page_Growloop Admin/dropdown'), 'Test Automation', false)
//WebUI.selectOptionByValue(findTestObjectfindTestObject('AdminPanel/Create Retrospective/Page_Growloop Admin/dropdown'),  'Test Automation', false)
//WebUI.selectOptionByLabel(findTestObject('AdminPanel/Create Retrospective/Page_Growloop Admin/dropdown'), 'Test Automation', false)
WebUI.click(findTestObject('AdminPanel/Create Retrospective/Page_Growloop Admin/dropdown'))


WebUI.click(findTestObject('AdminPanel/Create Retrospective/Page_Growloop Admin/div_sssssssSSSSTest AutoTest Automationtest_a1b58f'))

WebUI.click(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/div_Test Automation'))

WebUI.setText(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/input_Question 1_questions_0_question'), 
    'Question 1')

WebUI.click(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/div_New RetrospectiveSelect LanguageEnglish_6533b4'))

WebUI.click(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/div_Reminder Frequency'))

WebUI.click(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/div_Every Day'))

WebUI.click(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/div_Reminder Frequency Type'))

WebUI.click(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/div_Count'))

WebUI.setText(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/input_Please add the number of times for th_a363bd'), 
    '2')

WebUI.click(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/span_Save'))

WebUI.verifyElementText(findTestObject('Object Repository/AdminPanel/Create Retrospective/Page_Growloop Admin/div_Retrospective successfully added'), 
    'Retrospective successfully added!')

