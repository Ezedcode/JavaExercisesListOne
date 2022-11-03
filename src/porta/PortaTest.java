package porta;

import java.util.Scanner;

public class PortaTest {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Porta porta = new Porta();
        porta.open();
        porta.close();
        porta.paint("Red");
        System.out.print("Enter dmX: ");
        porta.setDimX(key.nextFloat());
        System.out.print("Enter dmY: ");
        porta.setDimY(key.nextFloat());
        System.out.print("Enter dmZ: ");
        porta.setDimZ(key.nextFloat());

        System.out.println("The status of the door:");

        System.out.println("Dimensions");
        System.out.println("---DmX: "+porta.getDimX());
        System.out.println("---DmY: "+porta.getDimY());
        System.out.println("---DmZ: "+porta.getDimZ());

        System.out.println("---The door's color: "+porta.getColor());

        if(porta.isOpen()){
            System.out.println("---The door is open!");
        }else{
            System.out.println("---The door is close!");
        }

    }
}
