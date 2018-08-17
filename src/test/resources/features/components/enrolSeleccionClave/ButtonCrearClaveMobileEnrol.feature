@ButtonCrearClaveMobileEnrol
Feature: Validacion de componente Boton Crear clave Mobile Enroll
  Validar componente boton Crear clave Mobile enrrolamiento

@ReporteButtonCrearClaveMobileEnrol
  Scenario: Boton debe inciar desactivado
    Then Validar que boton crear clave mobile inicia desactivado

  Scenario: Al activar boton se despliegan campos crear clave mobile
    When Click boton crear clave mobile
    Then Se deben desplegar campos crear clave mobile
    And Debe desaparecer opcion clave web

  Scenario: Al desactivar boton desaparecen campos crear clave mobile
    When Click boton crear clave mobile
    Then Deben desaparecer campos crear clave mobile
    And Debe aparecer opcion clave web
