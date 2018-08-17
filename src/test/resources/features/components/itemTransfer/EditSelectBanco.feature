@EditSelectBanco
Feature: Validacion de componente banco nuevo destinatario
  Validar componente banco nuevo destinatario

  @ReporteEditSelectBanco
  Scenario: Validar texto campo banco nuevo destinatario
    Then Validar texto campo banco nuevo destinatario

  Scenario: Validar que se despliega lista de bancos correctamente
    When Click a lista de bancos
    Then Validar que se despliega lista de bancos segun el core
