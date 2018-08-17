package qa.automation.mobile.definition.components.enrolCodigoSms;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Then;
import qa.automation.mobile.flow.BaseFlow;
import qa.automation.mobile.util.GenericMethod;

public class DefinitionCountSMSEnrol {
	@Then("^Validar contador se descuenta cada un segundo$")
	public void validar_contador_se_descuenta_cada_un_segundo() throws Throwable {
		String[] time1 = BaseFlow.pageModel.getTextViewCountDown().getText().toString().trim().split(":");
		GenericMethod.esperarSegundos(BaseFlow.driver, 1);
		String[] time2 = BaseFlow.pageModel.getTextViewCountDown().getText().toString().trim().split(":");
		assertTrue(Integer.parseInt(time2[1]) < Integer.parseInt(time1[1]));
	}
}