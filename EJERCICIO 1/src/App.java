public class App {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("       SISTEMA DE EVENTOS - UTN FRM");
        System.out.println("==========================================\n");

        // a. Se creen uno o más eventos universitarios
        EventoUniversitario evento1 = new EventoUniversitario("EVT-01", "Jornadas de Inteligencia Artificial", 15000.0, false);
        EventoUniversitario evento2 = new EventoUniversitario("EVT-02", "Charla de Java", 0.0, true);

        // b. Se cree una copia de cada evento creado utilizando el constructor de copia
        EventoUniversitario copiaEvento1 = new EventoUniversitario(evento1);
        EventoUniversitario copiaEvento2 = new EventoUniversitario(evento2);

        // c. Se muestren los datos de los eventos creados y su copia
        System.out.println("--- EVENTOS ORIGINALES ---");
        evento1.mostrarDatos();
        evento2.mostrarDatos();

        System.out.println("--- EVENTOS COPIADOS ---");
        copiaEvento1.mostrarDatos();
        copiaEvento2.mostrarDatos();

        // d. Se muestre el contador de eventos con la totalidad de eventos creados
        System.out.println("==========================================");
        System.out.println("TOTAL DE EVENTOS CREADOS: " + EventoUniversitario.getCantidadEventos());
        System.out.println("==========================================");
    }
}

