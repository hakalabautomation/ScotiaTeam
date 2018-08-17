@ViewEsTuCelularEnrol
Feature: Validacion de componentes de pantalla Es Tu numero Enroll
  Validar componentes de pantalla Es Tu numero en enrrolamiento

  @ReporteViewEsTuCelularEnrol
  Scenario: Validar textos de pantalla
    Then Validar texto de titulo Hola, nombre de cliente mismo al del core
    And Validar texto de subtitulo pantalla Es Tu numero
    And Validar texto input numero celular
    And Validar texto + en input numero celular
