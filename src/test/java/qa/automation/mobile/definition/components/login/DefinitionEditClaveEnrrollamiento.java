package qa.automation.mobile.definition.components.login;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;

public class DefinitionEditClaveEnrrollamiento {
	@Then("^Validar texto campo clave segun enrrolamiento\"([^\"]*)\"$")
	public void validar_texto_campo_clave_segun_enrrolamiento(String arg1) throws Throwable {
		String text = BaseFlow.pageModel.getSecondLoginPasswordContainer().getText().toString().trim();
		assertEquals(text, arg1);
	}

	@When("^Ingresar caracteres alfanumericos en clave login\"([^\"]*)\"$")
	public void ingresar_caracteres_alfanumericos_en_clave_login(String arg1) throws Throwable {
		BaseFlow.pageModel.getSecondLoginPassword().clear();
		BaseFlow.pageModel.getSecondLoginPassword().sendKeys(arg1);
	}

	@Then("^Permite ingresar caracteres alfanumericos en clave login\"([^\"]*)\"$")
	public void permite_ingresar_caracteres_alfanumericos_en_clave_login(String arg1) throws Throwable {
		String text = BaseFlow.pageModel.getSecondLoginPassword().getText().toString().trim();
		assertEquals(text, arg1);
	}

	@When("^Ingresar mas de (\\d+) caracteres en campo clave login\"([^\"]*)\"$")
	public void ingresar_mas_de_caracteres_en_campo_clave_login(int arg1, String arg2) throws Throwable {
		BaseFlow.pageModel.getSecondLoginPassword().clear();
		BaseFlow.pageModel.getSecondLoginPassword().sendKeys(arg2);
	}

	@Then("^No permitir el ingreso en campo clave login$")
	public void no_permitir_el_ingreso_en_campo_clave_login() throws Throwable {
		String text = BaseFlow.pageModel.getSecondLoginPassword().getText().toString().trim();
		assertTrue(text.length() <= 16);
	}

	@When("^Ingresar (\\d+) caracteres en campo clave login\"([^\"]*)\"$")
	public void ingresar_caracteres_en_campo_clave_login(int arg1, String arg2) throws Throwable {
		BaseFlow.pageModel.getSecondLoginPassword().clear();
		BaseFlow.pageModel.getSecondLoginPassword().sendKeys(arg2);
	}

	@Then("^Permitir el ingreso en campo clave login\"([^\"]*)\"$")
	public void permitir_el_ingreso_en_campo_clave_login(String arg1) throws Throwable {
		String text = BaseFlow.pageModel.getSecondLoginPassword().getText().toString().trim();
		assertEquals(text, arg1);
	}

	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@EditClaveEnrrollamiento")
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
	@Before("@ReporteEditClaveEnrrollamiento")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}
}