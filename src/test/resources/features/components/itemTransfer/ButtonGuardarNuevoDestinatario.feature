@ButtonGuardarNuevoDestinatario
Feature: Validacion de componente boton guardar nuevo destinatario
  Validar componente boton guardar nuevo destinatario

  @ReporteButtonGuardarNuevoDestinatario
  Scenario: Validar texto de boton guardar nuevo destinatario
    Then Validar texto de boton guardar nuevo destinatario

  Scenario: Boton debe permanecer inactivo si datos financieros estan incorrectos
    When No se completan datos financieros de nuevo destinatario
    Then Validar que boton guardar nuevo destinatario permanece inactivo

  Scenario Outline: Boton permite continuar si datos financieros son validos
    When Ingresar datos financieros validos<banco><cta><nroCta>
    Then Validar que boton guardar nuevo destinatario permite continuar

    Examples: 
      | banco        | cta                | nroCta      |
      | "SCOTIABANK" | "Cuenta Corriente" | "710432807" |
