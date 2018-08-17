package qa.automation.mobile.definition.components.enrolCodigoSms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionEditCodigoSmsEnrol {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@EditCodigoSmsEnrol")
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
	@Before("@ReporteEditCodigoSmsEnrol")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@When("^Ingresar letras y caracteres especiales en campo codigo SMS\"([^\"]*)\"$")
	public void ingresar_letras_y_caracteres_especiales_en_campo_codigo_SMS(String arg1) throws Throwable {
//		BaseFlow.pageModel.getEditTextCodeSMS().clear();
//		BaseFlow.pageModel.getEditTextCodeSMS().sendKeys(arg1);
	}

	@Then("^No permite ingresar letras ni caracteres especiales en campo codigo SMS$")
	public void no_permite_ingresar_letras_ni_caracteres_especiales_en_campo_codigo_SMS() throws Throwable {
		String text = BaseFlow.pageModel.getEditTextCodeSMS().getText().toString().trim();
		assertTrue(text.equalsIgnoreCase("") || GenericMethod.isNumeric(text));
	}

	@When("^Ingresar menos caracteres en campo codigo SMS\"([^\"]*)\"$")
	public void ingresar_menos_caracteres_en_campo_codigo_SMS(String arg1) throws Throwable {
		BaseFlow.pageModel.getEditTextCodeSMS().clear();
		BaseFlow.pageModel.getEditTextCodeSMS().sendKeys(arg1);
	}

	@Then("^Comprobar mensaje clave debe tener seis numeros$")
	public void comprobar_mensaje_clave_debe_tener_seis_numeros() throws Throwable {
		String error = BaseFlow.pageModel.getTextInputError().getText().toString().trim();
		assertEquals(error, BaseFlow.properties.getTextoErrorFormatoSms());
	}

	@When("^Ingresar mas de seis digitos en campo codigo SMS\"([^\"]*)\"$")
	public void ingresar_mas_de_seis_digitos_en_campo_codigo_SMS(String arg1) throws Throwable {
		BaseFlow.pageModel.getEditTextCodeSMS().clear();
		BaseFlow.pageModel.getEditTextCodeSMS().sendKeys(arg1);
	}

	@Then("^No permitir ingresar mas de seis digitos en campo codigo SMS$")
	public void no_permitir_ingresar_mas_de_seis_digitos_en_campo_codigo_SMS() throws Throwable {
		String sms = BaseFlow.pageModel.getEditTextCodeSMS().getText().toString().trim();
		assertTrue(sms.length() <= 6);
	}

	@When("^Ingresar codigo SMS valido\"([^\"]*)\"$")
	public void ingresar_codigo_SMS_valido(String arg1) throws Throwable {
		BaseFlow.pageModel.getEditTextCodeSMS().clear();
		BaseFlow.pageModel.getEditTextCodeSMS().sendKeys(arg1);
	}

	@Then("^Mensaje error codigo SMS debe desaparecer$")
	public void mensaje_error_codigo_SMS_debe_desaparecer() throws Throwable {
		try {
			BaseFlow.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			assertTrue(!GenericMethod.isElementPresent(BaseFlow.pageModel.getTextInputError()));
		} finally {
			BaseFlow.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
	}
}