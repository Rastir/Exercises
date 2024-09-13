package dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PersoAquaDTO {
    
    private String name;
    private String lastName;
    private String email;
    private int noVisit;
    private int age;
    private String lastVisit;
    private String alimentosYBebidas;
    private String experience;
    private String butler;
    private String preferencias;
    private String alergias;
    private String notas;
    private String perks;
    

    public PersoAquaDTO() {
    }

    public PersoAquaDTO(String name, String lastName, String email, int noVisit, int age, String lastVisit, String alimentosYBebidas, String experience, String butler, String preferencias, String alergias, String notas, String perks) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.noVisit = noVisit;
        this.age = age;
        this.lastVisit = lastVisit;
        this.alimentosYBebidas = alimentosYBebidas;
        this.experience = experience;
        this.butler = butler;
        this.preferencias = preferencias;
        this.alergias = alergias;
        this.notas = notas;
        this.perks = perks;
    }

}
