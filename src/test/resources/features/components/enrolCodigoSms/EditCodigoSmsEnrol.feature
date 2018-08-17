@EditCodigoSmsEnrol
Feature: Validar componente editar Codigo SMS Enroll
  Validar componente editar Codigo SMS en enrrolamiento

@ReporteEditCodigoSmsEnrol
  Scenario Outline: Permitir solo ingreso de numeros
    When Ingresar letras y caracteres especiales en campo codigo SMS<letras>
    Then No permite ingresar letras ni caracteres especiales en campo codigo SMS

    Examples: 
      | letras   |
      | "a"      |
      | "aA"     |
      | "aAb"    |
      | "aAbB"   |
      | "#$%&/(" |

  Scenario Outline: Codigo SMS debe ser de seis numeros
    When Ingresar menos caracteres en campo codigo SMS<numero>
    Then Comprobar mensaje clave debe tener seis numeros

    Examples: 
      | numero  |
      | ""      | 
      | "1"     | 
      | "12"    |
      | "123"   |
      | "1234"  | 
      | "12345" | 

  Scenario Outline: No permitir ingresar mas de 6 digitos
    When Ingresar mas de seis digitos en campo codigo SMS<numero>
    Then No permitir ingresar mas de seis digitos en campo codigo SMS

    Examples: 
      | numero    |
      | "1234567" |

  Scenario Outline: Mensaje error debe desaparecer si hay seis numeros
    When Ingresar codigo SMS valido<numero>
    Then Mensaje error codigo SMS debe desaparecer

    Examples: 
      | numero   |
      | "123456" |
