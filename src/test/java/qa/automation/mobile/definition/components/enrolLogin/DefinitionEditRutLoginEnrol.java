package qa.automation.mobile.definition.components.enrolLogin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionEditRutLoginEnrol {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@EditRutLoginEnrol")
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
	@Before("@ReporteEditRutLoginEnrol")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Validar texto campo Rut$")
	public void validar_texto_campo_Rut() throws Throwable {
		String tex = BaseFlow.pageModel.getLoginRutContainer().getText().toString().trim();
		assertEquals(tex, BaseFlow.properties.getTextoInputRut());
	}

	@When("^Ingresar rut invalido\"([^\"]*)\"$")
	public void ingresar_rut_invalido(String arg1) throws Throwable {
		BaseFlow.pageModel.getLoginRut().clear();
		BaseFlow.pageModel.getLoginRut().sendKeys(arg1);
	}

	@Then("^Desplegar mensaje rut invalido$")
	public void desplegar_mensaje_rut_invalido() throws Throwable {
		// String error = BaseFlow.pageModel.getTextInputError().getText().toString().trim();
		// assertEquals(error, BaseFlow.properties.getMensajeRutInvalido());
	}

	@When("^Ingresar mas caracteres del maximo permitido\"([^\"]*)\"$")
	public void ingresar_mas_caracteres_del_maximo_permitido(String arg1) throws Throwable {
		BaseFlow.pageModel.getLoginRut().clear();
		BaseFlow.pageModel.getLoginRut().sendKeys(arg1);
	}

	@Then("^No permitir ingresar mas caracteres$")
	public void no_permitir_ingresar_mas_caracteres() throws Throwable {
		String rut = BaseFlow.pageModel.getLoginRut().getText().toString().trim();
		assertTrue(rut.length() <= 12);
	}

	@When("^Ingresar en rut letras y caracteres especiales\"([^\"]*)\"$")
	public void ingresar_en_rut_letras_y_caracteres_especiales(String arg1) throws Throwable {
		BaseFlow.pageModel.getLoginRut().clear();
		BaseFlow.pageModel.getLoginRut().sendKeys(arg1);
	}

	@Then("^No permitir ingresar letras y caracteres especiales$")
	public void no_permitir_ingresar_letras_y_caracteres_especiales() throws Throwable {
		String rut = BaseFlow.pageModel.getLoginRut().getText().toString().trim();
		assertTrue(rut.equalsIgnoreCase("") || GenericMethod.isNumeric(rut));
	}

	@When("^Ingresar en rut mas de una letra k\"([^\"]*)\"$")
	public void ingresar_en_rut_mas_de_una_letra_k(String arg1) throws Throwable {
		BaseFlow.pageModel.getLoginRut().clear();
		BaseFlow.pageModel.getLoginRut().sendKeys(arg1);
	}

	@Then("^No permitir ingresar mas de una letra k$")
	public void no_permitir_ingresar_mas_de_una_letra_k() throws Throwable {
		String rut = BaseFlow.pageModel.getLoginRut().getText().toString().trim();
		assertTrue(rut.length() <= 1 || rut.equalsIgnoreCase(""));
	}

	@When("^Ingresar rut valido\"([^\"]*)\"$")
	public void ingresar_rut_valido(String arg1) throws Throwable {
		BaseFlow.pageModel.getLoginRut().clear();
		BaseFlow.pageModel.getLoginRut().sendKeys(arg1);
	}

	@Then("^Comprobar formato correcto de rut\"([^\"]*)\"$")
	public void comprobar_formato_correcto_de_rut(String arg1) throws Throwable {
		String rut = BaseFlow.pageModel.getLoginRut().getText().toString().trim();
		String formato = GenericMethod.formatearRUT(arg1);
		assertEquals(rut, formato);
	}
}