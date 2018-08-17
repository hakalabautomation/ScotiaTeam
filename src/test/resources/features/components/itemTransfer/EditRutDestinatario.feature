@EditRutDestinatario
Feature: Validacion de componente rut nuevo destinatario
  Validar componente rut nuevo destinatario

  @ReporteEditRutDestinatario
  Scenario: Validar texto campo rut
    Then Validar texto campo Rut nuevo destinatario

  Scenario Outline: Validar mensaje rut incorrecto
    When Ingresar rut nuevo destinatario invalido<rut>
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

  Scenario Outline: Validar largo maximo de 12 rut
    When Ingresar mas caracteres del maximo permitido en rut nuevo destinatario<rut>
    Then No permitir ingresar mas caracteres en rut nuevo destinatario

    #13 digitos
    Examples: 
      | rut             |
      | "1234567891234" |

  Scenario Outline: No permitir en rut letras ni caracteres especiales
    When Ingresar en rut nuevo destinatario letras y caracteres especiales<rut>
    Then No permitir ingresar letras y caracteres especiales en rut nuevo destinatario

    Examples: 
      | rut      |
      | "aA"     |
      | "aAbB"   |
      | "aAbBcC" |
      | "!#$%&"  |

  Scenario Outline: Solo permitir una letra K en rut
    When Ingresar en rut nuevo destinatariomas de una letra k<rut>
    Then No permitir ingresar mas de una letra k en rut nuevo destinatario

    Examples: 
      | rut  |
      | "kk" |
      | "KK" |
      | "kK" |

  Scenario Outline: Validar que rut se formatea correctamente
    When Ingresar rut nuevo destinatario valido<rut>
    Then Comprobar formato correcto de rut nuevo destinatario<rut>

    Examples: 
      | rut         |
      | "5111860-k" |
