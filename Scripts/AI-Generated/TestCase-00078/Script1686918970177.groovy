import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_resources-center_blog_test-orchestration'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/resources-center/blog/test-orchestration')

'step 2: Add visual checkpoint at Page_resources-center_blog_test-orchestration'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00078_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
