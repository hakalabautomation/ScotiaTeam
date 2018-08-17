@ButtonCancelarScotiapassSms
Feature: Validar componente boton cancelar scotiapass
  Validar componente boton cancelar scotiapass

  @ReporteButtonCancelarScotiapassSms
  Scenario: Validar texto Boton cancelar scotiapass
    Then Validar texto Boton cancelar scotiapass

  Scenario: Boton debe permanecer activo en todo momento
    Then Boton cancelar scotiapass debe permanecer activo en todo momento

  Scenario: Boton debe cancelar ingreso scotiapass
    When Click a boton cancelar scotiapass
    Then Pantalla ingreso scotiapass debe desaparecer sin continuar
