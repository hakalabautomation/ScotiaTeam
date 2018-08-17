package qa.automation.mobile.definition.components.enrolLogin;

import static org.junit.Assert.assertEquals;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;

public class DefinitionViewLoginEnrol {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@ViewLoginEnrol")
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
	@Before("@ReporteViewLoginEnrol")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Then("^Validar textos de pantalla Login$")
	public void validar_textos_de_pantalla_Login() throws Throwable {
		String titulo = BaseFlow.pageModel.getLoginWelcome().getText().toString().trim();
		// String tex1 = BaseFlow.pageModel.getLoginHelpLabel().getText().toString().trim();
		// String opt1 = BaseFlow.pageModel.getLoginHelpPasswordRecover().getText().toString().trim();
		// String tex2 = BaseFlow.pageModel.getLoginHelpPasswordLabel().getText().toString().trim();
		// String opt2 = BaseFlow.pageModel.getLoginHelpPasswordCreate().getText().toString().trim();
		assertEquals(titulo, BaseFlow.properties.getTituloBienvenido());
		// assertEquals(tex1, BaseFlow.properties.getLabelOlvidastePassLogin());
		// assertEquals(opt1, BaseFlow.properties.getTextoRecuperaTuClave());
		// assertEquals(tex2, BaseFlow.properties.getLabelTeAyudamosLogin());
		// assertEquals(opt2, BaseFlow.properties.getTextoNoTienesClaveInternet());
	}

	@When("^Click opcion Recupera tu clave$")
	public void click_opcion_Recupera_tu_clave() throws Throwable {
		BaseFlow.pageModel.getLoginHelpPasswordRecover().click();
	}

	@Then("^Validar textos de popup Recupera tu clave$")
	public void validar_textos_de_popup_Recupera_tu_clave() throws Throwable {
		String titulo = BaseFlow.pageModel.getDialogInformationTitle().getText().toString().trim();
		String mensaje = BaseFlow.pageModel.getDialogInformationMessage().getText().toString().trim();
		assertEquals(titulo, BaseFlow.properties.getTituloPopupOlvidastePassLogin());
		assertEquals(mensaje, BaseFlow.properties.getMensajePopupOlvidastePassLogin());
		BaseFlow.pageModel.getDialogInformationButtonNeutral().click();
	}

	@When("^Click opcion No tienes clave internet$")
	public void click_opcion_No_tienes_clave_internet() throws Throwable {
		BaseFlow.pageModel.getLoginHelpPasswordCreate().click();
	}

	@Then("^Validar textos de popup No tienes clave internet$")
	public void validar_textos_de_popup_No_tienes_clave_internet() throws Throwable {
		String titulo = BaseFlow.pageModel.getDialogInformationTitle().getText().toString().trim();
		// String mensaje = BaseFlow.pageModel.getDialogInformationMessage().getText().toString().trim();
		BaseFlow.pageModel.getDialogInformationButtonNeutral().click();
		assertEquals(titulo, BaseFlow.properties.getTituloPopupNoTengoClaveLogin());
		// assertEquals(mensaje, BaseFlow.properties.getMensajePopupNoTengoClaveLogin());
	}
}