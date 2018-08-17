package qa.automation.mobile.definition.components.itemTransfer;

import static org.junit.Assert.assertEquals;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;

public class DefinitionViewTransfer {
	@Then("^Validar titulo transferencias$")
	public void validar_titulo_transferencias() throws Throwable {
		String titulo = BaseFlow.pageModel.getTextView5().getText().toString().trim();
		assertEquals(titulo, BaseFlow.properties.getTituloDesActivos());
	}

	@When("^Obtener cantidad de productos que pueden realizar TEF$")
	public void obtener_cantidad_de_productos_que_pueden_realizar_TEF() throws Throwable {
	}

	@Then("^Validar consistencia de datos de productos que pueden realizar TEF$")
	public void validar_consistencia_de_datos_de_productos_que_pueden_realizar_TEF() throws Throwable {
	}

	@Then("^Visualizar boton crear destinatario$")
	public void visualizar_boton_crear_destinatario() throws Throwable {
	}

	@When("^Obtener lista de destinatarios activos del core$")
	public void obtener_lista_de_destinatarios_activos_del_core() throws Throwable {
	}

	@Then("^Visualizar lista de destinatarios activos$")
	public void visualizar_lista_de_destinatarios_activos() throws Throwable {
	}

	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ViewTransfer")
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
	@Before("@ReporteViewTransfer")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}
}