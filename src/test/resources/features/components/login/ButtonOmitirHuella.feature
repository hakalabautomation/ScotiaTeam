@ButtonOmitirHuella
Feature: Validacion componente boton omitir huella
  Validacion componente boton omitir huella

  @ReporteButtonOmitirHuella
  Scenario: Validar texto boton omitir huella
    Then Validar texto boton omitir huella

  Scenario: Validar que al realizar click omiti huella
    When Realizar click a boton omitir huella
    Then Omite ingreso de huella correctamante
