import java.util.Scanner;

//Pratica 01
//número 01

public class atividade1 {
  public static void main(String[] args) {

    try (Scanner num = new Scanner(System.in)) {
      System.out.println("Informe a diagonal menor: ");
      double menor = num.nextInt();

      System.out.println("Informe a diagonal maior: ");
      double maior = num.nextInt();

      double area = (menor * maior) / 2;
      System.out.println("A área do losango é: " + area);
    }

  }
}

//Funcionando