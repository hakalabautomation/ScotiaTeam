@TransferenciaEntreProductos
Feature: Validacion transferencias entre productos
	-Transferencia de cuenta corriente a tarjeta de crédito

@ReporteTransferenciaEntreProductos
 Scenario Outline: Realizar transferencia entre productos
    Given Estoy previamente enrrolado en Scotiabank Go<login>
    When Click a opcion transferecias
    And Click a opcion entre productos<cuenta>
    And Selecciono mi cuenta destino<cuentaTransfer>
    And Ingresar el monto<monto>
    And Click a boton Transferir
    And Click en Confirmar
    Then Se genera el comprobante exitosamente
     
    @TransferProduct
    Examples:
		| login   | monto | cuenta                | cuentaTransfer        |
		| "123456"| "1"   | "Cuenta Vista"        | "Cuenta Corriente"    |
		
		@TransferProductCtaCorrienteAVista
    Examples:
		| login   | monto | cuenta                | cuentaTransfer        |
		| "123456"| "1"   | "Cuenta Corriente"    | "Cuenta Vista"        |
		
		@TransferProductCtaVistaACRD
    Examples:
		| login   | monto | cuenta                | cuentaTransfer        |
		| "123456"| "1"   | "Cuenta Vista"        | "Cuenta Renta Diaria" |
		
		@TransferProductCtaCteACRD
    Examples:
		| login   | monto | cuenta                | cuentaTransfer        |
		| "123456"| "1"   | "Cuenta Corriente"    | "Cuenta Renta Diaria" |
		
		@TransferProductCRDACte
    Examples:
		| login   | monto | cuenta                | cuentaTransfer        |
		| "123456"| "1"   | "Cuenta Renta Diaria" | "Cuenta Corriente"    |
		
		@TransferProductCRDACtaVista
    Examples:
		| login   | monto | cuenta                | cuentaTransfer        |
		| "123456"| "1"   | "Cuenta Renta Diaria" | "Cuenta Vista"        |