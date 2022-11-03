package retangulo;

public class Retangulo {
    private float lado1;
    private float lado2;
    private float area;
    private float perimetro;

    public void calcularArea(){
        area = lado1 * lado2;
        System.out.println("The area of the rectangle is: " + area);
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public void calcularPerimetro(){
        perimetro = 2*(lado2+lado1);
        System.out.println("The perimeter of the rectangle is: " + perimetro);
    }

}
