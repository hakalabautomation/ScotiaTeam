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
import qa.automation.mobile.util.Transfer;

public class DefinitionButtonGuardarNuevoDestinatario {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ButtonGuardarNuevoDestinatario")
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
	@Before("@ReporteButtonGuardarNuevoDestinatario")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Validar texto de boton guardar nuevo destinatario$")
	public void validar_texto_de_boton_guardar_nuevo_destinatario() throws Throwable {
		String text = BaseFlow.pageModel.getButtonNext().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoButtonGuardarDestinatario());
	}

	@When("^No se completan datos financieros de nuevo destinatario$")
	public void no_se_completan_datos_financieros_de_nuevo_destinatario() throws Throwable {
		BaseFlow.pageModel.getEdittextAccountNumber().clear();
	}

	@Then("^Validar que boton guardar nuevo destinatario permanece inactivo$")
	public void validar_que_boton_guardar_nuevo_destinatario_permanece_inactivo() throws Throwable {
		assertTrue(!BaseFlow.pageModel.getButtonNext().isEnabled());
	}

	@When("^Ingresar datos financieros validos\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingresar_datos_financieros_validos(String banco, String arg2, String nroCta) throws Throwable {
		Transfer.SeleccionarBanco(banco);
		Transfer.SeleccionarTipoCuenta();
		BaseFlow.pageModel.getEdittextAccountNumber().sendKeys(nroCta);
	}

	@Then("^Validar que boton guardar nuevo destinatario permite continuar$")
	public void validar_que_boton_guardar_nuevo_destinatario_permite_continuar() throws Throwable {
		BaseFlow.pageModel.getButtonNext().click();
		GenericMethod.esperaElementoMobileSegundos(BaseFlow.driver, BaseFlow.pageModel.getButtonOk(), 30);
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getButtonOk()));
	}
}