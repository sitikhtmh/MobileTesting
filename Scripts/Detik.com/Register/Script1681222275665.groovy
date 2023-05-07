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

Mobile.startApplication('Mobile App/org.detikcom.rss_2023-02-13.apk', false)

Mobile.tap(findTestObject('Detik.com/Profil - Register/Menu_Profil'), 0)

Mobile.tap(findTestObject('Detik.com/Profil - Register/MenuProfil_Daftar'), 0)

Mobile.tap(findTestObject('Detik.com/Profil - Register/MenuProfile_btnREGISTER'), 0)

Mobile.setText(findTestObject('Detik.com/Profil - Register/EditText_NamaLengkap'), 'Siti Khotimah', 0)

Mobile.setText(findTestObject('Detik.com/Profil - Register/EditText_NoPonsel'), '085261869454', 0)

Mobile.setText(findTestObject('Detik.com/Profil - Register/EditText_Email'), 'siti.khotimah.ft17@gmail.com', 0)

Mobile.setText(findTestObject('Detik.com/Profil - Register/EditText_Password'), 'Eduwork123.', 0)

Mobile.setText(findTestObject('Detik.com/Profil - Register/EditText_KonfirmasiPassword'), 'Eduwork123.', 0)

Mobile.tap(findTestObject('Detik.com/Profil - Register/cek'), 0)

Mobile.tap(findTestObject('Detik.com/Profil - Register/Btn_RegisterMPC'), 0)

Mobile.closeApplication()

