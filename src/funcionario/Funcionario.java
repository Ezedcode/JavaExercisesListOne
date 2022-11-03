package funcionario;

public class Funcionario {
    private String name;
    private String sobrenome;
    private int horasTrabalhadas;
    private float valorPorHora;


    public String nomeCompleto(){
        return name.concat(" ").concat(sobrenome);
    }

    public void calcularSalario(){
        System.out.println("The salary is "+(horasTrabalhadas * valorPorHora));
    }

    public void incrementarHoras(int valor){
        valorPorHora += valor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setValorPorHora(float valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
}
