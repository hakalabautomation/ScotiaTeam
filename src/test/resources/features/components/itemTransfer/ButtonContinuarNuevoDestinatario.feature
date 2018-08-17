@ButtonContinuarNuevoDestinatario
Feature: Validacion de componente boton continuar nuevo destinatario
  Validar componente boton continuar nuevo destinatario

  @ReporteButtonContinuarNuevoDestinatario
  Scenario: Validar texto de boton continuar nuevo destinatario
    Then Validar texto de boton continuar nuevo destinatario

  Scenario: Boton debe permanecer inactivo si campos datos de destinatario estan vacios
    When Dejar campos datos de destinatario en blanco
    Then Validar que boton continuar nuevo destinatario permanece inactivo

  Scenario Outline: Boton debe permanecer inactivo si datos de destinatario estan incorrectos
    When Ingresar datos de destinatario invalidos<nombre><rut><correo>
    Then Validar que boton continuar nuevo destinatario permanece inactivo

    Examples: 
      | nombre | rut | correo |
      | "a"    | "1" | "a"    |

  Scenario Outline: Boton permite continuar si datos de destinatario estan correctos
    When Ingresar datos de destinatario validos<nombre><rut><correo>
    Then Validar que boton continuar nuevo destinatario permite continuar

    Examples: 
      | nombre   | rut         | correo             |
      | "Prueba" | "8863518-3" | "prueba@prueba.cl" |
