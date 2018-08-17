package qa.automation.mobile.definition.components.itemTransfer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionViewClaveScotiapass {
	@Then("^Validar titulo clave scotiapass nuevo destinatario$")
	public void validar_titulo_clave_scotiapass_nuevo_destinatario() throws Throwable {
		String text = BaseFlow.pageModel.getTextviewSummaryTitle().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTituloScotiapassDestinatario());
	}

	@Then("^Validar consistencia en datos de nuevo destinatario sean los ingresados anteriormente$")
	public void validar_consistencia_en_datos_de_nuevo_destinatario_sean_los_ingresados_anteriormente()
			throws Throwable {
	}

	@Then("^Validar que se visualiza input clave scotiapass nuevo destinatario$")
	public void validar_que_se_visualiza_input_clave_scotiapass_nuevo_destinatario() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getScotiapassPassword()));
	}

	@Then("^Validar que se visualiza boton autorizar nuevo destinatario$")
	public void validar_que_se_visualiza_boton_autorizar_nuevo_destinatario() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getButtonOk()));
	}

	@Then("^Validar que se visualiza boton cancelar nuevo destinatario$")
	public void validar_que_se_visualiza_boton_cancelar_nuevo_destinatario() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getButtonCancel()));
	}

	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ViewClaveScotiapass")
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
	@Before("@ReporteViewClaveScotiapass")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}
}