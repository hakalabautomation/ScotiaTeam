@EditNumeroCtaDestinatario
Feature: Validacion de componente numero de cuenta nuevo destinatario
  Validar componente numero de cuenta nuevo destinatario

  @ReporteEditNumeroCtaDestinatario
  Scenario: Validar texto campo tipo cuenta nuevo destinatario
    Then Validar texto campo numero de cuenta nuevo destinatario

  Scenario Outline: No permitir letras ni caracteres especiales
    When Ingresar en numero cuenta nuevo destinatario letras y caracteres especiales<nro>
    Then No permitir ingresar letras y caracteres especiales en numero cuenta nuevo destinatario

    Examples: 
      | nro      |
      | "aA"     |
      | "aAbB"   |
      | "aAbBcC" |
      | "!#$%&"  |

  Scenario Outline: No permitir ingresar mas de 20 digitos
    When Ingresar mas de veinte digitos en campo numero cuenta nuevo destinatario<nro>
    Then No permitir ingresar mas caracteres en campo numero cuenta nuevo destinatario

    #21 digitos
    Examples: 
      | nro                     |
      | "123456789012345678901" |
