import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_resources-center_blog_a-structured-evaluation-for-selecting-a-right-automated-testing-tool'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/resources-center/blog/a-structured-evaluation-for-selecting-a-right-automated-testing-tool')

'step 2: Add visual checkpoint at Page_resources-center_blog_a-structured-evaluation-for-selecting-a-right-automated-testing-tool'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00108_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
