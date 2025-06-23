// Clase que representa una estación de peaje
class Peaje {
    private String nombre;
    private String departamento;
    private int totalPeaje = 0;
    private int totalCamiones = 0;
    private int totalMotos = 0;
    private int totalCarros = 0;
    private java.util.List<Vehiculo> vehiculos = new java.util.ArrayList<>();

    public Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    // Métodos get/set para nombre y departamento
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    // Añadir un vehículo al peaje y actualizar contadores y total recaudado
    public void añadirVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        totalPeaje += calcularPeaje(vehiculo);

        if (vehiculo instanceof Carro) totalCarros++;
        else if (vehiculo instanceof Moto) totalMotos++;
        else if (vehiculo instanceof Camion) totalCamiones++;
    }

    // Calcula el valor del peaje para un vehículo
    public int calcularPeaje(Vehiculo vehiculo) {
        return vehiculo.getValorPeaje();
    }

    // Imprime el resumen de todos los vehículos y totales
    public void imprimir() {
        System.out.println("\n--- Reporte del Peaje ---");
        for (Vehiculo v : vehiculos) {
            v.imprimir();
        }
        System.out.println("Total carros: " + totalCarros);
        System.out.println("Total motos: " + totalMotos);
        System.out.println("Total camiones: " + totalCamiones);
        System.out.println("Total peaje recaudado: $" + totalPeaje);
    }
}
