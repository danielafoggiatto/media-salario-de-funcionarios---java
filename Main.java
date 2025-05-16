public class Main {
    public static void main(String[] args) {
        int numFuncionarios = 2;
        double salario = 0;
        double somaSalario = 0;

        for (int i = 0; i < numFuncionarios; i++) {
            System.out.println("Funcionário " + (i + 1) + ":");
            System.out.println("Digite o salário do funcionário:");
            salario = Double.parseDouble(System.console().readLine());
            somaSalario += salario;

        }
        double media = somaSalario / numFuncionarios;
        System.out.println("A média salarial é: " + media);

    }
}