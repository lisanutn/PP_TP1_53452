import java.util.List;
import java.util.ArrayList;

public class EventoUniversitario {
    // Atributo estático para el conteo global
    private static int cantidadEventos = 0;


    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    
    
    private Sala sala;                    
    private List<Actividad> actividades;     

    // Constructor principal
    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.gratuito = gratuito;
        this.costoBase = gratuito ? 0.0 : costoBase;
        this.actividades = new ArrayList<>(); // Inicializamos la lista vacía para la composición
        cantidadEventos++;
    }

    // Constructor de copia
    public EventoUniversitario(EventoUniversitario otro) {
        this(otro.id + "-COPIA", otro.titulo, otro.costoBase, otro.gratuito);
    }

    // Calcular costo estimado del evento
    public double calcularCostoEstimado() {
        if (this.gratuito) {
            return 0.0;
        } else {
            return this.costoBase * 1.21; // Aplica el 21% de IVA
        }
    }

    // c. Asignar sala al evento (Agregación)
    public void asignarSala(Sala sala) {
        this.sala = sala;
    }

    // d. Crear actividades propias del evento (Composición)
    public void crearActividad(int id, String titulo, int cupo) {
        Actividad nuevaActividad = new Actividad(id, titulo, cupo);
        this.actividades.add(nuevaActividad);
    }

    // Getter para acceder a las actividades desde la clase App
    public List<Actividad> getActividades() {
        return this.actividades;
    }

    // Getter estático para consultar la cantidad total de eventos
    public static int getCantidadEventos() {
        return cantidadEventos;
    }

    // f. Mostrar el resumen de datos por cada evento creado
    public void mostrarDatos() {
        System.out.println("==================================================");
        System.out.println("ID DEL EVENTO: " + this.id);
        System.out.println("Título: " + this.titulo);
        System.out.println("¿Es gratuito?: " + (this.gratuito ? "Sí" : "No"));
        System.out.println("Costo Base: $" + this.costoBase);
        System.out.println("Costo Estimado: $" + this.calcularCostoEstimado());
        
       
        if (this.sala != null) {
            System.out.println(" Sala asignada: " + this.sala.getNombre());
        } else {
            System.out.println(" Sala asignada: Ninguna");
        }
        
        System.out.println("--------------------------------------------------");
        System.out.println("Actividades planificadas:");
        if (this.actividades.isEmpty()) {
            System.out.println("   No hay actividades en este evento.");
        } else {
            for (Actividad act : this.actividades) {
                act.mostrarInscripciones(); // Llama al método que recorre e imprime alumnos
                System.out.println();
            }
        }
        System.out.println("==================================================");
    }
}