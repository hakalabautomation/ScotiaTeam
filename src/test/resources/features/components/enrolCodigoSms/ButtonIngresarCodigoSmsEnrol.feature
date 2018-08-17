@ButtonIngresarCodigoSmsEnrol
Feature: Validacion de componente Boton Ingresar codigo SMS Enroll
  Validar componente boton Ingresar codigo SMS en enrrolamiento

@ReporteButtonIngresarCodigoSmsEnrol
  Scenario Outline: Boton no se debe activar si formato de codigo SMS es incorrecto
    When Ingresar codigo SMS incorrecto<codigoSMS>
    Then Validar que boton ingresar codigo SMS esta inactivo

    Examples: 
      | codigoSMS |
      | ""        |
      | "1"       |
      | "12"      |
      | "123"     |
      | "1234"    |
      | "12345"   |

  Scenario Outline: Boton se debe activar si formato de codigo SMS es correcto
    When Ingresar codigo SMS correcto<codigoSMS>
    Then Validar que boton ingresar codigo SMS permite continuar

    Examples: 
      | codigoSMS |
      | "123456"  |
