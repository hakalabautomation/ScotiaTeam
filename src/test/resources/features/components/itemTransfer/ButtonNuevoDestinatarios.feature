@ButtonNuevoDestinatarios
Feature: Validacion de componente Boton nuevo destinatario
  Validar componente boton nuevo destinatario

  @ReporteButtonNuevoDestinatarios
  Scenario: Validar texto de boton nuevo destinatario
    Then Validar texto de boton nuevo destinatario

  Scenario: Al realizar click boton se debe desplegar pantalla nuevo destinatario
    When Click a boton nuevo destinatario
    Then Desplegar pantalla agregar nuevo destinatario
