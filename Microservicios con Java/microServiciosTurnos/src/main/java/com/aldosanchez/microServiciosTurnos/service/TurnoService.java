package com.aldosanchez.microServiciosTurnos.service;
import com.aldosanchez.microServiciosTurnos.model.Paciente;
import com.aldosanchez.microServiciosTurnos.model.Turno;
import com.aldosanchez.microServiciosTurnos.repository.ITurnoRepository;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TurnoService implements ITurnoService{
    
    @Autowired
    private ITurnoRepository turnoRepo;
    
    @Autowired
    private RestTemplate apiConsumir;

    @Override
    public List<Turno> getTurnos() {
        return turnoRepo.findAll();
    }

    @Override
    public void saveTurno(LocalDate fecha, String tratamiento, String dniPaciente) {
    
        //buscar el paciente en la api
        //Paciente pac = //buscar en la api
        Paciente pac = apiConsumir.getForObject("http://localhost:9001/pacientes/traerdni/"+dniPaciente, Paciente.class);
        
        //String nombreCompletoPaciente = //lo que consumo de nombre de la api;
        String nombreCompletoPaciente = pac.getNombre()+ "" + pac.getApellido();
        
        
        Turno turno = new Turno();
        turno.setFecha(fecha);
        turno.setTratamiento(tratamiento);
        turno.setNombreCompletoPaciente(nombreCompletoPaciente);
        
        turnoRepo.save(turno);
    }

    @Override
    public void deleteTurno(Long id) {
        turnoRepo.deleteById(id);
    }

    @Override
    public Turno findTurno(Long id) {
        return turnoRepo.findById(id).orElse(null);
    }

    @Override
    public void editTurno(Long id, Turno turno) {
        Turno turn = this.findTurno(id);
        
        turn.setFecha(turno.getFecha());
        turn.setTratamiento(turno.getTratamiento());
        turn.setNombreCompletoPaciente(turno.getNombreCompletoPaciente());
        
        turnoRepo.save(turn);
    }
    
}