package qa.automation.mobile.definition.components.enrolClaveScotiapass;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionViewClaveScotiapassEnrol {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ViewClaveScotiapassEnrol")
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
	@Before("@ReporteViewClaveScotiapassEnrol")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Validar titulo clave scotiapass$")
	public void validar_titulo_clave_scotiapass() throws Throwable {
		String titulo = BaseFlow.pageModel.getScotiapassTitle().getText().toString().trim();
		assertEquals(titulo, BaseFlow.properties.getTituloAutorizaRegistro());
	}

	@Then("^Validar subtitulo clave scotiapass$")
	public void validar_subtitulo_clave_scotiapass() throws Throwable {
		String titulo = BaseFlow.pageModel.getTextViewKeypassDesription().getText().toString().trim();
		assertEquals(titulo, BaseFlow.properties.getSubtituloAutorizaRegistro());
	}

	@Then("^Validar que se visualiza input clave scotiapass$")
	public void validar_que_se_visualiza_input_clave_scotiapass() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getScotiapassPassword()));
	}

	@Then("^Validar que se visualiza boton ingresar clave autorizacion$")
	public void validar_que_se_visualiza_boton_ingresar_clave_autorizacion() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getScotiapassButton()));
	}
}