@ButtonIngresarLogin
Feature: Validacion de componente Boton ingresar login
  Validar componente boton ingresar login

  @ReporteButtonIngresarLogin
  Scenario Outline: Validar texto boton ingresar login
    Then Validar texto boton ingresar login<texto>

    Examples: 
      | texto      |
      | "INGRESAR" |

  Scenario Outline: Boton debe permanecer inactivo si clave es menor a 6 digitos
    When Ingresar clave menos 6 digitos<clave>
    Then Comprobar que boton ingresar login parmanece inactivo

    Examples: 
      | clave   |
      | ""      |
      | "1"     |
      | "12"    |
      | "123"   |
      | "1234"  |
      | "12345" |

  Scenario Outline: Boton permite continuar si clave es valida
    When Ingresar clave login valida<clave>
    Then Comprobar que boton ingresar login permite continuar

    @SegunClaveWeb
    Examples: 
      | clave    |
      | "123456" |

    @SegunClaveMobile
    Examples: 
      | clave    |
      | "123456" |
