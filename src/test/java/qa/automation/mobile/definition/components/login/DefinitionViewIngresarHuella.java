package qa.automation.mobile.definition.components.login;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionViewIngresarHuella {
	@Then("^Validar titulo ingresar huella$")
	public void validar_titulo_ingresar_huella() throws Throwable {
		String text = BaseFlow.pageModel.getTextViewHeader().getText().toString().trim();
		assertTrue(text.contains(BaseFlow.properties.getTituloHuella()));
	}

	@Then("^Validar subtitulo ingresar huella$")
	public void validar_subtitulo_ingresar_huella() throws Throwable {
		String text = BaseFlow.pageModel.getTextViewBody().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getMensajeHuellaHabilitadaSub());
	}

	@Then("^Validar que imagen de huella se visualiza$")
	public void validar_que_imagen_de_huella_se_visualiza() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getImageViewFingerprint()));
	}

	@Then("^Validar que boton omitir huella se visualiza$")
	public void validar_que_boton_omitir_huella_se_visualiza() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getTextViewSkipUseFinger()));
	}
	
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ViewIngresarHuella")
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
	@Before("@ReporteViewIngresarHuella")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}
}