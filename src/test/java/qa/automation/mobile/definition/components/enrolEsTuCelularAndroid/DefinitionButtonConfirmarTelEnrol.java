package qa.automation.mobile.definition.components.enrolEsTuCelularAndroid;

import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionButtonConfirmarTelEnrol {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ButtonConfirmarTelEnrol")
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
	@Before("@ButtonConfirmarTelEnrol")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@When("^Ingresar numero telefonico incorrecto\"([^\"]*)\"$")
	public void ingresar_numero_telefonico_incorrecto(String arg1) throws Throwable {
		//BaseFlow.pageModel.getDialogConfirmPhoneEdittextNumber().sendKeys(arg1);
	}

	@Then("^Validar que despliega mensaje error de numero telefonico$")
	public void validar_que_despliega_mensaje_error_de_numero_telefonico() throws Throwable {
		BaseFlow.pageModel.getConfirmPhoneButtonYes().click();
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getTextInputError()));
	}

	@When("^Ingresar numero telefonico correcto$")
	public void ingresar_numero_telefonico_correcto() throws Throwable {
		BaseFlow.pageModel.getDialogConfirmPhoneEdittextNumber().sendKeys(BaseFlow.properties.getCelularValido());
	}

	@Then("^Validar que boton confirmar numero permite continuar$")
	public void validar_que_boton_confirmar_numero_permite_continuar() throws Throwable {
		BaseFlow.pageModel.getConfirmPhoneButtonYes().click();
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getSmsCodeContinue()));
	}
}