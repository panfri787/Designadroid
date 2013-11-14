package com.federacion.designadroid.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Pablo on 14/10/13.
 */
public class Designacion {

    private Miembro miembroCTA;

    private GregorianCalendar fechaInicio;

    private GregorianCalendar fechaFin;

    ArrayList<Partido> partidos;

    public Miembro getMiembroCTA() {
        return miembroCTA;
    }

    public void setMiembroCTA(Miembro miembroCTA) {
        this.miembroCTA = miembroCTA;
    }

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public GregorianCalendar getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(GregorianCalendar fechaFin) {
        this.fechaFin = fechaFin;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public Designacion(){
        this.partidos = new ArrayList<Partido>();
    }

    public Designacion(Miembro pmiembroCTA, GregorianCalendar pfechaInicio, GregorianCalendar pfechaFin){
        this.miembroCTA = pmiembroCTA;
        this.fechaInicio=pfechaInicio;
        this.fechaFin=pfechaFin;
        this.partidos = new ArrayList<Partido>();
    }

}
