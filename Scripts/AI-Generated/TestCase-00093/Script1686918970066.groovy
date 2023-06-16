import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_katalon-for-enterprises'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/katalon-for-enterprises')

'step 2: Add visual checkpoint at Page_katalon-for-enterprises'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00093_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
