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

public class DefinitionEditCrearClaveMobileEnrol {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@EditCrearClaveMobileEnrol")
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
	@Before("@ReporteEditCrearClaveMobileEnrol")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Validar texto campo crear clave mobile$")
	public void validar_texto_campo_crear_clave_mobile() throws Throwable {
		BaseFlow.pageModel.getScotiamobileFirstPassword().click();
		String text = BaseFlow.pageModel.getScotiamobileFirstContainer().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoInputCrearClaveMobile());
	}

	@When("^Ingresar letras y caracteres especiales en campo crear clave mobile\"([^\"]*)\"$")
	public void ingresar_letras_y_caracteres_especiales_en_campo_crear_clave_mobile(String arg1) throws Throwable {
		BaseFlow.pageModel.getScotiamobileFirstPassword().clear();
		// BaseFlow.pageModel.getScotiamobileFirstPassword().sendKeys(arg1);
	}

	@Then("^No permite ingresar letras ni caracteres especiales en campo crear clave mobile$")
	public void no_permite_ingresar_letras_ni_caracteres_especiales_en_campo_crear_clave_mobile() throws Throwable {
		String text = BaseFlow.pageModel.getScotiamobileFirstPassword().getText().toString().trim();
		assertTrue(text.equalsIgnoreCase("") || GenericMethod.isNumeric(text));
	}

	@When("^Ingresar menos caracteres en campo crear clave mobile\"([^\"]*)\"$")
	public void ingresar_menos_caracteres_en_campo_crear_clave_mobile(String arg1) throws Throwable {
		BaseFlow.pageModel.getScotiamobileFirstPassword().clear();
		BaseFlow.pageModel.getScotiamobileFirstPassword().sendKeys(arg1);
	}

	@Then("^Comprobar mensaje clave mobile debe tener seis numeros$")
	public void comprobar_mensaje_clave_mobile_debe_tener_seis_numeros() throws Throwable {
		String error = BaseFlow.pageModel.getTextInputError().getText().toString().trim();
		assertEquals(error, BaseFlow.properties.getMensajeErrorFormatoClaveMobile());
	}
}