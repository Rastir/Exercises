package logica;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import logica.Horario;
import logica.Turno;
import logica.Usuario;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-05-17T21:55:39")
@StaticMetamodel(Odontologo.class)
public class Odontologo_ extends Persona_ {

    public static volatile SingularAttribute<Odontologo, Usuario> unUsuario;
    public static volatile SingularAttribute<Odontologo, String> especialidad;
    public static volatile ListAttribute<Odontologo, Turno> unTurno;
    public static volatile SingularAttribute<Odontologo, Horario> unHorario;

}