package qa.automation.mobile.definition.components.enrolSeleccionClave;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;

public class DefinitionButtonClaveWebEnrol {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ButtonClaveWebEnrol")
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
	@Before("@ReporteButtonClaveWebEnrol")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@When("^Click a boton clave web$")
	public void click_a_boton_clave_web() throws Throwable {
		BaseFlow.pageModel.getChoosepassWebpassSwitch().click();
	}

	@Then("^Validar que opcion crear clave mobile este desactivada$")
	public void validar_que_opcion_crear_clave_mobile_este_desactivada() throws Throwable {
		String sw1 = BaseFlow.pageModel.getChoosepassScotiamobileSwitch().getText().toString().trim();
		assertEquals(sw1, BaseFlow.properties.getSwitchDesactivo());
	}

	@Then("^Boton ingresar seleccion de clave se activa es posible continuar$")
	public void boton_ingresar_seleccion_de_clave_se_activa_es_posible_continuar() throws Throwable {
		assertTrue(BaseFlow.pageModel.getChoosepassButton().isEnabled());
	}
}