@ButtonAutorizarScotiapass
Feature: Validacion de componente boton autorizar scotiapass
  Validar componente boton autorizar scotiapass

  @ReporteButtonAutorizarScotiapass
  Scenario: Validar texto de boton autorizar scotiapass
    Then Validar texto de boton autorizar scotiapass

  Scenario Outline: Boton debe permanecer inactivo si clave scotiapass no es de 8 digitos
    When Ingresar clave scotiapass invalida<sms>
    Then Comprobar que boton autorizar scotiapass permanece inactivo

    Examples: 
      | sms       |
      | ""        |
      | "1"       |
      | "12"      |
      | "123"     |
      | "1234"    |
      | "12345"   |
      | "123456"  |
      | "1234567" |

  Scenario Outline: Boton permite continuar si clave scotiapass es valida
    When Ingresar clave scotiapass valida<clave>
    Then Comprobar que boton autorizar scotiapass permite continuar

    Examples: 
      | clave      |
      | "12345678" |
