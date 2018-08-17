@ButtonItemBalance
Feature: Validacion de componente Boton Saldos de tabBar
  Validar componente boton Saldos de tabBar

  @ReporteButtonItemBalance
  Scenario: Desplegar Saldos si se realiza click a boton
    When Click a boton Saldos
    Then Desplegar pantalla Saldos

  Scenario: Validar texto boton Saldos
    Then Validar texto boton Saldos
