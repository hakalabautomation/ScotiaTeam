package qa.automation.mobile.definition.components.login;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;

public class DefinitionButtonIngresarLogin {
	@Then("^Validar texto boton ingresar login\"([^\"]*)\"$")
	public void validar_texto_boton_ingresar_login(String arg1) throws Throwable {
		String text = BaseFlow.pageModel.getSecondLoginButton().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoBtnIngresarBienve());
	}

	@When("^Ingresar clave menos (\\d+) digitos\"([^\"]*)\"$")
	public void ingresar_clave_menos_digitos(int arg1, String arg2) throws Throwable {
		BaseFlow.pageModel.getSecondLoginPassword().clear();
		BaseFlow.pageModel.getSecondLoginPassword().sendKeys(arg2);
	}

	@Then("^Comprobar que boton ingresar login parmanece inactivo$")
	public void comprobar_que_boton_ingresar_login_parmanece_inactivo() throws Throwable {
		assertTrue(!BaseFlow.pageModel.getSecondLoginPassword().isEnabled());
	}

	@When("^Ingresar clave login valida\"([^\"]*)\"$")
	public void ingresar_clave_login_valida(String arg1) throws Throwable {
		BaseFlow.pageModel.getSecondLoginPassword().clear();
		BaseFlow.pageModel.getSecondLoginPassword().sendKeys(arg1);
	}

	@Then("^Comprobar que boton ingresar login permite continuar$")
	public void comprobar_que_boton_ingresar_login_permite_continuar() throws Throwable {
		BaseFlow.pageModel.getSecondLoginPassword().click();
	}

	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ButtonIngresarLogin")
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
	@Before("@ReporteButtonIngresarLogin")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}
}