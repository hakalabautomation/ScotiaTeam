@ButtonMore
Feature: Validacion de componente Boton Mas de tabBar
  Validar componente boton mas de tabBar

  @ReporteButtonMore
  Scenario: Desplegar mas si se realiza click a boton
    When Click a boton mas
    Then Desplegar pantalla mas

  Scenario: Validar texto boton mas
    Then Validar texto boton mas
