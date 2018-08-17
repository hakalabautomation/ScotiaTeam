@EditCrearClaveMobileEnrol
Feature: Validar componente Crear Clave Mobile Enroll
  Validar componente Crear Clave Mobile en enrrolamiento

	@ReporteEditCrearClaveMobileEnrol
  Scenario: Validar texto campo crear clave mobile
    Then Validar texto campo crear clave mobile

  Scenario: Visualizar boton ver clave
    Then Comprobar que boton ver clave se visualiza

  Scenario Outline: Permitir solo ingreso de numeros
    When Ingresar letras y caracteres especiales en campo crear clave mobile<letras>
    Then No permite ingresar letras ni caracteres especiales en campo crear clave mobile

    Examples: 
      | letras   |
      | "a"      |
      | "aA"     |
      | "aAb"    |
      | "aAbB"   |
      | "#$%&/(" |

  Scenario Outline: Clave mobile debe ser de seis numeros
    When Ingresar menos caracteres en campo crear clave mobile<numero>
    Then Comprobar mensaje clave mobile debe tener seis numeros

    Examples: 
      | numero  |
      | "1"     |
      | "12"    |
      | "123"   | 
      | "1234"  |
      | "12345" |

  Scenario Outline: Mensaje error debe desaparecer si clave mobile es valida
    When Ingresar clave mobile valida<clave>
    Then Comprobar mensaje de error en campo clave mobile desaparece correctamente

    Examples: 
      | clave    |
      | "123456" |
