// Clase para representar camiones, cuyo peaje depende del número de ejes
class Camion extends Vehiculo {
    private int valorPeajeEje = 1;
    private int numeroEjes;

    public Camion(String placa, int numeroEjes) {
        super(placa);
        this.numeroEjes = numeroEjes;
    }

    public int getValorPeaje() {
        return valorPeajeEje * numeroEjes;
    }

    public void setValorPeajeEje(int valorPeajeEje) {
        this.valorPeajeEje = valorPeajeEje;
    }

    public void imprimir() {
        System.out.println("Camión - Placa: " + placa + " - Ejes: " + numeroEjes);
    }
}
