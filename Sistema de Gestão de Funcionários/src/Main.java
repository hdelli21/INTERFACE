public class Main {
    public static void main(String[] args) {
        // Criando uma instância de FuncionarioAssalariado
        Funcionario funcionarioAssalariado = new FuncionarioAssalariado(4580);
        
        System.out.println("Bônus do funcionário assalariado: R$ " + funcionarioAssalariado.calcularBonus());

        // Criando uma instância de FuncionarioHorista
        Funcionario funcionarioHorista = new FuncionarioHorista(80, 2500); // Exemplo de R$ 50/hora e 2000 horas/ano
        
        System.out.println("Bônus do funcionário horista: R$ " + funcionarioHorista.calcularBonus());
    }
}