package qa.automation.mobile.definition.components.itemBalance;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;

public class DefinitionItemBalance {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ItemBalance")
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
	@Before("@ReporteItemBalance")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@When("^Obtener cantidad de productos que posea cliente segun el core$")
	public void obtener_cantidad_de_productos_que_posea_cliente_segun_el_core() throws Throwable {
	}

	@Then("^Validar que se visualiza una vista por productos que posea el cliente segun el core$")
	public void validar_que_se_visualiza_una_vista_por_productos_que_posea_el_cliente_segun_el_core() throws Throwable {
	}

	@When("^Visualizo cuentas del cliente segun el core$")
	public void visualizo_cuentas_del_cliente_segun_el_core() throws Throwable {
	}

	@Then("^Se valida consistencia de datos por producto segun el core$")
	public void se_valida_consistencia_de_datos_por_producto_segun_el_core() throws Throwable {
	}

	@When("^Se escoge cuenta para validar movimientos$")
	public void se_escoge_cuenta_para_validar_movimientos() throws Throwable {
	}

	@Then("^Se valida consistencia de datos en movimiento de producto$")
	public void se_valida_consistencia_de_datos_en_movimiento_de_producto() throws Throwable {
	}
}