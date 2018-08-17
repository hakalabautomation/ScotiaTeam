package qa.automation.mobile.flow.components;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.stage.set.components.itemTransfer.ButtonAutorizarScotiapassStageSet;
import qa.automation.mobile.stage.set.components.itemTransfer.ButtonCancelarSMSStageSet;
import qa.automation.mobile.stage.set.components.itemTransfer.ButtonCancelarScotiapassSmsStageSet;
import qa.automation.mobile.stage.set.components.itemTransfer.ButtonContinuarNuevoDestinatarioStageSet;
import qa.automation.mobile.stage.set.components.itemTransfer.ButtonGuardarNuevoDestinatarioStageSet;
import qa.automation.mobile.stage.set.components.itemTransfer.ButtonNuevoDestinatariosStageSet;
import qa.automation.mobile.stage.set.components.itemTransfer.ButtonReenviarSmsStageSet;
import qa.automation.mobile.stage.set.components.itemTransfer.ButtonValidarSMSStageSet;
import qa.automation.mobile.stage.set.components.itemTransfer.EditCorreoDestinatarioStageSet;
import qa.automation.mobile.stage.set.components.itemTransfer.EditCorreoTefTercerosStageSet;
import qa.automation.mobile.stage.set.components.itemTransfer.EditMensajeTefTercerosStageSet;
import qa.automation.mobile.stage.set.components.itemTransfer.EditMontoTefTercerosStageSet;
import qa.automation.mobile.stage.set.components.itemTransfer.EditNombreDestinatarioStageSet;
import qa.automation.mobile.stage.set.components.itemTransfer.EditNumeroCtaDestinatarioStageSet;
import qa.automation.mobile.stage.set.components.itemTransfer.EditRutDestinatarioStageSet;
import qa.automation.mobile.stage.set.components.itemTransfer.EditScotiapassStageSet;
import qa.automation.mobile.stage.set.components.itemTransfer.EditSelectBancoStageSet;
import qa.automation.mobile.stage.set.components.itemTransfer.EditSelectTipoCuentaStageSet;
import qa.automation.mobile.stage.set.components.itemTransfer.EditSmsStageSet;
import qa.automation.mobile.stage.set.components.itemTransfer.ViewClaveScotiapassStageSet;
import qa.automation.mobile.stage.set.components.itemTransfer.ViewIngresoSmsStageSet;
import qa.automation.mobile.stage.set.components.itemTransfer.ViewTefTercerosStageSet;
import qa.automation.mobile.stage.set.components.itemTransfer.ViewTransferStageSet;
import qa.automation.mobile.stage.set.components.tabBar.ButtonTransferStageSet;

@SuiteClasses({ ButtonTransferStageSet.class, ViewTransferStageSet.class, ButtonNuevoDestinatariosStageSet.class,
		EditNombreDestinatarioStageSet.class, EditRutDestinatarioStageSet.class, EditCorreoDestinatarioStageSet.class,
		ButtonContinuarNuevoDestinatarioStageSet.class, EditSelectBancoStageSet.class,
		EditSelectTipoCuentaStageSet.class, EditNumeroCtaDestinatarioStageSet.class,
		ButtonGuardarNuevoDestinatarioStageSet.class, ViewIngresoSmsStageSet.class, ButtonReenviarSmsStageSet.class,
		EditSmsStageSet.class, ButtonCancelarSMSStageSet.class, ButtonValidarSMSStageSet.class,
		ViewClaveScotiapassStageSet.class, EditScotiapassStageSet.class, ButtonCancelarScotiapassSmsStageSet.class,
		ButtonAutorizarScotiapassStageSet.class, ViewTefTercerosStageSet.class, EditCorreoTefTercerosStageSet.class,
		EditMensajeTefTercerosStageSet.class, EditMontoTefTercerosStageSet.class, EditScotiapassStageSet.class,
		ButtonAutorizarScotiapassStageSet.class })
public class ComponentesModuloTransferenciaTest extends BaseFlow {
	private static final Logger LOGGER = LoggerFactory.getLogger(ComponentesModuloTransferenciaTest.class);

	@BeforeClass
	public static void flag() throws Exception {
		LOGGER.info("Ejecutando validacion componentes en modulo de transferencias ...");
	}
}
