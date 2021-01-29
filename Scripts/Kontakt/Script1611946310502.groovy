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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.euro.com.pl/')

WebUI.click(findTestObject('Object Repository/Page_RTV EURO AGD - Sklep internetowy RTV A_b7a44b/a_Kontakt'))

WebUI.click(findTestObject('Object Repository/Page_Kontakt/a_Chc przej do strony kontakt'))

WebUI.click(findTestObject('Object Repository/Page_Kontakt/a_Przejd do formularza'))

WebUI.click(findTestObject('Object Repository/Page_Pomoc - Formularz kontaktowy/a_Ubezpieczenia'))

WebUI.click(findTestObject('Object Repository/Page_Ubezpieczenia - formularz kontaktowy/span_Wybierz temat zgoszenia'))

WebUI.click(findTestObject('Object Repository/Page_Ubezpieczenia - formularz kontaktowy/div_Potrzebuj korekty polisy'))

WebUI.setText(findTestObject('Object Repository/Page_Ubezpieczenia - formularz kontaktowy/textarea__problem'), 'Testuj')

WebUI.setText(findTestObject('Object Repository/Page_Ubezpieczenia - formularz kontaktowy/input__cms_input_name'), 'Bartosz')

WebUI.setText(findTestObject('Object Repository/Page_Ubezpieczenia - formularz kontaktowy/input__cms_input_last_name'), 
    'Zagórski')

WebUI.setText(findTestObject('Object Repository/Page_Ubezpieczenia - formularz kontaktowy/input__cms_input_email'), 'zagorski@wp.pl')

WebUI.setText(findTestObject('Object Repository/Page_Ubezpieczenia - formularz kontaktowy/input_Numer telefonu_cms_input_phone'), 
    '600600600')

WebUI.click(findTestObject('Object Repository/Page_Ubezpieczenia - formularz kontaktowy/span_Potrzebuj korekty polisy'))

WebUI.setText(findTestObject('Object Repository/Page_Ubezpieczenia - formularz kontaktowy/input__cms_input_policy_number'), 
    '6005896')

WebUI.click(findTestObject('Object Repository/Page_Ubezpieczenia - formularz kontaktowy/input__input-submit'))

