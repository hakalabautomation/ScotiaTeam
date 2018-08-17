package qa.automation.mobile.definition.components.itemTransfer;

import static org.junit.Assert.assertEquals;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionEditSelectBanco {
	@Then("^Validar texto campo banco nuevo destinatario$")
	public void validar_texto_campo_banco_nuevo_destinatario() throws Throwable {
		String text = BaseFlow.pageModel.getEdittextBank().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoInputBanco());
	}

	@When("^Click a lista de bancos$")
	public void click_a_lista_de_bancos() throws Throwable {
		BaseFlow.pageModel.getEdittextBank().click();
	}

	@Then("^Validar que se despliega lista de bancos segun el core$")
	public void validar_que_se_despliega_lista_de_bancos_segun_el_core() throws Throwable {
		// Falta servicios
		GenericMethod.volver(BaseFlow.driver);
	}

	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@EditSelectBanco")
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
	@Before("@ReporteEditSelectBanco")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}
}