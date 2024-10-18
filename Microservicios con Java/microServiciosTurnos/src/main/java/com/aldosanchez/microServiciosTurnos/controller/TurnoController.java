package com.aldosanchez.microServiciosTurnos.controller;
import com.aldosanchez.microServiciosTurnos.dto.TurnoDTO;
import com.aldosanchez.microServiciosTurnos.model.Turno;
import com.aldosanchez.microServiciosTurnos.service.ITurnoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/turnos")
public class TurnoController {
    
    @Autowired
    private ITurnoService turnoServ;
    
    @PostMapping("/crear")
    public String crearTurno(@RequestBody TurnoDTO turno){
        
        turnoServ.saveTurno(turno.getFecha(), turno.getTratamiento(), turno.getDniPaciente());
        
        return "Turno creado correctamente";
    }
    
    @GetMapping("/traer")
    public List<Turno> traerTurnos(){
        return turnoServ.getTurnos();
    }
    
    @DeleteMapping("borrar/{id}")
    public String deleteTurno(@PathVariable Long id){
        turnoServ.deleteTurno(id);
        
        return "Turno borrado correctamente";
    }
    
    @PutMapping("/editar/{id_original}")
    public Turno editTurno (@PathVariable Long id_original,
                                 @RequestBody Turno turnoEditar) {
      
       turnoServ.editTurno(id_original, turnoEditar);
       Turno turnoEditado = turnoServ.findTurno(id_original);
       
       return turnoEditado;

    }
    
    @PutMapping("/traer/{id}")
    public Turno traerTurno(@PathVariable Long id){
        return turnoServ.findTurno(id);
    }
 
}