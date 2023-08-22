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

Mobile.tap(findTestObject('Object Repository/OldAndroid/android.widget.TextView - Login (10)'), 0)

Mobile.setText(findTestObject('Object Repository/OldAndroid/android.widget.EditText - Enter your email (7)'), 'Sadhani@ideabits.se', 
    0)

Mobile.setText(findTestObject('Object Repository/OldAndroid/android.widget.EditText - Enter your Password (min. 8 characters) (8)'), 
    'Admin@123', 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/android.widget.TextView - Login (11)'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/com.horcrux.svg.PathView (9)'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/android.widget.TextView - Goal Setting'), 0)

Mobile.setText(findTestObject('Object Repository/OldAndroid/android.widget.EditText - Add your goal title'), 'Test Goal', 
    0)

Mobile.setText(findTestObject('Object Repository/OldAndroid/android.widget.EditText - Share Thoughts'), 'test description', 
    0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/android.widget.ImageView (4)'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/android.widget.TextView - Performance'), 0)

Mobile.setText(findTestObject('Object Repository/OldAndroid/android.widget.EditText - Share Thoughts (1)'), 'Test Impotance text', 
    0)

Mobile.scrollToText('Who is minding about it?')

Mobile.tap(findTestObject('Object Repository/OldAndroid/android.widget.ImageView (5)'), 0)

Mobile.tap(findTestObject('OldAndroid/android.widget.TextView - sadhaniideabits.ses'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/android.view.ViewGroup (6)'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/android.widget.TextView - Select End Date'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/android.view.View - 20'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/android.widget.Button - OK'), 0)

Mobile.setText(findTestObject('Object Repository/OldAndroid/android.widget.EditText - Actions you want to take to achieve the goal'), 
    'test action', 0)

Mobile.scrollToText('Select Follow up Frequency *')

Mobile.tap(findTestObject('Object Repository/OldAndroid/android.widget.ImageView (7)'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/android.widget.TextView - Every Day'), 0)

Mobile.scrollToText('Create Goal')

Mobile.tap(findTestObject('Object Repository/OldAndroid/android.widget.TextView - Create Goal'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/com.horcrux.svg.PathView (10)'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/com.horcrux.svg.PathView (11)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/OldAndroid/android.widget.TextView - Test Goal'), 'Test Goal')

Mobile.verifyElementText(findTestObject('Object Repository/OldAndroid/android.widget.TextView - test description'), 'test description')

Mobile.tap(findTestObject('Object Repository/OldAndroid/android.widget.TextView - View Goal'), 0)

Mobile.verifyElementText(findTestObject('OldAndroid/android.widget.TextView - Test Goal'), 'Test Goal')

Mobile.verifyElementText(findTestObject('Object Repository/OldAndroid/android.widget.TextView - Test Impotance text'), 'Test Impotance text')

Mobile.scrollToText('Results')

Mobile.verifyElementText(findTestObject('Object Repository/OldAndroid/android.widget.TextView - test action'), 'test action')

Mobile.verifyElementText(findTestObject('Object Repository/OldAndroid/android.widget.TextView - Every Day (1)'), 'Every Day')

Mobile.tap(findTestObject('Object Repository/OldAndroid/com.horcrux.svg.PathView (12)'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/com.horcrux.svg.PathView (13)'), 0)

Mobile.tap(findTestObject('Object Repository/OldAndroid/android.widget.ImageView (8)'), 0)

Mobile.closeApplication()

