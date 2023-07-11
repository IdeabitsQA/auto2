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

Mobile.tap(findTestObject('Object Repository/Growloop/com.horcrux.svg.PathView (14)'), 0)

Mobile.tap(findTestObject('Object Repository/Growloop/android.widget.TextView - Retrospect'), 0)

Mobile.tap(findTestObject('Object Repository/Growloop/com.horcrux.svg.SvgView'), 0)

Mobile.setText(findTestObject('Object Repository/Growloop/android.widget.EditText'), 'test q1', 0)

Mobile.tap(findTestObject('Object Repository/Growloop/com.horcrux.svg.SvgView (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Growloop/android.widget.EditText (1)'), 'test q2', 0)

Mobile.scrollToText('Save Retrospection')

Mobile.tap(findTestObject('Object Repository/Growloop/android.view.ViewGroup (7)'), 0)

Mobile.scrollToText('Save Retrospection')

Mobile.tap(findTestObject('Object Repository/Growloop/android.widget.TextView - Save Retrospection'), 0)

Mobile.tap(findTestObject('Object Repository/Growloop/com.horcrux.svg.PathView (16)'), 0)

Mobile.tap(findTestObject('Object Repository/Growloop/android.widget.TextView - View More'), 0)

Mobile.tap(findTestObject('Object Repository/Growloop/com.horcrux.svg.SvgView (3)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Growloop/android.widget.TextView - test q1 (1)'), 'test q1')

Mobile.tap(findTestObject('Object Repository/Growloop/com.horcrux.svg.SvgView (7)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Growloop/android.widget.TextView - test q2'), 'test q2')

Mobile.tap(findTestObject('Object Repository/Growloop/com.horcrux.svg.PathView (19)'), 0)

Mobile.tap(findTestObject('Object Repository/Growloop/android.widget.ImageView (10)'), 0)

Mobile.closeApplication()

