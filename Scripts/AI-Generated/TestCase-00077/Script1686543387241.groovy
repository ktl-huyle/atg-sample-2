import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_katalon-vs-selenium'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/katalon-vs-selenium')

'step 2: Add visual checkpoint at Page_katalon-vs-selenium'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00077_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
