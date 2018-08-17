@EditRepiteClaveMobileEnrol
Feature: Validar componente Repite Clave Mobile Enroll
  Validar componente Repite Clave Mobile en enrrolamiento

	@ReporteEditRepiteClaveMobileEnrol
  Scenario: Validar texto campo Repite clave mobile
    Then Validar texto campo Repite clave mobile

  Scenario: Visualizar boton ver clave
    Then Comprobar que boton ver clave se visualiza

  Scenario Outline: Permitir solo ingreso de numeros
    When Ingresar letras y caracteres especiales en campo repite clave mobile<letras>
    Then No permite ingresar letras ni caracteres especiales en campo repite clave mobile

    Examples: 
      | letras   |
      | "a"      |
      | "aA"     |
      | "aAb"    |
      | "aAbB"   |
      | "#$%&/(" |

  Scenario Outline: Repite clave mobile debe ser de seis numeros
    When Ingresar menos caracteres en campo repite clave mobile<numero>
    Then Comprobar mensaje error en campo

    Examples: 
      | numero  |
      | "1"     | 
      | "12"    |
      | "123"   | 
      | "1234"  | 
      | "12345" |

  Scenario Outline: Clave debe igual a clave anterior
    When Ingresar clave mobile diferentes<claveMobile><repiteClaveMobile>
    Then Comprobar mensaje error en campo

    Examples: 
      | claveMobile | repiteClaveMobile |
      | "123456"    | "654321"          |

  Scenario Outline: Mensaje error debe desaparecer si clave mobile es valida
    When Ingresar clave mobile valida<clave>
    Then Comprobar mensaje de error en campo clave mobile desaparece correctamente

    Examples: 
      | clave    |
      | "123456" |
