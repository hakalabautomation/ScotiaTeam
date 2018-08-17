package qa.automation.mobile.definition.components.itemTransfer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebElement;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;

public class DefinitionEditSelectTipoCuenta {
	@Then("^Validar texto campo tipo cuenta nuevo destinatario$")
	public void validar_texto_campo_tipo_cuenta_nuevo_destinatario() throws Throwable {
		String text = BaseFlow.pageModel.getEdittextAccountType().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoInputTipoCta());
	}

	@When("^Click a lista de tipo cuenta$")
	public void click_a_lista_de_tipo_cuenta() throws Throwable {
		BaseFlow.pageModel.getEdittextAccountType().click();
	}

	@Then("^Validar que se despliega lista de tipo cuenta$")
	public void validar_que_se_despliega_lista_de_tipo_cuenta() throws Throwable {
		int tipos = 0;
		boolean correcto = false;
		String[] tiposCta = BaseFlow.properties.getTiposDeCuenta().split("|");
		for (WebElement tipoCta : BaseFlow.pageModel.getTextViewTypeAccount()) {
			correcto = tipoCta.getText().trim().equalsIgnoreCase(tiposCta[tipos]);
			tipos++;
		}
		assertTrue(correcto);
	}

	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@EditSelectTipoCuenta")
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
	@Before("@ReporteEditSelectTipoCuenta")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}
}