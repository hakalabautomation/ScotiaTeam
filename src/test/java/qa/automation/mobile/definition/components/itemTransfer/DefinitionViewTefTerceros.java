package qa.automation.mobile.definition.components.itemTransfer;

import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionViewTefTerceros {
	@When("^Obtener datos de destinatario seleccionado$")
	public void obtener_datos_de_destinatario_seleccionado() throws Throwable {
		// Faltan servicios
	}

	@Then("^Validar datos de destinatario sean consistentes$")
	public void validar_datos_de_destinatario_sean_consistentes() throws Throwable {
		// Faltan servicios
	}

	@Then("^Validar que se visualiza imput correo destinatario$")
	public void validar_que_se_visualiza_imput_correo_destinatario() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getEdittextEmail()));
	}

	@Then("^Validar que se visualiza campo mensaje transferencia$")
	public void validar_que_se_visualiza_campo_mensaje_transferencia() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getEdittextMessage()));
	}

	@Then("^Validar que se visualiza input monto transferecnia$")
	public void validar_que_se_visualiza_input_monto_transferecnia() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getEdittextAmount()));
	}

	@Then("^Validar que se visualiza boton confirmar transferencia$")
	public void validar_que_se_visualiza_boton_confirmar_transferencia() throws Throwable {
		GenericMethod.scrollMobile(BaseFlow.driver, BaseFlow.pageModel.getEdittextAmount(),
				BaseFlow.pageModel.getEdittextEmail());
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getButtonAuthorize()));
	}

	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ViewTefTerceros")
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
	@Before("@ReporteViewTefTerceros")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}
}