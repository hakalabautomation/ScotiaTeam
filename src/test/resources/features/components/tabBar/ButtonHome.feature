@ButtonHome
Feature: Validacion de componente Boton home de tabBar
  Validar componente boton home de tabBar

  @ReporteButtonHome
  Scenario: Desplegar home si se realiza click a boton
    When Click a boton home
    Then Desplegar pantalla home

  Scenario: Validar texto boton home
    Then Validar texto boton home
