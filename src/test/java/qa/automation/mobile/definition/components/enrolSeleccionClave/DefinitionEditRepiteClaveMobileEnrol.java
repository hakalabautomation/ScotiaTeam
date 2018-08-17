package qa.automation.mobile.definition.components.enrolSeleccionClave;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionEditRepiteClaveMobileEnrol {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@EditRepiteClaveMobileEnrol")
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
	@Before("@ReporteEditRepiteClaveMobileEnrol")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Validar texto campo Repite clave mobile$")
	public void validar_texto_campo_Repite_clave_mobile() throws Throwable {
		BaseFlow.pageModel.getScotiamobileSecondPassword().click();
		String text = BaseFlow.pageModel.getScotiamobileSecondContainer().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoInputRepiteClaveMobile());
	}

	@When("^Ingresar letras y caracteres especiales en campo repite clave mobile\"([^\"]*)\"$")
	public void ingresar_letras_y_caracteres_especiales_en_campo_repite_clave_mobile(String arg1) throws Throwable {
		BaseFlow.pageModel.getScotiamobileSecondPassword().clear();
		// BaseFlow.pageModel.getScotiamobileSecondPassword().sendKeys(arg1);
	}

	@Then("^No permite ingresar letras ni caracteres especiales en campo repite clave mobile$")
	public void no_permite_ingresar_letras_ni_caracteres_especiales_en_campo_repite_clave_mobile() throws Throwable {
		String text = BaseFlow.pageModel.getScotiamobileSecondPassword().getText().toString().trim();
		assertTrue(text.equalsIgnoreCase("") || GenericMethod.isNumeric(text));
	}

	@When("^Ingresar menos caracteres en campo repite clave mobile\"([^\"]*)\"$")
	public void ingresar_menos_caracteres_en_campo_repite_clave_mobile(String arg1) throws Throwable {
		BaseFlow.pageModel.getScotiamobileSecondPassword().clear();
		BaseFlow.pageModel.getScotiamobileSecondPassword().sendKeys(arg1);
	}

	@Then("^Comprobar mensaje error en campo$")
	public void comprobar_mensaje_error_en_campo() throws Throwable {
		String error = BaseFlow.pageModel.getTextInputError().getText().toString().trim();
		assertEquals(error, BaseFlow.properties.getMensajeErrorClaveMobileNoCoincide());
	}

	@When("^Ingresar clave mobile diferentes\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingresar_clave_mobile_diferentes(String arg1, String arg2) throws Throwable {
		BaseFlow.pageModel.getScotiamobileFirstPassword().clear();
		BaseFlow.pageModel.getScotiamobileFirstPassword().sendKeys(arg1);
		BaseFlow.pageModel.getScotiamobileSecondPassword().clear();
		BaseFlow.pageModel.getScotiamobileSecondPassword().sendKeys(arg2);
	}

	@When("^Ingresar clave mobile valida\"([^\"]*)\"$")
	public void ingresar_clave_mobile_valida(String arg1) throws Throwable {
		BaseFlow.pageModel.getScotiamobileFirstPassword().clear();
		BaseFlow.pageModel.getScotiamobileFirstPassword().sendKeys(arg1);
		BaseFlow.pageModel.getScotiamobileSecondPassword().clear();
		BaseFlow.pageModel.getScotiamobileSecondPassword().sendKeys(arg1);
	}

	@Then("^Comprobar mensaje de error en campo clave mobile desaparece correctamente$")
	public void comprobar_mensaje_de_error_en_campo_clave_mobile_desaparece_correctamente() throws Throwable {
		assertTrue(!GenericMethod.isElementPresent(BaseFlow.pageModel.getTextInputError()));
	}
}