package qa.automation.mobile.definition.components.itemTransfer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;

public class DefinitionButtonConfirmarTefTercero {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ButtonConfirmarTefTercero")
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
	@Before("@ReporteButtonConfirmarTefTercero")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Validar texto de boton confirmar transferencia a tercero$")
	public void validar_texto_de_boton_confirmar_transferencia_a_tercero() throws Throwable {
		String text = BaseFlow.pageModel.getButtonAuthorize().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoButtonConfirmarTef());
	}

	@When("^Dejar campos datos de transferencia en blanco$")
	public void dejar_campos_datos_de_transferencia_en_blanco() throws Throwable {
		BaseFlow.pageModel.getEdittextEmail().clear();
		BaseFlow.pageModel.getEdittextMessage().clear();
		BaseFlow.pageModel.getEdittextAmount().clear();
	}

	@Then("^Validar que boton confirmar transferencia a tercero permanece inactivo$")
	public void validar_que_boton_confirmar_transferencia_a_tercero_permanece_inactivo() throws Throwable {
		assertTrue(!BaseFlow.pageModel.getButtonAuthorize().isEnabled());
	}

	@When("^Ingresar datos de transferencia invalidos\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingresar_datos_de_transferencia_invalidos(String arg1, String arg2, String arg3) throws Throwable {
		BaseFlow.pageModel.getEdittextEmail().clear();
		BaseFlow.pageModel.getEdittextEmail().sendKeys(arg1);
		BaseFlow.pageModel.getEdittextMessage().clear();
		BaseFlow.pageModel.getEdittextMessage().sendKeys(arg2);
		BaseFlow.pageModel.getEdittextAmount().clear();
		BaseFlow.pageModel.getEdittextAmount().sendKeys(arg3);
	}

	@When("^Ingresar datos de transferencia validos\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingresar_datos_de_transferencia_validos(String arg1, String arg2, String arg3) throws Throwable {
		BaseFlow.pageModel.getEdittextEmail().clear();
		BaseFlow.pageModel.getEdittextEmail().sendKeys(arg1);
		BaseFlow.pageModel.getEdittextMessage().clear();
		BaseFlow.pageModel.getEdittextMessage().sendKeys(arg2);
		BaseFlow.pageModel.getEdittextAmount().clear();
		BaseFlow.pageModel.getEdittextAmount().sendKeys(arg3);
	}

	@Then("^Validar que boton confirmar transferencia a tercero permite continuar$")
	public void validar_que_boton_confirmar_transferencia_a_tercero_permite_continuar() throws Throwable {

	}
}