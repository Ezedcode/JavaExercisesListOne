package circulo;

public class Circulo {
    private float raio;
    private float area;
    private float perimetro;

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public void calcularArea(){
        area = (float)(Math.pow(raio,2)*3.14);
    }

    public float getArea() {
        return area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public float getRaio() {
        return raio;
    }

    public void calcularPerimetro(){
        perimetro = 2*3.14f*raio;
    }


}
