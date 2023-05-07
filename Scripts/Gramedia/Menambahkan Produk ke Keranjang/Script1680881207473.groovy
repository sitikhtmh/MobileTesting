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

Mobile.startApplication('E:\\Bootcamp QA Automation - Eduwork\\Testing With Katalon\\EduApp\\Mobile App\\Gramedia Digital_5.8.0_Apkpure.apk', 
    true)

Mobile.tap(findTestObject('Object Repository/Gramedia/android.widget.TextView - Books'), 0)

'Get Device Height and Store in device_height variable'
device_Height = Mobile.getDeviceHeight()

'Get Width Height and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

'Storing the startY value'
int startY = device_Height * 0.30

'Storing the endY value'
int endY = device_Height * 0.70

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

'Swipe Vertical from bottom to top'
Mobile.swipe(startX, startY, endX, endY)

'Get Device Height and Store in device_height variable'
device_Height = Mobile.getDeviceHeight()

'Get Width Height and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

'Storing the startY value'
int startY = device_Height * 0.30

'Storing the endY value'
int endY = device_Height * 0.70

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

'Swipe Vertical from bottom to top'
Mobile.swipe(startX, startY, endX, endY)

'Get Device Height and Store in device_height variable'
device_Height = Mobile.getDeviceHeight()

'Get Width Height and Store in device_Width variable'
device_Width = Mobile.getDeviceWidth()

'Storing the startX value by dividing device width by 2. Because x coordinates are constant for Vertical Swiping'
int startX = device_Width / 2

'Here startX and endX values are equal for vertical Swiping for that assigning startX value to endX'
int endX = startX

'Storing the startY value'
int startY = device_Height * 0.30

'Storing the endY value'
int endY = device_Height * 0.70

'Swipe Vertical from top to bottom'
Mobile.swipe(startX, endY, endX, startY)

'Swipe Vertical from bottom to top'
Mobile.swipe(startX, startY, endX, endY)

Mobile.tap(findTestObject('Object Repository/Gramedia/android.widget.TextView - Filter'), 0)

Mobile.tap(findTestObject('Object Repository/Gramedia/android.widget.ImageView (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Gramedia/android.widget.TextView - Free'), 0)

Mobile.tap(findTestObject('Object Repository/Gramedia/android.widget.TextView'), 0)

Mobile.tap(findTestObject('Object Repository/Gramedia/android.widget.ImageView (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Gramedia/android.widget.Button - FREE'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/Gramedia/android.widget.ImageView (4)'), 0)

Mobile.tap(findTestObject('Object Repository/Gramedia/android.widget.TextView - Indonesian'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.scrollToText('Bintang Kecil')

Mobile.tap(findTestObject('Object Repository/Gramedia/android.widget.ImageView (5)'), 0)

Mobile.tap(findTestObject('Object Repository/Gramedia/android.widget.RadioButton'), 0)

Mobile.tap(findTestObject('Object Repository/Gramedia/android.widget.Button - BUY (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Gramedia/android.widget.RadioButton (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Gramedia/android.widget.TextView - CHOOSE'), 0)

Mobile.tap(findTestObject('Object Repository/Gramedia/android.widget.Button - CONTINUE'), 0)

Mobile.closeApplication()

