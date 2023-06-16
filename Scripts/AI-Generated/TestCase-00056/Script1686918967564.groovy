import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_test-automation-for-developers'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/test-automation-for-developers')

'step 2: Add visual checkpoint at Page_test-automation-for-developers'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00056_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
