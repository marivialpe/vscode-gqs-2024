import java.util.Scanner;

//Pratica 01
//número 02

public class atividade2 {
  public static void main(String[] args) {

    try (Scanner num1 = new Scanner(System.in)) {
      System.out.println("Informe a temperatura em Celsius: ");
      double celsius = num1.nextInt();

      double fahrenheit = (celsius * 1.8) + 32;
      System.out.println("A temperetura informada em Fahrenheit é: " + fahrenheit);
    }

  }
}

//Funcionando