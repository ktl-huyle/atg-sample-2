import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_resources-center_blog_easy-automation-testing'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/resources-center/blog/easy-automation-testing')

'step 2: Add visual checkpoint at Page_resources-center_blog_easy-automation-testing'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00128_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
