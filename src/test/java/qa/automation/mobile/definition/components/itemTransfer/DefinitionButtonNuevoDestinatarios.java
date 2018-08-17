package qa.automation.mobile.definition.components.itemTransfer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionButtonNuevoDestinatarios {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ButtonNuevoDestinatarios")
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
	@Before("@ReporteButtonNuevoDestinatarios")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Validar texto de boton nuevo destinatario$")
	public void validar_texto_de_boton_nuevo_destinatario() throws Throwable {
		String text = BaseFlow.pageModel.getTextviewRecipientNew().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoButtonAgregarDestinatario());
	}

	@Then("^Desplegar pantalla agregar nuevo destinatario$")
	public void desplegar_pantalla_agregar_nuevo_destinatario() throws Throwable {
		GenericMethod.esperaElementoMobileSegundos(BaseFlow.driver, BaseFlow.pageModel.getAddRecipientButtonNext(), 30);
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getAddRecipientButtonNext()));
	}
}