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

public class DefinitionEditScotiapass {
	@Then("^Validar texto campo clave scotiapass nuevo destinatario$")
	public void validar_texto_campo_clave_scotiapass_nuevo_destinatario() throws Throwable {
		String text = BaseFlow.pageModel.getScotiapassContainer().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoScotiapassLogin());
	}

	@When("^Ingresar letras y caracteres especiales en campo clave scotiapass nuevo destinatario\"([^\"]*)\"$")
	public void ingresar_letras_y_caracteres_especiales_en_campo_clave_scotiapass_nuevo_destinatario(String arg1)
			throws Throwable {
		BaseFlow.pageModel.getScotiapassPassword().clear();
		BaseFlow.pageModel.getScotiapassPassword().sendKeys(arg1);
	}

	@Then("^No permite ingresar letras ni caracteres especiales en campo clave scotiapass nuevo destinatario$")
	public void no_permite_ingresar_letras_ni_caracteres_especiales_en_campo_clave_scotiapass_nuevo_destinatario()
			throws Throwable {
		String text = BaseFlow.pageModel.getScotiapassPassword().getText().toString().trim();
		assertTrue(text.equalsIgnoreCase("") || GenericMethod.isNumeric(text));
	}

	@When("^Ingresar mas de ocho digitos en campo scotiapass nuevo destinatario\"([^\"]*)\"$")
	public void ingresar_mas_de_ocho_digitos_en_campo_scotiapass_nuevo_destinatario(String arg1) throws Throwable {
		BaseFlow.pageModel.getScotiapassPassword().clear();
		BaseFlow.pageModel.getScotiapassPassword().sendKeys(arg1);
	}

	@Then("^No permite ingresar mas digitos en campo scotiapass nuevo destinatario$")
	public void no_permite_ingresar_mas_digitos_en_campo_scotiapass_nuevo_destinatario() throws Throwable {
		String text = BaseFlow.pageModel.getScotiapassPassword().getText().toString().trim();
		assertTrue(text.length() <= 8);
	}

	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@EditScotiapass")
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
	@Before("@ReporteEditScotiapass")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}
}