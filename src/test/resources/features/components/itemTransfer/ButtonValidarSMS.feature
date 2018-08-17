@ButtonValidarSMS
Feature: Validacion de componente boton validar SMS nuevo destinatario
  Validar componente boton validar SMS nuevo destinatario

  @ReporteButtonValidarSMS
  Scenario: Validar texto de boton validar SMS nuevo destinatario
    Then Validar texto de boton validar SMS nuevo destinatario

  Scenario Outline: Boton debe permanecer inactivo si codigo no es de 6 digitos
    When Ingresar codigo SMS nuevo destinatarios invalido<sms>
    Then Comprobar que boton validar SMS permanece inactivo

    Examples: 
      | sms     |
      | ""      |
      | "1"     |
      | "12"    |
      | "123"   |
      | "1234"  |
      | "12345" |

  Scenario Outline: Boton permite continuar si codigo sms es valido
    When Ingresar codigo SMS nuevo destinatarios valido<sms>
    Then Comprobar que boton validar SMS permite continuar

    Examples: 
      | sms      |
      | "123456" |
