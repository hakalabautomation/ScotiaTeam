package qa.automation.mobile.definition.components.enrolCodigoSms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionViewIngresoSmsEnrol {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ViewIngresoSmsEnrol")
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
	@Before("@ReporteViewIngresoSmsEnrol")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Validar titulo ingreso codigo SMS$")
	public void validar_titulo_ingreso_codigo_SMS() throws Throwable {
		String titulo = BaseFlow.pageModel.getTextTitleSms().getText().toString().trim();
		assertEquals(titulo, BaseFlow.properties.getTituloIngresoSms());
	}

	@Then("^Validar subtitulo ingreso codigo SMS$")
	public void validar_subtitulo_ingreso_codigo_SMS() throws Throwable {
		String subtitulo = BaseFlow.pageModel.getTextViewHeader().getText().toString().trim();
		assertEquals(subtitulo, BaseFlow.properties.getSubtituloIngresoSms());
	}

	@Then("^Validar numero telefono ingresado es correcto$")
	public void validar_numero_telefono_ingresado_es_correcto() throws Throwable {
		String cel = BaseFlow.pageModel.getTextViewNumber().getText().toString().trim().replaceAll(" ", "");
		assertEquals("+" + cel, BaseFlow.properties.getCelularValido());
	}

	@Then("^Validar texto de tiempo formato correcto$")
	public void validar_texto_de_tiempo_formato_correcto() throws Throwable {
		String time = BaseFlow.pageModel.getTextViewCountDown().getText().toString().trim();
		assertTrue(time.length() >= 4 && time.contains(":"));
	}

	@Then("^Validar texto boton reenviar SMS$")
	public void validar_texto_boton_reenviar_SMS() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getButtonReSendSMS()));
	}

	@Then("^Validar texto input codigo SMS$")
	public void validar_texto_input_codigo_SMS() throws Throwable {
		String tex = BaseFlow.pageModel.getTextInputLayoutSMS().getText().toString().trim();
		assertEquals(tex, BaseFlow.properties.getTextoInputSms());
	}

	@Then("^Validar que se visualiza barra de progreso$")
	public void validar_que_se_visualiza_barra_de_progreso() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getProgressBarCountDown()));
	}

	@Then("^Validar que se visualiza campo editar codigo SMS$")
	public void validar_que_se_visualiza_campo_editar_codigo_SMS() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getEditTextCodeSMS()));
	}

	@Then("^Validar que se visualiza boton continuar SMS$")
	public void validar_que_se_visualiza_boton_continuar_SMS() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getSmsCodeContinue()));
	}
}