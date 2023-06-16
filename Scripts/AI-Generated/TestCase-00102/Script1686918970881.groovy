import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_continuous-testing-self-assessment'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/continuous-testing-self-assessment')

'step 2: Add visual checkpoint at Page_continuous-testing-self-assessment'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00102_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
