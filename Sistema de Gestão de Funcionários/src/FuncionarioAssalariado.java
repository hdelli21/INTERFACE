// Implementação para funcionários assalariados
public class FuncionarioAssalariado implements Funcionario {
    
    //Atríbutos
    double salario;

    // Construtor para inicializar o salário anual
    public FuncionarioAssalariado(double salario) {
        this.salario = salario;
    }

    // O bônus é um valor fixo de R$ 5.000,00
    @Override
    public double calcularBonus() {
        return salario + 5000.00;
    }

}