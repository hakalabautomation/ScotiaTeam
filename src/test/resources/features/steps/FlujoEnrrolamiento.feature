@FlujoEnrrolamiento
Feature: Validacion flujo enrrolamiento
  Se procedera a validar flujo de enrrolamiento.
  	- Enrrolamiento clave web y scotiapass
  	- Enrrolamiento clave web y KeyPass
  	- Enrrolamiento clave mobile y scotiapass
  	- Enrrolamiento clave mobile y KeyPass

  @ReporteFlujoEnrrolamiento
  Scenario Outline: Realizar flujo de enrrolamiento
    When Ingresar rut y clave web de cliente<rut><clave>
    And Click boton ingresar login
    And Ingresar numero celular valido<celular><permitirSMS>
    And Ingresar codigo de validacion de SMS<SMS><permitirSMS>
    And Click boton validar SMS<permitirSMS>
    And Seleccionar clave de login<tipoClave><clave>
    And Click boton seleccionar clave
    And Realizar validacion de seguridad<factorAuth><scotiapass>
    Then Se realiza enrrolamiento correctamente

    @EnrolClaveWebScotiapass
    Examples: 
      | rut         | clave    | SMS      | tipoClave | factorAuth   | permitirSMS | scotiapass | celular       |
      | "14143429-2" | "123456" | "123456" | "WEB"     | "SCOTIAPASS" | "N"         | "12345678" | "56940854467" |

    @EnrolClaveWebKeyPass
    Examples: 
      | rut         | clave    | SMS      | tipoClave | factorAuth | permitirSMS | scotiapass | celular       |
      | "5111860-k" | "123456" | "123456" | "WEB"     | "KEYPASS"  | "N"         | ""         | "56940854467" |

    @EnrolClaveMobileScotiapass
    Examples: 
      | rut         | clave    | SMS      | tipoClave | factorAuth   | permitirSMS | scotiapass | celular       |
      | "5111860-k" | "123456" | "123456" | "MOBILE"  | "SCOTIAPASS" | "N"         | "12345678" | "56940854467" |

    @EnrolClaveMobileKeyPass
    Examples: 
      | rut         | clave    | SMS      | tipoClave | factorAuth | permitirSMS | scotiapass | celular       |
      | "5111860-k" | "123456" | "123456" | "MOBILE"  | "KEYPASS"  | "N"         | ""         | "56940854467" |

    @EnrolClaveWebScotiapassSMSAuto
    Examples: 
      | rut         | clave    | SMS      | tipoClave | factorAuth   | permitirSMS | scotiapass | celular       |
      | "5111860-k" | "123456" | "123456" | "WEB"     | "SCOTIAPASS" | "S"         | "12345678" | "56940854467" |
