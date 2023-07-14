public class Piramide extends Main {
    private final Piramide base;
    private final double altura;

    public Piramide(Piramide base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularVolumen() {
        double areaBase = base.calcularArea();
        return (areaBase * altura) / 3;
    }

    private double calcularArea() {
        return 0;
    }
}
