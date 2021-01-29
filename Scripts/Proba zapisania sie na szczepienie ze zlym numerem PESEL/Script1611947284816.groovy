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

WebUI.navigateToUrl('https://szczepimysie.pacjent.gov.pl/')

WebUI.setText(findTestObject('Object Repository/Page_Formularz Pacjenta/input_Imi_firstName'), 'Adam')

WebUI.setText(findTestObject('Object Repository/Page_Formularz Pacjenta/input_Nazwisko_lastName'), 'Zawada')

WebUI.setText(findTestObject('Object Repository/Page_Formularz Pacjenta/input_Numer PESEL_idExt'), '90061605538')

WebUI.setText(findTestObject('Object Repository/Page_Formularz Pacjenta/input_dwie cyfry mylnik trzy cyfry (mylnik _7f80ed'), 
    '55-237')

WebUI.setText(findTestObject('Object Repository/Page_Formularz Pacjenta/input_Adres e-mail_email'), 'Zawada@rost.pl')

WebUI.setText(findTestObject('Object Repository/Page_Formularz Pacjenta/input_Powtrz adres e-mail_confirmEmail'), 'Zawada@rost.pl')

WebUI.setText(findTestObject('Object Repository/Page_Formularz Pacjenta/input_Numer telefonu_msisdn'), '+48 655 655 655')

WebUI.setText(findTestObject('Object Repository/Page_Formularz Pacjenta/input_Powtrz numer telefonu_confirmMsisdn'), '+48 655 655 655')

WebUI.click(findTestObject('Object Repository/Page_Formularz Pacjenta/input_Wysanie formularza wymaga poniszych z_021bdd'))

WebUI.click(findTestObject('Object Repository/Page_Formularz Pacjenta/input_Wysanie formularza wymaga poniszych z_13317b'))

WebUI.click(findTestObject('Object Repository/Page_Formularz Pacjenta/input_Wysanie formularza wymaga poniszych z_936b56'))

WebUI.click(findTestObject('Object Repository/Page_Formularz Pacjenta/span_Wylij formularz'))

