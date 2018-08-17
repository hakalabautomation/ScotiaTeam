package qa.automation.mobile.definition.components.itemTransfer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;

public class DefinitionEditNombreDestinatario {
	@Then("^Validar texto campo nombre destinatario$")
	public void validar_texto_campo_nombre_destinatario() throws Throwable {
		BaseFlow.pageModel.getNameEditText().click();
		String text = BaseFlow.pageModel.getAddRecipientNameContainer().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoInputNombreDestinatario());
	}

	@When("^Ingresar caracteres alfanumeros en campo nombre destinatario\"([^\"]*)\"$")
	public void ingresar_caracteres_alfanumeros_en_campo_nombre_destinatario(String arg1) throws Throwable {
		BaseFlow.pageModel.getNameEditText().clear();
		BaseFlow.pageModel.getNameEditText().sendKeys(arg1);
	}

	@Then("^Validar que se ingresaron caracteres en campo nombre destinatario\"([^\"]*)\"$")
	public void validar_que_se_ingresaron_caracteres_en_campo_nombre_destinatario(String arg1) throws Throwable {
		String text = BaseFlow.pageModel.getNameEditText().getText().toString().trim();
		assertEquals(text, arg1);
	}

	@When("^Ingresar nombre menos de tres caracteres\"([^\"]*)\"$")
	public void ingresar_nombre_menos_de_tres_caracteres(String arg1) throws Throwable {
		BaseFlow.pageModel.getNameEditText().clear();
		BaseFlow.pageModel.getNameEditText().sendKeys(arg1);
	}

	@Then("^Desplegar mensaje nombre invalido$")
	public void desplegar_mensaje_nombre_invalido() throws Throwable {
		String error = BaseFlow.pageModel.getTextInputError().getText().toString().trim();
		assertEquals(error, BaseFlow.properties.getMensajeErrorNombreDestinatario());
	}

	@When("^Ingresar nombre mas de cincuenta caracteres\"([^\"]*)\"$")
	public void ingresar_nombre_mas_de_cincuenta_caracteres(String arg1) throws Throwable {
		BaseFlow.pageModel.getNameEditText().clear();
		BaseFlow.pageModel.getNameEditText().sendKeys(arg1);
	}

	@Then("^No permitir ingreso de mas de cincuenta caracteres en nombre$")
	public void no_permitir_ingreso_de_mas_de_cincuenta_caracteres_en_nombre() throws Throwable {
		String text = BaseFlow.pageModel.getNameEditText().getText().toString().trim();
		assertTrue(text.length() <= 50);
	}

	@When("^Ingresar nombre cincuenta caracteres\"([^\"]*)\"$")
	public void ingresar_nombre_cincuenta_caracteres(String arg1) throws Throwable {
		BaseFlow.pageModel.getNameEditText().clear();
		BaseFlow.pageModel.getNameEditText().sendKeys(arg1);
	}

	@Then("^Permitir ingreso de nombre maximo caracteres\"([^\"]*)\"$")
	public void permitir_ingreso_de_nombre_maximo_caracteres(String arg1) throws Throwable {
		String text = BaseFlow.pageModel.getNameEditText().getText().toString().trim();
		assertTrue(text.length() == 50);
	}

	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@EditNombreDestinatario")
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
	@Before("@ReporteEditNombreDestinatario")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}
}