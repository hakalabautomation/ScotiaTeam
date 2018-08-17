package qa.automation.mobile.util;

import qa.automation.mobile.flow.BaseFlow;

public final class Enrol {
	public static void IngresarSMS(String sms, String permitirSms) {
		GenericMethod.esperarSegundos(BaseFlow.driver, 3);
			BaseFlow.pageModel.getEditTextCodeSMS().sendKeys(sms);
	}

	public static void SeleccionarClaveLogin(String tipoClave, String clave) {
		GenericMethod.esperaElementoMobileSegundos(BaseFlow.driver, BaseFlow.pageModel.getChoosepassButton(), 5);
		switch (tipoClave) {
		case "WEB":
			BaseFlow.pageModel.getChoosepassWebpassSwitch().click();
			break;

		case "MOBILE":
			BaseFlow.pageModel.getChoosepassScotiamobileSwitch().click();
			BaseFlow.pageModel.getScotiamobileFirstPassword().sendKeys(clave);
			BaseFlow.pageModel.getScotiamobileSecondPassword().sendKeys(clave);
			break;

		default:
			break;
		}
	}

	public static void AutorizacionSegundoFactor(String segundoFactor, boolean requiereSms, String sms, String claveScotiapass) {
		switch (segundoFactor) {
		case "SCOTIAPASS":
			if (requiereSms) {
				GenericMethod.esperaElementoMobileSegundos(BaseFlow.driver, BaseFlow.pageModel.getButtonOk(), 5);
				BaseFlow.pageModel.getSmsPassword().sendKeys(sms);
				BaseFlow.pageModel.getButtonOk().click();
			}
			BaseFlow.pageModel.getScotiapassPassword().sendKeys(claveScotiapass);
			if (requiereSms)
				BaseFlow.pageModel.getButtonOk().click();
			else
				BaseFlow.pageModel.getScotiapassButton().click();
			break;

		case "KEYPASS":
			// Problema tecnico se debe resolver
			break;

		default:
			break;
		}
	}

	public static void IngresarNumeroCelular(String celular, String permitirSms) {

		GenericMethod.esperarSegundos(BaseFlow.driver, 3);
		switch (permitirSms) {
		// Se permite ingresar SMS de forma automatica
		case "S":
			if (GenericMethod.isElementPresent(BaseFlow.pageModel.getPermissionAllowButton()))
				BaseFlow.pageModel.getPermissionAllowButton().click();
			GenericMethod.esperaElementoMobileSegundos(BaseFlow.driver, BaseFlow.pageModel.getConfirmPhoneButtonYes(), 5);
			String movil = BaseFlow.pageModel.getDialogConfirmPhoneEdittextNumber().getText().toString().trim();
			if (!GenericMethod.validarCelular(movil)) {
				BaseFlow.pageModel.getDialogConfirmPhoneEdittextNumber().clear();
				BaseFlow.pageModel.getDialogConfirmPhoneEdittextNumber().sendKeys(celular);
			}
			BaseFlow.pageModel.getConfirmPhoneButtonYes().click();
			break;

		// Se rechaza ingresar SMS de forma automatica el ingreso es manual
		case "N":
			if (GenericMethod.isElementPresent(BaseFlow.pageModel.getPermissionDenyButton()))
				BaseFlow.pageModel.getPermissionDenyButton().click();
			GenericMethod.esperaElementoMobileSegundos(BaseFlow.driver, BaseFlow.pageModel.getConfirmPhoneButtonYes(), 5);
			String movil2 = BaseFlow.pageModel.getDialogConfirmPhoneEdittextNumber().getText().toString().trim();
			if (!GenericMethod.validarCelular(movil2)) {
				BaseFlow.pageModel.getDialogConfirmPhoneEdittextNumber().clear();
				BaseFlow.pageModel.getDialogConfirmPhoneEdittextNumber().sendKeys(celular);
			}
			BaseFlow.pageModel.getConfirmPhoneButtonYes().click();
			break;

		default:
			break;
		}
	}
}