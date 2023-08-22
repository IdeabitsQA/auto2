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

WebUI.callTestCase(findTestCase('Android/Login/Verify Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/OldAndroid/Profile/android.widget.ImageView (3)'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/Profile/android.widget.TextView - My Account Settings (1)'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/Profile/android.widget.TextView - Reset Password (1)'), 0)

Mobile.setText(findTestObject('Object Repository/OldAndroid/Profile/android.widget.EditText - Enter new password (min. 8 characters)'), 
    'Admin@123', 0)

Mobile.setText(findTestObject('Object Repository/OldAndroid/Profile/android.widget.EditText - Confirm new password'), 'Admin@123', 
    0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/Profile/android.widget.TextView - Reset Password (2)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/OldAndroid/Profile/android.widget.TextView -  Welcome to Growloop'), 
    0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/Profile/android.widget.TextView - Login'), 0)

Mobile.setText(findTestObject('Object Repository/OldAndroid/Profile/android.widget.EditText - Enter your email'), 'Sadhani@ideabits.se', 
    0)

Mobile.setText(findTestObject('Object Repository/OldAndroid/Profile/android.widget.EditText - Enter your Password (min. 8 characters)'), 
    'Admin@123', 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/Profile/android.widget.TextView - Login (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/OldAndroid/Profile/android.widget.ImageView (4)'), 0)

Mobile.closeApplication()

