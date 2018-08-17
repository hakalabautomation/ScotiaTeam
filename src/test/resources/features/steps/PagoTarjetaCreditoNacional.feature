#Observación: eliminar "Disponible línea de crédito".
#Como cliente Scotiabank Go con tarjeta de crédito nacional facturada
#Quiero tener la opción de pagarla
#Para estar al dia con mis pagos.
#- Solo se puede efectuar el pago con cuenta corriente / cuenta vista.
@PagoTarjetaCreditoNacional
Feature: Pago de tarjeta de credito
  Como cliente Scotiabank Go con tarjeta de credito nacional facturada 
  Quiero tener la opción de pagarla 
  Para estar al dia con mis pagos.

  @ReportePagoTarjetaCreditoNacional
  Scenario Outline: Realizar pago tarjeta de credito nacional
    Given Estoy previamente enrrolado en Scotiabank Go<login>
    When Click a opcion transferecias
    And Selecciona tarjeta de credito con deuda a pagar
    And Click a opcion pagar tarjeta de credito
    And Selecciona cuenta a cual se realizara el cobro
    And Ingreso forma de pago y monto a pagar<tipoPago><monto>
    And Confirma monto y autoriza pago
    Then Se debe desplegar comprobante de pago con monto ingresado

    @PagoTotalFacturado
    Examples: 
      | login    | tipoPago             | monto |
      | "123456" | "PagoTotalFacturado" | ""    |

    @PagoMinimoFacturado
    Examples: 
      | login    | tipoPago              | monto |
      | "123456" | "PagoMinimoFacturado" | ""    |

    @PagoOtroFacturado
    Examples: 
      | login    | tipoPago            | monto |
      | "123456" | "PagoOtroFacturado" | "10"  |
