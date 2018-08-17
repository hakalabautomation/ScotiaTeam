package qa.automation.mobile.flow.steps;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.stage.set.steps.TransferenciaEntreProductosCRDaCTEStageSet;

@SuiteClasses({ TransferenciaEntreProductosCRDaCTEStageSet.class })
public class TransferenciaEntreProductosCrdAVistaTest extends BaseFlow {
	private static final Logger LOGGER = LoggerFactory.getLogger(TransferenciaEntreProductosCrdAVistaTest.class);

	@BeforeClass
	public static void flag() throws Exception {
		LOGGER.info("Ejecutando Agregar destinatario distinto banco con KeyPass ...");
	}
}