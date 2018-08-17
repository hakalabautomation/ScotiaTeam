@ButtonCancelarSMS
Feature: Validar componente boton cancelar SMS
  Validar componente boton cancelar SMS

  @ReporteButtonCancelarSMS
  Scenario: Validar texto Boton cancelar SMS
    Then Validar texto Boton cancelar SMS

  Scenario: Boton debe permanecer activo en todo momento
    Then Boton cancelar SMS debe permanecer activo en todo momento

  Scenario: Boton debe cancelar ingreso SMS
    When Click a boton cancelar SMS
    Then Pantalla ingreso SMS debe desaparecer sin continuar
