@ViewLoginEnrol
Feature: Validacion de componentes Pantalla Login Enroll
  Validar componete pantalla login enrrolamiento

@ReporteViewLoginEnrol
  Scenario: Validar textos pantalla login enrrolamiento
    Then Validar textos de pantalla Login

  Scenario: Validar texto popups Recupera tu clave
    When Click opcion Recupera tu clave
    Then Validar textos de popup Recupera tu clave

  Scenario: Validar texto popups No tienes clave internet
    When Click opcion No tienes clave internet
    Then Validar textos de popup No tienes clave internet
