package qa.automation.mobile.definition.components.login;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import qa.automation.mobile.flow.BaseFlow;

public class DefinitionViewLoginSegunEnrrolamiento {
	@Then("^Validar que se visualiza avatar$")
	public void validar_que_se_visualiza_avatar() throws Throwable {
	}

	@Then("^Validar titulo Hola, nombre cliente mismo al core$")
	public void validar_titulo_Hola_nombre_cliente_mismo_al_core() throws Throwable {
	}

	@Then("^Validar que se visualiza campo clave login$")
	public void validar_que_se_visualiza_campo_clave_login() throws Throwable {
	}

	@Then("^Validar que se visualiza boton mas opciones login$")
	public void validar_que_se_visualiza_boton_mas_opciones_login() throws Throwable {
	}

	@Then("^Validar que se visualiza boton login$")
	public void validar_que_se_visualiza_boton_login() throws Throwable {
	}

	@Then("^Validar titulo huella$")
	public void validar_titulo_huella() throws Throwable {
	}

	@Then("^Validar subtitulo huella$")
	public void validar_subtitulo_huella() throws Throwable {
	}

	@Then("^Validar que se visualiza boton omitir huella$")
	public void validar_que_se_visualiza_boton_omitir_huella() throws Throwable {
	}
	
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ViewLoginSegunEnrrolamiento")
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
	@Before("@ReporteViewLoginSegunEnrrolamiento")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}
}