@TransferenciaTerceros
Feature: Validacion transferencia a terceros
  - Transferencia a terceros mismo banco con scotiapass
  - Transferencia a terceros mismo banco con KeyPass
  - Transferencia a terceros distinto banco con scotiapass
  - Transferencia a terceros distinto banco con KeyPass

 Scenario Outline: Realizar transferencia a terceros
    Given Estoy enrrolado en Scotiabank Go<login>
    When Click a la opcion transferecias
    And Click a boton nuevo destinatario
    And Ingresar datos personales destinatario<nombre><rut><correo>
    And Click a boton continuar
    And Ingresar datos financieros destinatario<banco><tipoCta><nroCta>
    And Click a boton guardar
    And Autorizar con segundo factor<segundoFactor>
    Then Destinatario agregado exitosamente<nombre><banco><nroCta>

    #@AgregarDestinatarioMisBancoScotiapass
    Examples: 
      | nombre                       | rut         | correo                 | banco        | tipoCta            | nroCta      | segundoFactor | login    |
      | "Pruebas mismo banco scotia" | "8863518-3" | "testgo@automation.cl" | "SCOTIABANK" | "Cuenta Corriente" | "710432807" | "Scotiapass"  | "123456" |