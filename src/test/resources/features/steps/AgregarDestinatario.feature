@AgregarDestinatario
Feature: Validacion agregar destinatario y realizar transferecia
  - Agregar destinatario y realizar transferencia mismo banco con scotiapass
  - Agregar destinatario y realizar transferencia mismo banco con KeyPass
  - Agregar destinatario y realizar transferencia distinto banco con scotiapass
  - Agregar destinatario y realizar transferencia distinto banco con KeyPass

@ReporteAgregarDestinatario
  Scenario Outline: Agregar destinatario exitosamente
    Given Estoy previamente enrrolado en Scotiabank Go<login>
    When Click a opcion transferecias
    And Click a boton nuevo destinatario
    And Ingresar datos personales destinatario<nombre><rut><correo>
    And Click a boton continuar
    And Ingresar datos financieros destinatario<banco><tipoCta><nroCta>
    And Click a boton guardar
    And Autorizar con segundo factor<segundoFactor>
    Then Destinatario agregado exitosamente<nombre><banco><nroCta>

    @AgregarDestinatarioMisBancoScotiapass
    Examples: 
      | nombre                       | rut         | correo                 | banco        | tipoCta            | nroCta      | segundoFactor | login    |
      | "Pruebas mismo banco scotia" | "8863518-3" | "testgo@automation.cl" | "SCOTIABANK" | "Cuenta Corriente" | "710432807" | "Scotiapass"  | "123456" |

    @AgregarDestinatarioMisBancoKeyPass
    Examples: 
      | nombre                        | rut         | correo                 | banco        | tipoCta            | nroCta      | segundoFactor | login    |
      | "Pruebas mismo banco KeyPass" | "8863518-3" | "testgo@automation.cl" | "SCOTIABANK" | "Cuenta Corriente" | "710432807" | "KeyPass"     | "123456" |

    @AgregarDestinatarioDisBancoScotiapass
    Examples: 
      | nombre                          | rut          | correo                 | banco       | tipoCta            | nroCta   | segundoFactor | login    |
      | "Pruebas distinto banco scotia" | "11111111-1" | "testgo@automation.cl" | "CONSORCIO" | "Cuenta Corriente" | "123456" | "Scotiapass"  | "123456" |

    @AgregarDestinatarioDisBancoKeyPass
    Examples: 
      | nombre                           | rut          | correo                 | banco       | tipoCta            | nroCta   | segundoFactor | login    |
      | "Pruebas distinto banco KeyPass" | "11111111-1" | "testgo@automation.cl" | "CONSORCIO" | "Cuenta Corriente" | "123456" | "KeyPass"     | "123456" |

  Scenario Outline: Realizar transferencia a nuevo destinatario
    When Escoger nuevo destinatario agregado
    And Ingresar monto a transferir<monto>
    And Click a boton confirmar
    And Autorizar TEF con segundo factor<segundoFactor>
    Then Se realiza TEF correctamente

    @AgregarDestinatarioMisBancoScotiapass
    Examples: 
      | monto | segundoFactor |
      | "1"   | "Scotiapass"  |

    @AgregarDestinatarioMisBancoKeyPass
    Examples: 
      | monto | segundoFactor |
      | "2"   | "KeyPass"     |

    @AgregarDestinatarioDisBancoScotiapass
    Examples: 
      | monto | segundoFactor |
      | "3"   | "Scotiapass"  |

    @AgregarDestinatarioDisBancoKeyPass
    Examples: 
      | monto | segundoFactor |
      | "4"   | "KeyPass"     |
