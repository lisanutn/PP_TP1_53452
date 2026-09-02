import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("       SISTEMA DE EVENTOS - UTN FRM (EJ. 2)       ");
        System.out.println("==================================================\n");

        // ---------------------------------------------------------------------
        // a. Se construya una lista de estudiantes
        // ---------------------------------------------------------------------
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Lionel Messi", "101010"));
        estudiantes.add(new Estudiante("Emiliano Martinez", "232323"));
        estudiantes.add(new Estudiante("Lionel Scaloni", "181818"));

        System.out.println("[OK] [a] Lista de estudiantes construida.");
        System.out.println();

        // ---------------------------------------------------------------------
        // b. Se construyan eventos
        // ---------------------------------------------------------------------
        EventoUniversitario congresoIA = new EventoUniversitario("EVT-IA", "Congreso de Inteligencia Artificial", 3000.0, false);
        EventoUniversitario jornadasJava = new EventoUniversitario("EVT-JV", "Jornadas de Introduccion a Java", 0.0, true);

        System.out.println("[OK] [b] Eventos universitarios instanciados.");
        System.out.println();

        // ---------------------------------------------------------------------
        // c. Se asigne una sala a cada evento
        // ---------------------------------------------------------------------
        // El constructor de tu clase Sala recibe (int id, String nombre)
        Sala aulaMagna = new Sala(101, "Aula Magna UTN");
        Sala labSistemas = new Sala(102, "Laboratorio de Sistemas 3");

        congresoIA.asignarSala(aulaMagna);
        jornadasJava.asignarSala(labSistemas);

        System.out.println("[OK] [c] Salas asignadas correctamente a cada evento.");
        System.out.println();

        // ---------------------------------------------------------------------
        // d. Se creen actividades propias de cada evento (Composicion)
        // ---------------------------------------------------------------------
        // El constructor de tu clase Actividad recibe (int id, String titulo, int cupoMaximo)
        congresoIA.crearActividad(501, "Taller de Redes Neuronales", 2); 
        jornadasJava.crearActividad(601, "Practica de Programacion Orientada a Objetos", 20);

        System.out.println("[OK] [d] Actividades creadas de forma interna.");
        System.out.println();

        // ---------------------------------------------------------------------
        // e. Se inscriban estudiantes en cada actividad
        // ---------------------------------------------------------------------
        System.out.println("[e] Procesando inscripciones:");
        
        // Obtenemos la primera actividad del congreso (indice 0) e inscribimos alumnos
        congresoIA.getActividades().get(0).inscribir(estudiantes.get(0)); // Lionel Messi (Aceptada)
        congresoIA.getActividades().get(0).inscribir(estudiantes.get(1)); // Emiliano Martinez (Aceptada)
        
        // Intento de inscripcion superando el cupo limite (Deberia rechazar)
        System.out.println("   * Intento de inscripcion excediendo el limite:");
        congresoIA.getActividades().get(0).inscribir(estudiantes.get(2)); // Lionel Scaloni
        
        // Inscripcion en las jornadas de Java
        jornadasJava.getActividades().get(0).inscribir(estudiantes.get(0)); // Lionel Messi
        System.out.println();

        // ---------------------------------------------------------------------
        // f. Se muestre el resumen de datos por cada evento creado
        // ---------------------------------------------------------------------
        System.out.println("[f] Mostrando resumen de datos de los eventos:");
        congresoIA.mostrarDatos();
        jornadasJava.mostrarDatos();
        System.out.println();

        // ---------------------------------------------------------------------
        // g. Se muestre el total de eventos creados
        // ---------------------------------------------------------------------
        System.out.println("[g] Informacion global del sistema:");
        System.out.println("Total de eventos universitarios creados: " + EventoUniversitario.getCantidadEventos());
        System.out.println("==================================================");
    }
}