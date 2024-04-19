import java.util.Scanner;

public class Atividade10 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double salarioTotal = 0;
        int totalFilhos = 0;
        int totalPessoas = 0;

        while (true) {
            System.out.print("Informe o salário do habitante (para terminar informe um valor negativo): ");
            double salario = console.nextDouble();

            if (salario < 0) {
                break;
            }

            System.out.print("Informe o número de filhos do habitante: ");
            int filhos = console.nextInt();

            salarioTotal += salario;
            totalFilhos += filhos;
            totalPessoas++;
        }

        double mediaSalario = salarioTotal / totalPessoas;
        double mediaFilhos = (double) totalFilhos / totalPessoas;

        System.out.println("\nResultados da pesquisa:");
        System.out.println("Média salarial da população: R$ " + String.format("%.2f", mediaSalario));
        System.out.println("Média do número de filhos: " + String.format("%.2f", mediaFilhos));
    }
}
