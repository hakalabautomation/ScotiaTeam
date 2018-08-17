package qa.automation.mobile.flow.components;

import org.junit.BeforeClass;
import org.junit.runners.Suite.SuiteClasses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.stage.set.components.home.ProductCarruselStageSet;
import qa.automation.mobile.stage.set.components.home.ViewHomeStageSet;
import qa.automation.mobile.stage.set.components.itemBalance.ItemBalanceStageSet;
import qa.automation.mobile.stage.set.components.tabBar.ButtonHomeStageSet;
import qa.automation.mobile.stage.set.components.tabBar.ButtonItemBalanceStageSet;

@SuiteClasses({ ButtonHomeStageSet.class, ViewHomeStageSet.class, ProductCarruselStageSet.class,
		ButtonItemBalanceStageSet.class, ItemBalanceStageSet.class })
public class ComponetesModulosInicioSaldosMasTest extends BaseFlow {
	private static final Logger LOGGER = LoggerFactory.getLogger(ComponetesModulosInicioSaldosMasTest.class);

	@BeforeClass
	public static void flag() throws Exception {
		LOGGER.info("Ejecutando validacion componentes en pantalla Inicio, Saldos y mas opciones ...");
	}
}