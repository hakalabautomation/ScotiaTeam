package qa.automation.mobile.flow;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import qa.automatedtesting.htmlreport.HtmlReport;
import qa.automation.mobile.appium.server.AppiumServer;
import qa.automation.mobile.model.PageModel;
import qa.automation.mobile.properties.PropertiesInit;
import qa.automation.mobile.util.GenericMethod;

@RunWith(Suite.class)
@SuiteClasses({})
public class BaseFlow {
	private static AppiumServer appium;
	public static PropertiesInit properties;
	public static AppiumDriver<MobileElement> driver;
	public static PageModel pageModel;
	public static final Logger LOGGER = LoggerFactory.getLogger(BaseFlow.class);
	public static final String scotiapackage = "cl.scotiabank.uat";
	public static final String scotiapackageEnv = scotiapackage;
	public static HtmlReport htmlReport;

	@BeforeClass
	public static void setUp() throws MalformedURLException {
		try {
			htmlReport = new HtmlReport(driver, "fails", "Reporte Scotiabank Go", "true", "Reporte Scotiabank Go");
			properties = new PropertiesInit();
			appium = new AppiumServer();
			// appium.startServer();
			// driver = appium.getIOSDriver();
			// driver = new AppiumDriver<MobileElement>(new URL(System.getenv("URL_APPIUM")), appium.capabilities());
			driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), appium.capabilities());
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			pageModel = PageFactory.initElements(driver, PageModel.class);
		} catch (Exception e) {
			LOGGER.info(e.toString());
		}
	}

	@AfterClass
	public static void finish() {
		LOGGER.info("************************************************");
		LOGGER.info("**   Finaliza ciclo de pruebas automatizadas  **");
		LOGGER.info("************************************************");
		htmlReport.generaHTML();
		GenericMethod.cerrarDriver(driver);
		// appium.stopServer();
	}
}