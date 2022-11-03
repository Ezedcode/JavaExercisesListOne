package Agenda;

public class Exercicio01 {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.addContacto("Eliane",932345678);
        agenda.addContacto("Laura",919876543);
        agenda.addContacto("Eliane",963452345);

        agenda.imprime();
    }
}
