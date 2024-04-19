import java.util.Scanner;

public class Atividade09 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int alunosAcima90 = 0;
        int alunosReprovadosNota = 0;
        int alunosReprovadosFalta = 0;
        int maiorNota = 0;
        int menorNota = Integer.MAX_VALUE;
        double media = 0;
        int totalAlunos = 0;

        while (true) {
            System.out.print("Informe a nota final do aluno (para terminar informe uma nota negativa): ");
            int notaFinal = console.nextInt();

            if (notaFinal < 0) {
                break;
            }

            System.out.print("Informe o total de faltas do aluno: ");
            int totalFaltas = console.nextInt();

            totalAlunos++;

            if (notaFinal >= 90) {
                alunosAcima90++;
            }

            if (notaFinal < 70) {
                alunosReprovadosNota++;
            }

            if (totalFaltas >= 20) {
                alunosReprovadosFalta++;
            }

            maiorNota = Math.max(maiorNota, notaFinal);
            menorNota = Math.min(menorNota, notaFinal);
            media += notaFinal;
        }

        media = media / totalAlunos;

        System.out.println("\nResultados:");
        System.out.println("Alunos com nota acima de 90: " + alunosAcima90);
        System.out.println("Alunos reprovados por nota: " + alunosReprovadosNota);
        System.out.println("Alunos reprovados por falta: " + alunosReprovadosFalta);
        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Média da turma: " + String.format("%.2f", media));
    }
}
