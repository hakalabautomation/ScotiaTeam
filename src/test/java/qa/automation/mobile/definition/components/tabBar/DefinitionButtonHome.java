package qa.automation.mobile.definition.components.tabBar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionButtonHome {
	@When("^Click a boton home$")
	public void click_a_boton_home() throws Throwable {
		BaseFlow.pageModel.getBottomItemHome().click();
	}

	@Then("^Desplegar pantalla home$")
	public void desplegar_pantalla_home() throws Throwable {
		GenericMethod.esperaElementoMobileSegundos(BaseFlow.driver, BaseFlow.pageModel.getCardViewProduct().get(0), 30);
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getCardViewProduct().get(0)));
	}

	@Then("^Validar texto boton home$")
	public void validar_texto_boton_home() throws Throwable {
		String text = BaseFlow.pageModel.getLargeLabel().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoInicio());
	}

	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ButtonHome")
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
	@Before("@ReporteButtonHome")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}
}