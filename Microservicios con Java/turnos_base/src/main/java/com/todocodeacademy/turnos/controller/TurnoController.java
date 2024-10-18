package com.todocodeacademy.turnos.controller;
import com.todocodeacademy.turnos.dto.TurnoDTO;
import com.todocodeacademy.turnos.model.Turno;
import com.todocodeacademy.turnos.service.ITurnoService;
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
@RequestMapping ("/turnos")
public class TurnoController {
    
     @Autowired
    private ITurnoService turnoServ;
    
     //1- crear un nuevo turno
     @PostMapping ("/crear")
     public String crearTurno ( @RequestBody TurnoDTO turno) {
         turnoServ.saveTurno(turno.getFecha(), turno.getTratamiento(), turno.getDniPaciente());
     
         return "Turno creado correctamente";
     }
          
        //2- obtener todos los turnos
    @GetMapping ("/traer")
    public List<Turno> traerTurnos () {
        return turnoServ.getTurnos();
    }
    
    //3- Eliminar un turno
    @DeleteMapping("/borrar/{id}")
    public String deleteTurno(@PathVariable Long id) {
        turnoServ.deleteTurno(id);
        
        return "El Turno fue eliminado correctamente";
    }
   
    //4 - Editar Turno
    @PutMapping ("/editar/{id_original}")
    public Turno editTurno (@PathVariable Long id_original,
                                 @RequestBody Turno turnoEditar) {
      
       turnoServ.editTurno(id_original, turnoEditar);
       Turno turnoEditado = turnoServ.findTurno(id_original);
       
       return turnoEditado;

    }
    
    //5- obtener un turno en particular
    @GetMapping ("/traer/{id}")
    public Turno traerTurno (@PathVariable Long id) {
        return turnoServ.findTurno(id);
    }
    
    
}
