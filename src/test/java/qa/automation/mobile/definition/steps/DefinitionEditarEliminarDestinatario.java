package qa.automation.mobile.definition.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionEditarEliminarDestinatario {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@EditarEliminarDestinatario")
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
	@Before("@ReporteEditarEliminarDestinatario")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Escoger un destinatario activo del listado de destinatarios$")
	public void escoger_un_destinatario_activo_del_listado_de_destinatarios() throws Throwable {
		GenericMethod.verificaEnrol("123456");
		BaseFlow.pageModel.getBottomItemTransfer().click();
		GenericMethod.esperaElementoMobileSegundos(BaseFlow.driver, BaseFlow.pageModel.getTextviewRecipientName().get(0), 30);
		BaseFlow.pageModel.getTextviewRecipientName().get(0).click();
	}

	@Then("^Escoger opcion de editar destinatario$")
	public void escoger_opcion_de_editar_destinatario() throws Throwable {
	}

	@When("^Se compueba ante el core que destinatario fue editado exitosamente$")
	public void se_compueba_ante_el_core_que_destinatario_fue_editado_exitosamente() throws Throwable {
		// Se debe generar conexion BD
	}

	@Then("^Escoger opcion de eliminar destinatario$")
	public void escoger_opcion_de_eliminar_destinatario() throws Throwable {
	}

	@When("^Se compueba ante el core que destinatario fue eliminado exitosamente$")
	public void se_compueba_ante_el_core_que_destinatario_fue_eliminado_exitosamente() throws Throwable {
	}
}