package com.aldoSanchez.destinatarios.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Envio {

    private Long id;
    private String numeroGuia;
    private String descripcion;
    private String estado;
    private Long destinatarioId;

    public Envio() {
    }

    public Envio(Long id, String numeroGuia, String descripcion, String estado, Long destinatarioId) {
        this.id = id;
        this.numeroGuia = numeroGuia;
        this.descripcion = descripcion;
        this.estado = estado;
        this.destinatarioId = destinatarioId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getDestinatarioId() {
        return destinatarioId;
    }

    public void setDestinatarioId(Long destinatarioId) {
        this.destinatarioId = destinatarioId;
    }

}
