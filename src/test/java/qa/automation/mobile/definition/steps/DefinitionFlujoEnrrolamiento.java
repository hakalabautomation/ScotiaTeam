package qa.automation.mobile.definition.steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.Enrol;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionFlujoEnrrolamiento {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@FlujoEnrrolamiento")
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
	@Before("@ReporteFlujoEnrrolamiento")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@When("^Ingresar rut y clave web de cliente\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingresar_rut_y_clave_web_de_cliente(String arg1, String arg2) throws Throwable {
		BaseFlow.pageModel.getLoginRut().sendKeys(arg1);
		BaseFlow.pageModel.getLoginPassword().sendKeys(arg2);
	}

	@When("^Click boton ingresar login$")
	public void click_boton_ingresar_login() throws Throwable {
		BaseFlow.pageModel.getLoginButton().click();
	}

	@When("^Ingresar numero celular valido\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingresar_numero_celular_valido(String arg1, String arg2) throws Throwable {
		Enrol.IngresarNumeroCelular(arg1, arg2);
	}

	@When("^Ingresar codigo de validacion de SMS\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingresar_codigo_de_validacion_de_SMS(String arg1, String arg2) throws Throwable {
		Enrol.IngresarSMS(arg1, arg2);
	}

	@When("^Click boton validar SMS\"([^\"]*)\"$")
	public void click_boton_validar_SMS(String arg1) throws Throwable {
		BaseFlow.pageModel.getSmsCodeContinue().click();
	}

	@When("^Seleccionar clave de login\"([^\"]*)\"\"([^\"]*)\"$")
	public void seleccionar_clave_de_login(String arg1, String arg2) throws Throwable {
		Enrol.SeleccionarClaveLogin(arg1, arg2);
	}

	@When("^Click boton seleccionar clave$")
	public void click_boton_seleccionar_clave() throws Throwable {
		BaseFlow.pageModel.getChoosepassButton().click();
	}

	@When("^Realizar validacion de seguridad\"([^\"]*)\"\"([^\"]*)\"$")
	public void realizar_validacion_de_seguridad(String arg1, String arg2) throws Throwable {
		Enrol.AutorizacionSegundoFactor(arg1, false, "", arg2);
	}

	@Then("^Se realiza enrrolamiento correctamente$")
	public void se_realiza_enrrolamiento_correctamente() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getButtonNext()));
	}
}