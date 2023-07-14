public class Esfera extends Main {
    private final double radio;

    public Esfera(double radio) {
        super();
        this.radio = radio;
    }

    public Esfera(Punto centro, double radio) {
        super();
        this.radio = radio;

    }
    public double calcularVolumen() {
        return (4 * Math.PI * Math.pow(radio, 3)) / 3;
    }
}
