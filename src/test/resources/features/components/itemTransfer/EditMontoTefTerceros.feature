@EditMontoTefTerceros
Feature: Validacion de componente campo monto transferecia terceros
  Validar componente campo monto transferecia terceros

  @ReporteEditMontoTefTerceros
  Scenario: Validar texto campo monto transferecia terceros
    Then Validar texto campo monto transferecia terceros

  Scenario: Mensaje de monto incorrecto
    When Ingresar monto transferecia terceros en formato incorrecto
    Then Validar mensaje de monto transferecia terceros incorrecto

  Scenario Outline: Formato con separador de miles campo monto
    When Ingresar monto en miles<monto>
    Then Se debe formatear monto correctamente<monto>

    Examples: 
      | monto      |
      | "1000"     |
      | "10000"    |
      | "100000"   |
      | "1000000"  |
      | "10000000" |

  Scenario Outline: No permite ingresar mas de 8 digitos
    When Ingresar mas de ocho digitos en campo monto transferecia terceros<monto>
    Then No permite ingresar mas de ocho digitos en campo monto transferecia terceros

    Examples: 
      | monto       |
      | "123456789" |

  Scenario Outline: Ingresar monto correcto
    When Ingresar monto correcto<monto>
    Then Permte ingresar monto correctamente

    Examples: 
      | monto |
      | "1"   |
