package qa.automation.mobile.definition.components.enrolClaveScotiapass;

import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionButtonIngresarScotiapassEnrol {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ButtonIngresarScotiapassEnrol")
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
	@Before("@ReporteButtonIngresarScotiapassEnrol")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@When("^Ingresar scotiapass en formato incorrecto\"([^\"]*)\"$")
	public void ingresar_scotiapass_en_formato_incorrecto(String arg1) throws Throwable {
		BaseFlow.pageModel.getScotiapassPassword().clear();
		BaseFlow.pageModel.getScotiapassPassword().sendKeys(arg1);
	}

	@Then("^Boton ingresar scotiapass debe permanecer inactivo$")
	public void boton_ingresar_scotiapass_debe_permanecer_inactivo() throws Throwable {
		assertTrue(!BaseFlow.pageModel.getScotiapassButton().isEnabled());
	}

	@When("^Ingresar scotiapass en formato correcto\"([^\"]*)\"$")
	public void ingresar_scotiapass_en_formato_correcto(String arg1) throws Throwable {
		BaseFlow.pageModel.getScotiapassPassword().clear();
		BaseFlow.pageModel.getScotiapassPassword().sendKeys(arg1);
	}

	@Then("^Boton ingresar scotiapass debe permitir continuar$")
	public void boton_ingresar_scotiapass_debe_permitir_continuar() throws Throwable {
		BaseFlow.pageModel.getScotiapassButton().click();
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getButtonNext()));
	}
}