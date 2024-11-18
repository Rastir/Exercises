package com.aldoSanchez.destinatarios.repository;

import com.aldoSanchez.destinatarios.model.Envio;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "envio-service")
public interface EnvioClient {

    @GetMapping("/envios/destinatario/{id}")
    List<Envio> getEnviosByDestinatarioId(@PathVariable("id") Long id);
}
