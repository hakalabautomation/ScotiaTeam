package qa.automation.mobile.definition.steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.Transfer;

public class DefinitionPagoTarjetaCreditoNacional {

	@When("^Selecciona tarjeta de credito con deuda a pagar$")
	public void selecciona_tarjeta_de_credito_con_deuda_a_pagar() throws Throwable {
	}

	@When("^Click a opcion pagar tarjeta de credito$")
	public void click_a_opcion_pagar_tarjeta_de_credito() throws Throwable {
		BaseFlow.pageModel.getViewGoToPayment().click();
	}

	@When("^Selecciona cuenta a cual se realizara el cobro$")
	public void selecciona_cuenta_a_cual_se_realizara_el_cobro() throws Throwable {
	}

	@When("^Ingreso forma de pago y monto a pagar\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingreso_forma_de_pago_y_monto_a_pagar(String arg1, String arg2) throws Throwable {
		Transfer.FormaPagoTarjetaCreditoNacional(arg1, arg2);
	}

	@When("^Confirma monto y autoriza pago$")
	public void confirma_monto_y_autoriza_pago() throws Throwable {
		BaseFlow.pageModel.getDialogInformationButtonPositive().click();
	}

	@Then("^Se debe desplegar comprobante de pago con monto ingresado$")
	public void se_debe_desplegar_comprobante_de_pago_con_monto_ingresado() throws Throwable {
	}

	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@PagoTarjetaCreditoNacional")
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
	@Before("@ReportePagoTarjetaCreditoNacional")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}
}