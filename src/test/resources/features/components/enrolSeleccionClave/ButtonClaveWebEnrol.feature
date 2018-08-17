@ButtonClaveWebEnrol
Feature: Validacion de componente Boton clave Web Enroll
  Validar componente boton clave Web enrrolamiento

@ReporteButtonClaveWebEnrol
  Scenario: Al estar activo opcion crear clave mobile se desactiva automaticamente
    When Click a boton clave web
    Then Validar que opcion crear clave mobile este desactivada
    And Boton ingresar seleccion de clave se activa es posible continuar
