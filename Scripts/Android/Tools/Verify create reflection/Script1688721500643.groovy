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

Mobile.tap(findTestObject('Object Repository/OldAndroid/android.widget.TextView - Login (8)'), 0)

Mobile.setText(findTestObject('Object Repository/OldAndroid/android.widget.EditText - Enter your email (4)'), 'Sadhani@ideabits.se', 
    0)

Mobile.setText(findTestObject('Object Repository/OldAndroid/android.widget.EditText - Enter your Password (min. 8 characters) (6)'), 
    'Admin@123', 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/android.view.ViewGroup (3)'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/com.horcrux.svg.PathView (6)'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/android.widget.TextView - Reflection (1)'), 0)

Mobile.scrollToText('Dimension(s)')

Mobile.setText(findTestObject('Object Repository/OldAndroid/android.widget.EditText - Share your thoughts (1)'), 'Test Reflection 1', 
    0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/android.widget.TextView - Experiment and renewal (1)'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/android.widget.TextView - Blessing'), 0)

Mobile.scrollToText('Tap here to select')

Mobile.tap(findTestObject('Object Repository/OldAndroid/android.widget.TextView - Self-Reflect (1)'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/com.horcrux.svg.PathView (7)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/OldAndroid/android.widget.TextView - Test Reflection 1 (1)'), 'Test Reflection 1')

Mobile.verifyElementText(findTestObject('Object Repository/OldAndroid/android.widget.TextView - Blessing (3)'), 'Blessing')

Mobile.closeApplication()

