package lampada;

public class LampadaTest {
    public static void main(String[] args) {
        Lampada light_1 = new Lampada("led",55, "blue","lp34",555,35,true);
        Lampada light_2 = new Lampada("fluorescente",57, "white","lp3477",58,36,false);

        System.out.format("\n\nLightn 1:\n--Model: %s, \n--Voltage: %.2f\n--Color: %s\n--Brand: %s\n--Price: %f\n--Power: %f\n--Status: %s\n\n",
                light_1.getModel(),light_1.getVoltage(),light_1.getColor(),light_1.getBrand(),light_1.getPrice(),light_1.getPower(),
                light_1.getStatus());

        System.out.format("Lightn 2:\n--Model: %s \n--Voltage: %.2f\n--Color: %s\n--Brand: %s\n--Price: %f\n--Power: %f\n--Status: %s\n\n",
                light_2.getModel(),light_2.getVoltage(),light_2.getColor(),light_2.getBrand(),light_2.getPrice(),light_2.getPower(),
                light_2.getStatus());


        if(light_2.getPower() > light_1.getPower()){
            System.out.println("Light 2 has most power!");
        }else{
            System.out.println("Light 1 has most power!");
        }


        if(light_2.getPrice() > light_1.getPrice()){
            System.out.println("Light 2 is more expensive!");
        }else{
            System.out.println("Light 1 is more expensive!");
        }
    }
}
