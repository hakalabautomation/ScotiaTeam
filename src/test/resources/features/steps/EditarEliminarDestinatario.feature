@EditarEliminarDestinatario
Feature: Flujo para midificar y eliminar un destinatario
  Se realiza flujo de modificacion y eliminacion de destinatario

  @ReporteEditarEliminarDestinatario
  Scenario: Editar destinatario
    Then Escoger un destinatario activo del listado de destinatarios
    And Escoger opcion de editar destinatario
    When Se compueba ante el core que destinatario fue editado exitosamente

  Scenario: Eliminar destinatario
    Then Escoger un destinatario activo del listado de destinatarios
    And Escoger opcion de eliminar destinatario
    When Se compueba ante el core que destinatario fue eliminado exitosamente
