package io.cucumber.skeleton;

import java.util.Date;

public class Evolucion {
    private String descripcion;
    private Date fecha;

    public Evolucion(String descripcion, Date fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }
}
