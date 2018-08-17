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

public class DefinitionButtonProfile {
	@When("^Click a boton perfil$")
	public void click_a_boton_perfil() throws Throwable {
		BaseFlow.pageModel.getBottomItemProfile().click();
	}

	@Then("^Desplegar pantalla perfil$")
	public void desplegar_pantalla_perfil() throws Throwable {
		GenericMethod.esperaElementoMobileSegundos(BaseFlow.driver, BaseFlow.pageModel.getTextViewProfileName(), 30);
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getTextViewProfileName()));
	}

	@Then("^Validar texto boton perfil$")
	public void validar_texto_boton_perfil() throws Throwable {
		String text = BaseFlow.pageModel.getLargeLabel().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoPerfil());
	}
	
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ButtonProfile")
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
	@Before("@ReporteButtonProfile")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}
}