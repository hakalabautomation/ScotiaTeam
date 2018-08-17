@EditScotiapass
Feature: Validar componente clave scotiapass nuevo destinatario
  Validar componente clave scotiapass en nuevo destinatario

  @ReporteEditScotiapass
  Scenario: Validar texto campo clave scotiapass nuevo destinatario
    Then Validar texto campo clave scotiapass nuevo destinatario

  Scenario: Visualizar boton ver clave
    Then Comprobar que boton ver clave se visualiza

  Scenario Outline: Permitir solo ingreso de numeros
    When Ingresar letras y caracteres especiales en campo clave scotiapass nuevo destinatario<letras>
    Then No permite ingresar letras ni caracteres especiales en campo clave scotiapass nuevo destinatario

    Examples: 
      | letras   |
      | "a"      |
      | "aA"     |
      | "aAb"    |
      | "aAbB"   |
      | "#$%&/(" |

  Scenario Outline: No permitir ingreso de mas de 8 digitos
    When Ingresar mas de ocho digitos en campo scotiapass nuevo destinatario<digitos>
    Then No permite ingresar mas digitos en campo scotiapass nuevo destinatario

    Examples: 
      | digitos     |
      | "123456789" |
