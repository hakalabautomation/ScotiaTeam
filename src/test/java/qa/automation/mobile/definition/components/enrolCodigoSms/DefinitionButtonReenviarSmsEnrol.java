package qa.automation.mobile.definition.components.enrolCodigoSms;

import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionButtonReenviarSmsEnrol {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ButtonReenviarSmsEnrol")
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
	@Before("@ReporteButtonReenviarSmsEnrol")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Boton permanece inactivo si contador no ha llegado a cero$")
	public void boton_permanece_inactivo_si_contador_no_ha_llegado_a_cero() throws Throwable {
		String time = BaseFlow.pageModel.getTextViewCountDown().getText().toString().trim();
		if (time.equalsIgnoreCase("00:00"))
			assertTrue(BaseFlow.pageModel.getButtonReSendSMS().isEnabled());
		else
			assertTrue(!BaseFlow.pageModel.getButtonReSendSMS().isEnabled());
	}

	@Given("^Tiempo de SMS debe estar en cero$")
	public void tiempo_de_SMS_debe_estar_en_cero() throws Throwable {
		String time = "";
		long cont = 0;
		do {
			time = BaseFlow.pageModel.getTextViewCountDown().getText().toString().trim();
			GenericMethod.esperarSegundos(BaseFlow.driver, 1);
			cont++;
		} while (!time.equalsIgnoreCase("00:00") || cont <= 120);
	}

	@When("^Click en boton reenviar codigo$")
	public void click_en_boton_reenviar_codigo() throws Throwable {
		if (BaseFlow.pageModel.getButtonReSendSMS().isEnabled())
			BaseFlow.pageModel.getButtonReSendSMS().click();
		else
			assertTrue("No se pudo realizar click a reenviar SMS", false);
	}

	@Then("^Se debe recibir SMS antes de finalizado el tiempo$")
	public void se_debe_recibir_SMS_antes_de_finalizado_el_tiempo() throws Throwable {
		assertTrue(!BaseFlow.pageModel.getButtonReSendSMS().isEnabled());
	}
}