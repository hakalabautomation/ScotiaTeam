@ButtonIngresarClaveEnrol
Feature: Validacion de componente Boton Ingresar clave Enrol
  Validar componente boton Ingresar clave en enrrolamiento

	@ReporteButtonIngresarClaveEnrol
  Scenario: Boton debe permanecer inactivo mientras no se escoja clave
    When Desactivar opciones de seleccion clave
    Then Validar que boton ingresar clave permanece inactivo

  Scenario: Boton debe permanecer inactivo mientras no se cree clave mobile valida
    When Click boton crear clave mobile
    Then Validar que boton ingresar clave permanece inactivo

  Scenario Outline: Boton se activa al crear clave mobile valida
    When Ingresar clave mobile valida<claveMobile>
    Then Validar que boton ingresar clave se activa

    Examples: 
      | claveMobile |
      | "123456"    |

  Scenario: Boton se desactiva al dar click en crear clave mobile valida
    When Desactivar opcion crear clave scotiamobile
    Then Validar que boton ingresar clave permanece inactivo

  Scenario: Boton se activa al utilizar clave web
    When Activar utilizar clave web
    Then Validar que boton ingresar clave se activa

  Scenario: Es posible continuar si boton esta activo
    When Click a boton ingresar clave
    Then Validar que boton ingresar clave permite continuar
