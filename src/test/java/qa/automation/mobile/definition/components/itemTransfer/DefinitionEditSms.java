package qa.automation.mobile.definition.components.itemTransfer;

import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionEditSms {
	@When("^Ingresar letras y caracteres especiales en campo codigo SMS nuevo destinatario\"([^\"]*)\"$")
	public void ingresar_letras_y_caracteres_especiales_en_campo_codigo_SMS_nuevo_destinatario(String arg1)
			throws Throwable {
		BaseFlow.pageModel.getSmsPassword().clear();
		BaseFlow.pageModel.getSmsPassword().sendKeys(arg1);
	}

	@Then("^No permite ingresar letras ni caracteres especiales en campo codigo SMS nuevo destinatario$")
	public void no_permite_ingresar_letras_ni_caracteres_especiales_en_campo_codigo_SMS_nuevo_destinatario()
			throws Throwable {
		String text = BaseFlow.pageModel.getSmsPassword().getText().toString().trim();
		assertTrue(text.equalsIgnoreCase("") || GenericMethod.isNumeric(text));
	}

	@When("^Ingresar mas de seis digitos en campo codigo SMS nuevo destinatario\"([^\"]*)\"$")
	public void ingresar_mas_de_seis_digitos_en_campo_codigo_SMS_nuevo_destinatario(String arg1) throws Throwable {
		BaseFlow.pageModel.getSmsPassword().clear();
		BaseFlow.pageModel.getSmsPassword().sendKeys(arg1);
	}

	@Then("^No permitir ingresar mas de seis digitos en campo codigo SMS nuevo destinatario$")
	public void no_permitir_ingresar_mas_de_seis_digitos_en_campo_codigo_SMS_nuevo_destinatario() throws Throwable {
		String text = BaseFlow.pageModel.getSmsPassword().getText().toString().trim();
		assertTrue(text.length() <= 6);
	}

	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@EditSms")
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
	@Before("@ReporteEditSms")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}
}