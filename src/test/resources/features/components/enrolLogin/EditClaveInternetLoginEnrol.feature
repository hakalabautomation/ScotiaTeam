@EditClaveInternetLoginEnrol
Feature: Validacion de componente Clave de internet
  Validar componete Clave de internet Login enrrolamiento

@ReporteEditClaveInternetLoginEnrol
  Scenario Outline: Validar texto campo clave internet
    Then Validar texto campo clave internet<textoCampo>

    Examples: 
      | textoCampo          |
      | "Clave de internet" |

  Scenario: Visualizar boton ver clave
    Then Comprobar que boton ver clave se visualiza

  Scenario Outline: Validar maximo de caracteres en campo clave internet
    When Ingresar caracteres en campo clave internet<claveWeb>
    Then Comprobar que no se ingresan mas de los caracteres permitidos

    Examples: 
      | claveWeb            |
      | "123456789abcdefg"  |
      | "123456789abcdefgh" |
