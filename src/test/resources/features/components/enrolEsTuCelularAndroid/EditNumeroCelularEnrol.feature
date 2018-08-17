@EditNumeroCelularEnrol
Feature: Validacion de componente Input Editar numero celular Enroll
  Validar componente input editar numero celular en enrrolamiento

	@ReporteEditNumeroCelularEnrol  
   Scenario Outline: Validar numero de telefono perimita solo numeros
    When Ingresar letras y caracteres especiales en campo numero celular<letras>
    Then Validar que no permita ingresar letras ni caracteres especiales

    Examples: 
      | letras      |
      | "a"         |
      | "aA"        |
      | "aAb"       |
      | "aAbB"      |
      | "aAbB#$%&/" |

  Scenario Outline: Validar numero de telefono debe poseer once caracteres
    When Ingresar menos de once caracteres en campo celular<numeroTel>
    Then Validar mensaje numero telefono no es valido<mensajeTelefono>

    Examples: 
      | numeroTel    | mensajeTelefono                                               |
      | "1"          | "El n\\u00famero de tel\\u00e9fono debe tener 11 caracteres." |
      | "12"         | "El n\\u00famero de tel\\u00e9fono debe tener 11 caracteres." |
      | "123"        | "El n\\u00famero de tel\\u00e9fono debe tener 11 caracteres." |
      | "1234"       | "El n\\u00famero de tel\\u00e9fono debe tener 11 caracteres." |
      | "12345"      | "El n\\u00famero de tel\\u00e9fono debe tener 11 caracteres." |
      | "123456"     | "El n\\u00famero de tel\\u00e9fono debe tener 11 caracteres." |
      | "1234567"    | "El n\\u00famero de tel\\u00e9fono debe tener 11 caracteres." |
      | "12345678"   | "El n\\u00famero de tel\\u00e9fono debe tener 11 caracteres." |
      | "123456789"  | "El n\\u00famero de tel\\u00e9fono debe tener 11 caracteres." |
      | "1234567890" | "El n\\u00famero de tel\\u00e9fono debe tener 11 caracteres." |

  Scenario: Validar numero de telefono posea formato correcto
    When Ingresar numero telefono valido
    Then Validar que permite ingresar telefono valido
