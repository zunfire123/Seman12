public class Cubo extends Main {
    private final double arista;

    public Cubo(Punto p1, Punto p2) {
        this.arista = Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));

    }
    public double calcularVolumen() {
        return Math.pow(arista, 3);
    }
}