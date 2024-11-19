Feature: Seleccionar Diagnostico Previo

Como Médico 
Quiero elegir un diagnóstico previo 
Para escribir una nueva evolución

Scenario: Ver diagnósticos previos

    Given un paciente con una historia clinica
    When el medico selecciona una nueva evolución
    Then el sistema muestra los diagnosticos previos


Scenario: Aviso de no diagnosticos previos

    Given un paciente con una historia clinica
    When el medico selecciona una nueva evolución
    And no se registran diagnosticos previos
    Then el sistema muestra un mensaje de advertencia



