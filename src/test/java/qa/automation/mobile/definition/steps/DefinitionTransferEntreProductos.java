package qa.automation.mobile.definition.steps;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;
import qa.automation.mobile.util.Transfer;

public class DefinitionTransferEntreProductos {
	/**
	 * Function: insertaLinea Description: Agrega una linea de repoorte
	 * 
	 * @param Scenario
	 *            scenario
	 * @return Void
	 **/
	@After("@TransferenciaEntreProductos")
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
	@Before("@ReporteTransferenciaEntreProductos")
	public void generaBloque(Scenario scenario) {
		BaseFlow.htmlReport.openBloque(scenario);
	}

	@Given("^Estoy enrrolado en Scotiabank Go\"([^\"]*)\"$")
	public void estoy_enrrolado_en_Scotiabank_Go(String arg1) throws Throwable {
		GenericMethod.verificaEnrol(arg1);
	}

	@When("^Click a la opcion transferecias$")
	public void click_a_la_opcion_transferecias() throws Throwable {
		BaseFlow.pageModel.getBottomItemTransfer().click();
	}

	@When("^Click a opcion entre productos\"([^\"]*)\"$")
	public void click_a_opcion_entre_productos(String arg1) throws Throwable {
		BaseFlow.pageModel.getTabBetweenProducts().click();
		BaseFlow.driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		Transfer.SeleccionarTipoCuenta(arg1);
	}

	@When("^Selecciono mi cuenta destino\"([^\"]*)\"$")
	public void selecciono_mi_cuenta_destino(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		BaseFlow.driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		Transfer.SeleccionarTipoCuentaEntreProductos(arg1);
		//BaseFlow.pageModel.getArrowBetweenProducts().click();
	}

	@When("^Ingresar el monto\"([^\"]*)\"$")
	public void ingresar_el_monto(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//click boton de monto y le agrego el monto (cambiar el boton)
		BaseFlow.pageModel.getAmountBetweenProducts().sendKeys(arg1);
	}

	@When("^Click a boton Transferir$")
	public void click_a_boton_Transferir() throws Throwable {
		//le doy al boton transferir (cambiar el elemento)
		BaseFlow.pageModel.getButtonTransferBetweenProducts().click();
	}

	@When("^Click en Confirmar$")
	public void click_en_Confirmar() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//click en confirmar (cambiar el elemento)	
		BaseFlow.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		BaseFlow.pageModel.getDialogPositiveBetweenProducts().click(); 
	}

	@Then("^Se genera el comprobante exitosamente$")
	public void se_genera_el_comprobante_exitosamente() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		// happy happy place
		String tef = BaseFlow.pageModel.getTextviewReceiptLabelBettewnProducts().getText().toString().trim();
		assertEquals(tef, BaseFlow.properties.getTituloComprobanteTefMin());
	}

}
