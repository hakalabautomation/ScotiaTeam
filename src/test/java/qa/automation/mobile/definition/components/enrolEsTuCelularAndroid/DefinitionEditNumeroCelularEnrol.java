package qa.automation.mobile.definition.components.enrolEsTuCelularAndroid;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionEditNumeroCelularEnrol {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@EditNumeroCelularEnrol")
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
	@Before("@ReporteEditNumeroCelularEnrol")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@When("^Ingresar letras y caracteres especiales en campo numero celular\"([^\"]*)\"$")
	public void ingresar_letras_y_caracteres_especiales_en_campo_numero_celular(String arg1) throws Throwable {
		// BaseFlow.pageModel.getDialogConfirmPhoneEdittextNumber().sendKeys(arg1);
	}

	@Then("^Validar que no permita ingresar letras ni caracteres especiales$")
	public void validar_que_no_permita_ingresar_letras_ni_caracteres_especiales() throws Throwable {
//		String cel = BaseFlow.pageModel.getDialogConfirmPhoneEdittextNumber().getText().toString().trim();
//		assertTrue(cel.equalsIgnoreCase("") || GenericMethod.isNumeric(cel));
	}

	@When("^Ingresar menos de once caracteres en campo celular\"([^\"]*)\"$")
	public void ingresar_menos_de_once_caracteres_en_campo_celular(String arg1) throws Throwable {
		BaseFlow.pageModel.getDialogConfirmPhoneEdittextNumber().clear();
		BaseFlow.pageModel.getDialogConfirmPhoneEdittextNumber().sendKeys(arg1);
	}

	@Then("^Validar mensaje numero telefono no es valido\"([^\"]*)\"$")
	public void validar_mensaje_numero_telefono_no_es_valido(String arg1) throws Throwable {
		BaseFlow.pageModel.getConfirmPhoneButtonYes().click();
		String mensaje = BaseFlow.pageModel.getTextInputError().getText().toString().trim();
		assertEquals(mensaje, BaseFlow.properties.getMensajeErrorCelular());
	}

	@When("^Ingresar numero telefono valido$")
	public void ingresar_numero_telefono_valido() throws Throwable {
		BaseFlow.pageModel.getDialogConfirmPhoneEdittextNumber().sendKeys(BaseFlow.properties.getCelularValido());
	}

	@Then("^Validar que permite ingresar telefono valido$")
	public void validar_que_permite_ingresar_telefono_valido() throws Throwable {
		assertTrue(BaseFlow.pageModel.getConfirmPhoneButtonYes().isEnabled());
	}
}