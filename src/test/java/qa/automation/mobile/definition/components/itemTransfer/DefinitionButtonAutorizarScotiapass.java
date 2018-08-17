package qa.automation.mobile.definition.components.itemTransfer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionButtonAutorizarScotiapass {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ButtonAutorizarScotiapass")
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
	@Before("@ReporteButtonAutorizarScotiapass")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Validar texto de boton autorizar scotiapass$")
	public void validar_texto_de_boton_autorizar_scotiapass() throws Throwable {
		String text = BaseFlow.pageModel.getButtonOk().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoButtonAutorizaScotiapass());
	}

	@When("^Ingresar clave scotiapass invalida\"([^\"]*)\"$")
	public void ingresar_clave_scotiapass_invalida(String arg1) throws Throwable {
		BaseFlow.pageModel.getScotiapassPassword().clear();
		BaseFlow.pageModel.getScotiapassPassword().sendKeys(arg1);
	}

	@Then("^Comprobar que boton autorizar scotiapass permanece inactivo$")
	public void comprobar_que_boton_autorizar_scotiapass_permanece_inactivo() throws Throwable {
		assertTrue(!BaseFlow.pageModel.getButtonOk().isEnabled());
	}

	@Then("^Comprobar que boton autorizar scotiapass permite continuar$")
	public void comprobar_que_boton_autorizar_scotiapass_permite_continuar() throws Throwable {
		try {
			BaseFlow.pageModel.getButtonOk().click();
			BaseFlow.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			GenericMethod.notEsperaElementoSegundos(BaseFlow.driver, BaseFlow.pageModel.getButtonOk(), 60);
		} finally {
			assertTrue(!GenericMethod.isElementPresent(BaseFlow.pageModel.getButtonOk()));
			BaseFlow.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
	}
}