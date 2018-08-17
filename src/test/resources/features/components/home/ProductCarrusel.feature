@ProductCarrusel
Feature: Validacion componte carrusel de productos
  Validacion componte carrusel de productos

  @ReporteProductCarrusel
  Scenario: Validar que se visualiza una vista por producto
    When Obtener cantidad de productos segun el core
    Then Validar que se visualiza una vista por productos segun el core

  Scenario: Validar consistencia de datos por productos del core
    When Visualizo cuentas del cliente
    Then Se valida consistencia de datos por producto
