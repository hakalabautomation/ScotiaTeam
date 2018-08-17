package qa.automation.mobile.definition.components.itemTransfer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import qa.automation.mobile.flow.BaseFlow;

public class DefinitionEditMensajeTefTerceros {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@EditMensajeTefTerceros")
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
	@Before("@ReporteEditMensajeTefTerceros")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Validar texto campo mensaje tef terceros$")
	public void validar_texto_campo_mensaje_tef_terceros() throws Throwable {
		String text = BaseFlow.pageModel.getEdittextMessageContainer().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoInputMensajeTef());
	}

	@Then("^Campo correo mensaje transferecia terceros debe tener por defecto mensaje$")
	public void campo_correo_mensaje_transferecia_terceros_debe_tener_por_defecto_mensaje() throws Throwable {
		String text = BaseFlow.pageModel.getEdittextMessage().getText().toString().trim();
		boolean res = text.contains(BaseFlow.properties.getTextoDefautlMensaje());
		assertTrue(res);
	}
}