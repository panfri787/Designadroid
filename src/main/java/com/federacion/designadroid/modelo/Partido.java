package com.federacion.designadroid.modelo;


import java.util.Date;

/**
 * Created by Pablo on 14/10/13.
 */
public class Partido {

    private String equipos;

    private Integer codPartido;

    private Date fechaHora;

    private String campo;

    private String localidad;

    private String categoria;

    private Miembro[] arbitros;

    private Miembro[] ofMesa;

    private Camiseta camisetaLocal;

    private Camiseta camisetaVisitante;

    private Miembro delegado;

    private String telefonoCampo;

    public Partido(String equipos, Integer codPartido, Date fechaHora, String campo, String localidad, String categoria, Miembro[] arbitros, Miembro[] ofMesa, Camiseta camisetaLocal, Camiseta camisetaVisitante, Miembro delegado, String telefonoCampo) {
        this.equipos = equipos;
        this.codPartido = codPartido;
        this.fechaHora = fechaHora;
        this.campo = campo;
        this.localidad = localidad;
        this.categoria = categoria;
        this.arbitros = arbitros;
        this.ofMesa = ofMesa;
        this.camisetaLocal = camisetaLocal;
        this.camisetaVisitante = camisetaVisitante;
        this.delegado = delegado;
        this.telefonoCampo = telefonoCampo;
    }


}
