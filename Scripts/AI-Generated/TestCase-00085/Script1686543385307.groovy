import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_testing-platform-for-managers'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/testing-platform-for-managers')

'step 2: Add visual checkpoint at Page_testing-platform-for-managers'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00085_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
