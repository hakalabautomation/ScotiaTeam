@EditSelectTipoCuenta
Feature: Validacion de componente tipo cuenta nuevo destinatario
  Validar componente tipo cuenta nuevo destinatario

  @ReporteEditSelectTipoCuenta
  Scenario: Validar texto campo tipo cuenta nuevo destinatario
    Then Validar texto campo tipo cuenta nuevo destinatario

  Scenario: Validar que se despliega lista de tipo cuenta correctamente
    When Click a lista de tipo cuenta
    Then Validar que se despliega lista de tipo cuenta
