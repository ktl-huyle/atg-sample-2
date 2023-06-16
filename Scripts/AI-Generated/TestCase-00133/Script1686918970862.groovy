import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_resources-center_blog_what-is-a-quality-platform'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/resources-center/blog/what-is-a-quality-platform')

'step 2: Add visual checkpoint at Page_resources-center_blog_what-is-a-quality-platform'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00133_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
