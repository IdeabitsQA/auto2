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

WebUI.callTestCase(findTestCase('Android/Login/Verify Login'), [('email') : 'Sadhani@ideabits.se', ('password') : 'Admin@123'], 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Android/Tools/Retrospective/android.widget.TextView - Tools'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Tools/Retrospective/android.widget.TextView - Add New'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Tools/Retrospective/com.horcrux.svg.PathView'), 0)

Mobile.setText(findTestObject('Object Repository/Android/Tools/Retrospective/android.widget.EditText'), 'test 1', 0)

Mobile.tap(findTestObject('Object Repository/Android/Tools/Retrospective/com.horcrux.svg.PathView (5)'), 0)

Mobile.setText(findTestObject('Object Repository/Android/Tools/Retrospective/android.widget.EditText (4)'), 'test 2', 0)

Mobile.tap(findTestObject('Object Repository/Android/Tools/Retrospective/com.horcrux.svg.PathView (6)'), 0)

Mobile.setText(findTestObject('Object Repository/Android/Tools/Retrospective/android.widget.EditText (5)'), 'test 3', 0)

Mobile.scrollToText('Save Retrospective')

Mobile.tap(findTestObject('Object Repository/Android/Tools/Retrospective/android.widget.TextView - Save Retrospective'), 
    0)

Mobile.tap(findTestObject('Android/Tools/Retrospective/android.widget.TextView - Tools'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Tools/Retrospective/android.widget.TextView - View All'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Android/Tools/Retrospective/android.widget.TextView - Retrospect'), 
    0)

Mobile.tap(findTestObject('Object Repository/Android/Tools/Retrospective/android.widget.TextView - View More'), 0)

Mobile.tap(findTestObject('Android/Tools/Retrospective/com.horcrux.svg.PathView (2)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android/Tools/Retrospective/android.widget.TextView - test 1'), 
    'test 1')

Mobile.tap(findTestObject('Object Repository/Android/Tools/Retrospective/com.horcrux.svg.PathView (3)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android/Tools/Retrospective/android.widget.TextView - test 2'), 
    'test 2')

Mobile.tap(findTestObject('Object Repository/Android/Tools/Retrospective/com.horcrux.svg.PathView (4)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android/Tools/Retrospective/android.widget.TextView - test 3'), 
    'test 3')

Mobile.tap(findTestObject('Object Repository/Android/Tools/Retrospective/android.widget.TextView - Close'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Android/Tools/Retrospective/android.widget.TextView - Retrospectives'), 
    0)

Mobile.tap(findTestObject('Object Repository/Android/Tools/Retrospective/android.widget.ImageView'), 0)

Mobile.closeApplication()

