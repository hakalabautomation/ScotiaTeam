package qa.automation.mobile.flow.steps;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import qa.automation.mobile.stage.set.steps.EnrolClaveWebKeyPassStageSet;

@SuiteClasses({ EnrolClaveWebKeyPassStageSet.class })
public class EnrrolamientoClaveWebKeyPassTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(EnrrolamientoClaveWebKeyPassTest.class);

	@BeforeClass
	public static void flag() throws Exception {
		LOGGER.info("Ejecutando Enrrolamiento clave web con KeyPass ...");
	}
}