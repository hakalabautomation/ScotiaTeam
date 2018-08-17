package qa.automation.mobile.properties;

import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertiesInit {

	private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesInit.class);
	private String TituloBienvenido;
	private String LabelOlvidastePassLogin;
	private String LabelTeAyudamosLogin;
	private String TituloPopupOlvidastePassLogin;
	private String MensajePopupOlvidastePassLogin;
	private String TituloPopupNoTengoClaveLogin;
	private String TextoNoTienesClaveInternet;
	private String MensajePopupNoTengoClaveLogin;
	private String TituloLoSentimos;
	private String MensajeClaveWebIncorrecta;
	private String MensajePorTuSeguridad;
	private String MensajeEsteEsTuNumero;
	private String TituloIngresoSms;
	private String SubtituloIngresoSms;
	private String TextoReenviarSms;
	private String TextoInputSms;
	private String TextoErrorFormatoSms;
	private String MensajeSmsIncorrecto;
	private String TituloSeleccionClave;
	private String SubtituloSeleccionClave;
	private String TituloClaveMobile;
	private String SubtituloClaveMobile;
	private String TextoInputCrearClaveMobile;
	private String TextoInputRepiteClaveMobile;
	private String MensajeErrorFormatoClaveMobile;
	private String MensajeErrorClaveMobileNoCoincide;
	private String TituloAutorizaRegistro;
	private String SubtituloAutorizaRegistro;
	private String TextoScotiapassLogin;
	private String MensajeErrorScotiapass1;
	private String MensajeErrorScotiapass2;
	private String TituloBienvenida;
	private String SubtituloBienve;
	private String TextoBtnContinuarBienve;
	private String TituloBienvenida2;
	private String TextoBienve1;
	private String TextoBienve2;
	private String SubtituloBienve2;
	private String TextoBtnIngresarBienve;
	private String TextoInputClaveWeb;
	private String TextoInputClaveMobile;
	private String TextoBtnIngresarSegunLogin;
	private String TextoRecuperaTuClave;
	private String TituloPopupCambiarUsuario;
	private String MensajePopupCambiarUsuario;
	private String TituloPopupRecuperarClaveWeb;
	private String MensajePopupRecuperarClaveWeb;
	private String TituloHuellaHabilitada;
	private String MensajeHuellaHabilitada;
	private String MensajeHuellaHabilitadaSub;
	private String TextoOmitirHuella;
	private String TextoCtaCte;
	private String TextoDisponible;
	private String TextoSaldoContable;
	private String TextoDisponibleLineaCredito;
	private String TextoCtaVista;
	private String TextoTitular;
	private String TextoAdicional;
	private String TextoUtilizado;
	private String TextoSaldoDisponibleTef;
	private String TextoDisponibleLineaCreditoTef;
	private String TituloComprobanteTef;
	private String TituloComprobanteTefMin;
	private String MensajeAgregadoConExito;
	private String TituloAgregadoConExito;
	private String TextoCambioClave;
	private String TextoCambioUsuario;
	private String TextoAjusteHuella;
	private String TextoCerrarSesion;
	private String TextoAyuda;
	private String TextoIrScotiaweb;
	private String TextoAcercaDe;
	private String TituloAyuda1;
	private String MensajeAyuda1;
	private String TituloAyuda2;
	private String MensajeAyuda2;
	private String TituloAyuda3;
	private String MensajeAyuda3;
	private String TituloAyuda4;
	private String MensajeAyuda4;
	private String TituloAyuda5;
	private String MensajeAyuda5;
	private String TextoInicio;
	private String TextoSaldos;
	private String TextoTransferencia;
	private String TextoPerfil;
	private String TextoMas;
	private String TextoBtnContinuar;
	private String TextoBtnCancelar;
	private String TextoBtnCerrar;
	private String TextoBtnVolver;
	private String MensajeErrorGenerico;
	private String MensajeTiempoSesion;
	private String Scotiapass;
	private String SMS;
	private String SaludoNoEsTuCel;
	private String Plus;
	private String MensajeErrorCelular;
	private String CelularValido;
	private String TituloClaveWeb;
	private String SubtituloClaveWeb;
	private String SwitchActivo;
	private String SwitchDesactivo;
	private String TextoProductos;
	private String TextoButtonAutorizaScotiapass;
	private String TextoButtonCancelarScotiapass;
	private String TextoButtonContinuarDestinatario;
	private String TextoButtonGuardarDestinatario;
	private String TextoInputBanco;
	private String TextoInputTipoCta;
	private String TiposDeCuenta;
	private String TextoInputNroCta;
	private String TextoInputNombreDestinatario;
	private String MensajeErrorNombreDestinatario;
	private String MensajeRutInvalido;
	private String TextoInputRut;
	private String TextoInputCorreoDestinatario;
	private String MensajeErrorCorreoDestinatario;
	private String TextoButtonAgregarDestinatario;
	private String TextoButtonValidarSMS;
	private String TextoButtonCancelarSMS;
	private String TextoButoonReenviarSMSDestinatario;
	private String TituloDesActivos;
	private String TextoInputMensajeTef;
	private String TextoDefautlMensaje;
	private String TituloIngresarSMSDestinatario;
	private String SubtituloIngresarSMSDestinatario;
	private String TextoInputSMSDestinatario;
	private String TituloScotiapassDestinatario;
	private String TituloHuella;
	private String MensajeErrorMontoTef;
	private String TextoInputMontoTef;
	private String TextoButtonConfirmarTef;
	private String reportConfigPath;

	public PropertiesInit() {
		Properties parametros = new Properties();
		String propFileName = "config/config.properties";
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

		try {
			parametros.load(inputStream);
			reportConfigPath = parametros.getProperty("reportConfigPath");
			TituloBienvenido = parametros.getProperty("TituloBienvenido");
			LabelOlvidastePassLogin = parametros.getProperty("LabelOlvidastePassLogin");
			LabelTeAyudamosLogin = parametros.getProperty("LabelTeAyudamosLogin");
			TituloPopupOlvidastePassLogin = parametros.getProperty("TituloPopupOlvidastePassLogin");
			MensajePopupOlvidastePassLogin = parametros.getProperty("MensajePopupOlvidastePassLogin");
			TituloPopupNoTengoClaveLogin = parametros.getProperty("TituloPopupNoTengoClaveLogin");
			TextoNoTienesClaveInternet = parametros.getProperty("TextoNoTienesClaveInternet");
			MensajePopupNoTengoClaveLogin = parametros.getProperty("MensajePopupNoTengoClaveLogin");
			TituloLoSentimos = parametros.getProperty("TituloLoSentimos");
			MensajeClaveWebIncorrecta = parametros.getProperty("MensajeClaveWebIncorrecta");
			MensajePorTuSeguridad = parametros.getProperty("MensajePorTuSeguridad");
			MensajeEsteEsTuNumero = parametros.getProperty("MensajeEsteEsTuNumero");
			TituloIngresoSms = parametros.getProperty("TituloIngresoSms");
			SubtituloIngresoSms = parametros.getProperty("SubtituloIngresoSms");
			TextoReenviarSms = parametros.getProperty("TextoReenviarSms");
			TextoInputSms = parametros.getProperty("TextoInputSms");
			TextoErrorFormatoSms = parametros.getProperty("TextoErrorFormatoSms");
			MensajeSmsIncorrecto = parametros.getProperty("MensajeSmsIncorrecto");
			TituloSeleccionClave = parametros.getProperty("TituloSeleccionClave");
			SubtituloSeleccionClave = parametros.getProperty("SubtituloSeleccionClave");
			TituloClaveMobile = parametros.getProperty("TituloClaveMobile");
			SubtituloClaveMobile = parametros.getProperty("SubtituloClaveMobile");
			TextoInputCrearClaveMobile = parametros.getProperty("TextoInputCrearClaveMobile");
			TextoInputRepiteClaveMobile = parametros.getProperty("TextoInputRepiteClaveMobile");
			MensajeErrorFormatoClaveMobile = parametros.getProperty("MensajeErrorFormatoClaveMobile");
			MensajeErrorClaveMobileNoCoincide = parametros.getProperty("MensajeErrorClaveMobileNoCoincide");
			SubtituloAutorizaRegistro = parametros.getProperty("SubtituloAutorizaRegistro");
			TextoScotiapassLogin = parametros.getProperty("TextoScotiapassLogin");
			MensajeErrorScotiapass1 = parametros.getProperty("MensajeErrorScotiapass1");
			MensajeErrorScotiapass2 = parametros.getProperty("MensajeErrorScotiapass2");
			TituloBienvenida = parametros.getProperty("TituloBienvenida");
			SubtituloBienve = parametros.getProperty("SubtituloBienve");
			TextoBtnContinuarBienve = parametros.getProperty("TextoBtnContinuarBienve");
			TituloBienvenida2 = parametros.getProperty("TituloBienvenida2");
			TextoBienve1 = parametros.getProperty("TextoBienve1");
			TextoBienve2 = parametros.getProperty("TextoBienve2");
			SubtituloBienve2 = parametros.getProperty("SubtituloBienve2");
			TextoBtnIngresarBienve = parametros.getProperty("TextoBtnIngresarBienve");
			TextoInputClaveWeb = parametros.getProperty("TextoInputClaveWeb");
			TextoInputClaveMobile = parametros.getProperty("TextoInputClaveMobile");
			TextoBtnIngresarSegunLogin = parametros.getProperty("TextoBtnIngresarSegunLogin");
			TextoRecuperaTuClave = parametros.getProperty("TextoRecuperaTuClave");
			TituloPopupCambiarUsuario = parametros.getProperty("TituloPopupCambiarUsuario");
			MensajePopupCambiarUsuario = parametros.getProperty("MensajePopupCambiarUsuario");
			TituloPopupRecuperarClaveWeb = parametros.getProperty("TituloPopupRecuperarClaveWeb");
			MensajePopupRecuperarClaveWeb = parametros.getProperty("MensajePopupRecuperarClaveWeb");
			TituloHuellaHabilitada = parametros.getProperty("TituloHuellaHabilitada");
			MensajeHuellaHabilitada = parametros.getProperty("MensajeHuellaHabilitada");
			MensajeHuellaHabilitadaSub = parametros.getProperty("MensajeHuellaHabilitadaSub");
			TextoOmitirHuella = parametros.getProperty("TextoOmitirHuella");
			TextoCtaCte = parametros.getProperty("TextoCtaCte");
			TextoDisponible = parametros.getProperty("TextoDisponible");
			TextoSaldoContable = parametros.getProperty("TextoSaldoContable");
			TextoDisponibleLineaCredito = parametros.getProperty("TextoDisponibleLineaCredito");
			TextoCtaVista = parametros.getProperty("TextoCtaVista");
			TextoTitular = parametros.getProperty("TextoTitular");
			TextoAdicional = parametros.getProperty("TextoAdicional");
			TextoUtilizado = parametros.getProperty("TextoUtilizado");
			TextoSaldoDisponibleTef = parametros.getProperty("TextoSaldoDisponibleTef");
			TextoDisponibleLineaCreditoTef = parametros.getProperty("TextoDisponibleLineaCreditoTef");
			TituloComprobanteTef = parametros.getProperty("TituloComprobanteTef");
			TituloComprobanteTefMin = parametros.getProperty("TituloComprobanteTefMin");
			TituloAgregadoConExito = parametros.getProperty("TituloAgregadoConExito");
			MensajeAgregadoConExito = parametros.getProperty("MensajeAgregadoConExito");
			TextoCambioClave = parametros.getProperty("TextoCambioClave");
			TextoCambioUsuario = parametros.getProperty("TextoCambioUsuario");
			TextoAjusteHuella = parametros.getProperty("TextoAjusteHuella");
			TextoCerrarSesion = parametros.getProperty("TextoCerrarSesion");
			TextoAyuda = parametros.getProperty("TextoAyuda");
			TextoIrScotiaweb = parametros.getProperty("TextoIrScotiaweb");
			TextoAcercaDe = parametros.getProperty("TextoAcercaDe");
			TituloAyuda1 = parametros.getProperty("TituloAyuda1");
			MensajeAyuda1 = parametros.getProperty("MensajeAyuda1");
			TituloAyuda2 = parametros.getProperty("TituloAyuda2");
			MensajeAyuda2 = parametros.getProperty("MensajeAyuda2");
			TituloAyuda3 = parametros.getProperty("TituloAyuda3");
			MensajeAyuda3 = parametros.getProperty("MensajeAyuda3");
			TituloAyuda4 = parametros.getProperty("TituloAyuda4");
			MensajeAyuda4 = parametros.getProperty("MensajeAyuda4");
			TituloAyuda5 = parametros.getProperty("TituloAyuda5");
			MensajeAyuda5 = parametros.getProperty("MensajeAyuda5");
			TextoInicio = parametros.getProperty("TextoInicio");
			TextoSaldos = parametros.getProperty("TextoSaldos");
			TextoTransferencia = parametros.getProperty("TextoTransferencia");
			TextoPerfil = parametros.getProperty("TextoPerfil");
			TextoMas = parametros.getProperty("TextoMas");
			TextoBtnContinuar = parametros.getProperty("TextoBtnContinuar");
			TextoBtnCancelar = parametros.getProperty("TextoBtnCancelar");
			TextoBtnCerrar = parametros.getProperty("TextoBtnCerrar");
			TextoBtnVolver = parametros.getProperty("TextoBtnVolver");
			MensajeErrorGenerico = parametros.getProperty("MensajeErrorGenerico");
			MensajeTiempoSesion = parametros.getProperty("MensajeTiempoSesion");
			Scotiapass = parametros.getProperty("Scotiapass");
			SMS = parametros.getProperty("SMS");
			SaludoNoEsTuCel = parametros.getProperty("SaludoNoEsTuCel");
			Plus = parametros.getProperty("Plus");
			MensajeErrorCelular = parametros.getProperty("MensajeErrorCelular");
			CelularValido = parametros.getProperty("CelularValido");
			TituloClaveWeb = parametros.getProperty("TituloClaveWeb");
			SubtituloClaveWeb = parametros.getProperty("SubtituloClaveWeb");
			SwitchActivo = parametros.getProperty("SwitchActivo");
			SwitchDesactivo = parametros.getProperty("SwitchDesactivo");
			TituloAutorizaRegistro = parametros.getProperty("TituloAutorizaRegistro");
			TextoProductos = parametros.getProperty("TextoProductos");
			TextoButtonAutorizaScotiapass = parametros.getProperty("TextoButtonAutorizaScotiapass");
			TextoButtonCancelarScotiapass = parametros.getProperty("TextoButtonCancelarScotiapass");
			TextoButtonContinuarDestinatario = parametros.getProperty("TextoButtonContinuarDestinatario");
			TextoButtonGuardarDestinatario = parametros.getProperty("TextoButtonGuardarDestinatario");
			TextoInputBanco = parametros.getProperty("TextoInputBanco");
			TextoInputTipoCta = parametros.getProperty("TextoInputTipoCta");
			TiposDeCuenta = parametros.getProperty("TiposDeCuenta");
			TextoInputNroCta = parametros.getProperty("TextoInputNroCta");
			TextoInputNombreDestinatario = parametros.getProperty("TextoInputNombreDestinatario");
			MensajeErrorNombreDestinatario = parametros.getProperty("MensajeErrorNombreDestinatario");
			MensajeRutInvalido = parametros.getProperty("MensajeRutInvalido");
			TextoInputRut = parametros.getProperty("TextoInputRut");
			TextoInputCorreoDestinatario = parametros.getProperty("TextoInputCorreoDestinatario");
			MensajeErrorCorreoDestinatario = parametros.getProperty("MensajeErrorCorreoDestinatario");
			TextoButtonAgregarDestinatario = parametros.getProperty("TextoButtonAgregarDestinatario");
			TextoButtonValidarSMS = parametros.getProperty("TextoButtonValidarSMS");
			TextoButtonCancelarSMS = parametros.getProperty("TextoButtonCancelarSMS");
			TextoButoonReenviarSMSDestinatario = parametros.getProperty("TextoButoonReenviarSMSDestinatario");
			TituloDesActivos = parametros.getProperty("TituloDesActivos");
			TextoInputMensajeTef = parametros.getProperty("TextoInputMensajeTef");
			TextoDefautlMensaje = parametros.getProperty("TextoDefautlMensaje");
			TituloIngresarSMSDestinatario = parametros.getProperty("TituloIngresarSMSDestinatario");
			SubtituloIngresarSMSDestinatario = parametros.getProperty("SubtituloIngresarSMSDestinatario");
			TextoInputSMSDestinatario = parametros.getProperty("TextoInputSMSDestinatario");
			TituloScotiapassDestinatario = parametros.getProperty("TituloScotiapassDestinatario");
			TituloHuella = parametros.getProperty("TituloHuella");
			MensajeErrorMontoTef = parametros.getProperty("MensajeErrorMontoTef");
			TextoInputMontoTef = parametros.getProperty("TextoInputMontoTef");
			TextoButtonConfirmarTef = parametros.getProperty("TextoButtonConfirmarTef");
		} catch (Exception e) {
			LOGGER.info(e.toString());
		}
	}

	public String getTituloBienvenido() {
		return TituloBienvenido;
	}

	public void setTituloBienvenido(String tituloBienvenido) {
		TituloBienvenido = tituloBienvenido;
	}

	public String getLabelOlvidastePassLogin() {
		return LabelOlvidastePassLogin;
	}

	public void setLabelOlvidastePassLogin(String labelOlvidastePassLogin) {
		LabelOlvidastePassLogin = labelOlvidastePassLogin;
	}

	public String getLabelTeAyudamosLogin() {
		return LabelTeAyudamosLogin;
	}

	public void setLabelTeAyudamosLogin(String labelTeAyudamosLogin) {
		LabelTeAyudamosLogin = labelTeAyudamosLogin;
	}

	public String getTituloPopupOlvidastePassLogin() {
		return TituloPopupOlvidastePassLogin;
	}

	public void setTituloPopupOlvidastePassLogin(String tituloPopupOlvidastePassLogin) {
		TituloPopupOlvidastePassLogin = tituloPopupOlvidastePassLogin;
	}

	public String getMensajePopupOlvidastePassLogin() {
		return MensajePopupOlvidastePassLogin;
	}

	public void setMensajePopupOlvidastePassLogin(String mensajePopupOlvidastePassLogin) {
		MensajePopupOlvidastePassLogin = mensajePopupOlvidastePassLogin;
	}

	public String getTituloPopupNoTengoClaveLogin() {
		return TituloPopupNoTengoClaveLogin;
	}

	public void setTituloPopupNoTengoClaveLogin(String tituloPopupNoTengoClaveLogin) {
		TituloPopupNoTengoClaveLogin = tituloPopupNoTengoClaveLogin;
	}

	public String getMensajePopupNoTengoClaveLogin() {
		return MensajePopupNoTengoClaveLogin;
	}

	public void setMensajePopupNoTengoClaveLogin(String mensajePopupNoTengoClaveLogin) {
		MensajePopupNoTengoClaveLogin = mensajePopupNoTengoClaveLogin;
	}

	public String getTituloLoSentimos() {
		return TituloLoSentimos;
	}

	public void setTituloLoSentimos(String tituloLoSentimos) {
		TituloLoSentimos = tituloLoSentimos;
	}

	public String getMensajeErrorMontoTef() {
		return MensajeErrorMontoTef;
	}

	public void setMensajeErrorMontoTef(String mensajeErrorMontoTef) {
		MensajeErrorMontoTef = mensajeErrorMontoTef;
	}

	public String getMensajeClaveWebIncorrecta() {
		return MensajeClaveWebIncorrecta;
	}

	public void setMensajeClaveWebIncorrecta(String mensajeClaveWebIncorrecta) {
		MensajeClaveWebIncorrecta = mensajeClaveWebIncorrecta;
	}

	public String getMensajePorTuSeguridad() {
		return MensajePorTuSeguridad;
	}

	public void setMensajePorTuSeguridad(String mensajePorTuSeguridad) {
		MensajePorTuSeguridad = mensajePorTuSeguridad;
	}

	public String getMensajeEsteEsTuNumero() {
		return MensajeEsteEsTuNumero;
	}

	public void setMensajeEsteEsTuNumero(String mensajeEsteEsTuNumero) {
		MensajeEsteEsTuNumero = mensajeEsteEsTuNumero;
	}

	public String getTituloIngresoSms() {
		return TituloIngresoSms;
	}

	public void setTituloIngresoSms(String tituloIngresoSms) {
		TituloIngresoSms = tituloIngresoSms;
	}

	public String getSubtituloIngresoSms() {
		return SubtituloIngresoSms;
	}

	public void setSubtituloIngresoSms(String subtituloIngresoSms) {
		SubtituloIngresoSms = subtituloIngresoSms;
	}

	public String getTextoReenviarSms() {
		return TextoReenviarSms;
	}

	public String getTextoButtonConfirmarTef() {
		return TextoButtonConfirmarTef;
	}

	public void setTextoButtonConfirmarTef(String textoButtonConfirmarTef) {
		TextoButtonConfirmarTef = textoButtonConfirmarTef;
	}

	public void setTextoReenviarSms(String textoReenviarSms) {
		TextoReenviarSms = textoReenviarSms;
	}

	public String getTextoInputSms() {
		return TextoInputSms;
	}

	public String getMensajeErrorCelular() {
		return MensajeErrorCelular;
	}

	public void setMensajeErrorCelular(String mensajeErrorCelular) {
		MensajeErrorCelular = mensajeErrorCelular;
	}

	public void setTextoInputSms(String textoInputSms) {
		TextoInputSms = textoInputSms;
	}

	public String getTextoErrorFormatoSms() {
		return TextoErrorFormatoSms;
	}

	public void setTextoErrorFormatoSms(String textoErrorFormatoSms) {
		TextoErrorFormatoSms = textoErrorFormatoSms;
	}

	public String getMensajeSmsIncorrecto() {
		return MensajeSmsIncorrecto;
	}

	public void setMensajeSmsIncorrecto(String mensajeSmsIncorrecto) {
		MensajeSmsIncorrecto = mensajeSmsIncorrecto;
	}

	public String getTituloSeleccionClave() {
		return TituloSeleccionClave;
	}

	public void setTituloSeleccionClave(String tituloSeleccionClave) {
		TituloSeleccionClave = tituloSeleccionClave;
	}

	public String getSubtituloSeleccionClave() {
		return SubtituloSeleccionClave;
	}

	public void setSubtituloSeleccionClave(String subtituloSeleccionClave) {
		SubtituloSeleccionClave = subtituloSeleccionClave;
	}

	public String getTituloClaveMobile() {
		return TituloClaveMobile;
	}

	public void setTituloClaveMobile(String tituloClaveMobile) {
		TituloClaveMobile = tituloClaveMobile;
	}

	public String getSubtituloClaveMobile() {
		return SubtituloClaveMobile;
	}

	public void setSubtituloClaveMobile(String subtituloClaveMobile) {
		SubtituloClaveMobile = subtituloClaveMobile;
	}

	public String getTextoInputCrearClaveMobile() {
		return TextoInputCrearClaveMobile;
	}

	public void setTextoInputCrearClaveMobile(String textoInputCrearClaveMobile) {
		TextoInputCrearClaveMobile = textoInputCrearClaveMobile;
	}

	public String getTextoInputRepiteClaveMobile() {
		return TextoInputRepiteClaveMobile;
	}

	public void setTextoInputRepiteClaveMobile(String textoInputRepiteClaveMobile) {
		TextoInputRepiteClaveMobile = textoInputRepiteClaveMobile;
	}

	public String getMensajeErrorFormatoClaveMobile() {
		return MensajeErrorFormatoClaveMobile;
	}

	public void setMensajeErrorFormatoClaveMobile(String mensajeErrorFormatoClaveMobile) {
		MensajeErrorFormatoClaveMobile = mensajeErrorFormatoClaveMobile;
	}

	public String getMensajeErrorClaveMobileNoCoincide() {
		return MensajeErrorClaveMobileNoCoincide;
	}

	public void setMensajeErrorClaveMobileNoCoincide(String mensajeErrorClaveMobileNoCoincide) {
		MensajeErrorClaveMobileNoCoincide = mensajeErrorClaveMobileNoCoincide;
	}

	public String getSubtituloAutorizaRegistro() {
		return SubtituloAutorizaRegistro;
	}

	public void setSubtituloAutorizaRegistro(String subtituloAutorizaRegistro) {
		SubtituloAutorizaRegistro = subtituloAutorizaRegistro;
	}

	public String getTextoScotiapassLogin() {
		return TextoScotiapassLogin;
	}

	public void setTextoScotiapassLogin(String textoScotiapassLogin) {
		TextoScotiapassLogin = textoScotiapassLogin;
	}

	public String getMensajeErrorScotiapass1() {
		return MensajeErrorScotiapass1;
	}

	public void setMensajeErrorScotiapass1(String mensajeErrorScotiapass1) {
		MensajeErrorScotiapass1 = mensajeErrorScotiapass1;
	}

	public String getPlus() {
		return Plus;
	}

	public void setPlus(String plus) {
		Plus = plus;
	}

	public static Logger getLogger() {
		return LOGGER;
	}

	public String getMensajeErrorScotiapass2() {
		return MensajeErrorScotiapass2;
	}

	public void setMensajeErrorScotiapass2(String mensajeErrorScotiapass2) {
		MensajeErrorScotiapass2 = mensajeErrorScotiapass2;
	}

	public String getTituloBienvenida() {
		return TituloBienvenida;
	}

	public void setTituloBienvenida(String tituloBienvenida) {
		TituloBienvenida = tituloBienvenida;
	}

	public String getSubtituloBienve() {
		return SubtituloBienve;
	}

	public void setSubtituloBienve(String subtituloBienve) {
		SubtituloBienve = subtituloBienve;
	}

	public String getSaludoNoEsTuCel() {
		return SaludoNoEsTuCel;
	}

	public void setSaludoNoEsTuCel(String saludoNoEsTuCel) {
		SaludoNoEsTuCel = saludoNoEsTuCel;
	}

	public String getTextoBtnContinuarBienve() {
		return TextoBtnContinuarBienve;
	}

	public void setTextoBtnContinuarBienve(String textoBtnContinuarBienve) {
		TextoBtnContinuarBienve = textoBtnContinuarBienve;
	}

	public String getTituloBienvenida2() {
		return TituloBienvenida2;
	}

	public void setTituloBienvenida2(String tituloBienvenida2) {
		TituloBienvenida2 = tituloBienvenida2;
	}

	public String getTextoBienve1() {
		return TextoBienve1;
	}

	public void setTextoBienve1(String textoBienve1) {
		TextoBienve1 = textoBienve1;
	}

	public String getTextoBienve2() {
		return TextoBienve2;
	}

	public void setTextoBienve2(String textoBienve2) {
		TextoBienve2 = textoBienve2;
	}

	public String getSubtituloBienve2() {
		return SubtituloBienve2;
	}

	public void setSubtituloBienve2(String subtituloBienve2) {
		SubtituloBienve2 = subtituloBienve2;
	}

	public String getTextoBtnIngresarBienve() {
		return TextoBtnIngresarBienve;
	}

	public void setTextoBtnIngresarBienve(String textoBtnIngresarBienve) {
		TextoBtnIngresarBienve = textoBtnIngresarBienve;
	}

	public String getTextoInputClaveWeb() {
		return TextoInputClaveWeb;
	}

	public void setTextoInputClaveWeb(String textoInputClaveWeb) {
		TextoInputClaveWeb = textoInputClaveWeb;
	}

	public String getTextoInputClaveMobile() {
		return TextoInputClaveMobile;
	}

	public String getTextoNoTienesClaveInternet() {
		return TextoNoTienesClaveInternet;
	}

	public void setTextoNoTienesClaveInternet(String textoNoTienesClaveInternet) {
		TextoNoTienesClaveInternet = textoNoTienesClaveInternet;
	}

	public void setTextoInputClaveMobile(String textoInputClaveMobile) {
		TextoInputClaveMobile = textoInputClaveMobile;
	}

	public String getTextoBtnIngresarSegunLogin() {
		return TextoBtnIngresarSegunLogin;
	}

	public void setTextoBtnIngresarSegunLogin(String textoBtnIngresarSegunLogin) {
		TextoBtnIngresarSegunLogin = textoBtnIngresarSegunLogin;
	}

	public String getTextoRecuperaTuClave() {
		return TextoRecuperaTuClave;
	}

	public void setTextoRecuperaTuClave(String textoRecuperaTuClave) {
		TextoRecuperaTuClave = textoRecuperaTuClave;
	}

	public String getTituloPopupCambiarUsuario() {
		return TituloPopupCambiarUsuario;
	}

	public void setTituloPopupCambiarUsuario(String tituloPopupCambiarUsuario) {
		TituloPopupCambiarUsuario = tituloPopupCambiarUsuario;
	}

	public String getMensajePopupCambiarUsuario() {
		return MensajePopupCambiarUsuario;
	}

	public void setMensajePopupCambiarUsuario(String mensajePopupCambiarUsuario) {
		MensajePopupCambiarUsuario = mensajePopupCambiarUsuario;
	}

	public String getTituloPopupRecuperarClaveWeb() {
		return TituloPopupRecuperarClaveWeb;
	}

	public void setTituloPopupRecuperarClaveWeb(String tituloPopupRecuperarClaveWeb) {
		TituloPopupRecuperarClaveWeb = tituloPopupRecuperarClaveWeb;
	}

	public String getMensajePopupRecuperarClaveWeb() {
		return MensajePopupRecuperarClaveWeb;
	}

	public void setMensajePopupRecuperarClaveWeb(String mensajePopupRecuperarClaveWeb) {
		MensajePopupRecuperarClaveWeb = mensajePopupRecuperarClaveWeb;
	}

	public String getTituloHuellaHabilitada() {
		return TituloHuellaHabilitada;
	}

	public void setTituloHuellaHabilitada(String tituloHuellaHabilitada) {
		TituloHuellaHabilitada = tituloHuellaHabilitada;
	}

	public String getMensajeHuellaHabilitada() {
		return MensajeHuellaHabilitada;
	}

	public void setMensajeHuellaHabilitada(String mensajeHuellaHabilitada) {
		MensajeHuellaHabilitada = mensajeHuellaHabilitada;
	}

	public String getMensajeHuellaHabilitadaSub() {
		return MensajeHuellaHabilitadaSub;
	}

	public void setMensajeHuellaHabilitadaSub(String mensajeHuellaHabilitadaSub) {
		MensajeHuellaHabilitadaSub = mensajeHuellaHabilitadaSub;
	}

	public String getTextoOmitirHuella() {
		return TextoOmitirHuella;
	}

	public void setTextoOmitirHuella(String textoOmitirHuella) {
		TextoOmitirHuella = textoOmitirHuella;
	}

	public String getTextoCtaCte() {
		return TextoCtaCte;
	}

	public void setTextoCtaCte(String textoCtaCte) {
		TextoCtaCte = textoCtaCte;
	}

	public String getTextoDisponible() {
		return TextoDisponible;
	}

	public void setTextoDisponible(String textoDisponible) {
		TextoDisponible = textoDisponible;
	}

	public String getTextoSaldoContable() {
		return TextoSaldoContable;
	}

	public void setTextoSaldoContable(String textoSaldoContable) {
		TextoSaldoContable = textoSaldoContable;
	}

	public String getTextoDisponibleLineaCredito() {
		return TextoDisponibleLineaCredito;
	}

	public void setTextoDisponibleLineaCredito(String textoDisponibleLineaCredito) {
		TextoDisponibleLineaCredito = textoDisponibleLineaCredito;
	}

	public String getTextoCtaVista() {
		return TextoCtaVista;
	}

	public void setTextoCtaVista(String textoCtaVista) {
		TextoCtaVista = textoCtaVista;
	}

	public String getTextoTitular() {
		return TextoTitular;
	}

	public void setTextoTitular(String textoTitular) {
		TextoTitular = textoTitular;
	}

	public String getTextoAdicional() {
		return TextoAdicional;
	}

	public void setTextoAdicional(String textoAdicional) {
		TextoAdicional = textoAdicional;
	}

	public String getTextoUtilizado() {
		return TextoUtilizado;
	}

	public void setTextoUtilizado(String textoUtilizado) {
		TextoUtilizado = textoUtilizado;
	}

	public String getTextoSaldoDisponibleTef() {
		return TextoSaldoDisponibleTef;
	}

	public void setTextoSaldoDisponibleTef(String textoSaldoDisponibleTef) {
		TextoSaldoDisponibleTef = textoSaldoDisponibleTef;
	}

	public String getTextoDisponibleLineaCreditoTef() {
		return TextoDisponibleLineaCreditoTef;
	}

	public void setTextoDisponibleLineaCreditoTef(String textoDisponibleLineaCreditoTef) {
		TextoDisponibleLineaCreditoTef = textoDisponibleLineaCreditoTef;
	}

	public String getTituloAgregadoConExito() {
		return TituloAgregadoConExito;
	}

	public void setTituloAgregadoConExito(String tituloAgregadoConExito) {
		TituloAgregadoConExito = tituloAgregadoConExito;
	}

	public String getMensajeAgregadoConExito() {
		return MensajeAgregadoConExito;
	}

	public void setMensajeAgregadoConExito(String mensajeAgregadoConExito) {
		MensajeAgregadoConExito = mensajeAgregadoConExito;
	}

	public String getTextoCambioClave() {
		return TextoCambioClave;
	}

	public void setTextoCambioClave(String textoCambioClave) {
		TextoCambioClave = textoCambioClave;
	}

	public String getTextoCambioUsuario() {
		return TextoCambioUsuario;
	}

	public void setTextoCambioUsuario(String textoCambioUsuario) {
		TextoCambioUsuario = textoCambioUsuario;
	}

	public String getTextoAjusteHuella() {
		return TextoAjusteHuella;
	}

	public void setTextoAjusteHuella(String textoAjusteHuella) {
		TextoAjusteHuella = textoAjusteHuella;
	}

	public String getTextoCerrarSesion() {
		return TextoCerrarSesion;
	}

	public void setTextoCerrarSesion(String textoCerrarSesion) {
		TextoCerrarSesion = textoCerrarSesion;
	}

	public String getTextoAyuda() {
		return TextoAyuda;
	}

	public void setTextoAyuda(String textoAyuda) {
		TextoAyuda = textoAyuda;
	}

	public String getTextoIrScotiaweb() {
		return TextoIrScotiaweb;
	}

	public void setTextoIrScotiaweb(String textoIrScotiaweb) {
		TextoIrScotiaweb = textoIrScotiaweb;
	}

	public String getTextoAcercaDe() {
		return TextoAcercaDe;
	}

	public void setTextoAcercaDe(String textoAcercaDe) {
		TextoAcercaDe = textoAcercaDe;
	}

	public String getTituloAyuda1() {
		return TituloAyuda1;
	}

	public void setTituloAyuda1(String tituloAyuda1) {
		TituloAyuda1 = tituloAyuda1;
	}

	public String getMensajeAyuda1() {
		return MensajeAyuda1;
	}

	public void setMensajeAyuda1(String mensajeAyuda1) {
		MensajeAyuda1 = mensajeAyuda1;
	}

	public String getTituloAyuda2() {
		return TituloAyuda2;
	}

	public void setTituloAyuda2(String tituloAyuda2) {
		TituloAyuda2 = tituloAyuda2;
	}

	public String getMensajeAyuda2() {
		return MensajeAyuda2;
	}

	public void setMensajeAyuda2(String mensajeAyuda2) {
		MensajeAyuda2 = mensajeAyuda2;
	}

	public String getTituloAyuda3() {
		return TituloAyuda3;
	}

	public void setTituloAyuda3(String tituloAyuda3) {
		TituloAyuda3 = tituloAyuda3;
	}

	public String getMensajeAyuda3() {
		return MensajeAyuda3;
	}

	public void setMensajeAyuda3(String mensajeAyuda3) {
		MensajeAyuda3 = mensajeAyuda3;
	}

	public String getTituloAyuda4() {
		return TituloAyuda4;
	}

	public void setTituloAyuda4(String tituloAyuda4) {
		TituloAyuda4 = tituloAyuda4;
	}

	public String getMensajeAyuda4() {
		return MensajeAyuda4;
	}

	public void setMensajeAyuda4(String mensajeAyuda4) {
		MensajeAyuda4 = mensajeAyuda4;
	}

	public String getTituloAyuda5() {
		return TituloAyuda5;
	}

	public void setTituloAyuda5(String tituloAyuda5) {
		TituloAyuda5 = tituloAyuda5;
	}

	public String getMensajeAyuda5() {
		return MensajeAyuda5;
	}

	public void setMensajeAyuda5(String mensajeAyuda5) {
		MensajeAyuda5 = mensajeAyuda5;
	}

	public String getTextoInicio() {
		return TextoInicio;
	}

	public void setTextoInicio(String textoInicio) {
		TextoInicio = textoInicio;
	}

	public String getTextoSaldos() {
		return TextoSaldos;
	}

	public void setTextoSaldos(String textoSaldos) {
		TextoSaldos = textoSaldos;
	}

	public String getTextoTransferencia() {
		return TextoTransferencia;
	}

	public void setTextoTransferencia(String textoTransferencia) {
		TextoTransferencia = textoTransferencia;
	}

	public String getTextoPerfil() {
		return TextoPerfil;
	}

	public void setTextoPerfil(String textoPerfil) {
		TextoPerfil = textoPerfil;
	}

	public String getTextoMas() {
		return TextoMas;
	}

	public void setTextoMas(String textoMas) {
		TextoMas = textoMas;
	}

	public String getTextoBtnContinuar() {
		return TextoBtnContinuar;
	}

	public void setTextoBtnContinuar(String textoBtnContinuar) {
		TextoBtnContinuar = textoBtnContinuar;
	}

	public String getTextoBtnCancelar() {
		return TextoBtnCancelar;
	}

	public void setTextoBtnCancelar(String textoBtnCancelar) {
		TextoBtnCancelar = textoBtnCancelar;
	}

	public String getTextoBtnCerrar() {
		return TextoBtnCerrar;
	}

	public void setTextoBtnCerrar(String textoBtnCerrar) {
		TextoBtnCerrar = textoBtnCerrar;
	}

	public String getTextoBtnVolver() {
		return TextoBtnVolver;
	}

	public void setTextoBtnVolver(String textoBtnVolver) {
		TextoBtnVolver = textoBtnVolver;
	}

	public String getMensajeErrorGenerico() {
		return MensajeErrorGenerico;
	}

	public void setMensajeErrorGenerico(String mensajeErrorGenerico) {
		MensajeErrorGenerico = mensajeErrorGenerico;
	}

	public String getMensajeTiempoSesion() {
		return MensajeTiempoSesion;
	}

	public void setMensajeTiempoSesion(String mensajeTiempoSesion) {
		MensajeTiempoSesion = mensajeTiempoSesion;
	}

	public String getScotiapass() {
		return Scotiapass;
	}

	public void setScotiapass(String scotiapass) {
		Scotiapass = scotiapass;
	}

	public String getSMS() {
		return SMS;
	}

	public void setSMS(String sMS) {
		SMS = sMS;
	}

	public String getTituloComprobanteTef() {
		return TituloComprobanteTef;
	}

	public void setTituloComprobanteTef(String tituloComprobanteTef) {
		TituloComprobanteTef = tituloComprobanteTef;
	}

	public String getTituloComprobanteTefMin() {
		return TituloComprobanteTefMin;
	}

	public void setTituloComprobanteTefin(String tituloComprobanteTefMin) {
		TituloComprobanteTefMin = tituloComprobanteTefMin;
	}

	public String getCelularValido() {
		return CelularValido;
	}

	public void setCelularValido(String celularValido) {
		CelularValido = celularValido;
	}

	public String getTextoInputMontoTef() {
		return TextoInputMontoTef;
	}

	public void setTextoInputMontoTef(String textoInputMontoTef) {
		TextoInputMontoTef = textoInputMontoTef;
	}

	public String getTituloClaveWeb() {
		return TituloClaveWeb;
	}

	public void setTituloClaveWeb(String tituloClaveWeb) {
		TituloClaveWeb = tituloClaveWeb;
	}

	public String getSubtituloClaveWeb() {
		return SubtituloClaveWeb;
	}

	public void setSubtituloClaveWeb(String subtituloClaveWeb) {
		SubtituloClaveWeb = subtituloClaveWeb;
	}

	public String getSwitchActivo() {
		return SwitchActivo;
	}

	public void setSwitchActivo(String switchActivo) {
		SwitchActivo = switchActivo;
	}

	public String getSwitchDesactivo() {
		return SwitchDesactivo;
	}

	public void setSwitchDesactivo(String switchDesactivo) {
		SwitchDesactivo = switchDesactivo;
	}

	public String getTituloAutorizaRegistro() {
		return TituloAutorizaRegistro;
	}

	public void setTituloAutorizaRegistro(String tituloAutorizaRegistro) {
		TituloAutorizaRegistro = tituloAutorizaRegistro;
	}

	public String getTextoProductos() {
		return TextoProductos;
	}

	public void setTextoProductos(String textoProductos) {
		TextoProductos = textoProductos;
	}

	public String getTextoButtonAutorizaScotiapass() {
		return TextoButtonAutorizaScotiapass;
	}

	public void setTextoButtonAutorizaScotiapass(String textoButtonAutorizaScotiapass) {
		TextoButtonAutorizaScotiapass = textoButtonAutorizaScotiapass;
	}

	public String getTextoButtonCancelarScotiapass() {
		return TextoButtonCancelarScotiapass;
	}

	public void setTextoButtonCancelarScotiapass(String textoButtonCancelarScotiapass) {
		TextoButtonCancelarScotiapass = textoButtonCancelarScotiapass;
	}

	public String getTextoButtonContinuarDestinatario() {
		return TextoButtonContinuarDestinatario;
	}

	public void setTextoButtonContinuarDestinatario(String textoButtonContinuarDestinatario) {
		TextoButtonContinuarDestinatario = textoButtonContinuarDestinatario;
	}

	public String getTextoButtonGuardarDestinatario() {
		return TextoButtonGuardarDestinatario;
	}

	public void setTextoButtonGuardarDestinatario(String textoButtonGuardarDestinatario) {
		TextoButtonGuardarDestinatario = textoButtonGuardarDestinatario;
	}

	public String getTextoInputBanco() {
		return TextoInputBanco;
	}

	public void setTextoInputBanco(String textoInputBanco) {
		TextoInputBanco = textoInputBanco;
	}

	public String getTextoInputTipoCta() {
		return TextoInputTipoCta;
	}

	public void setTextoInputTipoCta(String textoInputTipoCta) {
		TextoInputTipoCta = textoInputTipoCta;
	}

	public String getTiposDeCuenta() {
		return TiposDeCuenta;
	}

	public void setTiposDeCuenta(String tiposDeCuenta) {
		TiposDeCuenta = tiposDeCuenta;
	}

	public String getTextoInputNroCta() {
		return TextoInputNroCta;
	}

	public void setTextoInputNroCta(String textoInputNroCta) {
		TextoInputNroCta = textoInputNroCta;
	}

	public String getTextoInputNombreDestinatario() {
		return TextoInputNombreDestinatario;
	}

	public void setTextoInputNombreDestinatario(String textoInputNombreDestinatario) {
		TextoInputNombreDestinatario = textoInputNombreDestinatario;
	}

	public String getMensajeErrorNombreDestinatario() {
		return MensajeErrorNombreDestinatario;
	}

	public void setMensajeErrorNombreDestinatario(String mensajeErrorNombreDestinatario) {
		MensajeErrorNombreDestinatario = mensajeErrorNombreDestinatario;
	}

	public String getMensajeRutInvalido() {
		return MensajeRutInvalido;
	}

	public void setMensajeRutInvalido(String mensajeRutInvalido) {
		MensajeRutInvalido = mensajeRutInvalido;
	}

	public String getTextoInputRut() {
		return TextoInputRut;
	}

	public void setTextoInputRut(String textoInputRut) {
		TextoInputRut = textoInputRut;
	}

	public String getTextoInputCorreoDestinatario() {
		return TextoInputCorreoDestinatario;
	}

	public void setTextoInputCorreoDestinatario(String textoInputCorreoDestinatario) {
		TextoInputCorreoDestinatario = textoInputCorreoDestinatario;
	}

	public String getMensajeErrorCorreoDestinatario() {
		return MensajeErrorCorreoDestinatario;
	}

	public void setMensajeErrorCorreoDestinatario(String mensajeErrorCorreoDestinatario) {
		MensajeErrorCorreoDestinatario = mensajeErrorCorreoDestinatario;
	}

	public String getTextoButtonAgregarDestinatario() {
		return TextoButtonAgregarDestinatario;
	}

	public void setTextoButtonAgregarDestinatario(String textoButtonAgregarDestinatario) {
		TextoButtonAgregarDestinatario = textoButtonAgregarDestinatario;
	}

	public String getTextoButtonValidarSMS() {
		return TextoButtonValidarSMS;
	}

	public void setTextoButtonValidarSMS(String textoButtonValidarSMS) {
		TextoButtonValidarSMS = textoButtonValidarSMS;
	}

	public String getTextoButtonCancelarSMS() {
		return TextoButtonCancelarSMS;
	}

	public void setTextoButtonCancelarSMS(String textoButtonCancelarSMS) {
		TextoButtonCancelarSMS = textoButtonCancelarSMS;
	}

	public String getTextoButoonReenviarSMSDestinatario() {
		return TextoButoonReenviarSMSDestinatario;
	}

	public void setTextoButoonReenviarSMSDestinatario(String textoButoonReenviarSMSDestinatario) {
		TextoButoonReenviarSMSDestinatario = textoButoonReenviarSMSDestinatario;
	}

	public String getTituloDesActivos() {
		return TituloDesActivos;
	}

	public void setTituloDesActivos(String tituloDesActivos) {
		TituloDesActivos = tituloDesActivos;
	}

	public String getTextoInputMensajeTef() {
		return TextoInputMensajeTef;
	}

	public void setTextoInputMensajeTef(String textoInputMensajeTef) {
		TextoInputMensajeTef = textoInputMensajeTef;
	}

	public String getTextoDefautlMensaje() {
		return TextoDefautlMensaje;
	}

	public void setTextoDefautlMensaje(String textoDefautlMensaje) {
		TextoDefautlMensaje = textoDefautlMensaje;
	}

	public String getTituloIngresarSMSDestinatario() {
		return TituloIngresarSMSDestinatario;
	}

	public void setTituloIngresarSMSDestinatario(String tituloIngresarSMSDestinatario) {
		TituloIngresarSMSDestinatario = tituloIngresarSMSDestinatario;
	}

	public String getSubtituloIngresarSMSDestinatario() {
		return SubtituloIngresarSMSDestinatario;
	}

	public void setSubtituloIngresarSMSDestinatario(String subtituloIngresarSMSDestinatario) {
		SubtituloIngresarSMSDestinatario = subtituloIngresarSMSDestinatario;
	}

	public String getTextoInputSMSDestinatario() {
		return TextoInputSMSDestinatario;
	}

	public void setTextoInputSMSDestinatario(String textoInputSMSDestinatario) {
		TextoInputSMSDestinatario = textoInputSMSDestinatario;
	}

	public String getTituloScotiapassDestinatario() {
		return TituloScotiapassDestinatario;
	}

	public void setTituloScotiapassDestinatario(String tituloScotiapassDestinatario) {
		TituloScotiapassDestinatario = tituloScotiapassDestinatario;
	}

	public String getTituloHuella() {
		return TituloHuella;
	}

	public void setTituloHuella(String tituloHuella) {
		TituloHuella = tituloHuella;
	}
}