import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<String> registros = new ArrayList<>();

    private static void imprimirRegistros() {
        System.out.println("Registros:");

        for (String registro : registros) {
            System.out.println(registro);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Figura geométrica 2D");
            System.out.println("2. Figura tridimensional");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    menuFigura2D(scanner);
                    break;
                case 2:
                    menuFigura3D(scanner);
                    break;
                case 3:
                    imprimirRegistros();
                    break;
                case 0:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }

            System.out.println();
        } while (opcion != 0);
    }

    private static void menuFigura2D(Scanner scanner) {
        int opcion;
        do {
            System.out.println("Seleccione una figura geométrica:");
            System.out.println("1. Triángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Círculo");
            System.out.println("0. Volver al menú principal");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularTriangulo(scanner);
                    break;
                case 2:
                    calcularCuadrado(scanner);
                    break;
                case 3:
                    calcularCirculo(scanner);
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }

            System.out.println();
        } while (opcion != 0);
    }

    private static void menuFigura3D(Scanner scanner) {
        int opcion;
        do {
            System.out.println("Seleccione una figura tridimensional:");
            System.out.println("1. Pirámide");
            System.out.println("2. Cubo");
            System.out.println("3. Esfera");
            System.out.println("0. Volver al menú principal");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularPiramide(scanner);
                    break;
                case 2:
                    calcularCubo(scanner);
                    break;
                case 3:
                    calcularEsfera(scanner);
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }

            System.out.println();
        } while (opcion != 0);
    }

    private static void calcularTriangulo(Scanner scanner) {
        System.out.println("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();
        double area = 0.5 * base * altura;
        double perimetro = base * 3;
        System.out.println("El área del triángulo es: " + area);
        System.out.println("El perímetro del triángulo es: " + perimetro);
        registros.add("Triángulo - Área: " + area + ", Perímetro: " + perimetro);
    }

    private static void calcularCuadrado(Scanner scanner) {
        System.out.println("Ingrese el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        double perimetro = lado * 4;
        System.out.println("El área del cuadrado es: " + area);
        System.out.println("El perímetro del cuadrado es: " + perimetro);
        registros.add("Cuadrado - Área: " + area + ", Perímetro: " + perimetro);
    }

    private static void calcularCirculo(Scanner scanner) {
        System.out.println("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;

        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);
        registros.add("Círculo - Área: " + area + ", Perímetro: " + perimetro);
    }

    private static void calcularPiramide(Scanner scanner) {
        System.out.println("Ingrese la base del triángulo de la pirámide: ");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del triángulo de la pirámide: ");
        double alturaTriangulo = scanner.nextDouble();
        System.out.println("Ingrese la altura de la pirámide: ");
        double alturaPiramide = scanner.nextDouble();
        double areaTriangulo = 0.5 * base * alturaTriangulo;
        double volumen = (areaTriangulo * alturaPiramide) / 3;
        System.out.println("El volumen de la pirámide es: " + volumen);
        registros.add("Pirámide - Volumen: " + volumen);
    }

    private static void calcularCubo(Scanner scanner) {
        System.out.println("Ingrese las coordenadas del primer punto del cubo (x, y):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double z1 = scanner.nextDouble();
        Punto p1 = new Punto(x1, y1, z1);

        System.out.println("Ingrese las coordenadas del segundo punto del cubo (x, y):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double z2 = scanner.nextDouble();
        Punto p2 = new Punto(x2, y2, z2);

        Cubo cubo = new Cubo(p1, p2);
        double volumen = cubo.calcularVolumen();
        System.out.println("El volumen del cubo es: " + volumen);
        registros.add("Cubo - Volumen: " + volumen);
    }

    private static void calcularEsfera(Scanner scanner) {
        System.out.println("Ingrese las coordenadas del centro de la esfera (x, y):");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
        Punto centro = new Punto(x, y, z);
        System.out.println("Ingrese el radio de la esfera: ");
        double radio = scanner.nextDouble();
        Esfera esfera = new Esfera(centro, radio);
        double volumen = esfera.calcularVolumen();
        System.out.println("El volumen de la esfera es: " + volumen);
        registros.add("Esfera - Volumen: " + volumen);
    }
}