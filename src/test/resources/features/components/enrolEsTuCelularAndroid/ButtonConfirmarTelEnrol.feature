@ButtonConfirmarTelEnrol
Feature: Validacion de componente Boton Confirmar numero telefono Enroll
  Validar componente boton Confirmar numero telefono en enrrolamiento

@ReporteButtonConfirmarTelEnrol
  Scenario Outline: Boton no debe permitr continuar si formato de numero telefonico es incorrecto
    When Ingresar numero telefonico incorrecto<numeroTel>
    Then Validar que despliega mensaje error de numero telefonico

    Examples: 
      | numeroTel    |
      | ""           |
      | "1"          |
      | "12"         |
      | "123"        |
      | "1234"       |
      | "12345"      |
      | "123456"     |
      | "1234567"    |
      | "12345678"   |
      | "123456789"  |
      | "1234567890" |

  Scenario: Boton debe permitr continuar si formato de numero telefonico es correcto
    When Ingresar numero telefonico correcto
    Then Validar que boton confirmar numero permite continuar
