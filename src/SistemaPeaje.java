// Clase principal que ejecuta el sistema de peaje
public class SistemaPeaje {
    public static void main(String[] args) {
        Peaje peaje = new Peaje("Peaje Tola", "Pichincha");

        // Registro de vehículos en el sistema
        peaje.añadirVehiculo(new Carro("ABC123"));
        peaje.añadirVehiculo(new Moto("XYZ789"));
        peaje.añadirVehiculo(new Camion("TRK456", 3));
        peaje.añadirVehiculo(new Carro("DEF456"));

        // Impresión del reporte final
        peaje.imprimir();
    }
}
