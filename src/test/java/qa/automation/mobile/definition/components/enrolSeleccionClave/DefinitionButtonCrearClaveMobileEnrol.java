package qa.automation.mobile.definition.components.enrolSeleccionClave;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionButtonCrearClaveMobileEnrol {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ButtonCrearClaveMobileEnrol")
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
	@Before("@ReporteButtonCrearClaveMobileEnrol")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Validar que boton crear clave mobile inicia desactivado$")
	public void validar_que_boton_crear_clave_mobile_inicia_desactivado() throws Throwable {
		assertTrue(!BaseFlow.pageModel.getChoosepassButton().isEnabled());
	}

	@Then("^Se deben desplegar campos crear clave mobile$")
	public void se_deben_desplegar_campos_crear_clave_mobile() throws Throwable {
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getScotiamobileFirstPassword()) && GenericMethod.isElementPresent(BaseFlow.pageModel.getScotiamobileSecondPassword()));
	}

	@Then("^Debe desaparecer opcion clave web$")
	public void debe_desaparecer_opcion_clave_web() throws Throwable {
		try {
			BaseFlow.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			assertTrue(!GenericMethod.isElementPresent(BaseFlow.pageModel.getChoosepassWebpassSwitch()));
		} finally {
			BaseFlow.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
	}

	@Then("^Deben desaparecer campos crear clave mobile$")
	public void deben_desaparecer_campos_crear_clave_mobile() throws Throwable {
		try {
			BaseFlow.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			assertTrue(
					!GenericMethod.isElementPresent(BaseFlow.pageModel.getScotiamobileFirstPassword()) && GenericMethod.isElementPresent(BaseFlow.pageModel.getScotiamobileSecondPassword()));
		} finally {
			BaseFlow.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
	}

	@Then("^Debe aparecer opcion clave web$")
	public void debe_aparecer_opcion_clave_web() throws Throwable {
		try {
			BaseFlow.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getChoosepassWebpassSwitch()));
		} finally {
			BaseFlow.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
	}
}