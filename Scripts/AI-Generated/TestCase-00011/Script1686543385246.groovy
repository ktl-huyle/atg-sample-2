import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_resources-center_blog_benefits-continuous-integration-delivery'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/resources-center/blog/benefits-continuous-integration-delivery')

'step 2: At Page_resources-center_blog_benefits-continuous-integration-delivery click on strong_object'

testObj = findTestObject('Object Repository/Page_resources-center_blog_benefits-continuous-integration-delivery/strong_object')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WS.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain +'/resources-center/blog/benefits-continuous-integration-delivery(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(testObj)

'step 3: Add visual checkpoint at Page_resources-center_blog_benefits-continuous-integration-delivery'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00011_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
