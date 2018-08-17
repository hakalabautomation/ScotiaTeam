package qa.automation.mobile.definition.components.home;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;

public class DefinitionProductCarrusel {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ProductCarrusel")
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
	@Before("@ReporteProductCarrusel")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@When("^Obtener cantidad de productos segun el core$")
	public void obtener_cantidad_de_productos_segun_el_core() throws Throwable {
		// Faltan servicios
	}

	@Then("^Validar que se visualiza una vista por productos segun el core$")
	public void validar_que_se_visualiza_una_vista_por_productos_segun_el_core() throws Throwable {
	}

	@When("^Visualizo cuentas del cliente$")
	public void visualizo_cuentas_del_cliente() throws Throwable {
	}

	@Then("^Se valida consistencia de datos por producto$")
	public void se_valida_consistencia_de_datos_por_producto() throws Throwable {
	}
}