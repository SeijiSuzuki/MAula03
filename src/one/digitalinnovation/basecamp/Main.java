package one.digitalinnovation.basecamp;

public class Main {
    public static void main(String[] args) {
        CalcularArea calcularArea = new CalcularArea();

        double quadrado = calcularArea.quadrilateros(2.5);
        System.out.println("Área do quadrado: "+ quadrado);

        double retangulo = calcularArea.quadrilateros(2.5, 5.5);
        System.out.println("Área do retangulo: "+ retangulo);

        double triangulo = calcularArea.quadrilateros(2.5, 5.5, 7);
        System.out.println("Área do triangulo: "+ triangulo);
    }
}
