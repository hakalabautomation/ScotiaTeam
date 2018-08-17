package qa.automation.mobile.definition.components.itemTransfer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionViewIngresoSms {
	@Then("^Validar titulo ingreso codigo SMS nuevo destinatario$")
	public void validar_titulo_ingreso_codigo_SMS_nuevo_destinatario() throws Throwable {
		String text = BaseFlow.pageModel.getTextTitleSms().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTituloIngresarSMSDestinatario());
	}

	@Then("^Validar subtitulo ingreso codigo SMS nuevo destinatario$")
	public void validar_subtitulo_ingreso_codigo_SMS_nuevo_destinatario() throws Throwable {
		String text = BaseFlow.pageModel.getTextViewHeader().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getSubtituloIngresarSMSDestinatario());
	}

	@Then("^Validar texto de tiempo formato correcto nuevo destinatario$")
	public void validar_texto_de_tiempo_formato_correcto_nuevo_destinatario() throws Throwable {
		String time = BaseFlow.pageModel.getTextViewCountDown().getText().toString().trim();
		assertTrue(time.length() >= 4 && time.contains(":"));
	}

	@Then("^Validar texto boton reenviar SMS nuevo destinatario$")
	public void validar_texto_boton_reenviar_SMS_nuevo_destinatario() throws Throwable {
		String text = BaseFlow.pageModel.getButtonReSendSMS().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoReenviarSms());
	}

	@Then("^Validar que se visualiza campo editar codigo SMS nuevo destinatario$")
	public void validar_que_se_visualiza_campo_editar_codigo_SMS_nuevo_destinatario() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getSmsPassword()));
	}

	@Then("^Validar que se visualiza boton validar SMS$")
	public void validar_que_se_visualiza_boton_validar_SMS() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getButtonOk()));
	}

	@Then("^Validar que se visualiza boton cancelar SMS$")
	public void validar_que_se_visualiza_boton_cancelar_SMS() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getButtonCancel()));
	}

	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ViewIngresoSms")
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
	@Before("@ReporteViewIngresoSms")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}
}