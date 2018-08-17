package qa.automation.mobile.definition.components.itemTransfer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionButtonContinuarNuevoDestinatario {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ButtonContinuarNuevoDestinatario")
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
	@Before("@ReporteButtonContinuarNuevoDestinatario")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Validar texto de boton continuar nuevo destinatario$")
	public void validar_texto_de_boton_continuar_nuevo_destinatario() throws Throwable {
		String text = BaseFlow.pageModel.getAddRecipientButtonNext().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoButtonContinuarDestinatario());
	}

	@When("^Dejar campos datos de destinatario en blanco$")
	public void dejar_campos_datos_de_destinatario_en_blanco() throws Throwable {
		BaseFlow.pageModel.getNameEditText().clear();
		BaseFlow.pageModel.getRutEditText().clear();
		BaseFlow.pageModel.getEmailEditText().clear();
	}

	@Then("^Validar que boton continuar nuevo destinatario permanece inactivo$")
	public void validar_que_boton_continuar_nuevo_destinatario_permanece_inactivo() throws Throwable {
		assertTrue(!BaseFlow.pageModel.getAddRecipientButtonNext().isEnabled());
	}

	@When("^Ingresar datos de destinatario invalidos\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingresar_datos_de_destinatario_invalidos(String arg1, String arg2, String arg3) throws Throwable {
		BaseFlow.pageModel.getNameEditText().sendKeys(arg1);
		BaseFlow.pageModel.getRutEditText().sendKeys(arg2);
		BaseFlow.pageModel.getEmailEditText().sendKeys(arg3);
	}

	@When("^Ingresar datos de destinatario validos\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingresar_datos_de_destinatario_validos(String arg1, String arg2, String arg3) throws Throwable {
		BaseFlow.pageModel.getNameEditText().clear();
		BaseFlow.pageModel.getNameEditText().sendKeys(arg1);
		BaseFlow.pageModel.getRutEditText().clear();
		BaseFlow.pageModel.getRutEditText().sendKeys(arg2);
		BaseFlow.pageModel.getEmailEditText().clear();
		BaseFlow.pageModel.getEmailEditText().sendKeys(arg3);
	}

	@Then("^Validar que boton continuar nuevo destinatario permite continuar$")
	public void validar_que_boton_continuar_nuevo_destinatario_permite_continuar() throws Throwable {
		BaseFlow.pageModel.getAddRecipientButtonNext().click();
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getButtonNext()));
	}
}