@ViewHome
Feature: Validacion de componentes Pantalla home
  Validar componente pantalla home

  @ReporteViewHome
  Scenario: Validar textos pantalla home
    Then Validar titulo tus productos

  Scenario: Visualizar carruel de productos
    Then Validar que se visualiza carrusel de productos
