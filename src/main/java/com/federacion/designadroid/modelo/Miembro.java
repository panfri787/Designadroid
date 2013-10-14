package com.federacion.designadroid.modelo;

/**
 * Created by Pablo on 14/10/13.
 */
public class Miembro {

    private String nombre;

    private String telefono;

    private Integer licencia;

    public Miembro(String pnombre, String ptelefono){
        this.nombre = pnombre;
        this.telefono = ptelefono;
    }

    public Miembro(String pnombre, String ptelefono, Integer plicencia){
        this.nombre = pnombre;
        this.telefono = ptelefono;
        this.licencia = plicencia;
    }



}
