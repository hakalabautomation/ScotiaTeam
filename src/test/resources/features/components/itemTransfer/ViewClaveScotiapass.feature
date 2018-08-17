@ViewClaveScotiapass
Feature: Validacion de componentes pantalla clave scotiapass nuevo destinatario
  Validar componente pantalla clave scotiapass nuevo destinatario

  @ReporteViewClaveScotiapass
  Scenario: Validar textos pantalla clave scotiapass nuevo destinatario
    Then Validar titulo clave scotiapass nuevo destinatario

  Scenario: Validar que datos de nuevo destinatario sean los ingresados anteriormente
    Then Validar consistencia en datos de nuevo destinatario sean los ingresados anteriormente

  Scenario: Validar que se visualiza input clave scotiapass
    Then Validar que se visualiza input clave scotiapass nuevo destinatario

  Scenario: Validar que se visualiza boton autorizar nuevo destinatario
    Then Validar que se visualiza boton autorizar nuevo destinatario

  Scenario: Validar que se visualiza boton cancelar nuevo destinatario
    Then Validar que se visualiza boton cancelar nuevo destinatario
