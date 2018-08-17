@ButtonReenviarSms
Feature: Validar componente boton Reenviar SMS nuevo destinatario
  Validar componente boton Reenviar SMS en nuevo destinatario

  @ReporteButtonReenviarSms
  Scenario: Boton permanece inactivo si contador no ha llegado a cero
    Then Boton permanece inactivo si contador no ha llegado a cero

  Scenario: Boton debe reenviar codigo
    Given Tiempo de SMS debe estar en cero
    When Click en boton reenviar codigo
    Then Se debe recibir SMS antes de finalizado el tiempo
