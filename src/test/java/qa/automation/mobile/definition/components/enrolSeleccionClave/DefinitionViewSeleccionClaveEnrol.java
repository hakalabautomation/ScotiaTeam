package qa.automation.mobile.definition.components.enrolSeleccionClave;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionViewSeleccionClaveEnrol {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ViewSeleccionClaveEnrol")
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
	@Before("@ReporteViewSeleccionClaveEnrol")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Validar titulo seleccion de clave$")
	public void validar_titulo_seleccion_de_clave() throws Throwable {
		String titulo = BaseFlow.pageModel.getChoosepassTitle().getText().toString().trim();
		assertEquals(titulo, BaseFlow.properties.getTituloSeleccionClave());
	}

	@Then("^Validar subtitulo seleccion de clave$")
	public void validar_subtitulo_seleccion_de_clave() throws Throwable {
		String titulo = BaseFlow.pageModel.getChoosepassSubtitle().getText().toString().trim();
		assertEquals(titulo, BaseFlow.properties.getSubtituloSeleccionClave());
	}

	@Then("^Validar titulo crear clave mobile$")
	public void validar_titulo_crear_clave_mobile() throws Throwable {
		String titulo = BaseFlow.pageModel.getChoosepassScotiamobileTitle().getText().toString().trim();
		assertEquals(titulo, BaseFlow.properties.getTituloClaveMobile());
	}

	@Then("^Validar subtitulo crear clave mobile$")
	public void validar_subtitulo_crear_clave_mobile() throws Throwable {
		String titulo = BaseFlow.pageModel.getChoosepassScotiamobileSubtitle().getText().toString().trim();
		assertEquals(titulo, BaseFlow.properties.getSubtituloClaveMobile());
	}

	@Then("^Validar titulo utilizar clave web$")
	public void validar_titulo_utilizar_clave_web() throws Throwable {
		String titulo = BaseFlow.pageModel.getChoosepassWebpassTitle().getText().toString().trim();
		assertEquals(titulo, BaseFlow.properties.getTituloClaveWeb());
	}

	@Then("^Validar subtitulo utilizar clave web$")
	public void validar_subtitulo_utilizar_clave_web() throws Throwable {
		String titulo = BaseFlow.pageModel.getChoosepassWebpassSubtitle().getText().toString().trim();
		assertEquals(titulo, BaseFlow.properties.getSubtituloClaveWeb());
	}

	@Then("^Validar que se visualiza boton crear clave mobile$")
	public void validar_que_se_visualiza_boton_crear_clave_mobile() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getChoosepassScotiamobileSwitch()));
	}

	@Then("^Validar que se visualiza boton clave web$")
	public void validar_que_se_visualiza_boton_clave_web() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getChoosepassWebpassSwitch()));
	}

	@Then("^Validar que se visualiza boton ingresar clave seleccionada$")
	public void validar_que_se_visualiza_boton_ingresar_clave_seleccionada() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getChoosepassButton()));
	}
}
