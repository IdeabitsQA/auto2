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

Mobile.tap(findTestObject('Object Repository/Android/Tools/Reflection/android.widget.Button - Never'), 0, FailureHandling.OPTIONAL)

Mobile.tap(findTestObject('Object Repository/Android/Tools/Reflection/android.widget.TextView - Tools'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Tools/Reflection/android.widget.TextView - Add New'), 0)

Mobile.scrollToText('Share your thoughts...')

Mobile.setText(findTestObject('Object Repository/Android/Tools/Reflection/android.widget.EditText - Share your thoughts'), 
    'Test Automatio Reflection', 0)

Mobile.tap(findTestObject('Object Repository/Android/Tools/Reflection/android.widget.TextView - Blessing'), 0)

Mobile.scrollToText('Save Reflection')

Mobile.tap(findTestObject('Object Repository/Android/Tools/Reflection/android.widget.TextView - Save Reflection'), 0)

Mobile.tap(findTestObject('Android/Tools/Reflection/android.widget.TextView - Tools'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Tools/Reflection/android.widget.TextView - View All'), 0)

Mobile.waitForElementPresent(findTestObject('Object Repository/Android/Tools/Reflection/android.widget.TextView - Reflection'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Android/Tools/Reflection/android.widget.TextView - Test Automatio Reflection'), 
    '"Test Automatio Reflection"')

Mobile.tap(findTestObject('Object Repository/Android/Tools/Reflection/android.widget.ImageView'), 0)

Mobile.closeApplication()

