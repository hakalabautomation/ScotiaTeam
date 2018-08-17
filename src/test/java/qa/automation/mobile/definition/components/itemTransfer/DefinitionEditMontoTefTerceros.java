package qa.automation.mobile.definition.components.itemTransfer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.Transfer;

public class DefinitionEditMontoTefTerceros {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@EditMontoTefTerceros")
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
	@Before("@ReporteEditMontoTefTerceros")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Validar texto campo monto transferecia terceros$")
	public void validar_texto_campo_monto_transferecia_terceros() throws Throwable {
		String text = BaseFlow.pageModel.getEdittextAmountContainer().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoInputMontoTef());
	}

	@When("^Ingresar monto transferecia terceros en formato incorrecto$")
	public void ingresar_monto_transferecia_terceros_en_formato_incorrecto() throws Throwable {
		BaseFlow.pageModel.getEdittextAmount().clear();
		BaseFlow.pageModel.getEdittextAmount().sendKeys("");
	}

	@Then("^Validar mensaje de monto transferecia terceros incorrecto$")
	public void validar_mensaje_de_monto_transferecia_terceros_incorrecto() throws Throwable {
		String text = BaseFlow.pageModel.getTextInputError().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getMensajeErrorMontoTef());
	}

	@When("^Ingresar monto en miles\"([^\"]*)\"$")
	public void ingresar_monto_en_miles(String arg1) throws Throwable {
		BaseFlow.pageModel.getEdittextAmount().clear();
		BaseFlow.pageModel.getEdittextAmount().sendKeys(arg1);
	}

	@Then("^Se debe formatear monto correctamente\"([^\"]*)\"$")
	public void se_debe_formatear_monto_correctamente(String arg1) throws Throwable {
		String text = BaseFlow.pageModel.getEdittextAmount().getText().toString().trim();
		assertEquals(text, Transfer.formatearMonto(Integer.parseInt(arg1)));
	}

	@When("^Ingresar mas de ocho digitos en campo monto transferecia terceros\"([^\"]*)\"$")
	public void ingresar_mas_de_ocho_digitos_en_campo_monto_transferecia_terceros(String arg1) throws Throwable {
		BaseFlow.pageModel.getEdittextAmount().clear();
		BaseFlow.pageModel.getEdittextAmount().sendKeys(arg1);
	}

	@Then("^No permite ingresar mas de ocho digitos en campo monto transferecia terceros$")
	public void no_permite_ingresar_mas_de_ocho_digitos_en_campo_monto_transferecia_terceros() throws Throwable {
		String text = BaseFlow.pageModel.getEdittextAmount().getText().toString().trim();
		assertTrue(text.length() <= 10);
	}

	@When("^Ingresar monto correcto\"([^\"]*)\"$")
	public void ingresar_monto_correcto(String arg1) throws Throwable {
		BaseFlow.pageModel.getEdittextAmount().clear();
		BaseFlow.pageModel.getEdittextAmount().sendKeys(arg1);
	}

	@Then("^Permte ingresar monto correctamente$")
	public void permte_ingresar_monto_correctamente() throws Throwable {
		String text = BaseFlow.pageModel.getEdittextAmount().getText().toString().trim();
		assertTrue(text.length() <= 10);
	}
}