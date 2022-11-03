package circulo;

public class CirculoTest {
    public static void main(String[] args) {
        Circulo novoCirculo = new Circulo();

        novoCirculo.setRaio(10f);

        novoCirculo.calcularArea();
        System.out.println("The area is " + novoCirculo.getArea());
        novoCirculo.calcularPerimetro();
        System.out.println("The perimeter is "+ novoCirculo.getPerimetro());

        novoCirculo.setRaio(4f);

        novoCirculo.calcularArea();
        System.out.println("\n\nThe area is " + novoCirculo.getArea());
        novoCirculo.calcularPerimetro();
        System.out.println("The perimeter is "+ novoCirculo.getPerimetro());
    }
}
