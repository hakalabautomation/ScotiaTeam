@EditNombreDestinatario
Feature: Validar componente nombre destinatario
  Validar componente Repite Clave Mobile en enrrolamiento

  @ReporteEditNombreDestinatario
  Scenario: Validar texto campo nombre destinatario
    Then Validar texto campo nombre destinatario

  Scenario Outline: Permite ingresar carateres alfanumericos
    When Ingresar caracteres alfanumeros en campo nombre destinatario<alfanumerico>
    Then Validar que se ingresaron caracteres en campo nombre destinatario<alfanumerico>

    Examples: 
      | alfanumerico          |
      | "12345abcdáéíóú ABCD" |

  Scenario Outline: Largo minimo de nombre 3 caracteres
    When Ingresar nombre menos de tres caracteres<nombre>
    Then Desplegar mensaje nombre invalido

    Examples: 
      | nombre |
      | "a"    |
      | "ab"   |

  Scenario Outline: No permitir ingreso de mas de 50 caracteres
    When Ingresar nombre mas de cincuenta caracteres<nombre>
    Then No permitir ingreso de mas de cincuenta caracteres en nombre

    #51 caracteres
    Examples: 
      | nombre                                                |
      | "qwertyuiopasdfghjklñzxcvbnmQWERTYUIOPASDFGHJKLÑZXCV" |

  Scenario Outline: Largo maximo de nombre 50 caracteres
    When Ingresar nombre cincuenta caracteres<nombre>
    Then Permitir ingreso de nombre maximo caracteres<nombre>

    #50 caracteres
    Examples: 
      | nombre                                               |
      | "qwertyuiopasdfghjklñzxcvbnmQWERTYUIOPASDFGHJKLÑZXC" |
