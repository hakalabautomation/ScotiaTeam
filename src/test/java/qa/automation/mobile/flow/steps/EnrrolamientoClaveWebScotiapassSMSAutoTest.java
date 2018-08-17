package qa.automation.mobile.flow.steps;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import qa.automation.mobile.stage.set.steps.EnrolClaveWebScotiapassSMSAutoStageSet;

@SuiteClasses({ EnrolClaveWebScotiapassSMSAutoStageSet.class })
public class EnrrolamientoClaveWebScotiapassSMSAutoTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(EnrrolamientoClaveWebScotiapassSMSAutoTest.class);

	@BeforeClass
	public static void flag() throws Exception {
		LOGGER.info("Ejecutando Enrrolamiento con codigo SMS ingresado de forma automatica para android ...");
	}
}