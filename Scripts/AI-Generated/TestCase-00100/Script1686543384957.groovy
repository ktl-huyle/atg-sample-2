import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_ebooks_digital-transformation-in-insurance'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/ebooks/digital-transformation-in-insurance')

'step 2: Add visual checkpoint at Page_ebooks_digital-transformation-in-insurance'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00100_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
