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

public class DefinitionButtonCancelarScotiapassSms {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ButtonCancelarScotiapassSms")
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
	@Before("@ReporteButtonCancelarScotiapassSms")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Validar texto Boton cancelar scotiapass$")
	public void validar_texto_Boton_cancelar_scotiapass() throws Throwable {
		String text = BaseFlow.pageModel.getButtonCancel().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoButtonCancelarScotiapass());
	}

	@Then("^Boton cancelar scotiapass debe permanecer activo en todo momento$")
	public void boton_cancelar_scotiapass_debe_permanecer_activo_en_todo_momento() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getButtonCancel()));
	}

	@When("^Click a boton cancelar scotiapass$")
	public void click_a_boton_cancelar_scotiapass() throws Throwable {
		BaseFlow.pageModel.getButtonCancel().click();
	}

	@Then("^Pantalla ingreso scotiapass debe desaparecer sin continuar$")
	public void pantalla_ingreso_scotiapass_debe_desaparecer_sin_continuar() throws Throwable {
		try {
			GenericMethod.notEsperaElementoSegundos(BaseFlow.driver, BaseFlow.pageModel.getButtonCancel(), 30);
			BaseFlow.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			assertTrue(!GenericMethod.isElementPresent(BaseFlow.pageModel.getButtonCancel()));
		} finally {
			BaseFlow.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			BaseFlow.pageModel.getButtonNext().click();
			BaseFlow.pageModel.getSmsPassword().clear();
			BaseFlow.pageModel.getSmsPassword().sendKeys("123456");
			BaseFlow.pageModel.getButtonOk().click();
			GenericMethod.esperaElementoMobileSegundos(BaseFlow.driver, BaseFlow.pageModel.getScotiapassPassword(), 30);
		}
	}
}