package pessoa;

import java.util.Scanner;

public class PessoaTest {
    public static int a = 2;

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.print("Enter your name: ");
        pessoa.setName(key.nextLine());

        System.out.print("Enter your age: ");
        pessoa.setAge(key.nextInt());

        pessoa.tellTheName();
        pessoa.tellTheAge();
        pessoa.doBirthday();
        pessoa.tellTheAge();

        System.out.println(a);
    }

}
