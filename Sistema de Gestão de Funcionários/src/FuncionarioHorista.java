// Implementação para Funcionários Horistas

public class FuncionarioHorista implements Funcionario {
    // Atributos
    private double salarioHora;
    private int horasTrabalhadasAno;

    //Construtor Padrão
    public FuncionarioHorista (double salarioHora, int horasTrabalhadasAno) {
        this.salarioHora = salarioHora;
        this.horasTrabalhadasAno = horasTrabalhadasAno;
    }

    // O bônus é 10% do total anual recebido
    @Override
    public double calcularBonus() {
        double totalAnual = salarioHora * horasTrabalhadasAno;
        return totalAnual * 0.10;
    }
}