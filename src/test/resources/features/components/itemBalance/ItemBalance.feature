@ItemBalance
Feature: Validacion componte saldos de productos
  Validacion componte saldos de productos

  @ReporteItemBalance
  Scenario: Validar que se visualiza una vista por producto
    When Obtener cantidad de productos que posea cliente segun el core
    Then Validar que se visualiza una vista por productos que posea el cliente segun el core

  Scenario: Validar consistencia de datos por productos del core
    When Visualizo cuentas del cliente segun el core
    Then Se valida consistencia de datos por producto segun el core

  Scenario: Validar movimientos por producto
    When Se escoge cuenta para validar movimientos
    Then Se valida consistencia de datos en movimiento de producto
