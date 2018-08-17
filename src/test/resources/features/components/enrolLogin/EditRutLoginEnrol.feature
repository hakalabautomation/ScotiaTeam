@EditRutLoginEnrol
Feature: Validacion de componente Rut Login Enroll
  Validar componente Rut login enrrolamiento

@ReporteEditRutLoginEnrol
  Scenario: Validar texto campo rut
    Then Validar texto campo Rut

  Scenario Outline: Validar mensaje rut incorrecto
    When Ingresar rut invalido<rut>
    Then Desplegar mensaje rut invalido

    Examples: 
      | rut         |
      | "1"         |
      | "12"        | 
      | "123"       | 
      | "1234"      | 
      | "12345"     | 
      | "123456"    | 
      | "1234567"   | 
      | "12345678"  |
      | "123456789" |

  Scenario Outline: Validar largo maximo rut
    When Ingresar mas caracteres del maximo permitido<largoPermitido>
    Then No permitir ingresar mas caracteres

    Examples: 
      | largoPermitido |
      | "12"           |

  Scenario Outline: No permitir en rut letras ni caracteres especiales
    When Ingresar en rut letras y caracteres especiales<rut>
    Then No permitir ingresar letras y caracteres especiales

    Examples: 
      | rut      |
      | "aA"     |
      | "aAbB"   |
      | "aAbBcC" |
      | "!#$%&"  |

  Scenario Outline: Solo permitir una letra K en rut
    When Ingresar en rut mas de una letra k<rut>
    Then No permitir ingresar mas de una letra k

    Examples: 
      | rut  |
      | "kk" |
      | "KK" |
      | "kK" |

  Scenario Outline: Validar que rut se formatea correctamente
    When Ingresar rut valido<rut>
    Then Comprobar formato correcto de rut<rut>

    Examples: 
      | rut         |
      | "5111860-k" |
