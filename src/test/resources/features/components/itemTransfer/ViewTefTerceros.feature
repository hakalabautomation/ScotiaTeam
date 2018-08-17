@ViewTefTerceros
Feature: Validacion de componentes de pantalla transferencia a terceros
  Validar componentes de pantalla transferencia a terceros

  @ReporteViewTefTerceros
  Scenario: Validar datos de destinatario sean consistentes
    When Obtener datos de destinatario seleccionado
    Then Validar datos de destinatario sean consistentes

  Scenario: Validar que se visualiza input correo
    Then Validar que se visualiza imput correo destinatario

  Scenario: Validar que se visualiza input mensaje
    Then Validar que se visualiza campo mensaje transferencia

  Scenario: Validar que se visualiza input monto
    Then Validar que se visualiza input monto transferecnia

  Scenario: Validar que se visualiza boton confirmar transferencia
    Then Validar que se visualiza boton confirmar transferencia
