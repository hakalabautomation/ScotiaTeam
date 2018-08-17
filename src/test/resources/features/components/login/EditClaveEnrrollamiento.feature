@EditClaveEnrrollamiento
Feature: Validar componente campo clave segun enrrolamiento
  Validar componente campo clave segun enrrolamiento

  @ReporteEditClaveEnrrollamiento
  Scenario Outline: Validar texto campo clave segun enrrolamiento
    Then Validar texto campo clave segun enrrolamiento<texto>

    @SegunClaveWeb
    Examples: 
      | texto               |
      | "Clave de internet" |

    @SegunClaveMobile
    Examples: 
      | texto          |
      | "Clave mobile" |

  Scenario: Visualizar boton ver clave
    Then Comprobar que boton ver clave se visualiza

  Scenario Outline: Permitir ingreso caracteres alfanumericos
    When Ingresar caracteres alfanumericos en clave login<letras>
    Then Permite ingresar caracteres alfanumericos en clave login<letras>

    Examples: 
      | letras   |
      | "a"      |
      | "aA"     |
      | "aAb"    |
      | "aAbB"   |
      | "#$%&/(" |

  Scenario Outline: No permitir mas de 16 caracteres
    When Ingresar mas de 16 caracteres en campo clave login<clave>
    Then No permitir el ingreso en campo clave login

    Examples: 
      | clave               |
      | "12345678901234567" |

  Scenario Outline: Permitir maximo 16 caracteres
    When Ingresar 16 caracteres en campo clave login<clave>
    Then Permitir el ingreso en campo clave login<clave>

    Examples: 
      | clave              |
      | "1234567890123456" |
