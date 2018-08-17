package qa.automation.mobile.definition.components.itemTransfer;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefinitionEditMontoPagoTC {
	@Then("^Validar texto campo monto pago tarjeta de credito$")
	public void validar_texto_campo_monto_pago_tarjeta_de_credito() throws Throwable {
	}

	@When("^Ingresar monto pago tarjeta de credito en formato incorrecto$")
	public void ingresar_monto_pago_tarjeta_de_credito_en_formato_incorrecto() throws Throwable {
	}

	@Then("^Validar mensaje de monto pago tarjeta de credito incorrecto$")
	public void validar_mensaje_de_monto_pago_tarjeta_de_credito_incorrecto() throws Throwable {
	}

	@When("^Ingresar monto pago tarjeta de credito en miles\"([^\"]*)\"$")
	public void ingresar_monto_pago_tarjeta_de_credito_en_miles(String arg1) throws Throwable {
	}

	@When("^Ingresar mas de ocho digitos en campo monto pago tarjeta de credito\"([^\"]*)\"$")
	public void ingresar_mas_de_ocho_digitos_en_campo_monto_pago_tarjeta_de_credito(String arg1) throws Throwable {
	}

	@Then("^No permite ingresar mas de ocho digitos en campo monto pago tarjeta de credito$")
	public void no_permite_ingresar_mas_de_ocho_digitos_en_campo_monto_pago_tarjeta_de_credito() throws Throwable {
	}

	@When("^Ingresar monto pago tarjeta de credito correcto\"([^\"]*)\"$")
	public void ingresar_monto_pago_tarjeta_de_credito_correcto(String arg1) throws Throwable {
	}

	@Then("^Permte ingresar monto pago tarjeta de credito correctamente$")
	public void permte_ingresar_monto_pago_tarjeta_de_credito_correctamente() throws Throwable {
	}
}