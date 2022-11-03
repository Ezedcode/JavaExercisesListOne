package client;

import client.Client;

public class ClientTest {
    public static void main(String[] args) {
        Client client_1 = new Client("Zedino", 20202001);
        Client client_2 = new Client("Ezedélio", 20202504);

        System.out.format("\n\nClient 1 \n---Name: %s\n---Code: %d",client_1.getName(),client_1.getCode());
        System.out.format("\n\nClient 2 \n---Name: %s\n---Code: %d",client_2.getName(),client_2.getCode());
    }
}
