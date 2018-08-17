package qa.automation.mobile.util;

import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import qa.automation.mobile.flow.BaseFlow;

public final class GenericMethod {
	/**
	 * Cerrar proceso WebDriver
	 * 
	 * @param driver
	 */
	public static void cerrarDriver(WebDriver driver) {
		driver.quit();
	}

	/**
	 * Volver atras
	 * 
	 * @param driver
	 */
	public static void volver(WebDriver driver) {
		driver.navigate().back();
	}

	/**
	 * Comprobar si el valor es numerico
	 * 
	 * @param valor
	 *            Parametro a comprobar si es numerico
	 */
	public static boolean isNumeric(String valor) {
		try {
			Double.parseDouble(valor);
			return true;
		} catch (NumberFormatException ne) {
			return false;
		}
	}

	/**
	 * Metodo que se encarga de esperar X cantidad de segundos durante la ejecucion de la prueba utilizando el driver
	 * 
	 * @param driver
	 * @param segundos
	 * 
	 * @return {@link Void}
	 */
	public static void esperarSegundos(AppiumDriver<MobileElement> driver, int segundos) {
		synchronized (driver) {
			try {
				driver.wait(segundos * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * <b>Nombre:</b> esperaElementoMobileSegundos</br>
	 * </br>
	 * <b>Description:</b> Genera una pausa explicita hasta que el elemento dado es encontrado.
	 * 
	 * @param driver
	 *            Controlador AndroidDriver.
	 * @param webElement
	 *            Elemento a esperar.
	 * @param segundos
	 *            (int) Valor de tiempo en segundos a esperar.
	 * @return {@link Boolean} Retorna un valor <b>verdadero</b> si el elemento es encontrado dentro del tiempo estipulado, de lo contrario retorna un valor <b>falso</b>.
	 **/
	public static boolean esperaElementoMobileSegundos(AppiumDriver<MobileElement> driver, WebElement webElement, int segundos) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, segundos);
			wait.until(ExpectedConditions.visibilityOf(webElement));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

	/**
	 * <b>Nombre:</b> notEsperaElementoSegundos</br>
	 * </br>
	 * <b>Description:</b> Genera una pausa explicita hasta que el elemento dado desaparece.
	 * 
	 * @param {@link
	 * 			WebDriver} Controlador WebDrive.
	 * @param {@link
	 * 			WebElement} Elemento a esperar.
	 * @param segundos
	 *            (int) Valor de tiempo en segundos a esperar.
	 * @return {@link Boolean} Retorna un valor <b>verdadero</b> si el elemento es encontrado dentro del tiempo estipulado, de lo contrario retorna un valor <b>falso</b>.
	 **/
	public static boolean notEsperaElementoSegundos(AppiumDriver<MobileElement> driver, WebElement webElement, int segundos) {
		WebDriverWait wait = new WebDriverWait(driver, segundos);
		if (isElementPresent(webElement)) {
			wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOf(webElement)));
			return true;
		} else {
			return false;
		}
	}

	/**
	 * <b>Nombre:</b> isElementPresent</br>
	 * </br>
	 * <b>Description:</b> Verifica la existencia de un elemento
	 * 
	 * @param {@link
	 * 			WebElement} Objeto de tipo WebElement a buscar
	 * @return {@link Boolean} Retorna <b>True</b> si el elemento es encontrado, de lo contrario retorna <b>False</b>
	 **/
	public static boolean isElementPresent(WebElement webElement) {
		boolean resp = false;
		try {
			resp = webElement.isDisplayed();
		} catch (NoSuchElementException e) {
			resp = false;
		}
		return resp;
	}

	/**
	 * Realiza scroll mobile
	 * 
	 * @param driver
	 *            AndroidDriver
	 * @param elementDesde
	 *            Elemento desde donde debe iniciar scroll
	 * @param elementHasta
	 *            Elemento hasta donde debe llegar el scroll
	 * 
	 * @return {@link Void}
	 */

	@SuppressWarnings("rawtypes")
	public static void scrollMobile(AppiumDriver<MobileElement> driver, WebElement elementDesde, WebElement elementHasta) {
		// Se obtiene coordenas de elementos
		int x = elementDesde.getLocation().getX();
		int y = elementDesde.getLocation().getY();
		int x2 = elementHasta.getLocation().getX();
		int y2 = elementHasta.getLocation().getY();
		new TouchAction(driver).press(PointOption.point(x, y)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(x2, y2)).release().perform();
	}

	/**
	 * Comprueba si ya hay cliente enrrolado en la app y en caso de que si, se loguea
	 * 
	 * @param psw
	 *            Clave con cual se debe leguear en caso de estar enrrolado
	 * 
	 * @return {@link Void}
	 */
	public static void verificaEnrol(String psw) {
		if (isElementPresent(BaseFlow.pageModel.getSecondLoginPassword())) {
			BaseFlow.pageModel.getSecondLoginPassword().sendKeys(psw);
			BaseFlow.pageModel.getSecondLoginButton().click();
		} else if (isElementPresent(BaseFlow.pageModel.getTextViewSkipUseFinger())) {
			BaseFlow.pageModel.getTextViewSkipUseFinger().click();
			esperaElementoMobileSegundos(BaseFlow.driver, BaseFlow.pageModel.getSecondLoginPassword(), 30);
			BaseFlow.pageModel.getSecondLoginPassword().sendKeys(psw);
			BaseFlow.pageModel.getSecondLoginButton().click();
		}
		assertTrue(GenericMethod.isElementPresent(BaseFlow.pageModel.getBottomItemHome()));
	}

	/**
	 * Valida si string cumple formato de celular chileno
	 * 
	 * @param movil
	 *            String que se desea validar su formato
	 * 
	 * @return {@link Boolean} Retorna <b>True</b> si celuar es chileno <b>False</b> En caso que no cumpla formato correcto
	 */
	public static boolean validarCelular(String movil) {
		Pattern pattern = Pattern.compile("^(/+569|0569|569|5 69)?[4|5|6|7|9][0-9]{8}$");
		return pattern.matcher(movil).matches();
	}

	/**
	 * Entrega un rut formateado con puntos y guion, segun formto chileno
	 * 
	 * @param rut
	 *            String de rut a formatear
	 * 
	 * @return {@link String} Rut con putos y guion segun corresponda
	 */
	public static String formatearRUT(String rut) {
		int cont = 0;
		String format;
		rut = rut.replace(".", "");
		rut = rut.replace("-", "");
		format = "-" + rut.substring(rut.length() - 1);
		for (int i = rut.length() - 2; i >= 0; i--) {
			format = rut.substring(i, i + 1) + format;
			cont++;
			if (cont == 3 && i != 0) {
				format = "." + format;
				cont = 0;
			}
		}
		return format;
	}

	/**
	 * Valida si correo entregado cumple con formato correcto
	 * 
	 * @param correo
	 *            Email a validar su formato
	 * 
	 * @return {@link Boolean} Retorna <b>True</b> si string cumple con formato de correo correcto <b>False</b> si no es formato correcto
	 */
	public static boolean CorreoValido(String correo) {
		boolean res = false;
		// Patron para validar el email
		Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher mather = pattern.matcher(correo);
		if (mather.find())
			res = true;
		else
			res = false;

		return res;
	}

	/**
	 * Realiza swipe mobile
	 * 
	 * @param driver
	 *            AndroidDriver
	 * @param elementDesde
	 *            Elemento desde donde debe iniciar swipe
	 * @param elementHasta
	 *            Elemento hasta donde debe llegar el swipe
	 * 
	 * @return {@link Void}
	 */
	@SuppressWarnings("rawtypes")
	public static void swipeMobile(AppiumDriver<MobileElement> driver, WebElement elementDesde) {
		// Se obtiene coordenas de elementos
		int x = elementDesde.getLocation().getX();
		int y = elementDesde.getLocation().getY();
		int x2 = 1050;
		int y2 = elementDesde.getLocation().getY();
		// Realiza scroll
		new TouchAction(driver).press(PointOption.point(x2, y2)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(x, y)).release().perform();
	}
}