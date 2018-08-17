package qa.automation.mobile.definition.components.login;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionButtonOmitirHuella {
	@Then("^Validar texto boton omitir huella$")
	public void validar_texto_boton_omitir_huella() throws Throwable {
		String text = BaseFlow.pageModel.getTextViewSkipUseFinger().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoOmitirHuella());
	}

	@When("^Realizar click a boton omitir huella$")
	public void realizar_click_a_boton_omitir_huella() throws Throwable {
		BaseFlow.pageModel.getTextViewSkipUseFinger().click();
	}

	@Then("^Omite ingreso de huella correctamante$")
	public void omite_ingreso_de_huella_correctamante() throws Throwable {
		GenericMethod.notEsperaElementoSegundos(BaseFlow.driver, BaseFlow.pageModel.getTextViewSkipUseFinger(), 10);
		assertTrue(!GenericMethod.isElementPresent(BaseFlow.pageModel.getTextViewSkipUseFinger()));
	}

	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ButtonOmitirHuella")
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
	@Before("@ReporteButtonOmitirHuella")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}
}