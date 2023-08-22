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

Mobile.tap(findTestObject('Object Repository/OldAndroid/Tracks/com.horcrux.svg.PathView'), 0)

Mobile.scrollToText('Welcome to Growloop')

Mobile.tap(findTestObject('Object Repository/OldAndroid/Tracks/android.widget.TextView - Welcome to Growloop'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/Tracks/android.widget.TextView - Lets Do This'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/Tracks/android.widget.TextView - 1. Introduction to Growloop'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/Tracks/android.widget.TextView - Welcome to Growloop, your digital leadership coach and trainer'), 
    0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/Tracks/android.widget.TextView - Start Fresh'), 0)

Mobile.scrollToText('Next')

Mobile.tap(findTestObject('Object Repository/OldAndroid/Tracks/android.widget.TextView - Next'), 0)

Mobile.scrollToText('Next')

Mobile.tap(findTestObject('Object Repository/OldAndroid/Tracks/android.widget.TextView - Next (1)'), 0)

Mobile.scrollToText('Previous')

Mobile.tap(findTestObject('Object Repository/OldAndroid/Tracks/android.widget.TextView - Next (4)'), 0)

Mobile.scrollToText('Previous')

Mobile.tap(findTestObject('OldAndroid/Tracks/android.widget.TextView - Next (2)'), 0)

Mobile.scrollToText('Previous')

Mobile.tap(findTestObject('OldAndroid/Tracks/android.widget.TextView - Next (3)'), 0)

Mobile.scrollToText('Previous')

Mobile.tap(findTestObject('OldAndroid/Tracks/android.widget.TextView - Next (4)'), 0)

Mobile.scrollToText('Previous')

Mobile.tap(findTestObject('Object Repository/OldAndroid/Tracks/android.widget.TextView - Next (5)'), 0)

Mobile.setText(findTestObject('Object Repository/OldAndroid/Tracks/android.widget.EditText - Share your thoughts'), 'test thoughts', 
    0)

Mobile.scrollToText('Image/Video shall be saved To Phone Gallery')

Mobile.tap(findTestObject('Object Repository/OldAndroid/Tracks/com.horcrux.svg.PathView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/Tracks/android.widget.TextView - Select Video'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/Tracks/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/Tracks/android.widget.TextView - Next (3)'), 0)

Mobile.scrollToText('Next')

Mobile.tap(findTestObject('OldAndroid/Tracks/android.widget.TextView - Next'), 0)

Mobile.scrollToText('Back to chapters')

Mobile.tap(findTestObject('Object Repository/OldAndroid/Tracks/android.widget.TextView - Back to chapters'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/Tracks/com.horcrux.svg.PathView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/Tracks/android.widget.ImageView (1)'), 0)

Mobile.scrollToText('Sadhani')

Mobile.verifyElementExist(findTestObject('Object Repository/OldAndroid/Tracks/android.widget.ImageView (2)'), 0)

Mobile.closeApplication()

