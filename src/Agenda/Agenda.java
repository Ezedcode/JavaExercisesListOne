package Agenda;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Contacto> informacoes = new ArrayList<Contacto>();

    public void addContacto(String name, int phoneNumber){
        Contacto contacto = new Contacto();

        contacto.setName(name);
        contacto.setPhoneNumber(phoneNumber);

        informacoes.add(contacto);
    }

    public void imprime(){
        System.out.println("Agenda:");

        for (int index=0; index <= informacoes.size()-1;index++){
            System.out.format("Name: %s - Phone: %d\n",
                    informacoes.get(index).getName(),
                    informacoes.get(index).getPhoneNumber());
        }

        System.out.println("End of Contact List");
    }
}
