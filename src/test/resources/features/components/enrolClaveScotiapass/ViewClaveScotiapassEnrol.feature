@ViewClaveScotiapassEnrol
Feature: Validacion de componentes Pantalla clave scotiapass Enroll
  Validar componente pantalla clave scotiapass en enrrolamiento

  @ReporteViewClaveScotiapassEnrol
  Scenario: Validar textos pantalla clave scotiapass enrrolamiento
    Then Validar titulo clave scotiapass
    And Validar subtitulo clave scotiapass

  Scenario: Validar que se visualiza input clave scotiapass
    Then Validar que se visualiza input clave scotiapass

  Scenario: Validar que se visualiza boton ingresar clave autorizacion
    Then Validar que se visualiza boton ingresar clave autorizacion
