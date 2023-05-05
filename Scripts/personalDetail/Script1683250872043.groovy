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


WebUI.setText(findTestObject('Object Repository/PersonalDetail_OrangeHRM/personalDetails_input_Nickname'), 'Masari')
WebUI.setText(findTestObject('Object Repository/PersonalDetail_OrangeHRM/personalDetails_input_OtherId'), '0002622')
WebUI.setText(findTestObject('Object Repository/PersonalDetail_OrangeHRM/personalDetails_input_DriverLicenseNumber'), '123123123')
WebUI.setText(findTestObject('Object Repository/PersonalDetail_OrangeHRM/personalDetails_input_LicenseExpiryDate'), '2025-05-05')
WebUI.setText(findTestObject('Object Repository/PersonalDetail_OrangeHRM/personalDetails_input_SSN_Number'), '123123123')
WebUI.setText(findTestObject('Object Repository/PersonalDetail_OrangeHRM/personalDetails_input_SIN_Number'), '123123123')
WebUI.click(findTestObject('Object Repository/PersonalDetail_OrangeHRM/personalDetails_div_SelectNationality'))
WebUI.click(findTestObject('Object Repository/PersonalDetail_OrangeHRM/div_Indonesian'))
WebUI.click(findTestObject('Object Repository/PersonalDetail_OrangeHRM/personalDetails_div_SelectMaritalStatus'))
WebUI.click(findTestObject('Object Repository/PersonalDetail_OrangeHRM/div_Single'))
WebUI.setText(findTestObject('Object Repository/PersonalDetail_OrangeHRM/personalDetails_input_DateofBirth'), '1998-01-11')
WebUI.click(findTestObject('Object Repository/PersonalDetail_OrangeHRM/label_Male'))
WebUI.setText(findTestObject('Object Repository/PersonalDetail_OrangeHRM/personalDetails_input_MilitaryService'), 'none')
WebUI.click(findTestObject('Object Repository/PersonalDetail_OrangeHRM/button_Save_PersonalDetail'))

WebUI.click(findTestObject('Object Repository/PersonalDetail_OrangeHRM/personalDetails_div_SelectBloodType'))
WebUI.click(findTestObject('Object Repository/PersonalDetail_OrangeHRM/div_O'))
WebUI.click(findTestObject('Object Repository/PersonalDetail_OrangeHRM/button_Save_CustomFields'))

//WebUI.click(findTestObject('Object Repository/PersonalDetail_OrangeHRM/button_Add'))
//WebUI.uploadFile(findTestObject('Object Repository/PersonalDetail_OrangeHRM/div_Browse'), file)
//WebUI.delay(5)
//WebUI.setText(findTestObject('Object Repository/PersonalDetail_OrangeHRM/personalDetails_textarea_Comment'), 'attach 1')
//WebUI.click(findTestObject('Object Repository/PersonalDetail_OrangeHRM/button_Save_addAttachment'))
//WebUI.delay(5)
//WebUI.click(findTestObject('Object Repository/PersonalDetail_OrangeHRM/button_Add'))
//WebUI.uploadFile(findTestObject('Object Repository/PersonalDetail_OrangeHRM/div_Browse'), file2)
//WebUI.delay(5)
//WebUI.setText(findTestObject('Object Repository/PersonalDetail_OrangeHRM/personalDetails_textarea_Comment'), 'attach 2')
//WebUI.click(findTestObject('Object Repository/PersonalDetail_OrangeHRM/button_Save_addAttachment'))

