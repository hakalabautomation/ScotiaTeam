@ViewSeleccionClaveEnrol
Feature: Validacion de componentes Pantalla Seleccion de clave Enroll
  Validar componente pantalla seleccion de clave en enrrolamiento
	
	@ReporteViewSeleccionClaveEnrol
  Scenario: Validar textos pantalla seleccion de clave enrrolamiento
    Then Validar titulo seleccion de clave
    And Validar subtitulo seleccion de clave
    And Validar titulo crear clave mobile
    And Validar subtitulo crear clave mobile
    And Validar titulo utilizar clave web
    And Validar subtitulo utilizar clave web

  Scenario: Validar que se visualiza boton crear clave mobile
    Then Validar que se visualiza boton crear clave mobile

  Scenario: Validar que se visualiza boton clave web
    Then Validar que se visualiza boton clave web

  Scenario: Validar que se visualiza boton ingresar clave seleccionada
    Then Validar que se visualiza boton ingresar clave seleccionada
