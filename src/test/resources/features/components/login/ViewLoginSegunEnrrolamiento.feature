@ViewLoginSegunEnrrolamiento
Feature: Validacion de componentes Pantalla Login segun enrrolamiento
  Validar componente pantalla login segun enrrolamiento

  @ReporteViewLoginSegunEnrrolamiento
  Scenario: Validar textos pantalla Login segun enrrolamiento
    Then Validar que se visualiza avatar
    And Validar titulo Hola, nombre cliente mismo al core

  @SegunClave
  Scenario: Validar que se visualiza campo clave login
    Then Validar que se visualiza campo clave login

  @SegunClave
  Scenario: Validar que se visualiza boton mas opciones login
    Then Validar que se visualiza boton mas opciones login

  @SegunClave
  Scenario: Validar que se visualiza boton login
    Then Validar que se visualiza boton login

  @SegunHuella
  Scenario: Validar textos pantalla Login segun enrrolamiento
    Then Validar titulo huella
    And Validar subtitulo huella

  @SegunHuella
  Scenario: Validar que se visualiza boton omitir huella
    Then Validar que se visualiza boton omitir huella
