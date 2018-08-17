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

public class DefinitionButtonTransfer {
	@When("^Click a boton transferencias$")
	public void click_a_boton_transferencias() throws Throwable {
		BaseFlow.pageModel.getBottomItemTransfer().click();
	}

	@Then("^Desplegar pantalla transferencias$")
	public void desplegar_pantalla_transferencias() throws Throwable {
		GenericMethod.esperaElementoMobileSegundos(BaseFlow.driver, BaseFlow.pageModel.getViewAddRecipient(), 30);
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getViewAddRecipient()));
	}

	@Then("^Validar texto boton transferencias$")
	public void validar_texto_boton_transferencias() throws Throwable {
		String text = BaseFlow.pageModel.getLargeLabel().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoTransferencia());
	}
	
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ButtonTransfer")
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
	@Before("@ReporteButtonTransfer")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}
}