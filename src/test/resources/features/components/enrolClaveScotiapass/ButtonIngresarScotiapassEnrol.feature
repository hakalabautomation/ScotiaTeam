@ButtonIngresarScotiapassEnrol
Feature: Validacion de componente Boton ingresar scotiapass Enroll
  Validar componente boton ingresar scotiapass en enrrolamiento

  @ReporteButtonIngresarScotiapassEnrol
  Scenario Outline: Boton debe permanecer inactivo si formato scotiapass es invalido
    When Ingresar scotiapass en formato incorrecto<scotiapass>
    Then Boton ingresar scotiapass debe permanecer inactivo

    Examples: 
      | scotiapass |
      | ""         |
      | "1"        |
      | "12"       |
      | "123"      |
      | "1234"     |
      | "12345"    |
      | "123456"   |
      | "1234567"  |

  Scenario Outline: Boton debe permitir continuar si formato scotiapass es correcto
    When Ingresar scotiapass en formato correcto<scotiapass>
    Then Boton ingresar scotiapass debe permitir continuar

    Examples: 
      | scotiapass |
      | "12345678" |
