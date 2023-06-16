import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_webinars_enhance-software-testing-process'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/webinars/enhance-software-testing-process')

'step 2: Add visual checkpoint at Page_webinars_enhance-software-testing-process'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00101_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
