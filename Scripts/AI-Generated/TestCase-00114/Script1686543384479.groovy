import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_webinars_what-new-katalon-studio-7-5-demo-qa'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/webinars/what-new-katalon-studio-7-5-demo-qa')

'step 2: Add visual checkpoint at Page_webinars_what-new-katalon-studio-7-5-demo-qa'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00114_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
