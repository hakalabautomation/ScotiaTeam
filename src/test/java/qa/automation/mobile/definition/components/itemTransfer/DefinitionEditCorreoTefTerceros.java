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

public class DefinitionEditCorreoTefTerceros {
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

	@Then("^Validar texto campo correo destinatario$")
	public void validar_texto_campo_correo_destinatario() throws Throwable {
		String text = BaseFlow.pageModel.getEdittextEmailContainer().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getTextoInputMensajeTef());
	}

	@Then("^Validar correo destinatario debe tener por defecto correo valido$")
	public void validar_correo_destinatario_debe_tener_por_defecto_correo_valido() throws Throwable {
		String text = BaseFlow.pageModel.getEdittextEmail().getText().toString().trim();
		assertTrue(GenericMethod.CorreoValido(text));
	}

	@When("^Ingresar correo destinatario en formato incorrecto\"([^\"]*)\"$")
	public void ingresar_correo_destinatario_en_formato_incorrecto(String arg1) throws Throwable {
		BaseFlow.pageModel.getEdittextEmail().clear();
		BaseFlow.pageModel.getEdittextEmail().sendKeys(arg1);
	}

	@Then("^Validar mensaje de correo destinatario incorrecto$")
	public void validar_mensaje_de_correo_destinatario_incorrecto() throws Throwable {
		String text = BaseFlow.pageModel.getTextInputError().getText().toString().trim();
		assertEquals(text, BaseFlow.properties.getMensajeErrorCorreoDestinatario());
	}

	@When("^Ingresar correo destinatario en formato correcto\"([^\"]*)\"$")
	public void ingresar_correo_destinatario_en_formato_correcto(String arg1) throws Throwable {
		BaseFlow.pageModel.getEdittextEmail().clear();
		BaseFlow.pageModel.getEdittextEmail().sendKeys(arg1);
	}

	@Then("^Validar que mensaje error de correo destinatario desaparece$")
	public void validar_que_mensaje_error_de_correo_destinatario_desaparece() throws Throwable {
		try {
			BaseFlow.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			assertTrue(!GenericMethod.isElementPresent(BaseFlow.pageModel.getTextInputError()));
		} finally {
			BaseFlow.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
	}
}