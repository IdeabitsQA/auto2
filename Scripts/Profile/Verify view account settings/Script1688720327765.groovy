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

WebUI.callTestCase(findTestCase('Login/Verify Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Growloop/Profile/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Growloop/Profile/android.widget.TextView - My Account Settings'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Growloop/Profile/android.widget.EditText - Sadhani'), 'Sadhani')

Mobile.verifyElementText(findTestObject('Object Repository/Growloop/Profile/android.widget.EditText - sadhaniideabits.se'), 
    'sadhani@ideabits.se')

Mobile.verifyElementText(findTestObject('Object Repository/Growloop/Profile/android.widget.TextView - Reset Password'), 
    'Reset Password')

Mobile.verifyElementText(findTestObject('Object Repository/Growloop/Profile/android.widget.TextView - View Privacy Policy'), 
    'View Privacy Policy')

Mobile.verifyElementText(findTestObject('Object Repository/Growloop/Profile/android.widget.TextView - De-Activate Account'), 
    'De-Activate Account')

Mobile.verifyElementText(findTestObject('Object Repository/Growloop/Profile/android.widget.TextView - Change Language'), 
    'Change Language')

Mobile.tap(findTestObject('Object Repository/Growloop/Profile/com.horcrux.svg.PathView'), 0)

Mobile.closeApplication()

