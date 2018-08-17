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

public class DefinitionEditNumeroCtaDestinatario {
	@Then("^Validar texto campo numero de cuenta nuevo destinatario$")
	public void validar_texto_campo_numero_de_cuenta_nuevo_destinatario() throws Throwable {
		BaseFlow.pageModel.getEdittextAccountNumber().click();
		String text = BaseFlow.pageModel.getTextInputLayoutAccountNumber().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoInputNroCta());
	}

	@When("^Ingresar en numero cuenta nuevo destinatario letras y caracteres especiales\"([^\"]*)\"$")
	public void ingresar_en_numero_cuenta_nuevo_destinatario_letras_y_caracteres_especiales(String arg1)
			throws Throwable {
		BaseFlow.pageModel.getEdittextAccountNumber().clear();
		BaseFlow.pageModel.getEdittextAccountNumber().sendKeys(arg1);
	}

	@Then("^No permitir ingresar letras y caracteres especiales en numero cuenta nuevo destinatario$")
	public void no_permitir_ingresar_letras_y_caracteres_especiales_en_numero_cuenta_nuevo_destinatario()
			throws Throwable {
		String text = BaseFlow.pageModel.getEdittextAccountNumber().getText().toString().trim();
		assertTrue(text.equalsIgnoreCase("") || GenericMethod.isNumeric(text));
	}

	@When("^Ingresar mas de veinte digitos en campo numero cuenta nuevo destinatario\"([^\"]*)\"$")
	public void ingresar_mas_de_veinte_digitos_en_campo_numero_cuenta_nuevo_destinatario(String arg1) throws Throwable {
		BaseFlow.pageModel.getEdittextAccountNumber().clear();
		BaseFlow.pageModel.getEdittextAccountNumber().sendKeys(arg1);
	}

	@Then("^No permitir ingresar mas caracteres en campo numero cuenta nuevo destinatario$")
	public void no_permitir_ingresar_mas_caracteres_en_campo_numero_cuenta_nuevo_destinatario() throws Throwable {
		String text = BaseFlow.pageModel.getEdittextAccountNumber().getText().toString().trim();
		assertTrue(text.length() <= 20);
	}

	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@EditNumeroCtaDestinatario")
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
	@Before("@ReporteEditNumeroCtaDestinatario")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}
}