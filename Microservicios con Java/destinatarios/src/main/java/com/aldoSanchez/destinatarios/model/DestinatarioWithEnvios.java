package com.aldoSanchez.destinatarios.model;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DestinatarioWithEnvios {

    private Destinatario destinatario;
    private List<Envio> envios;

    public DestinatarioWithEnvios(Destinatario destinatario, List<Envio> envios) {
        this.destinatario = destinatario;
        this.envios = envios;
    }

}
