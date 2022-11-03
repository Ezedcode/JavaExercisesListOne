package retangulo;

public class RetanguloTest {
    public static void main(String[] args) {
        Retangulo novoRetangulo = new Retangulo();

        novoRetangulo.setLado1(10);
        novoRetangulo.setLado2(5);

        novoRetangulo.calcularArea();
        novoRetangulo.calcularPerimetro();

        novoRetangulo.setLado2(7);
        novoRetangulo.calcularArea();
        novoRetangulo.calcularPerimetro();
    }
}
