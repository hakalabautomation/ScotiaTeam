@ButtonTransfer
Feature: Validacion de componente Boton transferencias de tabBar
  Validar componente boton transferencias de tabBar

  @ReporteButtonTransfer
  Scenario: Desplegar transferencias si se realiza click a boton
    When Click a boton transferencias
    Then Desplegar pantalla transferencias

  Scenario: Validar texto boton transferencias
    Then Validar texto boton transferencias
