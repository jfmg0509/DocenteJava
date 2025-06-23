// Clase para representar motos
class Moto extends Vehiculo {
    private int valorPeaje = 1;

    public Moto(String placa) {
        super(placa);
    }

    public int getValorPeaje() {
        return valorPeaje;
    }

    public void setValorPeaje(int valorPeaje) {
        this.valorPeaje = valorPeaje;
    }

    public void imprimir() {
        System.out.println("Moto - Placa: " + placa);
    }
}
