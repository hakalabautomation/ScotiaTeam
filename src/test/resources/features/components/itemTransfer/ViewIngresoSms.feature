@ViewIngresoSms
Feature: Validacion de componentes de pantalla Ingreso Codigo SMS nuevo destinatario
  Validar componentes de pantalla Ingreso Codigo SMS nuevo destinatario

  @ReporteViewIngresoSms
  Scenario: Validar textos Pantalla ingreso codigo SMS
    Then Validar titulo ingreso codigo SMS nuevo destinatario
    And Validar subtitulo ingreso codigo SMS nuevo destinatario
    And Validar texto de tiempo formato correcto nuevo destinatario
    And Validar texto boton reenviar SMS nuevo destinatario

  Scenario: Validar que se visualiza barra de progreso
    Then Validar que se visualiza barra de progreso

  Scenario: Validar que se visualiza campo editar codigo SMS
    Then Validar que se visualiza campo editar codigo SMS nuevo destinatario

  Scenario: Validar que se visualiza boton validar SMS
    Then Validar que se visualiza boton validar SMS

  Scenario: Validar que se visualiza boton cancelar SMS
    Then Validar que se visualiza boton cancelar SMS
