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

public class DefinitionEditRutDestinatario {
	@Then("^Validar texto campo Rut nuevo destinatario$")
	public void validar_texto_campo_Rut_nuevo_destinatario() throws Throwable {
		BaseFlow.pageModel.getRutEditText().click();
		String text = BaseFlow.pageModel.getAddRecipientRutContainer().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoInputRut());
	}

	@When("^Ingresar rut nuevo destinatario invalido\"([^\"]*)\"$")
	public void ingresar_rut_nuevo_destinatario_invalido(String arg1) throws Throwable {
		BaseFlow.pageModel.getRutEditText().clear();
		BaseFlow.pageModel.getRutEditText().sendKeys(arg1);
	}

	@When("^Ingresar mas caracteres del maximo permitido en rut nuevo destinatario\"([^\"]*)\"$")
	public void ingresar_mas_caracteres_del_maximo_permitido_en_rut_nuevo_destinatario(String arg1) throws Throwable {
		BaseFlow.pageModel.getRutEditText().clear();
		try {
			BaseFlow.pageModel.getRutEditText().sendKeys(arg1);
		} catch (Exception e) {
			BaseFlow.LOGGER.info("No permite ingresar mas caracteres en rut nuevo destinatario", e.toString().trim());
		}
	}

	@Then("^No permitir ingresar mas caracteres en rut nuevo destinatario$")
	public void no_permitir_ingresar_mas_caracteres_en_rut_nuevo_destinatario() throws Throwable {
		String text = BaseFlow.pageModel.getRutEditText().getText().toString().trim();
		assertTrue(text.length() <= 12);
	}

	@When("^Ingresar en rut nuevo destinatario letras y caracteres especiales\"([^\"]*)\"$")
	public void ingresar_en_rut_nuevo_destinatario_letras_y_caracteres_especiales(String arg1) throws Throwable {
		BaseFlow.pageModel.getRutEditText().clear();
		try {
			BaseFlow.pageModel.getRutEditText().sendKeys(arg1);
		} catch (Exception e) {
			BaseFlow.LOGGER.info("No permite ingresar letras y caracteres especiales en rut nuevo destinatario",
					e.toString().trim());
		}
	}

	@Then("^No permitir ingresar letras y caracteres especiales en rut nuevo destinatario$")
	public void no_permitir_ingresar_letras_y_caracteres_especiales_en_rut_nuevo_destinatario() throws Throwable {
		String text = BaseFlow.pageModel.getRutEditText().getText().toString().trim();
		assertTrue(text.equalsIgnoreCase("") || GenericMethod.isNumeric(text));
	}

	@When("^Ingresar en rut nuevo destinatariomas de una letra k\"([^\"]*)\"$")
	public void ingresar_en_rut_nuevo_destinatariomas_de_una_letra_k(String arg1) throws Throwable {
		BaseFlow.pageModel.getRutEditText().clear();
		BaseFlow.pageModel.getRutEditText().sendKeys(arg1);
	}

	@Then("^No permitir ingresar mas de una letra k en rut nuevo destinatario$")
	public void no_permitir_ingresar_mas_de_una_letra_k_en_rut_nuevo_destinatario() throws Throwable {
		String text = BaseFlow.pageModel.getRutEditText().getText().toString().trim().toLowerCase();
		assertTrue(text.length() <= 1 || text.equalsIgnoreCase("") || text.equalsIgnoreCase("k"));
	}

	@When("^Ingresar rut nuevo destinatario valido\"([^\"]*)\"$")
	public void ingresar_rut_nuevo_destinatario_valido(String arg1) throws Throwable {
		BaseFlow.pageModel.getRutEditText().clear();
		BaseFlow.pageModel.getRutEditText().sendKeys(arg1);
	}

	@Then("^Comprobar formato correcto de rut nuevo destinatario\"([^\"]*)\"$")
	public void comprobar_formato_correcto_de_rut_nuevo_destinatario(String arg1) throws Throwable {
		String format = GenericMethod.formatearRUT(arg1);
		String text = BaseFlow.pageModel.getRutEditText().getText().toString().trim();
		assertEquals(format, text);
	}

	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@EditRutDestinatario")
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
	@Before("@ReporteEditRutDestinatario")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}
}