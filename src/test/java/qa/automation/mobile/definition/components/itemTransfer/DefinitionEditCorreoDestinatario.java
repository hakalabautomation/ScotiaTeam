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

public class DefinitionEditCorreoDestinatario {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@EditCorreoDestinatario")
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
	@Before("@ReporteEditCorreoDestinatario")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Validar texto campo correo nuevo destinatario$")
	public void validar_texto_campo_correo_nuevo_destinatario() throws Throwable {
		BaseFlow.pageModel.getEmailEditText().click();
		String text = BaseFlow.pageModel.getAddRecipientEmailContainer().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoInputCorreoDestinatario());
	}

	@When("^Ingresar correo en formato incorrecto\"([^\"]*)\"$")
	public void ingresar_correo_en_formato_incorrecto(String arg1) throws Throwable {
		BaseFlow.pageModel.getEmailEditText().clear();
		BaseFlow.pageModel.getEmailEditText().sendKeys(arg1);
	}

	@Then("^Validar mensaje de correo incorrecto$")
	public void validar_mensaje_de_correo_incorrecto() throws Throwable {
		String text = BaseFlow.pageModel.getTextInputError().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getMensajeErrorCorreoDestinatario());
	}

	@When("^Ingresar correo en formato correcto\"([^\"]*)\"$")
	public void ingresar_correo_en_formato_correcto(String arg1) throws Throwable {
		BaseFlow.pageModel.getEmailEditText().clear();
		BaseFlow.pageModel.getEmailEditText().sendKeys(arg1);
	}

	@Then("^Validar que mensaje error de correo desaparece$")
	public void validar_que_mensaje_error_de_correo_desaparece() throws Throwable {
		try {
			BaseFlow.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getTextInputError()));
		} finally {
			BaseFlow.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
	}
}