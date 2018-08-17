package qa.automation.mobile.definition.components.enrolCodigoSms;

import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionButtonIngresarCodigoSmsEnrol {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ButtonIngresarCodigoSmsEnrol")
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
	@Before("@ReporteButtonIngresarCodigoSmsEnrol")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@When("^Ingresar codigo SMS incorrecto\"([^\"]*)\"$")
	public void ingresar_codigo_SMS_incorrecto(String arg1) throws Throwable {
		BaseFlow.pageModel.getEditTextCodeSMS().clear();
		BaseFlow.pageModel.getEditTextCodeSMS().sendKeys(arg1);
	}

	@Then("^Validar que boton ingresar codigo SMS esta inactivo$")
	public void validar_que_boton_ingresar_codigo_SMS_esta_inactivo() throws Throwable {
		assertTrue(!BaseFlow.pageModel.getSmsCodeContinue().isEnabled());
	}

	@When("^Ingresar codigo SMS correcto\"([^\"]*)\"$")
	public void ingresar_codigo_SMS_correcto(String arg1) throws Throwable {
		BaseFlow.pageModel.getEditTextCodeSMS().clear();
		BaseFlow.pageModel.getEditTextCodeSMS().sendKeys(arg1);
	}

	@Then("^Validar que boton ingresar codigo SMS permite continuar$")
	public void validar_que_boton_ingresar_codigo_SMS_permite_continuar() throws Throwable {
		BaseFlow.pageModel.getSmsCodeContinue().click();
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getChoosepassButton()));
	}
}