package com.aldoSanchez.envios.service;

import com.aldoSanchez.envios.model.Destinatario;
import com.aldoSanchez.envios.model.Envio;
import com.aldoSanchez.envios.repository.IEnvioRepository;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EnvioService implements IEnvioService{
    
    @Autowired
    private IEnvioRepository envioRepo;
    
    @Autowired
    private RestTemplate apiConsumir;

    @Override
    public List<Envio> getEnvios() {
        return envioRepo.findAll();
    }

    @Override
    public void saveEnvio(LocalDate fecha_creacion, String status, String descripcion, String dniDestinatario) {
        
        
        //Buscar el destinatario en la api destinatario
        Destinatario des = apiConsumir.getForObject("http://localhost:9001/destinatarios/traerdni/" + dniDestinatario, Destinatario.class);
        String nombreCompletoDestinatario = des.getNombre() + " " + des.getApellido();
        
        Envio envio = new Envio();
        envio.setFecha_creacion(fecha_creacion);
        envio.setStatus(status);
        envio.setDescripcion(descripcion);
        envio.setNombreCompletoDestinatario(nombreCompletoDestinatario);
        
        envioRepo.save(envio);
    }

    @Override
    public void deleteEnvio(Long id) {
        envioRepo.deleteById(id);
    }

    @Override
    public Envio findEnvio(Long id) {
        return envioRepo.findById(id).orElse(null);
    }

    @Override
    public void editEnvio(Long id, Envio envio) {
    
        Envio env = this.findEnvio(id);
        
        env.setFecha_creacion(envio.getFecha_creacion());
        env.setStatus(envio.getStatus());
        env.setDescripcion(envio.getDescripcion());
        env.setNombreCompletoDestinatario(envio.getNombreCompletoDestinatario());
        
        envioRepo.save(env);
    }
    
    
    
}
