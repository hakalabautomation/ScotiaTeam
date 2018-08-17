@ButtonIngresarLoginEnrol
Feature: Validacion de componente Boton Ingresar Login Enroll
  Validar componente boton ingresar login enrrolamiento

@ReporteButtonIngresarLoginEnrol
  Scenario: Validar que boton ingresar login enroll se visualiza
    Then Validar que boton ingresar login enroll se visualiza

  Scenario Outline: Boton no se habilita si clave web es menor a seis caracteres
    When Ingresar rut valido y clave web menor a seis caracteres<rut><claveWeb>
    Then Validar que boton no se habilita

    Examples: 
      | rut         | claveWeb |
      | "111111111" | ""       |
      | "111111111" | "1"      |
      | "111111111" | "12"     |
      | "111111111" | "123"    |
      | "111111111" | "1234"   |
      | "111111111" | "12345"  |

  Scenario Outline: Boton no se habilita si rut es invalido
    When Ingresar rut invalido y clave web correcta<rut><claveWeb>
    Then Validar que boton no se habilita

    Examples: 
      | rut         | claveWeb |
      | "1"         | "123456" |
      | "12"        | "123456" |
      | "123"       | "123456" |
      | "1234"      | "123456" |
      | "12345"     | "123456" |
      | "123456"    | "123456" |
      | "1234567"   | "123456" |
      | "12345678"  | "123456" |
      | "123456789" | "123456" |

  Scenario Outline: Boton permite continuar si datos son validos
    When Ingresar rut valido y clave web correcta<rut><claveWeb>
    Then Permite continuar enrrolamiento

    Examples: 
      | rut         | claveWeb |
      | "9507539-8" | "123456" |
