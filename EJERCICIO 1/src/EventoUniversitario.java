//EJERCICIO 1 
public class EventoUniversitario {
    // 1. Atributo estático 
    private static int cantidadEventos = 0;
    // 2. Atributos de instancia 
    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
  
//Constructor parametrizado/principal
public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
    this.id = id;
    this.titulo = titulo;
    this.costoBase = costoBase;
    this.gratuito = gratuito;
    cantidadEventos++;
}
//constructor de copia 
public EventoUniversitario(EventoUniversitario otro){
    this(otro.id, otro.titulo, otro.costoBase, otro.gratuito);
}
//calcular costo estimado del enveto 
public double calcularCostoEstimado() {
if (this.gratuito){
    return 0.0; 
} else {
    return this.costoBase * 1.21;//IVA
}
}
public static int getCantidadEventos() {
    return cantidadEventos; 
}
public void crearActividad(int id, String titulo, int cupo) {
    System.out.println( "Actividad" +" titulo"+ "creada para el evento.");
}
public void  mostrarDatos() {
    System.out.println("id del evento:"+ this.id);
    System.out.println("titulo del evento:"+ this.titulo);
    System.out.println("El evento es gratuito?:"+ this.gratuito);
    System.out.println("El costo base del evento es:$"+ this.costoBase);
    System.out.println("El costo estimado del evento es:$"+ this.calcularCostoEstimado());
    System.out.println("--------------------------------");
}

}// llave de la clase 
      