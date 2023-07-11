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

Mobile.startApplication('C:\\Users\\ASUS\\Katalon Studio\\Growloop Mobile Automation\\app-release.apk', true)

Mobile.tap(findTestObject('Object Repository/Growloop/android.widget.TextView - Login (9)'), 0)

Mobile.setText(findTestObject('Object Repository/Growloop/android.widget.EditText - Enter your email (5)'), 'Sadhani@ideabits.se', 
    0)

Mobile.setText(findTestObject('Object Repository/Growloop/android.widget.EditText - Enter your Password (min. 8 characters) (7)'), 
    'Admin@123', 0)

Mobile.tap(findTestObject('Object Repository/Growloop/android.view.ViewGroup (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Growloop/android.widget.TextView - Tools (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Growloop/android.widget.TextView - Feedback'), 0)

Mobile.scrollToText('Share your thoughts...')

Mobile.setText(findTestObject('Object Repository/Growloop/android.widget.EditText - Share your thoughts (2)'), 'Test feedback1', 
    0)

Mobile.tap(findTestObject('Object Repository/Growloop/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Growloop/android.widget.TextView - Experiment and renewal (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Growloop/android.widget.TextView - Blessing (2)'), 0)

Mobile.scrollToText('Send Feedback')

Mobile.scrollToText('Tap here to select')

Mobile.tap(findTestObject('Object Repository/Growloop/com.horcrux.svg.PathView (8)'), 0)

Mobile.tap(findTestObject('Object Repository/Growloop/android.widget.TextView - Select Video'), 0)

Mobile.tap(findTestObject('Object Repository/Growloop/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Growloop/android.widget.ImageView (3)'), 0)

Mobile.tap(findTestObject('Growloop/android.widget.TextView - sadhaniideabits.ses'), 0)

Mobile.tap(findTestObject('Object Repository/Growloop/android.widget.TextView - Select'), 0)

Mobile.scrollToText('Shame')

Mobile.tap(findTestObject('Object Repository/Growloop/android.widget.TextView - Send Feedback'), 0)

Mobile.closeApplication()

