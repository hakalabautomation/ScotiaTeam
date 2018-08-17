@EditSms
Feature: Validar componente editar Codigo SMS en nuevo destinatario
  Validar componente editar Codigo SMS en nuevo destinatario

  @ReporteEditSms
  Scenario Outline: Permitir solo ingreso de numeros
    When Ingresar letras y caracteres especiales en campo codigo SMS nuevo destinatario<letras>
    Then No permite ingresar letras ni caracteres especiales en campo codigo SMS nuevo destinatario

    Examples: 
      | letras   |
      | "a"      |
      | "aA"     |
      | "aAb"    |
      | "aAbB"   |
      | "#$%&/(" |

  Scenario Outline: No permitir ingresar mas de 6 digitos
    When Ingresar mas de seis digitos en campo codigo SMS nuevo destinatario<numero>
    Then No permitir ingresar mas de seis digitos en campo codigo SMS nuevo destinatario

    Examples: 
      | numero    |
      | "1234567" |
