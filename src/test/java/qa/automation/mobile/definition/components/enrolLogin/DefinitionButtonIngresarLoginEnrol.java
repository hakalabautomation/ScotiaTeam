package qa.automation.mobile.definition.components.enrolLogin;

import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionButtonIngresarLoginEnrol {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ButtonIngresarLoginEnrol")
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
	@Before("@ButtonIngresarLoginEnrol")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Validar que boton ingresar login enroll se visualiza$")
	public void validar_que_boton_ingresar_login_enroll_se_visualiza() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getLoginButton()));
	}

	@When("^Ingresar rut valido y clave web menor a seis caracteres\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingresar_rut_valido_y_clave_web_menor_a_seis_caracteres(String arg1, String arg2) throws Throwable {
		BaseFlow.pageModel.getLoginRut().clear();
		BaseFlow.pageModel.getLoginRut().sendKeys(arg1);
		BaseFlow.pageModel.getLoginPassword().clear();
		BaseFlow.pageModel.getLoginPassword().sendKeys(arg2);
	}

	@Then("^Validar que boton no se habilita$")
	public void validar_que_boton_no_se_habilita() throws Throwable {
		assertTrue(!BaseFlow.pageModel.getLoginButton().isEnabled());
	}

	@When("^Ingresar rut invalido y clave web correcta\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingresar_rut_invalido_y_clave_web_correcta(String arg1, String arg2) throws Throwable {
		BaseFlow.pageModel.getLoginRut().clear();
		BaseFlow.pageModel.getLoginRut().sendKeys(arg1);
		BaseFlow.pageModel.getLoginPassword().clear();
		BaseFlow.pageModel.getLoginPassword().sendKeys(arg2);
	}

	@When("^Ingresar rut valido y clave web correcta\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingresar_rut_valido_y_clave_web_correcta(String arg1, String arg2) throws Throwable {
		BaseFlow.pageModel.getLoginRut().clear();
		BaseFlow.pageModel.getLoginRut().sendKeys(arg1);
		BaseFlow.pageModel.getLoginPassword().clear();
		BaseFlow.pageModel.getLoginPassword().sendKeys(arg2);
	}

	@Then("^Permite continuar enrrolamiento$")
	public void permite_continuar_enrrolamiento() throws Throwable {
		BaseFlow.pageModel.getLoginButton().click();
		if (GenericMethod.isElementPresent(BaseFlow.pageModel.getPermissionDenyButton()))
			BaseFlow.pageModel.getPermissionDenyButton().click();
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getConfirmPhoneButtonYes()));
	}
}