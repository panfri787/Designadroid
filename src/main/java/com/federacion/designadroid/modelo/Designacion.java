package com.federacion.designadroid.modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Pablo on 14/10/13.
 */
public class Designacion {

    private Miembro miembroCTA;

    private Date fechaInicio;

    private Date fechaFin;

    ArrayList<Partido> partidos;

    public Designacion(Miembro pmiembroCTA, Date pfechaInicio, Date pfechaFin){
        this.miembroCTA = pmiembroCTA;
        this.fechaInicio=pfechaInicio;
        this.fechaFin=pfechaFin;
        this.partidos = new ArrayList<Partido>();
    }

}
