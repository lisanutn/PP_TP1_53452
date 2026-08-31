import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public class Actividad{
    private int id;    
    private String titulo;
    private int cupoMaximo;
    public static final int CUPO_MINIMO = 1;
    private List<Inscripcion> inscripciones;
//El constructor
    public Actividad(int id, String titulo, int cupoMaximo){
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;
        this.inscripciones = new ArrayList<>(); //inicio de la lista vacia 
    }

//inscripcion de alumnos
    public Inscripcion inscribir(Estudiante estudiante){
        if (this.inscripciones.size() < this.cupoMaximo){   
            Inscripcion nuevaInscripcion = new Inscripcion(LocalDate.now(), "Aceptada", estudiante);
            this.inscripciones.add(nuevaInscripcion);//lo guardamos en  la lista
            return nuevaInscripcion;
        }else {
            System.out.println("No se pudo inscribir a"+ estudiante.getnombre()+ "no hay mas cupos disponibles en" + this.titulo);
            return null;

        }

    }
//mostrar alumnos inscriptos

}// cierre de la llave final de la clase 
