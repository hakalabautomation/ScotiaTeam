@EditCorreoTefTerceros
Feature: Validar componente correo destinatario en transferecia terceros
  Validar componente correo destinatario en transferecia terceros

  @ReporteEditCorreoTefTerceros
  Scenario: Validar texto campo correo destinatario
    Then Validar texto campo correo destinatario

  Scenario: Campo correo destinatario debe tener por defecto correo valido
    Then Validar correo destinatario debe tener por defecto correo valido

  Scenario Outline: Mensaje de correo incorrecto
    When Ingresar correo destinatario en formato incorrecto<correo>
    Then Validar mensaje de correo destinatario incorrecto

    Examples: 
      | correo |
      | ""     |
      | "a"    |
      | "a@"   |
      | "a@a"  |
      | "a@a." |

  Scenario Outline: Correo en formato correcto
    When Ingresar correo destinatario en formato correcto<correo>
    Then Validar que mensaje error de correo destinatario desaparece

    Examples: 
      | correo                   |
      | "chipelibrego@gmail.com" |
