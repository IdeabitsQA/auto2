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

Mobile.tap(findTestObject('Object Repository/Android/Tools/android.widget.TextView - Tools'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Tools/android.widget.TextView - Add New'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Tools/android.widget.TextView - Share with Buddies or Teams'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Tools/android.widget.TextView - Test Automation'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Tools/android.widget.TextView - Select'), 0)

Mobile.scrollToText('Share your thoughts...')

Mobile.setText(findTestObject('Object Repository/Android/Tools/android.widget.EditText - Share your thoughts (1)'), 'Test Automation', 
    0)

Mobile.tap(findTestObject('Object Repository/Android/Tools/android.widget.TextView - Blessing'), 0)

Mobile.scrollToText('Share Feedback')

Mobile.tap(findTestObject('Object Repository/Android/Tools/android.widget.TextView - Share Feedback'), 0)

Mobile.tap(findTestObject('Android/Tools/android.widget.TextView - Tools'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Tools/android.widget.TextView - View All'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Android/Tools/android.widget.TextView - Test Automation (1)'), 
    '"Test Automation"')

Mobile.tap(findTestObject('Object Repository/Android/Tools/android.widget.ImageView'), 0)

Mobile.closeApplication()

