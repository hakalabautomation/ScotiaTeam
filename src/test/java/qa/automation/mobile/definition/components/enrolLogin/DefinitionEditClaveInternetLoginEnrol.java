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

public class DefinitionEditClaveInternetLoginEnrol {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@EditClaveInternetLoginEnrol")
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
	@Before("@ReporteEditClaveInternetLoginEnrol")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Validar texto campo clave internet\"([^\"]*)\"$")
	public void validar_texto_campo_clave_internet(String arg1) throws Throwable {
		String texto = BaseFlow.pageModel.getLoginPasswordContainer().getText().toString().trim();
		assertEquals(texto, arg1);
	}

	@Then("^Comprobar que boton ver clave se visualiza$")
	public void comprobar_que_boton_ver_clave_se_visualiza() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getTextInputPasswordToggle()));
	}

	@When("^Ingresar caracteres en campo clave internet\"([^\"]*)\"$")
	public void ingresar_caracteres_en_campo_clave_internet(String arg1) throws Throwable {
		BaseFlow.pageModel.getLoginPassword().sendKeys(arg1);
	}

	@Then("^Comprobar que no se ingresan mas de los caracteres permitidos$")
	public void comprobar_que_no_se_ingresan_mas_de_los_caracteres_permitidos() throws Throwable {
		String psw = BaseFlow.pageModel.getLoginPassword().getText().toString().trim();
		assertTrue(psw.length() <= 16 || psw.equalsIgnoreCase(""));
	}
}