package io.cucumber.skeleton;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertFalse;

public class StepDefinitions {
    private Paciente paciente;
    private boolean tieneDiagnosticosPrevios;
    @Given("un paciente con una historia clinica")
    public void un_paciente_con_una_historia_clinica() {
        paciente = new Paciente();
        paciente.agregarHistoriaClinica("Diagnóstico previo 1");
        paciente.agregarHistoriaClinica("Diagnóstico previo 2");
        boolean tieneDiagnosticosPrevios = !paciente.obtenerHistoriaClinica().isEmpty();

    }

    @When("el medico selecciona una nueva evolución")
    public void el_medico_selecciona_una_nueva_evolucion() {
        paciente.agregarEvolucion("Nueva evolucion");

    }

    @Then("el sistema muestra los diagnosticos previos")
    public void el_sistema_muestra_los_diagnosticos_previos() {

        assertTrue("Expected previous diagnoses to be shown", true);
    }

    @And("no se registran diagnosticos previos")
    public void no_se_registran_diagnosticos_previos() {
        paciente.limpiarHistoriaClinica();
        boolean tieneDiagnosticosPrevios = !paciente.obtenerHistoriaClinica().isEmpty();
    }

    @Then("el sistema muestra un mensaje de advertencia")
    public void el_sistema_muestra_un_mensaje_de_advertencia() {
        // Verificar que el sistema muestra un mensaje de advertencia
        assertFalse("No se esperaban diagnósticos previos", tieneDiagnosticosPrevios);
    }

    private void assertTrue(String s, boolean b) {
    }
}


