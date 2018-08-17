package qa.automation.mobile.flow.components;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.stage.set.components.enrolClaveScotiapass.ButtonIngresarScotiapassEnrolStageSet;
import qa.automation.mobile.stage.set.components.enrolClaveScotiapass.EditScotiapassEnrolStageSet;
import qa.automation.mobile.stage.set.components.enrolClaveScotiapass.ViewClaveScotiapassEnrolStageSet;
import qa.automation.mobile.stage.set.components.enrolCodigoSms.ButtonIngresarCodigoSmsEnrolStageSet;
import qa.automation.mobile.stage.set.components.enrolCodigoSms.ButtonReenviarSmsEnrolStageSet;
import qa.automation.mobile.stage.set.components.enrolCodigoSms.EditCodigoSmsEnrolStageSet;
import qa.automation.mobile.stage.set.components.enrolCodigoSms.ViewIngresoSmsEnrolStageSet;
import qa.automation.mobile.stage.set.components.enrolEsTuCelularAndroid.ButtonConfirmarTelEnrolStageSet;
import qa.automation.mobile.stage.set.components.enrolEsTuCelularAndroid.EditNumeroCelularEnrolStageSet;
import qa.automation.mobile.stage.set.components.enrolEsTuCelularAndroid.ViewEsTuCelularEnrolStageSet;
import qa.automation.mobile.stage.set.components.enrolLogin.ButtonIngresarLoginEnrolStageSet;
import qa.automation.mobile.stage.set.components.enrolLogin.EditClaveInternetLoginEnrolStageSet;
import qa.automation.mobile.stage.set.components.enrolLogin.EditRutLoginEnrolStageSet;
import qa.automation.mobile.stage.set.components.enrolLogin.ViewLoginEnrolStageSet;
import qa.automation.mobile.stage.set.components.enrolSeleccionClave.ButtonClaveWebEnrolStageSet;
import qa.automation.mobile.stage.set.components.enrolSeleccionClave.ButtonCrearClaveMobileEnrolStageSet;
import qa.automation.mobile.stage.set.components.enrolSeleccionClave.ButtonIngresarClaveEnrolStageSet;
import qa.automation.mobile.stage.set.components.enrolSeleccionClave.EditCrearClaveMobileEnrolStageSet;
import qa.automation.mobile.stage.set.components.enrolSeleccionClave.EditRepiteClaveMobileEnrolStageSet;
import qa.automation.mobile.stage.set.components.enrolSeleccionClave.ViewSeleccionClaveEnrolStageSet;

@SuiteClasses({ ViewLoginEnrolStageSet.class, EditRutLoginEnrolStageSet.class, EditClaveInternetLoginEnrolStageSet.class, ButtonIngresarLoginEnrolStageSet.class,
		ViewEsTuCelularEnrolStageSet.class, EditNumeroCelularEnrolStageSet.class, ButtonConfirmarTelEnrolStageSet.class, ViewIngresoSmsEnrolStageSet.class,
		ButtonReenviarSmsEnrolStageSet.class, EditCodigoSmsEnrolStageSet.class, ButtonIngresarCodigoSmsEnrolStageSet.class, ViewSeleccionClaveEnrolStageSet.class,
		ButtonCrearClaveMobileEnrolStageSet.class, EditCrearClaveMobileEnrolStageSet.class, EditRepiteClaveMobileEnrolStageSet.class, ButtonClaveWebEnrolStageSet.class,
		ButtonIngresarClaveEnrolStageSet.class, ViewClaveScotiapassEnrolStageSet.class, EditScotiapassEnrolStageSet.class, ButtonIngresarScotiapassEnrolStageSet.class })
public class ComponentesEnrrolamientoScotiapassTest extends BaseFlow {
	private static final Logger LOGGER = LoggerFactory.getLogger(ComponentesEnrrolamientoScotiapassTest.class);

	@BeforeClass
	public static void flag() throws Exception {
		LOGGER.info("Ejecutando validacion componentes en enrrolamiento clave web ...");
	}
}
