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

Mobile.tap(findTestObject('Object Repository/Android/Journal/android.widget.TextView - Journal'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Journal/android.widget.TextView - Select Date'), 0)

Mobile.tap(findTestObject('Android/Journal/android.view.View - 7'), 0)

Mobile.tap(findTestObject('Android/Journal/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Android/Journal/android.view.View - 8 (1)'), 0)

Mobile.tap(findTestObject('Android/Journal/android.widget.Button - OK'), 0)

Mobile.closeApplication()

