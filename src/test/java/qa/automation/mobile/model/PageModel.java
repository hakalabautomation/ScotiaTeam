package qa.automation.mobile.model;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import qa.automation.mobile.flow.BaseFlow;

public class PageModel {
	/** ENRROLAMIENTO - PANTALLA 1 - LOGIN **/
	// Titulo Bienvenido
	@FindBy(id = "login_welcome")
	private WebElement loginWelcome;

	// Input Rut
	@FindBy(id = "login_rut")
	private WebElement loginRut;

	@FindBy(id = "login_rut_container")
	private WebElement loginRutContainer;

	// Error de input, este se muestra una vez alla un error en algun input, como por ejemplo Rut invalido
	@FindBy(id = "textinput_error")
	private WebElement textInputError;

	// Input Clave Internet
	@FindBy(id = "login_password")
	private WebElement loginPassword;

	@FindBy(id = "login_password_container")
	private WebElement loginPasswordContainer;

	// Btn ver Clave Internet
	@FindBy(id = "text_input_password_toggle")
	private WebElement textInputPasswordToggle;

	// Btn Login
	@FindBy(id = "login_button")
	private WebElement loginButton;

	// Label ¿Olvidaste tu contraseña?
	@FindBy(id = "login_help_label")
	private WebElement loginHelpLabel;

	// Opcion Recupera tu clave
	@FindBy(id = "login_help_password_recover")
	private WebElement loginHelpPasswordRecover;

	// Label ¿Te ayudamos?
	@FindBy(id = "login_help_password_label")
	private WebElement loginHelpPasswordLabel;

	// Opcion ¿No tienes clave de internet?
	@FindBy(id = "login_help_password_create")
	private WebElement loginHelpPasswordCreate;

	/**
	 * POPUPS - Todos lo popup tienen la misma estructura solo cambia mensaje y titulo
	 **/
	// Icono popup
	@FindBy(id = "dialog_information_icon")
	private WebElement dialogInformationIcon;

	// Titulo popup
	@FindBy(id = "dialog_information_title")
	private WebElement dialogInformationTitle;

	// Mensaje popup
	@FindBy(id = "dialog_information_message")
	private WebElement dialogInformationMessage;

	// Btn cerrar popup
	@FindBy(id = "dialog_information_button_neutral")
	private WebElement dialogInformationButtonNeutral;

	// Btn continuar popup
	@FindBy(id = "dialog_information_button_positive")
	private WebElement dialogInformationButtonPositive;

	// Btn cancelar popup
	@FindBy(id = "dialog_information_button_negative")
	private WebElement dialogInformationButtonNegative;

	/** ENRROLAMIENTO - PANTALLA Es tu celular **/
	// Titulo Hola, xxxx
	@FindBy(id = "confirm_phone_greetings")
	private WebElement confirmPhoneGreetings;

	// Subtitulo Por tu seguridad
	@FindBy(id = "textView3")
	private WebElement subPorTuSeguridad;

	// Subtitulo ¿Este es tu numero?
	@FindBy(id = "textView4")
	private WebElement subEsteEsTuNumero;

	// Signo + android
	@FindBy(id = "textView_plus")
	private WebElement textViewPlus;

	// Input telefono
	@FindBy(id = "dialog_confirm_phone_edittext_number")
	private WebElement dialogConfirmPhoneEdittextNumber;

	// Btn confirmar
	@FindBy(id = "confirm_phone_button_yes")
	private WebElement confirmPhoneButtonYes;

	/** ENRROLAMIENTO - PANTALLA 2 - INGRESO SMS **/
	// Titulo ingreso sms
	@FindBy(id = "textViewTitle")
	private WebElement textTitleSms;

	// Subtitulo ingreso sms
	@FindBy(id = "textViewHeader")
	private WebElement textViewHeader;

	// Label numero telefono
	@FindBy(id = "textViewNumber")
	private WebElement textViewNumber;

	// Barra progreso
	@FindBy(id = "progressBarCountDown")
	private WebElement progressBarCountDown;

	// Reloj cuenta regresiva
	@FindBy(id = "textViewCountDown")
	private WebElement textViewCountDown;

	// Btn reenviar sms
	@FindBy(id = "buttonReSendSMS")
	private WebElement buttonReSendSMS;

	// Text input codigo sms
	@FindBy(id = "textInputLayoutSMS")
	private WebElement textInputLayoutSMS;

	// Input codigo sms
	@FindBy(id = "editTextCodeSMS")
	private WebElement editTextCodeSMS;

	// Btn confirmar sms
	@FindBy(id = "smscode_continue")
	private WebElement smsCodeContinue;

	/** ENRROLAMIENTO - PANTALLA 3 -SELECCION DE CLAVE **/
	// Titulo seleccion de clave
	@FindBy(id = "choosepass_title")
	private WebElement choosepassTitle;

	// Subtitulo seleccion de clave
	@FindBy(id = "choosepass_subtitle")
	private WebElement choosepassSubtitle;

	// Titulo Crear clave ScotiaMobile
	@FindBy(id = "choosepass_scotiamobile_title")
	private WebElement choosepassScotiamobileTitle;

	// Subtitulo Crear clave ScotiaMobile
	@FindBy(id = "choosepass_scotiamobile_subtitle")
	private WebElement choosepassScotiamobileSubtitle;

	// Titulo Utilizar mi clave de internet
	@FindBy(id = "choosepass_webpass_title")
	private WebElement choosepassWebpassTitle;

	// Subtitulo Utilizar mi clave de internet
	@FindBy(id = "choosepass_webpass_subtitle")
	private WebElement choosepassWebpassSubtitle;

	// Texto input clave Scotiago 1
	@FindBy(id = "scotiamobile_first_container")
	private WebElement scotiamobileFirstContainer;

	// Input Crear clave mobile
	@FindBy(id = "scotiamobile_first_password")
	private WebElement scotiamobileFirstPassword;

	// Texto input clave Scotiago 2
	@FindBy(id = "scotiamobile_second_container")
	private WebElement scotiamobileSecondContainer;

	// Input repite clave mobile
	@FindBy(id = "scotiamobile_second_password")
	private WebElement scotiamobileSecondPassword;

	// Opcion crear clave mobile
	@FindBy(id = "choosepass_scotiamobile_switch")
	private WebElement choosepassScotiamobileSwitch;

	// Opcion clave web
	@FindBy(id = "choosepass_webpass_switch")
	private WebElement choosepassWebpassSwitch;

	@FindBy(id = "choosepass_button")
	private WebElement choosepassButton;

	/** ENRROLAMIENTO - PANTALLA 4 - AUTORIZA REGISTRO **/
	// Titulo autoriza registro
	@FindBy(id = "scotiapass_title")
	private WebElement scotiapassTitle;

	// Subtitulo autoriza registro
	@FindBy(id = "textView_keypass_desription")
	private WebElement textViewKeypassDesription;

	// Texto input scotiapass
	@FindBy(id = "scotiapass_container")
	private WebElement scotiapassContainer;

	// Input scotiapass
	@FindBy(id = "scotiapass_password")
	private WebElement scotiapassPassword;

	@FindBy(id = "scotiapass_button")
	private WebElement scotiapassButton;

	/** PANTALLA BIENVENIDA **/
	// Imagen pantalla bienvenida
	@FindBy(id = "congrats_img")
	private WebElement congratsImg1;

	// Titulo pantalla bienvenida
	@FindBy(id = "welcome_title")
	private WebElement welcomeTitle;

	// Subtitulo pantalla bienvenida
	@FindBy(id = "welcome_subtitle")
	private WebElement welcomeSubtitle;

	// btn continuar pantalla bienvenida
	@FindBy(id = "buttonNext")
	private WebElement buttonNext;

	// Textos pantalla bienvenida
	@FindBy(id = "tips_container")
	private WebElement tipsContainer;

	// Textos pantalla bienvenida
	@FindBy(id = "tips_second_container")
	private WebElement tipsSecondContainer;

	// Btn Ingresar bienvenida
	@FindBy(id = "buttonFinish")
	private WebElement buttonFinish;

	/** PANTALLA SEGUNDO LOGIN **/
	// Avatar con letra inicial
	@FindBy(id = "circleLetter_name")
	private WebElement circleLetterName;

	// Nombre cliente
	@FindBy(id = "second_login_greetings")
	private WebElement secondLoginGreetings;

	// Texto input clave
	@FindBy(id = "second_login_password_container")
	private WebElement secondLoginPasswordContainer;

	// Input clave
	@FindBy(id = "second_login_password")
	private WebElement secondLoginPassword;

	// Btn Ingresar segundo login
	@FindBy(id = "second_login_button")
	private WebElement secondLoginButton;

	// Btn mas opciones
	@FindBy(id = "action_more_options")
	private WebElement actionMoreOptions;

	// Btn opciones
	@FindBy(id = "textViewChangeUser")
	private WebElement textViewChangeUser;

	@FindBy(id = "textViewChangeUser")
	private WebElement textViewRecoveryPassword;

	/** HOME - HUELLA HABILITADO **/
	// Imagen Huella
	@FindBy(how = How.ID, using = BaseFlow.scotiapackage + ":id/imageViewFingerprint")
	private WebElement imageViewFingerprint;

	// Texto Huella
	@FindBy(id = "textViewSettingBody")
	private WebElement textViewSettingBody;

	@FindBy(id = "textViewBody")
	private WebElement textViewBody;

	// Omitir huella
	@FindBy(how = How.ID, using = BaseFlow.scotiapackage + ":id/textViewSkipUseFinger")
	private WebElement textViewSkipUseFinger;

	/** HOME **/
	// Carrusel de productos
	@FindBy(id = "cardView_product")
	private List<WebElement> cardViewProduct;

	@FindBy(id = "textview_product_name")
	private WebElement textviewProductName;

	@FindBy(id = "textview_product_number")
	private WebElement textviewProductNumber;

	@FindBy(id = "textview_product_card_type")
	private WebElement textviewProductCardType;

	@FindBy(id = "textview_balance_main_description")
	private WebElement textviewBalanceMainDescription;

	@FindBy(id = "textview_balance_main_amount")
	private WebElement textviewBalanceMainAmount;

	@FindBy(id = "textview_balance_second_description")
	private WebElement textviewBalanceSecondDescription;

	@FindBy(id = "textview_balance_second_amount")
	private WebElement textviewBalanceSecondAmount;

	@FindBy(id = "textview_balance_third_description")
	private WebElement textviewBalanceThirdDescription;

	@FindBy(id = "textview_balance_third_amount")
	private WebElement textviewBalanceThirdAmount;

	@FindBy(id = "textview_balance_third_description_amount")
	private WebElement textviewBalanceThirdDescriptionAmount;

	@FindBy(id = "textview_balance_third_description_used")
	private WebElement textviewBalanceThirdDescriptionUsed;

	@FindBy(id = "textview_balance_third_description_used_amount")
	private WebElement textviewBalanceThirdDescriptionUsedSmount;

	/** TABBAR **/
	@FindBy(id = "bottom_item_home")
	private WebElement bottomItemHome;

	@FindBy(id = "bottom_item_balance")
	private WebElement bottomItemBalance;

	@FindBy(id = "bottom_item_transfer")
	private WebElement bottomItemTransfer;

	@FindBy(id = "bottom_item_profile")
	private WebElement bottomItemProfile;

	@FindBy(id = "bottom_item_more")
	private WebElement bottomItemMore;

	// Texto de boton se visualiza al pulsar boton, solo en android
	@FindBy(id = "largeLabel")
	private WebElement largeLabel;

	/** SALDOS **/
	@FindBy(id = "progress_bar")
	private WebElement progressBar;

	@FindBy(id = "textview_transaction_title")
	private List<WebElement> textviewTransactionTitle;

	@FindBy(id = "textview_transaction_description")
	private List<WebElement> textviewTransactionDescription;

	@FindBy(id = "textview_transaction_amount")
	private List<WebElement> textviewTransactionAmount;

	@FindBy(id = "recycler_view")
	private WebElement recyclerView;

	/** TRANSFERENCIAS **/
	@FindBy(id = "textview_product_transfer_name")
	private WebElement textviewProductTransferName;

	@FindBy(id = "textview_product_transfer_number")
	private WebElement textviewProductTransferNumber;

	@FindBy(id = "circleLetter_product_transfer_name")
	private WebElement circleLetterProductTransferName;

	@FindBy(id = "textview_product_transfer_description_firts")
	private WebElement textviewProductTransferDescriptionFirts;

	@FindBy(id = "textview_product_transfer_description_firts_balance")
	private WebElement textviewProductTransferDescriptionFirtsBalance;

	@FindBy(id = "textview_product_transfer_description_second")
	private WebElement textviewProductTransferDescriptionSecond;

	@FindBy(id = "textview_product_transfer_description_third")
	private WebElement textviewProductTransferDescriptionThird;

	@FindBy(id = "detail_content")
	private WebElement detailContent;

	@FindBy(id = "textView5")
	private WebElement textView5;

	@FindBy(id = "view_add_recipient")
	private WebElement viewAddRecipient;

	@FindBy(id = "textview_recipient_new")
	private WebElement textviewRecipientNew;

	@FindBy(id = "imagebutton_right_arror")
	private List<WebElement> imagebuttonRightArror;

	@FindBy(id = "textview_recipient_name")
	private List<WebElement> textviewRecipientName;

	@FindBy(id = "textview_recipient_bank_description")
	private List<WebElement> textviewRecipientBankDescription;

	@FindBy(id = "textview_recipient_account_number")
	private List<WebElement> textviewRecipientAccountNumber;

	@FindBy(id = "edittext_email_container")
	private WebElement edittextEmailContainer;

	@FindBy(id = "edittext_email")
	private WebElement edittextEmail;

	@FindBy(id = "edittext_message_container")
	private WebElement edittextMessageContainer;

	@FindBy(id = "edittext_message")
	private WebElement edittextMessage;

	@FindBy(id = "edittext_amount")
	private WebElement edittextAmount;

	@FindBy(id = "edittext_amount_container")
	private WebElement edittextAmountContainer;

	@FindBy(id = "button_authorize")
	private WebElement buttonAuthorize;

	// Comprobante TEF
	@FindBy(id = "textview_receipt_label_result")
	private WebElement textviewReceiptLabelResult;

	@FindBy(id = "textview_receipt_origin_account_number")
	private WebElement textviewReceiptOriginAccountNumber;

	@FindBy(id = "textview_receipt_label_origin_account_number")
	private WebElement textviewReceiptLabelOriginAccountNumber;

	@FindBy(id = "receipt_to")
	private WebElement receiptTo;

	@FindBy(id = "textview_receipt_destinatary_name")
	private WebElement textviewReceiptDestinataryName;

	@FindBy(id = "textview_receipt_amount")
	private WebElement textviewReceiptAmount;

	@FindBy(id = "textview_receipt_destinatary_custumer_id")
	private WebElement textviewReceiptDestinataryCustumerId;

	@FindBy(id = "textview_receipt_label_destinatary_account_number")
	private WebElement textviewReceiptLabelDestinataryAccountNumber;

	@FindBy(id = "textview_receipt_destinatary_account_number")
	private WebElement textviewReceiptDestinataryAccountNumber;

	@FindBy(id = "textview_receipt_label_destinatary_bank_name")
	private WebElement textviewReceiptLabelDestinataryBankName;

	@FindBy(id = "textview_receipt_destinatary_bank_name")
	private WebElement textviewReceiptDestinataryBankName;

	@FindBy(id = "textview_label_receipt_message")
	private WebElement textviewLabelReceiptMessage;

	@FindBy(id = "textview_receipt_message")
	private WebElement textviewReceiptMessage;

	@FindBy(id = "textview_label_receipt_date")
	private WebElement textviewLabelReceiptDate;

	@FindBy(id = "textview_receipt_date")
	private WebElement textviewReceiptDate;

	@FindBy(id = "textview_label_receipt_hour")
	private WebElement textviewLabelReceiptHour;

	@FindBy(id = "textview_receipt_hour")
	private WebElement textviewReceiptHour;

	@FindBy(id = "textview_receipt_label_number_transaccion")
	private WebElement textviewReceiptLabelNumberTransaccion;

	@FindBy(id = "textview_receipt_number_transaccion")
	private WebElement textviewReceiptNumberTransaccion;

	@FindBy(id = "textview_receipt_title")
	private WebElement textviewReceiptLabelTittle;

	@FindBy(id = "imageView7")
	private WebElement imageView7;

	// Agregar destinatario
	@FindBy(id = "add_recipient_name_container")
	private WebElement addRecipientNameContainer;

	@FindBy(id = "nameEditText")
	private WebElement nameEditText;

	@FindBy(id = "add_recipient_rut_container")
	private WebElement addRecipientRutContainer;

	@FindBy(id = "rutEditText")
	private WebElement rutEditText;

	@FindBy(id = "add_recipient_email_container")
	private WebElement addRecipientEmailContainer;

	@FindBy(id = "emailEditText")
	private WebElement emailEditText;

	@FindBy(id = "add_recipient_button_next")
	private WebElement addRecipientButtonNext;

	@FindBy(id = "edittext_bank")
	private WebElement edittextBank;

	@FindBy(id = "textView_institution")
	private List<WebElement> textViewInstitution;

	@FindBy(id = "edittext_account_type")
	private WebElement edittextAccountType;

	@FindBy(id = "textView_type_account")
	private List<WebElement> textViewTypeAccount;

	@FindBy(id = "textInputLayout_account_number")
	private WebElement textInputLayoutAccountNumber;

	@FindBy(id = "edittext_account_number")
	private WebElement edittextAccountNumber;

	@FindBy(id = "sms_password")
	private WebElement smsPassword;

	@FindBy(id = "textview_summary_title")
	private WebElement textviewSummaryTitle;

	// Botones en modal de autorizacion
	@FindBy(id = "button_ok")
	private WebElement buttonOk;

	@FindBy(id = "button_cancel")
	private WebElement buttonCancel;

	/** PERFIL **/
	@FindBy(id = "textView_profile_name")
	private WebElement textViewProfileName;

	@FindBy(id = "layoutChangePassword")
	private WebElement layoutChangePassword;

	@FindBy(id = "layoutChangeUser")
	private WebElement layoutChangeUser;

	@FindBy(how = How.ID, using = BaseFlow.scotiapackage + ":id/layoutEnableFingerprint")
	private WebElement layoutEnableFingerprint;

	@FindBy(id = "layoutCloseSession")
	private WebElement layoutCloseSession;

	// Ajuste Huella
	@FindBy(how = How.ID, using = BaseFlow.scotiapackage + ":id/fingerprintInfo")
	private WebElement fingerprintInfo;

	@FindBy(how = How.ID, using = BaseFlow.scotiapackage + ":id/enableFingerprintSwitch")
	private WebElement enableFingerprintSwitch;

	/** MAS **/
	@FindBy(id = "layoutHelp")
	private WebElement layoutHelp;

	@FindBy(id = "layoutGoToWeb")
	private WebElement layoutGoToWeb;

	@FindBy(id = "layoutAboutThat")
	private WebElement layoutAboutThat;

	// Ayuda
	@FindBy(id = "textview_help_title")
	private List<WebElement> textviewHelpTitle;

	@FindBy(id = "textview_help_text")
	private List<WebElement> textviewHelpText;

	@FindBy(id = "receipt_button_emergency_call")
	private List<WebElement> receiptButtonEmergencyCall;

	/** Dialogos de sistema android **/
	@FindBy(id = "com.android.packageinstaller:id/permission_message")
	private WebElement permissionMessage;

	@FindBy(how = How.ID, using = "com.android.packageinstaller:id/permission_allow_button")
	private WebElement permissionAllowButton;

	@FindBy(how = How.ID, using = "com.android.packageinstaller:id/permission_deny_button")
	private WebElement permissionDenyButton;

	@FindBy(xpath = "//android.widget.TextView[@text='Entre productos']")
	private WebElement tabBetweenProducts;

	// Transferencia entre productos
	@FindBy(id = "between_product_arrow")
	private WebElement betweenArrow;

	@FindBy(id = "text_container")
	private WebElement text_container;

	@FindBy(id = "transfer_button")
	private WebElement transfer_button;

	@FindBy(id = "dialog_information_button_positive")
	private WebElement dialog_positive;

	@FindBy(id = "textview_product_transfer_name")
	private List<WebElement> text_transfer_name;

	@FindBy(id = "between_product_name")
	private List<WebElement> betweenProductName;

	// Pago TC
	@FindBy(id = "view_go_to_payment")
	private WebElement viewGoToPayment;

	@FindBy(id = "rb_billed_amount")
	private WebElement rbBilledAmount;

	@FindBy(id = "layout_billed_amount")
	private WebElement layoutBilledAmount;

	@FindBy(id = "rb_min_amount")
	private WebElement rbMinAmount;

	@FindBy(id = "layout_min_amount")
	private WebElement layoutMinAmount;

	@FindBy(id = "rb_another_amount")
	private WebElement rbAnotherAmount;

	@FindBy(id = "tv_another_amount_value")
	private WebElement tvAnotherAmountValue;

	@FindBy(id = "text_container")
	private WebElement textContainer;

	@FindBy(id = "btn_pay")
	private WebElement btnPay;

	public WebElement getLoginWelcome() {
		return loginWelcome;
	}

	public void setLoginWelcome(WebElement loginWelcome) {
		this.loginWelcome = loginWelcome;
	}

	public WebElement getLoginRut() {
		return loginRut;
	}

	public void setLoginRut(WebElement loginRut) {
		this.loginRut = loginRut;
	}

	public WebElement getLoginRutContainer() {
		return loginRutContainer;
	}

	public void setLoginRutContainer(WebElement loginRutContainer) {
		this.loginRutContainer = loginRutContainer;
	}

	public WebElement getTextInputError() {
		return textInputError;
	}

	public void setTextInputError(WebElement textInputError) {
		this.textInputError = textInputError;
	}

	public WebElement getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(WebElement loginPassword) {
		this.loginPassword = loginPassword;
	}

	public WebElement getTextInputPasswordToggle() {
		return textInputPasswordToggle;
	}

	public WebElement getLoginPasswordContainer() {
		return loginPasswordContainer;
	}

	public void setLoginPasswordContainer(WebElement loginPasswordContainer) {
		this.loginPasswordContainer = loginPasswordContainer;
	}

	public void setTextInputPasswordToggle(WebElement textInputPasswordToggle) {
		this.textInputPasswordToggle = textInputPasswordToggle;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}

	public WebElement getLoginHelpLabel() {
		return loginHelpLabel;
	}

	public void setLoginHelpLabel(WebElement loginHelpLabel) {
		this.loginHelpLabel = loginHelpLabel;
	}

	public WebElement getLoginHelpPasswordRecover() {
		return loginHelpPasswordRecover;
	}

	public void setLoginHelpPasswordRecover(WebElement loginHelpPasswordRecover) {
		this.loginHelpPasswordRecover = loginHelpPasswordRecover;
	}

	public WebElement getLoginHelpPasswordLabel() {
		return loginHelpPasswordLabel;
	}

	public void setLoginHelpPasswordLabel(WebElement loginHelpPasswordLabel) {
		this.loginHelpPasswordLabel = loginHelpPasswordLabel;
	}

	public WebElement getLoginHelpPasswordCreate() {
		return loginHelpPasswordCreate;
	}

	public void setLoginHelpPasswordCreate(WebElement loginHelpPasswordCreate) {
		this.loginHelpPasswordCreate = loginHelpPasswordCreate;
	}

	public WebElement getDialogInformationIcon() {
		return dialogInformationIcon;
	}

	public void setDialogInformationIcon(WebElement dialogInformationIcon) {
		this.dialogInformationIcon = dialogInformationIcon;
	}

	public WebElement getDialogInformationTitle() {
		return dialogInformationTitle;
	}

	public void setDialogInformationTitle(WebElement dialogInformationTitle) {
		this.dialogInformationTitle = dialogInformationTitle;
	}

	public WebElement getDialogInformationMessage() {
		return dialogInformationMessage;
	}

	public void setDialogInformationMessage(WebElement dialogInformationMessage) {
		this.dialogInformationMessage = dialogInformationMessage;
	}

	public WebElement getDialogInformationButtonNeutral() {
		return dialogInformationButtonNeutral;
	}

	public void setDialogInformationButtonNeutral(WebElement dialogInformationButtonNeutral) {
		this.dialogInformationButtonNeutral = dialogInformationButtonNeutral;
	}

	public WebElement getDialogInformationButtonPositive() {
		return dialogInformationButtonPositive;
	}

	public void setDialogInformationButtonPositive(WebElement dialogInformationButtonPositive) {
		this.dialogInformationButtonPositive = dialogInformationButtonPositive;
	}

	public WebElement getDialogInformationButtonNegative() {
		return dialogInformationButtonNegative;
	}

	public void setDialogInformationButtonNegative(WebElement dialogInformationButtonNegative) {
		this.dialogInformationButtonNegative = dialogInformationButtonNegative;
	}

	public WebElement getConfirmPhoneGreetings() {
		return confirmPhoneGreetings;
	}

	public void setConfirmPhoneGreetings(WebElement confirmPhoneGreetings) {
		this.confirmPhoneGreetings = confirmPhoneGreetings;
	}

	public WebElement getSubPorTuSeguridad() {
		return subPorTuSeguridad;
	}

	public void setSubPorTuSeguridad(WebElement subPorTuSeguridad) {
		this.subPorTuSeguridad = subPorTuSeguridad;
	}

	public WebElement getSubEsteEsTuNumero() {
		return subEsteEsTuNumero;
	}

	public void setSubEsteEsTuNumero(WebElement subEsteEsTuNumero) {
		this.subEsteEsTuNumero = subEsteEsTuNumero;
	}

	public WebElement getTextViewPlus() {
		return textViewPlus;
	}

	public void setTextViewPlus(WebElement textViewPlus) {
		this.textViewPlus = textViewPlus;
	}

	public WebElement getDialogConfirmPhoneEdittextNumber() {
		return dialogConfirmPhoneEdittextNumber;
	}

	public void setDialogConfirmPhoneEdittextNumber(WebElement dialogConfirmPhoneEdittextNumber) {
		this.dialogConfirmPhoneEdittextNumber = dialogConfirmPhoneEdittextNumber;
	}

	public WebElement getConfirmPhoneButtonYes() {
		return confirmPhoneButtonYes;
	}

	public void setConfirmPhoneButtonYes(WebElement confirmPhoneButtonYes) {
		this.confirmPhoneButtonYes = confirmPhoneButtonYes;
	}

	public WebElement getTextTitleSms() {
		return textTitleSms;
	}

	public void setTextTitleSms(WebElement textTitleSms) {
		this.textTitleSms = textTitleSms;
	}

	public WebElement getTextViewHeader() {
		return textViewHeader;
	}

	public void setTextViewHeader(WebElement textViewHeader) {
		this.textViewHeader = textViewHeader;
	}

	public WebElement getTextViewNumber() {
		return textViewNumber;
	}

	public void setTextViewNumber(WebElement textViewNumber) {
		this.textViewNumber = textViewNumber;
	}

	public WebElement getProgressBarCountDown() {
		return progressBarCountDown;
	}

	public void setProgressBarCountDown(WebElement progressBarCountDown) {
		this.progressBarCountDown = progressBarCountDown;
	}

	public WebElement getTextViewCountDown() {
		return textViewCountDown;
	}

	public void setTextViewCountDown(WebElement textViewCountDown) {
		this.textViewCountDown = textViewCountDown;
	}

	public WebElement getButtonReSendSMS() {
		return buttonReSendSMS;
	}

	public void setButtonReSendSMS(WebElement buttonReSendSMS) {
		this.buttonReSendSMS = buttonReSendSMS;
	}

	public WebElement getTextInputLayoutSMS() {
		return textInputLayoutSMS;
	}

	public void setTextInputLayoutSMS(WebElement textInputLayoutSMS) {
		this.textInputLayoutSMS = textInputLayoutSMS;
	}

	public WebElement getEditTextCodeSMS() {
		return editTextCodeSMS;
	}

	public void setEditTextCodeSMS(WebElement editTextCodeSMS) {
		this.editTextCodeSMS = editTextCodeSMS;
	}

	public WebElement getSmsCodeContinue() {
		return smsCodeContinue;
	}

	public void setSmsCodeContinue(WebElement smsCodeContinue) {
		this.smsCodeContinue = smsCodeContinue;
	}

	public WebElement getChoosepassTitle() {
		return choosepassTitle;
	}

	public void setChoosepassTitle(WebElement choosepassTitle) {
		this.choosepassTitle = choosepassTitle;
	}

	public WebElement getChoosepassSubtitle() {
		return choosepassSubtitle;
	}

	public void setChoosepassSubtitle(WebElement choosepassSubtitle) {
		this.choosepassSubtitle = choosepassSubtitle;
	}

	public WebElement getChoosepassScotiamobileTitle() {
		return choosepassScotiamobileTitle;
	}

	public void setChoosepassScotiamobileTitle(WebElement choosepassScotiamobileTitle) {
		this.choosepassScotiamobileTitle = choosepassScotiamobileTitle;
	}

	public WebElement getChoosepassScotiamobileSubtitle() {
		return choosepassScotiamobileSubtitle;
	}

	public void setChoosepassScotiamobileSubtitle(WebElement choosepassScotiamobileSubtitle) {
		this.choosepassScotiamobileSubtitle = choosepassScotiamobileSubtitle;
	}

	public WebElement getChoosepassWebpassTitle() {
		return choosepassWebpassTitle;
	}

	public void setChoosepassWebpassTitle(WebElement choosepassWebpassTitle) {
		this.choosepassWebpassTitle = choosepassWebpassTitle;
	}

	public WebElement getChoosepassWebpassSubtitle() {
		return choosepassWebpassSubtitle;
	}

	public void setChoosepassWebpassSubtitle(WebElement choosepassWebpassSubtitle) {
		this.choosepassWebpassSubtitle = choosepassWebpassSubtitle;
	}

	public WebElement getScotiamobileFirstContainer() {
		return scotiamobileFirstContainer;
	}

	public void setScotiamobileFirstContainer(WebElement scotiamobileFirstContainer) {
		this.scotiamobileFirstContainer = scotiamobileFirstContainer;
	}

	public WebElement getScotiamobileSecondContainer() {
		return scotiamobileSecondContainer;
	}

	public void setScotiamobileSecondContainer(WebElement scotiamobileSecondContainer) {
		this.scotiamobileSecondContainer = scotiamobileSecondContainer;
	}

	public WebElement getScotiamobileFirstPassword() {
		return scotiamobileFirstPassword;
	}

	public void setScotiamobileFirstPassword(WebElement scotiamobileFirstPassword) {
		this.scotiamobileFirstPassword = scotiamobileFirstPassword;
	}

	public WebElement getScotiamobileSecondPassword() {
		return scotiamobileSecondPassword;
	}

	public void setScotiamobileSecondPassword(WebElement scotiamobileSecondPassword) {
		this.scotiamobileSecondPassword = scotiamobileSecondPassword;
	}

	public WebElement getChoosepassScotiamobileSwitch() {
		return choosepassScotiamobileSwitch;
	}

	public void setChoosepassScotiamobileSwitch(WebElement choosepassScotiamobileSwitch) {
		this.choosepassScotiamobileSwitch = choosepassScotiamobileSwitch;
	}

	public WebElement getChoosepassWebpassSwitch() {
		return choosepassWebpassSwitch;
	}

	public void setChoosepassWebpassSwitch(WebElement choosepassWebpassSwitch) {
		this.choosepassWebpassSwitch = choosepassWebpassSwitch;
	}

	public WebElement getChoosepassButton() {
		return choosepassButton;
	}

	public void setChoosepassButton(WebElement choosepassButton) {
		this.choosepassButton = choosepassButton;
	}

	public WebElement getScotiapassTitle() {
		return scotiapassTitle;
	}

	public void setScotiapassTitle(WebElement scotiapassTitle) {
		this.scotiapassTitle = scotiapassTitle;
	}

	public WebElement getTextViewKeypassDesription() {
		return textViewKeypassDesription;
	}

	public void setTextViewKeypassDesription(WebElement textViewKeypassDesription) {
		this.textViewKeypassDesription = textViewKeypassDesription;
	}

	public WebElement getScotiapassContainer() {
		return scotiapassContainer;
	}

	public void setScotiapassContainer(WebElement scotiapassContainer) {
		this.scotiapassContainer = scotiapassContainer;
	}

	public WebElement getScotiapassPassword() {
		return scotiapassPassword;
	}

	public void setScotiapassPassword(WebElement scotiapassPassword) {
		this.scotiapassPassword = scotiapassPassword;
	}

	public WebElement getScotiapassButton() {
		return scotiapassButton;
	}

	public void setScotiapassButton(WebElement scotiapassButton) {
		this.scotiapassButton = scotiapassButton;
	}

	public WebElement getCongratsImg1() {
		return congratsImg1;
	}

	public void setCongratsImg1(WebElement congratsImg1) {
		this.congratsImg1 = congratsImg1;
	}

	public WebElement getWelcomeTitle() {
		return welcomeTitle;
	}

	public void setWelcomeTitle(WebElement welcomeTitle) {
		this.welcomeTitle = welcomeTitle;
	}

	public WebElement getWelcomeSubtitle() {
		return welcomeSubtitle;
	}

	public void setWelcomeSubtitle(WebElement welcomeSubtitle) {
		this.welcomeSubtitle = welcomeSubtitle;
	}

	public WebElement getButtonNext() {
		return buttonNext;
	}

	public void setButtonNext(WebElement buttonNext) {
		this.buttonNext = buttonNext;
	}

	public WebElement getTipsContainer() {
		return tipsContainer;
	}

	public void setTipsContainer(WebElement tipsContainer) {
		this.tipsContainer = tipsContainer;
	}

	public WebElement getTipsSecondContainer() {
		return tipsSecondContainer;
	}

	public void setTipsSecondContainer(WebElement tipsSecondContainer) {
		this.tipsSecondContainer = tipsSecondContainer;
	}

	public WebElement getButtonFinish() {
		return buttonFinish;
	}

	public void setButtonFinish(WebElement buttonFinish) {
		this.buttonFinish = buttonFinish;
	}

	public WebElement getCircleLetterName() {
		return circleLetterName;
	}

	public void setCircleLetterName(WebElement circleLetterName) {
		this.circleLetterName = circleLetterName;
	}

	public WebElement getSecondLoginGreetings() {
		return secondLoginGreetings;
	}

	public void setSecondLoginGreetings(WebElement secondLoginGreetings) {
		this.secondLoginGreetings = secondLoginGreetings;
	}

	public WebElement getSecondLoginPasswordContainer() {
		return secondLoginPasswordContainer;
	}

	public void setSecondLoginPasswordContainer(WebElement secondLoginPasswordContainer) {
		this.secondLoginPasswordContainer = secondLoginPasswordContainer;
	}

	public WebElement getSecondLoginPassword() {
		return secondLoginPassword;
	}

	public void setSecondLoginPassword(WebElement secondLoginPassword) {
		this.secondLoginPassword = secondLoginPassword;
	}

	public WebElement getSecondLoginButton() {
		return secondLoginButton;
	}

	public void setSecondLoginButton(WebElement secondLoginButton) {
		this.secondLoginButton = secondLoginButton;
	}

	public WebElement getActionMoreOptions() {
		return actionMoreOptions;
	}

	public void setActionMoreOptions(WebElement actionMoreOptions) {
		this.actionMoreOptions = actionMoreOptions;
	}

	public WebElement getTextViewChangeUser() {
		return textViewChangeUser;
	}

	public void setTextViewChangeUser(WebElement textViewChangeUser) {
		this.textViewChangeUser = textViewChangeUser;
	}

	public WebElement getTextViewRecoveryPassword() {
		return textViewRecoveryPassword;
	}

	public void setTextViewRecoveryPassword(WebElement textViewRecoveryPassword) {
		this.textViewRecoveryPassword = textViewRecoveryPassword;
	}

	public WebElement getImageViewFingerprint() {
		return imageViewFingerprint;
	}

	public void setImageViewFingerprint(WebElement imageViewFingerprint) {
		this.imageViewFingerprint = imageViewFingerprint;
	}

	public WebElement getTextViewSettingBody() {
		return textViewSettingBody;
	}

	public void setTextViewSettingBody(WebElement textViewSettingBody) {
		this.textViewSettingBody = textViewSettingBody;
	}

	public WebElement getTextViewBody() {
		return textViewBody;
	}

	public void setTextViewBody(WebElement textViewBody) {
		this.textViewBody = textViewBody;
	}

	public WebElement getTextViewSkipUseFinger() {
		return textViewSkipUseFinger;
	}

	public void setTextViewSkipUseFinger(WebElement textViewSkipUseFinger) {
		this.textViewSkipUseFinger = textViewSkipUseFinger;
	}

	public WebElement getTextviewProductName() {
		return textviewProductName;
	}

	public void setTextviewProductName(WebElement textviewProductName) {
		this.textviewProductName = textviewProductName;
	}

	public WebElement getTextviewProductNumber() {
		return textviewProductNumber;
	}

	public void setTextviewProductNumber(WebElement textviewProductNumber) {
		this.textviewProductNumber = textviewProductNumber;
	}

	public WebElement getTextviewProductCardType() {
		return textviewProductCardType;
	}

	public void setTextviewProductCardType(WebElement textviewProductCardType) {
		this.textviewProductCardType = textviewProductCardType;
	}

	public WebElement getTextviewBalanceMainDescription() {
		return textviewBalanceMainDescription;
	}

	public void setTextviewBalanceMainDescription(WebElement textviewBalanceMainDescription) {
		this.textviewBalanceMainDescription = textviewBalanceMainDescription;
	}

	public WebElement getTextviewBalanceMainAmount() {
		return textviewBalanceMainAmount;
	}

	public void setTextviewBalanceMainAmount(WebElement textviewBalanceMainAmount) {
		this.textviewBalanceMainAmount = textviewBalanceMainAmount;
	}

	public WebElement getTextviewBalanceSecondDescription() {
		return textviewBalanceSecondDescription;
	}

	public void setTextviewBalanceSecondDescription(WebElement textviewBalanceSecondDescription) {
		this.textviewBalanceSecondDescription = textviewBalanceSecondDescription;
	}

	public WebElement getTextviewBalanceSecondAmount() {
		return textviewBalanceSecondAmount;
	}

	public void setTextviewBalanceSecondAmount(WebElement textviewBalanceSecondAmount) {
		this.textviewBalanceSecondAmount = textviewBalanceSecondAmount;
	}

	public WebElement getTextviewBalanceThirdDescription() {
		return textviewBalanceThirdDescription;
	}

	public void setTextviewBalanceThirdDescription(WebElement textviewBalanceThirdDescription) {
		this.textviewBalanceThirdDescription = textviewBalanceThirdDescription;
	}

	public WebElement getTextviewBalanceThirdAmount() {
		return textviewBalanceThirdAmount;
	}

	public void setTextviewBalanceThirdAmount(WebElement textviewBalanceThirdAmount) {
		this.textviewBalanceThirdAmount = textviewBalanceThirdAmount;
	}

	public WebElement getTextviewBalanceThirdDescriptionAmount() {
		return textviewBalanceThirdDescriptionAmount;
	}

	public void setTextviewBalanceThirdDescriptionAmount(WebElement textviewBalanceThirdDescriptionAmount) {
		this.textviewBalanceThirdDescriptionAmount = textviewBalanceThirdDescriptionAmount;
	}

	public WebElement getTextviewBalanceThirdDescriptionUsed() {
		return textviewBalanceThirdDescriptionUsed;
	}

	public void setTextviewBalanceThirdDescriptionUsed(WebElement textviewBalanceThirdDescriptionUsed) {
		this.textviewBalanceThirdDescriptionUsed = textviewBalanceThirdDescriptionUsed;
	}

	public WebElement getTextviewBalanceThirdDescriptionUsedSmount() {
		return textviewBalanceThirdDescriptionUsedSmount;
	}

	public void setTextviewBalanceThirdDescriptionUsedSmount(WebElement textviewBalanceThirdDescriptionUsedSmount) {
		this.textviewBalanceThirdDescriptionUsedSmount = textviewBalanceThirdDescriptionUsedSmount;
	}

	public WebElement getBottomItemHome() {
		return bottomItemHome;
	}

	public void setBottomItemHome(WebElement bottomItemHome) {
		this.bottomItemHome = bottomItemHome;
	}

	public WebElement getBottomItemBalance() {
		return bottomItemBalance;
	}

	public void setBottomItemBalance(WebElement bottomItemBalance) {
		this.bottomItemBalance = bottomItemBalance;
	}

	public WebElement getBottomItemTransfer() {
		return bottomItemTransfer;
	}

	public void setBottomItemTransfer(WebElement bottomItemTransfer) {
		this.bottomItemTransfer = bottomItemTransfer;
	}

	public WebElement getBottomItemProfile() {
		return bottomItemProfile;
	}

	public void setBottomItemProfile(WebElement bottomItemProfile) {
		this.bottomItemProfile = bottomItemProfile;
	}

	public WebElement getBottomItemMore() {
		return bottomItemMore;
	}

	public void setBottomItemMore(WebElement bottomItemMore) {
		this.bottomItemMore = bottomItemMore;
	}

	public WebElement getLargeLabel() {
		return largeLabel;
	}

	public void setLargeLabel(WebElement largeLabel) {
		this.largeLabel = largeLabel;
	}

	public WebElement getProgressBar() {
		return progressBar;
	}

	public void setProgressBar(WebElement progressBar) {
		this.progressBar = progressBar;
	}

	public WebElement getRecyclerView() {
		return recyclerView;
	}

	public void setRecyclerView(WebElement recyclerView) {
		this.recyclerView = recyclerView;
	}

	public WebElement getTextviewProductTransferName() {
		return textviewProductTransferName;
	}

	public void setTextviewProductTransferName(WebElement textviewProductTransferName) {
		this.textviewProductTransferName = textviewProductTransferName;
	}

	public WebElement getTextviewProductTransferNumber() {
		return textviewProductTransferNumber;
	}

	public void setTextviewProductTransferNumber(WebElement textviewProductTransferNumber) {
		this.textviewProductTransferNumber = textviewProductTransferNumber;
	}

	public WebElement getCircleLetterProductTransferName() {
		return circleLetterProductTransferName;
	}

	public void setCircleLetterProductTransferName(WebElement circleLetterProductTransferName) {
		this.circleLetterProductTransferName = circleLetterProductTransferName;
	}

	public WebElement getTextviewProductTransferDescriptionFirts() {
		return textviewProductTransferDescriptionFirts;
	}

	public void setTextviewProductTransferDescriptionFirts(WebElement textviewProductTransferDescriptionFirts) {
		this.textviewProductTransferDescriptionFirts = textviewProductTransferDescriptionFirts;
	}

	public WebElement getTextviewProductTransferDescriptionFirtsBalance() {
		return textviewProductTransferDescriptionFirtsBalance;
	}

	public void setTextviewProductTransferDescriptionFirtsBalance(WebElement textviewProductTransferDescriptionFirtsBalance) {
		this.textviewProductTransferDescriptionFirtsBalance = textviewProductTransferDescriptionFirtsBalance;
	}

	public WebElement getTextviewProductTransferDescriptionSecond() {
		return textviewProductTransferDescriptionSecond;
	}

	public void setTextviewProductTransferDescriptionSecond(WebElement textviewProductTransferDescriptionSecond) {
		this.textviewProductTransferDescriptionSecond = textviewProductTransferDescriptionSecond;
	}

	public WebElement getTextviewProductTransferDescriptionThird() {
		return textviewProductTransferDescriptionThird;
	}

	public void setTextviewProductTransferDescriptionThird(WebElement textviewProductTransferDescriptionThird) {
		this.textviewProductTransferDescriptionThird = textviewProductTransferDescriptionThird;
	}

	public WebElement getDetailContent() {
		return detailContent;
	}

	public void setDetailContent(WebElement detailContent) {
		this.detailContent = detailContent;
	}

	public WebElement getTextView5() {
		return textView5;
	}

	public void setTextView5(WebElement textView5) {
		this.textView5 = textView5;
	}

	public WebElement getViewAddRecipient() {
		return viewAddRecipient;
	}

	public void setViewAddRecipient(WebElement viewAddRecipient) {
		this.viewAddRecipient = viewAddRecipient;
	}

	public WebElement getTextviewRecipientNew() {
		return textviewRecipientNew;
	}

	public void setTextviewRecipientNew(WebElement textviewRecipientNew) {
		this.textviewRecipientNew = textviewRecipientNew;
	}

	public WebElement getNameEditText() {
		return nameEditText;
	}

	public void setNameEditText(WebElement nameEditText) {
		this.nameEditText = nameEditText;
	}

	public WebElement getRutEditText() {
		return rutEditText;
	}

	public void setRutEditText(WebElement rutEditText) {
		this.rutEditText = rutEditText;
	}

	public WebElement getEmailEditText() {
		return emailEditText;
	}

	public void setEmailEditText(WebElement emailEditText) {
		this.emailEditText = emailEditText;
	}

	public WebElement getTextInputLayoutAccountNumber() {
		return textInputLayoutAccountNumber;
	}

	public void setTextInputLayoutAccountNumber(WebElement textInputLayoutAccountNumber) {
		this.textInputLayoutAccountNumber = textInputLayoutAccountNumber;
	}

	public WebElement getAddRecipientButtonNext() {
		return addRecipientButtonNext;
	}

	public void setAddRecipientButtonNext(WebElement addRecipientButtonNext) {
		this.addRecipientButtonNext = addRecipientButtonNext;
	}

	public WebElement getEdittextBank() {
		return edittextBank;
	}

	public void setEdittextBank(WebElement edittextBank) {
		this.edittextBank = edittextBank;
	}

	public List<WebElement> getTextViewInstitution() {
		return textViewInstitution;
	}

	public void setTextViewInstitution(List<WebElement> textViewInstitution) {
		this.textViewInstitution = textViewInstitution;
	}

	public WebElement getEdittextAccountType() {
		return edittextAccountType;
	}

	public void setEdittextAccountType(WebElement edittextAccountType) {
		this.edittextAccountType = edittextAccountType;
	}

	public WebElement getEdittextAccountNumber() {
		return edittextAccountNumber;
	}

	public void setEdittextAccountNumber(WebElement edittextAccountNumber) {
		this.edittextAccountNumber = edittextAccountNumber;
	}

	public WebElement getSmsPassword() {
		return smsPassword;
	}

	public void setSmsPassword(WebElement smsPassword) {
		this.smsPassword = smsPassword;
	}

	public WebElement getButtonOk() {
		return buttonOk;
	}

	public void setButtonOk(WebElement buttonOk) {
		this.buttonOk = buttonOk;
	}

	public WebElement getButtonCancel() {
		return buttonCancel;
	}

	public void setButtonCancel(WebElement buttonCancel) {
		this.buttonCancel = buttonCancel;
	}

	public WebElement getTextViewProfileName() {
		return textViewProfileName;
	}

	public void setTextViewProfileName(WebElement textViewProfileName) {
		this.textViewProfileName = textViewProfileName;
	}

	public WebElement getLayoutChangePassword() {
		return layoutChangePassword;
	}

	public void setLayoutChangePassword(WebElement layoutChangePassword) {
		this.layoutChangePassword = layoutChangePassword;
	}

	public WebElement getLayoutChangeUser() {
		return layoutChangeUser;
	}

	public void setLayoutChangeUser(WebElement layoutChangeUser) {
		this.layoutChangeUser = layoutChangeUser;
	}

	public WebElement getLayoutEnableFingerprint() {
		return layoutEnableFingerprint;
	}

	public void setLayoutEnableFingerprint(WebElement layoutEnableFingerprint) {
		this.layoutEnableFingerprint = layoutEnableFingerprint;
	}

	public WebElement getLayoutCloseSession() {
		return layoutCloseSession;
	}

	public void setLayoutCloseSession(WebElement layoutCloseSession) {
		this.layoutCloseSession = layoutCloseSession;
	}

	public WebElement getFingerprintInfo() {
		return fingerprintInfo;
	}

	public void setFingerprintInfo(WebElement fingerprintInfo) {
		this.fingerprintInfo = fingerprintInfo;
	}

	public WebElement getEnableFingerprintSwitch() {
		return enableFingerprintSwitch;
	}

	public void setEnableFingerprintSwitch(WebElement enableFingerprintSwitch) {
		this.enableFingerprintSwitch = enableFingerprintSwitch;
	}

	public WebElement getLayoutHelp() {
		return layoutHelp;
	}

	public void setLayoutHelp(WebElement layoutHelp) {
		this.layoutHelp = layoutHelp;
	}

	public WebElement getLayoutGoToWeb() {
		return layoutGoToWeb;
	}

	public void setLayoutGoToWeb(WebElement layoutGoToWeb) {
		this.layoutGoToWeb = layoutGoToWeb;
	}

	public WebElement getLayoutAboutThat() {
		return layoutAboutThat;
	}

	public void setLayoutAboutThat(WebElement layoutAboutThat) {
		this.layoutAboutThat = layoutAboutThat;
	}

	public WebElement getPermissionMessage() {
		return permissionMessage;
	}

	public void setPermissionMessage(WebElement permissionMessage) {
		this.permissionMessage = permissionMessage;
	}

	public WebElement getPermissionAllowButton() {
		return permissionAllowButton;
	}

	public void setPermissionAllowButton(WebElement permissionAllowButton) {
		this.permissionAllowButton = permissionAllowButton;
	}

	public WebElement getPermissionDenyButton() {
		return permissionDenyButton;
	}

	public void setPermissionDenyButton(WebElement permissionDenyButton) {
		this.permissionDenyButton = permissionDenyButton;
	}

	public List<WebElement> getCardViewProduct() {
		return cardViewProduct;
	}

	public void setCardViewProduct(List<WebElement> cardViewProduct) {
		this.cardViewProduct = cardViewProduct;
	}

	public List<WebElement> getTextviewTransactionTitle() {
		return textviewTransactionTitle;
	}

	public void setTextviewTransactionTitle(List<WebElement> textviewTransactionTitle) {
		this.textviewTransactionTitle = textviewTransactionTitle;
	}

	public List<WebElement> getTextviewTransactionDescription() {
		return textviewTransactionDescription;
	}

	public void setTextviewTransactionDescription(List<WebElement> textviewTransactionDescription) {
		this.textviewTransactionDescription = textviewTransactionDescription;
	}

	public List<WebElement> getTextviewTransactionAmount() {
		return textviewTransactionAmount;
	}

	public void setTextviewTransactionAmount(List<WebElement> textviewTransactionAmount) {
		this.textviewTransactionAmount = textviewTransactionAmount;
	}

	public List<WebElement> getImagebuttonRightArror() {
		return imagebuttonRightArror;
	}

	public void setImagebuttonRightArror(List<WebElement> imagebuttonRightArror) {
		this.imagebuttonRightArror = imagebuttonRightArror;
	}

	public List<WebElement> getTextviewRecipientName() {
		return textviewRecipientName;
	}

	public void setTextviewRecipientName(List<WebElement> textviewRecipientName) {
		this.textviewRecipientName = textviewRecipientName;
	}

	public List<WebElement> getTextviewRecipientBankDescription() {
		return textviewRecipientBankDescription;
	}

	public void setTextviewRecipientBankDescription(List<WebElement> textviewRecipientBankDescription) {
		this.textviewRecipientBankDescription = textviewRecipientBankDescription;
	}

	public List<WebElement> getTextviewRecipientAccountNumber() {
		return textviewRecipientAccountNumber;
	}

	public void setTextviewRecipientAccountNumber(List<WebElement> textviewRecipientAccountNumber) {
		this.textviewRecipientAccountNumber = textviewRecipientAccountNumber;
	}

	public WebElement getEdittextEmail() {
		return edittextEmail;
	}

	public void setEdittextEmail(WebElement edittextEmail) {
		this.edittextEmail = edittextEmail;
	}

	public WebElement getEdittextMessage() {
		return edittextMessage;
	}

	public void setEdittextMessage(WebElement edittextMessage) {
		this.edittextMessage = edittextMessage;
	}

	public WebElement getEdittextAmount() {
		return edittextAmount;
	}

	public void setEdittextAmount(WebElement edittextAmount) {
		this.edittextAmount = edittextAmount;
	}

	public WebElement getEdittextAmountContainer() {
		return edittextAmountContainer;
	}

	public void setEdittextAmountContainer(WebElement edittextAmountContainer) {
		this.edittextAmountContainer = edittextAmountContainer;
	}

	public WebElement getButtonAuthorize() {
		return buttonAuthorize;
	}

	public void setButtonAuthorize(WebElement buttonAuthorize) {
		this.buttonAuthorize = buttonAuthorize;
	}

	public WebElement getTextviewReceiptLabelResult() {
		return textviewReceiptLabelResult;
	}

	public void setTextviewReceiptLabelResult(WebElement textviewReceiptLabelResult) {
		this.textviewReceiptLabelResult = textviewReceiptLabelResult;
	}

	public WebElement getTextviewReceiptOriginAccountNumber() {
		return textviewReceiptOriginAccountNumber;
	}

	public void setTextviewReceiptOriginAccountNumber(WebElement textviewReceiptOriginAccountNumber) {
		this.textviewReceiptOriginAccountNumber = textviewReceiptOriginAccountNumber;
	}

	public WebElement getTextviewReceiptLabelOriginAccountNumber() {
		return textviewReceiptLabelOriginAccountNumber;
	}

	public void setTextviewReceiptLabelOriginAccountNumber(WebElement textviewReceiptLabelOriginAccountNumber) {
		this.textviewReceiptLabelOriginAccountNumber = textviewReceiptLabelOriginAccountNumber;
	}

	public WebElement getReceiptTo() {
		return receiptTo;
	}

	public void setReceiptTo(WebElement receiptTo) {
		this.receiptTo = receiptTo;
	}

	public WebElement getTextviewReceiptDestinataryName() {
		return textviewReceiptDestinataryName;
	}

	public void setTextviewReceiptDestinataryName(WebElement textviewReceiptDestinataryName) {
		this.textviewReceiptDestinataryName = textviewReceiptDestinataryName;
	}

	public WebElement getTextviewReceiptAmount() {
		return textviewReceiptAmount;
	}

	public void setTextviewReceiptAmount(WebElement textviewReceiptAmount) {
		this.textviewReceiptAmount = textviewReceiptAmount;
	}

	public WebElement getTextviewReceiptDestinataryCustumerId() {
		return textviewReceiptDestinataryCustumerId;
	}

	public void setTextviewReceiptDestinataryCustumerId(WebElement textviewReceiptDestinataryCustumerId) {
		this.textviewReceiptDestinataryCustumerId = textviewReceiptDestinataryCustumerId;
	}

	public WebElement getTextviewReceiptLabelDestinataryAccountNumber() {
		return textviewReceiptLabelDestinataryAccountNumber;
	}

	public void setTextviewReceiptLabelDestinataryAccountNumber(WebElement textviewReceiptLabelDestinataryAccountNumber) {
		this.textviewReceiptLabelDestinataryAccountNumber = textviewReceiptLabelDestinataryAccountNumber;
	}

	public WebElement getTextviewReceiptDestinataryAccountNumber() {
		return textviewReceiptDestinataryAccountNumber;
	}

	public void setTextviewReceiptDestinataryAccountNumber(WebElement textviewReceiptDestinataryAccountNumber) {
		this.textviewReceiptDestinataryAccountNumber = textviewReceiptDestinataryAccountNumber;
	}

	public WebElement getTextviewReceiptLabelDestinataryBankName() {
		return textviewReceiptLabelDestinataryBankName;
	}

	public void setTextviewReceiptLabelDestinataryBankName(WebElement textviewReceiptLabelDestinataryBankName) {
		this.textviewReceiptLabelDestinataryBankName = textviewReceiptLabelDestinataryBankName;
	}

	public WebElement getTextviewReceiptDestinataryBankName() {
		return textviewReceiptDestinataryBankName;
	}

	public void setTextviewReceiptDestinataryBankName(WebElement textviewReceiptDestinataryBankName) {
		this.textviewReceiptDestinataryBankName = textviewReceiptDestinataryBankName;
	}

	public WebElement getTextviewLabelReceiptMessage() {
		return textviewLabelReceiptMessage;
	}

	public void setTextviewLabelReceiptMessage(WebElement textviewLabelReceiptMessage) {
		this.textviewLabelReceiptMessage = textviewLabelReceiptMessage;
	}

	public WebElement getTextviewReceiptMessage() {
		return textviewReceiptMessage;
	}

	public void setTextviewReceiptMessage(WebElement textviewReceiptMessage) {
		this.textviewReceiptMessage = textviewReceiptMessage;
	}

	public WebElement getTextviewLabelReceiptDate() {
		return textviewLabelReceiptDate;
	}

	public void setTextviewLabelReceiptDate(WebElement textviewLabelReceiptDate) {
		this.textviewLabelReceiptDate = textviewLabelReceiptDate;
	}

	public WebElement getTextviewReceiptDate() {
		return textviewReceiptDate;
	}

	public void setTextviewReceiptDate(WebElement textviewReceiptDate) {
		this.textviewReceiptDate = textviewReceiptDate;
	}

	public WebElement getTextviewLabelReceiptHour() {
		return textviewLabelReceiptHour;
	}

	public void setTextviewLabelReceiptHour(WebElement textviewLabelReceiptHour) {
		this.textviewLabelReceiptHour = textviewLabelReceiptHour;
	}

	public WebElement getTextviewReceiptHour() {
		return textviewReceiptHour;
	}

	public void setTextviewReceiptHour(WebElement textviewReceiptHour) {
		this.textviewReceiptHour = textviewReceiptHour;
	}

	public WebElement getTextviewReceiptLabelNumberTransaccion() {
		return textviewReceiptLabelNumberTransaccion;
	}

	public void setTextviewReceiptLabelNumberTransaccion(WebElement textviewReceiptLabelNumberTransaccion) {
		this.textviewReceiptLabelNumberTransaccion = textviewReceiptLabelNumberTransaccion;
	}

	public WebElement getTextviewReceiptNumberTransaccion() {
		return textviewReceiptNumberTransaccion;
	}

	public void setTextviewReceiptNumberTransaccion(WebElement textviewReceiptNumberTransaccion) {
		this.textviewReceiptNumberTransaccion = textviewReceiptNumberTransaccion;
	}

	public WebElement getImageView7() {
		return imageView7;
	}

	public void setImageView7(WebElement imageView7) {
		this.imageView7 = imageView7;
	}

	public List<WebElement> getTextViewTypeAccount() {
		return textViewTypeAccount;
	}

	public void setTextViewTypeAccount(List<WebElement> textViewTypeAccount) {
		this.textViewTypeAccount = textViewTypeAccount;
	}

	public List<WebElement> getTextviewHelpTitle() {
		return textviewHelpTitle;
	}

	public void setTextviewHelpTitle(List<WebElement> textviewHelpTitle) {
		this.textviewHelpTitle = textviewHelpTitle;
	}

	public List<WebElement> getTextviewHelpText() {
		return textviewHelpText;
	}

	public void setTextviewHelpText(List<WebElement> textviewHelpText) {
		this.textviewHelpText = textviewHelpText;
	}

	public List<WebElement> getReceiptButtonEmergencyCall() {
		return receiptButtonEmergencyCall;
	}

	public void setReceiptButtonEmergencyCall(List<WebElement> receiptButtonEmergencyCall) {
		this.receiptButtonEmergencyCall = receiptButtonEmergencyCall;
	}

	public WebElement getAddRecipientNameContainer() {
		return addRecipientNameContainer;
	}

	public void setAddRecipientNameContainer(WebElement addRecipientNameContainer) {
		this.addRecipientNameContainer = addRecipientNameContainer;
	}

	public WebElement getAddRecipientRutContainer() {
		return addRecipientRutContainer;
	}

	public void setAddRecipientRutContainer(WebElement addRecipientRutContainer) {
		this.addRecipientRutContainer = addRecipientRutContainer;
	}

	public WebElement getAddRecipientEmailContainer() {
		return addRecipientEmailContainer;
	}

	public void setAddRecipientEmailContainer(WebElement addRecipientEmailContainer) {
		this.addRecipientEmailContainer = addRecipientEmailContainer;
	}

	public WebElement getEdittextMessageContainer() {
		return edittextMessageContainer;
	}

	public void setEdittextMessageContainer(WebElement edittextMessageContainer) {
		this.edittextMessageContainer = edittextMessageContainer;
	}

	public WebElement getEdittextEmailContainer() {
		return edittextEmailContainer;
	}

	public void setEdittextEmailContainer(WebElement edittextEmailContainer) {
		this.edittextEmailContainer = edittextEmailContainer;
	}

	public WebElement getTextviewSummaryTitle() {
		return textviewSummaryTitle;
	}

	public void setTextviewSummaryTitle(WebElement textviewSummaryTitle) {
		this.textviewSummaryTitle = textviewSummaryTitle;
	}

	public WebElement getTabBetweenProducts() {
		return tabBetweenProducts;
	}

	public void setTabBetweenProducts(WebElement tabBetweenProducts) {
		this.tabBetweenProducts = tabBetweenProducts;
	}

	public WebElement getArrowBetweenProducts() {
		return betweenArrow;
	}

	public void setArrowBetweenProducts(WebElement betweenArrow) {
		this.betweenArrow = betweenArrow;
	}

	public WebElement getAmountBetweenProducts() {
		return text_container;
	}

	public void setAmountBetweenProducts(WebElement text_container) {
		this.text_container = text_container;
	}

	public WebElement getButtonTransferBetweenProducts() {
		return transfer_button;
	}

	public void setButtonTransferBetweenProducts(WebElement transfer_button) {
		this.transfer_button = transfer_button;
	}

	public WebElement getDialogPositiveBetweenProducts() {
		return dialog_positive;
	}

	public void setDialogPositiveBetweenProducts(WebElement dialog_positive) {
		this.dialog_positive = dialog_positive;
	}

	public WebElement getTextviewReceiptLabelBettewnProducts() {
		return textviewReceiptLabelTittle;
	}

	public void setTextviewReceiptLabelTittleBettewnProducts(WebElement textviewReceiptLabelTittle) {
		this.textviewReceiptLabelTittle = textviewReceiptLabelTittle;
	}

	public List<WebElement> getTextTransferName() {
		return text_transfer_name;
	}

	public void setTextTransferName(List<WebElement> text_transfer_name) {
		this.text_transfer_name = text_transfer_name;
	}

	public List<WebElement> getBetweenProductName() {
		return betweenProductName;
	}

	public void setBetweenProductName(List<WebElement> betweenProductName) {
		this.betweenProductName = betweenProductName;
	}

	public WebElement getTextviewReceiptLabelTittle() {
		return textviewReceiptLabelTittle;
	}

	public void setTextviewReceiptLabelTittle(WebElement textviewReceiptLabelTittle) {
		this.textviewReceiptLabelTittle = textviewReceiptLabelTittle;
	}

	public WebElement getBetweenArrow() {
		return betweenArrow;
	}

	public void setBetweenArrow(WebElement betweenArrow) {
		this.betweenArrow = betweenArrow;
	}

	public WebElement getText_container() {
		return text_container;
	}

	public void setText_container(WebElement text_container) {
		this.text_container = text_container;
	}

	public WebElement getTransfer_button() {
		return transfer_button;
	}

	public void setTransfer_button(WebElement transfer_button) {
		this.transfer_button = transfer_button;
	}

	public WebElement getDialog_positive() {
		return dialog_positive;
	}

	public void setDialog_positive(WebElement dialog_positive) {
		this.dialog_positive = dialog_positive;
	}

	public List<WebElement> getText_transfer_name() {
		return text_transfer_name;
	}

	public void setText_transfer_name(List<WebElement> text_transfer_name) {
		this.text_transfer_name = text_transfer_name;
	}

	public WebElement getViewGoToPayment() {
		return viewGoToPayment;
	}

	public void setViewGoToPayment(WebElement viewGoToPayment) {
		this.viewGoToPayment = viewGoToPayment;
	}

	public WebElement getRbBilledAmount() {
		return rbBilledAmount;
	}

	public void setRbBilledAmount(WebElement rbBilledAmount) {
		this.rbBilledAmount = rbBilledAmount;
	}

	public WebElement getLayoutBilledAmount() {
		return layoutBilledAmount;
	}

	public void setLayoutBilledAmount(WebElement layoutBilledAmount) {
		this.layoutBilledAmount = layoutBilledAmount;
	}

	public WebElement getRbMinAmount() {
		return rbMinAmount;
	}

	public void setRbMinAmount(WebElement rbMinAmount) {
		this.rbMinAmount = rbMinAmount;
	}

	public WebElement getLayoutMinAmount() {
		return layoutMinAmount;
	}

	public void setLayoutMinAmount(WebElement layoutMinAmount) {
		this.layoutMinAmount = layoutMinAmount;
	}

	public WebElement getRbAnotherAmount() {
		return rbAnotherAmount;
	}

	public void setRbAnotherAmount(WebElement rbAnotherAmount) {
		this.rbAnotherAmount = rbAnotherAmount;
	}

	public WebElement getTvAnotherAmountValue() {
		return tvAnotherAmountValue;
	}

	public void setTvAnotherAmountValue(WebElement tvAnotherAmountValue) {
		this.tvAnotherAmountValue = tvAnotherAmountValue;
	}

	public WebElement getTextContainer() {
		return textContainer;
	}

	public void setTextContainer(WebElement textContainer) {
		this.textContainer = textContainer;
	}

	public WebElement getBtnPay() {
		return btnPay;
	}

	public void setBtnPay(WebElement btnPay) {
		this.btnPay = btnPay;
	}
}