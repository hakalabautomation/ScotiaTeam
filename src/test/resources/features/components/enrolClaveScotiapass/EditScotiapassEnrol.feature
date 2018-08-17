@EditScotiapassEnrol
Feature: Validar componente clave scotiapass Enroll
  Validar componente clave scotiapass en enrrolamiento

@ReporteEditScotiapassEnrol
  Scenario Outline: Validar texto campo clave scotiapass
    Then Validar texto campo clave scotiapass<texto>

    Examples: 
      | texto              |
      | "Clave Scotiapass" |

  Scenario: Visualizar boton ver clave
    Then Comprobar que boton ver clave se visualiza

  Scenario Outline: Permitir solo ingreso de numeros
    When Ingresar letras y caracteres especiales en campo clave scotiapass<letras>
    Then No permite ingresar letras ni caracteres especiales en campo clave scotiapass

    Examples: 
      | letras   |
      | "a"      |
      | "aA"     |
      | "aAb"    |
      | "aAbB"   |
      | "#$%&/(" |

  Scenario Outline: No permitir ingreso de mas de 8 digitos
    When Ingresar mas de ocho digitos<digitos>
    Then No permite ingresar mas digitos en campo scotiapass

    Examples: 
      | digitos     |
      | "123456789" |

  Scenario Outline: Ingresar clave scotiapass valida
    When Ingresar clave scotiapass valida<scotiapass>
    Then Permite ingresar scotiapass valido<scotiapass>

    Examples: 
      | scotiapass |
      | "12345678" |
