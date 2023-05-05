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

WebUI.click(findTestObject('Object Repository/addUser_OrangeHRM/a_PIM'))
WebUI.click(findTestObject('Object Repository/addUser_OrangeHRM/button_Add'))
WebUI.uploadFile(findTestObject('addUser_OrangeHRM/button_Add Employee_oxd-icon-button employee-image-action'), 'C:\\Users\\masari\\KatalonStudio\\Test Automation\\File\\masarii.jpg')
WebUI.delay(5)
WebUI.setText(findTestObject('Object Repository/addUser_OrangeHRM/input_Employee Full Name_firstName'), 'Masari')
WebUI.setText(findTestObject('Object Repository/addUser_OrangeHRM/input_Employee Full Name_middleName'), 'Pras')
WebUI.setText(findTestObject('Object Repository/addUser_OrangeHRM/input_Employee Full Name_lastName'), 'Tyo')

WebUI.click(findTestObject('Object Repository/addUser_OrangeHRM/span_Employee Id_oxd-switch-input oxd-switch-input--active --label-right'))
WebUI.setText(findTestObject('Object Repository/addUser_OrangeHRM/input_Username_oxd-input oxd-input--focus'), 'masari')
WebUI.setText(findTestObject('Object Repository/addUser_OrangeHRM/input_Password_oxd-input oxd-input--active'), 'Masari123@')
WebUI.setText(findTestObject('Object Repository/addUser_OrangeHRM/input_Confirm Password_oxd-input oxd-input--active'), 'Masari123@')
WebUI.click(findTestObject('Object Repository/addUser_OrangeHRM/button_Save'))

WebUI.verifyElementPresent(findTestObject('Object Repository/addUser_OrangeHRM/h6_Masari Tyo'), 0)

