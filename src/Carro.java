// Clase para representar carros
class Carro extends Vehiculo {
    private int valorPeaje = 2;

    public Carro(String placa) {
        super(placa);
    }

    public int getValorPeaje() {
        return valorPeaje;
    }

    public void setValorPeaje(int valorPeaje) {
        this.valorPeaje = valorPeaje;
    }

    public void imprimir() {
        System.out.println("Carro - Placa: " + placa);
    }
}

