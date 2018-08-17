@ButtonConfirmarTefTercero
Feature: Validacion de componente boton confirmar transferencia a tercero
  Validar componente boton confirmar transferencia a tercero

  @ReporteButtonConfirmarTefTercero
  Scenario: Validar texto de boton confirmar transferencia a tercero
    Then Validar texto de boton confirmar transferencia a tercero

  Scenario: Boton debe permanecer inactivo si campos datos de transferencia estan vacios
    When Dejar campos datos de transferencia en blanco
    Then Validar que boton confirmar transferencia a tercero permanece inactivo

  Scenario Outline: Boton debe permanecer inactivo si datos de transferencia estan incorrectos
    When Ingresar datos de transferencia invalidos<email><mensaje><monto>
    Then Validar que boton confirmar transferencia a tercero permanece inactivo

    Examples: 
      | email | mensaje | monto |
      | "a"   | ""      | ""    |

  Scenario Outline: Boton permite continuar si datos de transferencia estan correctos
    When Ingresar datos de transferencia validos<email><mensaje><monto>
    Then Validar que boton confirmar transferencia a tercero permite continuar

    Examples: 
      | email                    | mensaje       | monto |
      | "chipelibrego@gmail.com" | "Testing Tef" | "1"   |
