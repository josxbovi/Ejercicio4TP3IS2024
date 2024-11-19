package io.cucumber.skeleton;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Paciente {
    private List<String> historiaClinica;
    private List<Evolucion> evoluciones;

    public Paciente() {
        historiaClinica = new ArrayList<>();
        evoluciones = new ArrayList<>();
    }

    public void agregarHistoriaClinica(String diagnostico) {
        historiaClinica.add(diagnostico);
    }

    public List<String> obtenerHistoriaClinica() {
        return historiaClinica;
    }

    public void limpiarHistoriaClinica() {
        historiaClinica.clear();
    }

    public void agregarEvolucion(String descripcion) {
        evoluciones.add(new Evolucion(descripcion, new Date()));
    }

    public List<Evolucion> obtenerEvoluciones() {
        return evoluciones;
    }
}
