package porta;

public class Porta {
    private boolean openUp;
    private String color;
    private float dimX;
    private float dimY;
    private float dimZ;

    public void open(){
        openUp = true;
    }

    public void close(){
        openUp = false;
    }

    public void paint(String cor){
        this.color = cor;
    }

    public boolean isOpen(){
        return openUp;
    }

    public float getDimX() {
        return dimX;
    }

    public void setDimX(float dimX) {
        this.dimX = dimX;
    }

    public float getDimY() {
        return dimY;
    }

    public void setDimY(float dimY) {
        this.dimY = dimY;
    }

    public float getDimZ() {
        return dimZ;
    }

    public String getColor() {
        return color;
    }

    public void setDimZ(float dimZ) {
        this.dimZ = dimZ;
    }
}
