package io.cucumber.skeleton;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SeleccionarDiagnosticoPrevioTest {
    private Paciente paciente;

    @Before
    public void setUp() {
        paciente = new Paciente();
    }

    @Test
    public void testVerDiagnosticosPrevios() {
        // Given un paciente con una historia clinica
        paciente.agregarHistoriaClinica("Diagnóstico previo 1");
        paciente.agregarHistoriaClinica("Diagnóstico previo 2");

        // When el medico selecciona una nueva evolución
        paciente.agregarEvolucion("Nueva evolución");

        // Then el sistema muestra los diagnosticos previos
        assertTrue("Se esperaban diagnósticos previos", !paciente.obtenerHistoriaClinica().isEmpty());
    }

    @Test
    public void testAvisoDeNoDiagnosticosPrevios() {
        // Given un paciente con una historia clinica
        paciente.agregarHistoriaClinica("Diagnóstico previo 1");
        paciente.agregarHistoriaClinica("Diagnóstico previo 2");

        // When el medico selecciona una nueva evolución
        paciente.agregarEvolucion("Nueva evolución");

        // And no se registran diagnosticos previos
        paciente.limpiarHistoriaClinica();

        // Then el sistema muestra un mensaje de advertencia
        assertFalse("No se esperaban diagnósticos previos", !paciente.obtenerHistoriaClinica().isEmpty());
    }
}
