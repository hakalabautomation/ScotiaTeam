@ViewIngresoSmsEnrol
Feature: Validacion de componentes de pantalla Ingreso Codigo SMS Enroll
  Validar componentes de pantalla Ingreso Codigo SMS en enrrolamiento

@ReporteViewIngresoSmsEnrol
  Scenario: Validar textos Pantalla ingreso codigo SMS
    Then Validar titulo ingreso codigo SMS
    And Validar subtitulo ingreso codigo SMS
    And Validar numero telefono ingresado es correcto
    And Validar texto de tiempo formato correcto
    And Validar texto boton reenviar SMS
    And Validar texto input codigo SMS

  Scenario: Validar que se visualiza barra de progreso
    Then Validar que se visualiza barra de progreso

  Scenario: Validar que se visualiza campo editar codigo SMS
    Then Validar que se visualiza campo editar codigo SMS

  Scenario: Validar que se visualiza boton continuar SMS
    Then Validar que se visualiza boton continuar SMS
