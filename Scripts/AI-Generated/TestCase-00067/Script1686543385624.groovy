import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_ebooks_software-tester-handbook'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/ebooks/software-tester-handbook')

'step 2: Add visual checkpoint at Page_ebooks_software-tester-handbook'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00067_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()