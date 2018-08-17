@EditCorreoDestinatario
Feature: Validacion de componente correo nuevo destinatario
  Validar componente correo nuevo destinatario

  @ReporteEditCorreoDestinatario
  Scenario: Validar texto campo correo
    Then Validar texto campo correo nuevo destinatario

  Scenario Outline: Mensaje de correo incorrecto
    When Ingresar correo en formato incorrecto<correo>
    Then Validar mensaje de correo incorrecto

    Examples: 
      | correo |
      | "a"    |
      | "a@"   |
      | "a@a"  |
      | "a@a." |

  Scenario Outline: Correo en formato correcto
    When Ingresar correo en formato correcto<correo>
    Then Validar que mensaje error de correo desaparece

    Examples: 
      | correo                   |
      | "chipelibrego@gmail.com" |
