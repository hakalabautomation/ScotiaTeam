@EditMontoPagoTC
Feature: Validacion de componente campo monto pago tarjeta de credito
  Validar componente campo monto pago tarjeta de credito

  @ReporteEditMontoPagoTC
  Scenario: Validar texto campo monto pago tarjeta de credito
    Then Validar texto campo monto pago tarjeta de credito

  Scenario: Mensaje de monto incorrecto
    When Ingresar monto pago tarjeta de credito en formato incorrecto
    Then Validar mensaje de monto pago tarjeta de credito incorrecto

  Scenario Outline: Formato con separador de miles campo monto
    When Ingresar monto pago tarjeta de credito en miles<monto>
    Then Se debe formatear monto correctamente<monto>

    Examples: 
      | monto      |
      | "1000"     |
      | "10000"    |
      | "100000"   |
      | "1000000"  |
      | "10000000" |

  Scenario Outline: No permite ingresar mas de 8 digitos
    When Ingresar mas de ocho digitos en campo monto pago tarjeta de credito<monto>
    Then No permite ingresar mas de ocho digitos en campo monto pago tarjeta de credito

    Examples: 
      | monto       |
      | "123456789" |

  Scenario Outline: Ingresar monto correcto
    When Ingresar monto pago tarjeta de credito correcto<monto>
    Then Permte ingresar monto pago tarjeta de credito correctamente

    Examples: 
      | monto |
      | "1"   |
