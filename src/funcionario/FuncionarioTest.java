package funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario novoFuncionario = new Funcionario();

        novoFuncionario.setName("Lionel");
        novoFuncionario.setSobrenome("Messi");

        novoFuncionario.setHorasTrabalhadas(10);
        novoFuncionario.setValorPorHora(25.50f);

        System.out.println("Name: "+ novoFuncionario.nomeCompleto());
        novoFuncionario.nomeCompleto();
        novoFuncionario.calcularSalario();
        novoFuncionario.incrementarHoras(8);

        novoFuncionario.calcularSalario();
    }
}
