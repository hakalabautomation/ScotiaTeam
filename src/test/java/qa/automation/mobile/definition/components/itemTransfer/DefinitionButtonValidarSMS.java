package qa.automation.mobile.definition.components.itemTransfer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionButtonValidarSMS {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ButtonValidarSMS")
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
	@Before("@ReporteButtonValidarSMS")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Validar texto de boton validar SMS nuevo destinatario$")
	public void validar_texto_de_boton_validar_SMS_nuevo_destinatario() throws Throwable {
		String text = BaseFlow.pageModel.getButtonOk().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoButtonValidarSMS());
	}

	@When("^Ingresar codigo SMS nuevo destinatarios invalido\"([^\"]*)\"$")
	public void ingresar_codigo_SMS_nuevo_destinatarios_invalido(String arg1) throws Throwable {
		BaseFlow.pageModel.getSmsPassword().clear();
		BaseFlow.pageModel.getSmsPassword().sendKeys(arg1);
	}

	@Then("^Comprobar que boton validar SMS permanece inactivo$")
	public void comprobar_que_boton_validar_SMS_permanece_inactivo() throws Throwable {
		assertTrue(BaseFlow.pageModel.getButtonOk().isEnabled());
	}

	@When("^Ingresar codigo SMS nuevo destinatarios valido\"([^\"]*)\"$")
	public void ingresar_codigo_SMS_nuevo_destinatarios_valido(String arg1) throws Throwable {
		BaseFlow.pageModel.getSmsPassword().clear();
		BaseFlow.pageModel.getSmsPassword().sendKeys(arg1);
	}

	@Then("^Comprobar que boton validar SMS permite continuar$")
	public void comprobar_que_boton_validar_SMS_permite_continuar() throws Throwable {
		BaseFlow.pageModel.getButtonOk().click();
		GenericMethod.esperaElementoMobileSegundos(BaseFlow.driver, BaseFlow.pageModel.getScotiapassPassword(), 30);
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getScotiapassPassword()));
	}
}