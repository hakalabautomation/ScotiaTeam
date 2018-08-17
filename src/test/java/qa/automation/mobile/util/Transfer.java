package qa.automation.mobile.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import qa.automation.mobile.flow.BaseFlow;

public final class Transfer {

	/**
	 * Se escoge banco a cual pertenece nuevo destinatario a agregar
	 * 
	 * @param banco
	 *            El banco que se desea escoger de la lista de bancos
	 * 
	 * @return {@link Void}
	 */
	public static void SeleccionarBanco(String banco) {
		BaseFlow.pageModel.getEdittextBank().click();
		GenericMethod.esperaElementoMobileSegundos(BaseFlow.driver, BaseFlow.pageModel.getTextViewInstitution().get(0), 30);
		int count = BaseFlow.pageModel.getTextViewInstitution().size();
		String bank = "";
		do {
			for (int i = 0; i < count; i++) {
				bank = BaseFlow.pageModel.getTextViewInstitution().get(i).getText().toString().trim();
				if (bank.contains(banco)) {
					BaseFlow.pageModel.getTextViewInstitution().get(i).click();
					return;
				}
			}
			// Se realiza scroll en caso de no encontrar banco
			GenericMethod.scrollMobile(BaseFlow.driver, BaseFlow.pageModel.getTextViewInstitution().get(count - 1), BaseFlow.pageModel.getTextViewInstitution().get(0));
		} while (true);
	}

	/**
	 * Se escoge tipo de cuenta
	 * 
	 * @return {@link Void} Para este caso escoge cuenta corriente
	 */
	public static void SeleccionarTipoCuenta() {
		GenericMethod.esperaElementoMobileSegundos(BaseFlow.driver, BaseFlow.pageModel.getEdittextAccountType(), 30);
		BaseFlow.pageModel.getEdittextAccountType().click();
		BaseFlow.pageModel.getTextViewTypeAccount().get(1).click();
	}

	/**
	 * Autoriza nuevo destinatario o agregar nuevo destinatario dependiendo de segundo factor de seguridad posea cliente
	 * 
	 * @param factor
	 *            Si es Scotiapass o KeyPass su segundo factor
	 * @param sms
	 *            Booleano si requiere o no SMS(para el caso de agregar destinatario con scotiapass)
	 * 
	 * @return {@link Void}
	 */
	public static void SegundoFactorTEF(String factor, boolean sms) {
		switch (factor) {
		case "Scotiapass":
			// Ingresar SMS
			if (sms) {
				GenericMethod.esperaElementoMobileSegundos(BaseFlow.driver, BaseFlow.pageModel.getSmsPassword(), 30);
				BaseFlow.pageModel.getSmsPassword().sendKeys(BaseFlow.properties.getSMS());
				BaseFlow.pageModel.getButtonOk().click();
			}
			GenericMethod.esperaElementoMobileSegundos(BaseFlow.driver, BaseFlow.pageModel.getScotiapassPassword(), 30);
			BaseFlow.pageModel.getScotiapassPassword().sendKeys(BaseFlow.properties.getScotiapass());
			BaseFlow.pageModel.getButtonOk().click();
			break;

		case "KeyPass":

			break;

		default:
			break;
		}
	}

	/**
	 * Realiza scroll hasta encontrar el banco necesario para realizar transferencia y genera lista con nombre, banco y cuenta de destinatario
	 * 
	 * @param driver
	 *            AppiumDriver
	 * @param idBanco
	 *            ID de la lista de los bancos
	 * @param idCuenta
	 *            ID de la lista de las cuentas de destinatarios
	 * @param idNombreDestinatario
	 *            ID de lista de nombre de destinatario
	 * @param nombreBanco
	 *            Nombre del banco al que se desea realizar transferencia
	 * 
	 * @return {@link List}
	 */
	public static List<?> datosDestinatarioTransferencia(AppiumDriver<MobileElement> driver, String idBanco, String idCuenta, String idNombreDestinatario, String nombreBanco) {
		By banco = By.id(BaseFlow.scotiapackage + ":id/" + idBanco);
		By cuenta = By.id(BaseFlow.scotiapackage + ":id/" + idCuenta);
		By destinatario = By.id(BaseFlow.scotiapackage + ":id/" + idNombreDestinatario);
		int count = 0;
		List<String> datosDestinatario = new ArrayList<>();
		do {
			count = driver.findElements(banco).size();
			for (int i = 0; i < count; i++) {
				String appNameBank = driver.findElements(banco).get(i).getText();// Nombre de banco
				if (appNameBank.contains(nombreBanco)) {
					String appName = driver.findElements(destinatario).get(i).getText();// Nombre destinatario
					String appAccountBank = driver.findElements(cuenta).get(i).getText();// Numero de cuenta
					datosDestinatario.add(appName);
					datosDestinatario.add(appNameBank);
					datosDestinatario.add(appAccountBank);
					driver.findElements(banco).get(i).click(); // Se realiza click a destinatario para iniciar transferencia
					return datosDestinatario;
				}
			}
			GenericMethod.scrollMobile(driver, driver.findElements(banco).get(count - 1), driver.findElements(banco).get(0));
		} while (true);
	}

	/**
	 * Formatea numero con separador de miles
	 * 
	 * @param monto
	 *            String de monto a formatear con separadores de miles
	 * 
	 * @return {@link String} monto con separadores de miles (.)
	 */
	public static String formatearMonto(int monto) {
		DecimalFormatSymbols simbolo = new DecimalFormatSymbols();
		simbolo.setDecimalSeparator(',');
		simbolo.setGroupingSeparator('.');
		DecimalFormat formateador = new DecimalFormat("###,###.##", simbolo);
		return formateador.format(monto);
	}

	/**
	 * Se escoge tipo de cuenta a cual pertenece la transferencia entre productos
	 * 
	 * @param cuenta
	 *            El tipo de cuenta que se desea escoger de la lista de productos
	 * 
	 * @return {@link Void}
	 */
	public static void SeleccionarTipoCuenta(String cuenta) {
		GenericMethod.esperaElementoMobileSegundos(BaseFlow.driver, BaseFlow.pageModel.getTextTransferName().get(0), 30); // cambiar el elemento
		int count = BaseFlow.pageModel.getTextTransferName().size();
		String prod = "";
		do {
			for (int i = 0; i < count; i++) {
				prod = BaseFlow.pageModel.getTextTransferName().get(i).getText().toString().trim();
				if (prod.contains(cuenta)) {
					BaseFlow.pageModel.getTextTransferName().get(i).click();
					return;
				}
			}
			// Se realiza s en caso de no encontrar la cuenta
			GenericMethod.swipeMobile(BaseFlow.driver, BaseFlow.pageModel.getTextTransferName().get(count - 1));
		} while (true);
	}

	/**
	 * Se escoge tipo de cuenta a cual pertenece la transferencia entre productos
	 * 
	 * @param cuenta
	 *            El tipo de cuenta que se desea escoger de la lista de productos
	 * 
	 * @return {@link Void}
	 */
	public static void SeleccionarTipoCuentaEntreProductos(String cuenta) {
		GenericMethod.esperaElementoMobileSegundos(BaseFlow.driver, BaseFlow.pageModel.getBetweenProductName().get(0), 30); // cambiar el elemento
		int count = BaseFlow.pageModel.getBetweenProductName().size();
		String prod = "";
		do {
			for (int i = 0; i < count; i++) {
				prod = BaseFlow.pageModel.getBetweenProductName().get(i).getText().toString().trim();
				if (prod.contains(cuenta)) {
					BaseFlow.pageModel.getBetweenProductName().get(i).click();
					return;
				}
			}
			// Se realiza s en caso de no encontrar la cuenta
			GenericMethod.scrollMobile(BaseFlow.driver, BaseFlow.pageModel.getBetweenProductName().get(count - 1), BaseFlow.pageModel.getBetweenProductName().get(0));
		} while (true);
	}

	/**
	 * Escogemos la modalidad de pago de TC, donde puede ser Monto facturado total, Monto minimo del factura u Otro monto
	 * 
	 * @param formaPago
	 *            Monto facturado, Monto minimo u Otro monto
	 * @param monto
	 *            Para el caso de otro monto, es necesario ingresar el monto a pagar
	 * 
	 * @return {@link Void}
	 */
	public static void FormaPagoTarjetaCreditoNacional(String formaPago, String monto) {
		switch (formaPago) {
		case "PagoTotalFacturado":
			BaseFlow.pageModel.getRbBilledAmount().click();
			break;

		case "PagoMinimoFacturado":
			BaseFlow.pageModel.getRbMinAmount().click();
			break;

		case "PagoOtroFacturado":
			BaseFlow.pageModel.getRbMinAmount().click();
			BaseFlow.pageModel.getRbAnotherAmount().clear();
			BaseFlow.pageModel.getRbAnotherAmount().sendKeys(monto);
			break;

		default:
			break;
		}
		BaseFlow.pageModel.getBtnPay().click();
	}
}