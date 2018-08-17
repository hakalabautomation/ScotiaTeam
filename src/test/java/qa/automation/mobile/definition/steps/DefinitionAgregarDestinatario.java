package qa.automation.mobile.definition.steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;
import qa.automation.mobile.util.Transfer;

public class DefinitionAgregarDestinatario {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@AgregarDestinatario")
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
	@Before("@ReporteAgregarDestinatario")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Given("^Estoy previamente enrrolado en Scotiabank Go\"([^\"]*)\"$")
	public void estoy_previamente_enrrolado_en_Scotiabank_Go(String arg1) throws Throwable {
		GenericMethod.verificaEnrol(arg1);
	}

	@When("^Click a opcion transferecias$")
	public void click_a_opcion_transferecias() throws Throwable {
		BaseFlow.pageModel.getBottomItemTransfer().click();
	}

	@When("^Click a boton nuevo destinatario$")
	public void click_a_boton_nuevo_destinatario() throws Throwable {
		GenericMethod.esperaElementoMobileSegundos(BaseFlow.driver, BaseFlow.pageModel.getTextviewRecipientNew(), 30);
		BaseFlow.pageModel.getTextviewRecipientNew().click();
	}

	@When("^Ingresar datos personales destinatario\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingresar_datos_personales_destinatario(String nombre, String rut, String correo) throws Throwable {
		BaseFlow.pageModel.getNameEditText().sendKeys(nombre);
		BaseFlow.pageModel.getRutEditText().sendKeys(rut);
		BaseFlow.pageModel.getEmailEditText().sendKeys(correo);
	}

	@When("^Click a boton continuar$")
	public void click_a_boton_continuar() throws Throwable {
		BaseFlow.pageModel.getAddRecipientButtonNext().click();
	}

	@When("^Ingresar datos financieros destinatario\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void ingresar_datos_financieros_destinatario(String banco, String tipoCta, String nroCta) throws Throwable {
		Transfer.SeleccionarBanco(banco);
		Transfer.SeleccionarTipoCuenta();
		BaseFlow.pageModel.getEdittextAccountNumber().sendKeys(nroCta);
	}

	@When("^Click a boton guardar$")
	public void click_a_boton_guardar() throws Throwable {
		BaseFlow.pageModel.getButtonNext().click();
	}

	@When("^Autorizar con segundo factor\"([^\"]*)\"$")
	public void autorizar_con_segundo_factor(String arg1) throws Throwable {
		Transfer.SegundoFactorTEF(arg1, true);
	}

	@Then("^Destinatario agregado exitosamente\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void destinatario_agregado_exitosamente(String nombre, String banco, String nroCta) throws Throwable {
		boolean titulo = BaseFlow.pageModel.getDialogInformationTitle().getText().equalsIgnoreCase(BaseFlow.properties.getTituloAgregadoConExito());
		String mensajeExito = BaseFlow.properties.getMensajeAgregadoConExito() + "\n" + nombre;
		String mensaje = BaseFlow.pageModel.getDialogInformationMessage().getText();
		boolean exito = mensaje.equalsIgnoreCase(mensajeExito);
		assertTrue(titulo && exito);
		BaseFlow.pageModel.getDialogInformationButtonNeutral().click();
		String name = BaseFlow.pageModel.getTextviewRecipientName().get(0).getText().toString().trim();
		String bank = BaseFlow.pageModel.getTextviewRecipientBankDescription().get(0).getText().toString().trim();
		String cta = BaseFlow.pageModel.getTextviewRecipientAccountNumber().get(0).getText().toString().trim();
		assertTrue(name.equalsIgnoreCase(nombre) && bank.contains(banco) && cta.equalsIgnoreCase(nroCta));
	}

	@When("^Escoger nuevo destinatario agregado$")
	public void escoger_nuevo_destinatario_agregado() throws Throwable {
		GenericMethod.esperaElementoMobileSegundos(BaseFlow.driver, BaseFlow.pageModel.getTextviewRecipientName().get(0), 30);
		BaseFlow.pageModel.getTextviewRecipientName().get(0).click();
	}

	@When("^Ingresar monto a transferir\"([^\"]*)\"$")
	public void ingresar_monto_a_transferir(String arg1) throws Throwable {
		GenericMethod.scrollMobile(BaseFlow.driver, BaseFlow.pageModel.getEdittextAmount(), BaseFlow.pageModel.getEdittextEmail());
		BaseFlow.pageModel.getEdittextAmount().sendKeys(arg1);
	}

	@When("^Click a boton confirmar$")
	public void click_a_boton_confirmar() throws Throwable {
		BaseFlow.pageModel.getButtonAuthorize().click();
	}

	@When("^Autorizar TEF con segundo factor\"([^\"]*)\"$")
	public void autorizar_TEF_con_segundo_factor(String arg1) throws Throwable {
		Transfer.SegundoFactorTEF(arg1, false);
	}

	@Then("^Se realiza TEF correctamente$")
	public void se_realiza_TEF_correctamente() throws Throwable {
		String tef = BaseFlow.pageModel.getTextviewReceiptLabelResult().getText().toString().trim();
		assertEquals(tef, BaseFlow.properties.getTituloComprobanteTef());
	}
}