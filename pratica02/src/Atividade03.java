import java.util.Scanner;

//Pratica 01
//número 03

public class Atividade03 {
  public static void main(String[] args) {

    try (Scanner console = new Scanner(System.in)) {
      System.out.println("Informe o valor do salario minimo: ");
      double minimo = console.nextInt();

      System.out.println("Informe o valor do salario do funcionario: ");
      double salario = console.nextInt();

      double total = salario / minimo ;
      System.out.println("O funcionario recebe: " + total + " salarios minimos");
    }

  }
}

//Funcionando