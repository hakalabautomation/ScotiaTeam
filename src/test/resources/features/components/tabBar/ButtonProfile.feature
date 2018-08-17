@ButtonProfile
Feature: Validacion de componente Boton perfil de tabBar
  Validar componente boton perfil de tabBar

  @ReporteButtonProfile
  Scenario: Desplegar perfil si se realiza click a boton
    When Click a boton perfil
    Then Desplegar pantalla perfil

  Scenario: Validar texto boton perfil
    Then Validar texto boton perfil
