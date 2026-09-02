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
        this.inscripciones.add(nuevaInscripcion);
        
        // Agregamos esta linea para documentar la inscripcion exitosa
        System.out.println("Inscripcion aceptada para " + estudiante.getNombre() + " en " + this.titulo);
        
        return nuevaInscripcion;
    } else {
        // Corregimos tambien los espacios en blanco que faltaban
        System.out.println("No se pudo inscribir a " + estudiante.getNombre() + ", no hay mas cupos disponibles en " + this.titulo);
        return null;
    }
}
//mostrar alumnos inscriptos
    public void mostrarInscripciones(){
        System.out.println("Alumnos inscriptos en "+ this.titulo + ":");
        
        if (this.inscripciones.isEmpty()){
            System.out.println("No hay alumnos inscriptos en esta actividad.");
        } else {
            for (Inscripcion ins : this.inscripciones) {
                System.out.println(ins.getestudiante().getLegajo()+ ins.getestudiante().getNombre());
            } 
        }
        
        
    }
}// cierre de la llave final de la clase 
