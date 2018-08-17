package qa.automation.mobile.definition.components.home;

import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionViewHome {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ViewHome")
	public void insertaLinea(Scenario scenario) {
		BaseFlow.htmlReport.addResultado(scenario);
	}

	/**
	 * Function: generaBloque Description: Agrega una nuevo bloque al reporte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@Before("@ReporteViewHome")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Validar titulo tus productos$")
	public void validar_titulo_tus_productos() throws Throwable {
	}

	@Then("^Validar que se visualiza carrusel de productos$")
	public void validar_que_se_visualiza_carrusel_de_productos() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getCardViewProduct().get(0)));
	}
}