@ViewTransfer
Feature: Validacion de componentes Pantalla transferencias
  Validar componente pantalla transferencias

  @ReporteViewTransfer
  Scenario: Validar textos pantalla transferencias
    Then Validar titulo transferencias

  Scenario: Validar productos para realizar TEF a terceros
    When Obtener cantidad de productos que pueden realizar TEF
    Then Validar consistencia de datos de productos que pueden realizar TEF

  Scenario: Validar que boton crear destinatario se visualiza
    Then Visualizar boton crear destinatario

  Scenario: Validar datos consistentes de destinatarios activos
    When Obtener lista de destinatarios activos del core
    Then Visualizar lista de destinatarios activos
