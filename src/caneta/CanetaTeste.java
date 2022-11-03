package caneta;

import caneta.Caneta;

public class CanetaTeste {

    public static void main(String[] args) {
        Caneta caneta1 = new Caneta("Bravo","blue",1.75f);

        System.out.format("\n\nPen's description\n\n--Brand: %s\n--color: %s\n--height: %.2f\n\n",caneta1.getBrand(),caneta1.getColor(),caneta1.getHeight());
    }
}
