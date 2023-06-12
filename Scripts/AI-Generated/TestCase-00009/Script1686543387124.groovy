import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_business-outcomes'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/business-outcomes')

'step 2: At Page_business-outcomes click on hyperlink_case_studies --> navigate to Page_case-studies'

testObj = findTestObject('Object Repository/Page_business-outcomes/hyperlink_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/business-outcomes(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_case-studies'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00009_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
