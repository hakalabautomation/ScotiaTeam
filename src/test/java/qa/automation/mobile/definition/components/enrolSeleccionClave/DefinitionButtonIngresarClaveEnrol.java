package qa.automation.mobile.definition.components.enrolSeleccionClave;

import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionButtonIngresarClaveEnrol {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ButtonIngresarClaveEnrol")
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
	@Before("@ReporteButtonIngresarClaveEnrol")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@When("^Desactivar opciones de seleccion clave$")
	public void desactivar_opciones_de_seleccion_clave() throws Throwable {
		String sw1 = BaseFlow.pageModel.getChoosepassScotiamobileSwitch().getText().toString().trim();
		String sw2 = BaseFlow.pageModel.getChoosepassWebpassSwitch().getText().toString().trim();
		if (sw1.equalsIgnoreCase(BaseFlow.properties.getSwitchActivo()))
			BaseFlow.pageModel.getChoosepassScotiamobileSwitch().click();
		if (sw2.equalsIgnoreCase(BaseFlow.properties.getSwitchActivo()))
			BaseFlow.pageModel.getChoosepassWebpassSwitch().click();
	}

	@Then("^Validar que boton ingresar clave permanece inactivo$")
	public void validar_que_boton_ingresar_clave_permanece_inactivo() throws Throwable {
		assertTrue(!BaseFlow.pageModel.getChoosepassButton().isEnabled());
	}

	@When("^Click boton crear clave mobile$")
	public void click_boton_crear_clave_mobile() throws Throwable {
		BaseFlow.pageModel.getChoosepassScotiamobileSwitch().click();
	}

	@Then("^Validar que boton ingresar clave se activa$")
	public void validar_que_boton_ingresar_clave_se_activa() throws Throwable {
		assertTrue(BaseFlow.pageModel.getChoosepassButton().isEnabled());
	}

	@When("^Desactivar opcion crear clave scotiamobile$")
	public void desactivar_opcion_crear_clave_scotiamobile() throws Throwable {
		BaseFlow.pageModel.getChoosepassScotiamobileSwitch().click();
	}

	@When("^Activar utilizar clave web$")
	public void activar_utilizar_clave_web() throws Throwable {
		BaseFlow.pageModel.getChoosepassWebpassSwitch().click();
	}

	@When("^Click a boton ingresar clave$")
	public void click_a_boton_ingresar_clave() throws Throwable {
		BaseFlow.pageModel.getChoosepassButton().click();
	}

	@Then("^Validar que boton ingresar clave permite continuar$")
	public void validar_que_boton_ingresar_clave_permite_continuar() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getScotiapassButton()));
	}
}