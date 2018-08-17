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

public class DefinitionButtonMore {
	@When("^Click a boton mas$")
	public void click_a_boton_mas() throws Throwable {
		BaseFlow.pageModel.getBottomItemMore().click();
	}

	@Then("^Desplegar pantalla mas$")
	public void desplegar_pantalla_mas() throws Throwable {
		GenericMethod.esperaElementoMobileSegundos(BaseFlow.driver, BaseFlow.pageModel.getLayoutHelp(), 30);
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getLayoutHelp()));
	}

	@Then("^Validar texto boton mas$")
	public void validar_texto_boton_mas() throws Throwable {
		String text = BaseFlow.pageModel.getLargeLabel().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoMas());
	}
	
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ButtonMore")
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
	@Before("@ReporteButtonMore")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}
}