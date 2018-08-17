@ViewIngresarHuella
Feature: Validacion de componentes pantalla ingresar huella
  Validar componente pantalla ingresar huella

  @ReporteViewIngresarHuella
  Scenario: Validar textos pantalla ingresar huella
    Then Validar titulo ingresar huella
    And Validar subtitulo ingresar huella

  Scenario: Validar que imagen de huella se visualiza
    Then Validar que imagen de huella se visualiza

  Scenario: Validar que boton omitir huella se visualiza
    Then Validar que boton omitir huella se visualiza
