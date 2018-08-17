package qa.automation.mobile.definition.components.enrolEsTuCelularAndroid;

import static org.junit.Assert.assertEquals;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import qa.automation.mobile.flow.BaseFlow;

public class DefinitionViewEsTuCelularEnrol {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ViewEsTuCelularEnrol")
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
	@Before("@ReporteViewEsTuCelularEnrol")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Validar texto de titulo Hola, nombre de cliente mismo al del core$")
	public void validar_texto_de_titulo_Hola_nombre_de_cliente_mismo_al_del_core() throws Throwable {
		// Falta obtener nombre de cliente desde core
	}

	@Then("^Validar texto de subtitulo pantalla Es Tu numero$")
	public void validar_texto_de_subtitulo_pantalla_Es_Tu_numero() throws Throwable {
		String sub = BaseFlow.pageModel.getSubPorTuSeguridad().getText().toString().trim();
		assertEquals(sub, BaseFlow.properties.getMensajePorTuSeguridad());
	}

	@Then("^Validar texto input numero celular$")
	public void validar_texto_input_numero_celular() throws Throwable {
		String tex = BaseFlow.pageModel.getSubEsteEsTuNumero().getText().toString().trim();
		assertEquals(tex, BaseFlow.properties.getMensajeEsteEsTuNumero());
	}

	@Then("^Validar texto \\+ en input numero celular$")
	public void validar_texto_en_input_numero_celular() throws Throwable {
		String tex = BaseFlow.pageModel.getTextViewPlus().getText().toString().trim();
		assertEquals(tex, BaseFlow.properties.getPlus());
	}
}