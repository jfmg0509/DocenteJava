// Clase abstracta base para los vehículos
abstract class Vehiculo {
    protected String placa;

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    // Método abstracto que debe implementar cada tipo de vehículo
    public abstract int getValorPeaje();
    public abstract void imprimir();

    public String getPlaca() {
        return placa;
    }
}
