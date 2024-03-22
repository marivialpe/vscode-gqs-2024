import java.util.Scanner;

public class Atividade07 {

    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {

          System.out.print("Digite o tipo de apartamento em que esteve hospedado (Simples/Duplo): ");
          String apartamento = console.next();

          System.out.print("Digite a quantidade de dias hospedado: ");
          double diaria = console.nextDouble();
           
          double valor = 0;

          if (apartamento.equalsIgnoreCase("Simples")) {
              if (diaria < 10) {
                  valor = 100.00;
              } else if (diaria >= 10 && diaria <= 15) {
                  valor = 90.00;
              } else {
                  valor = 80.00;
              }
          } else if (apartamento.equalsIgnoreCase("Duplo")) {
              if (diaria < 10) {
                  valor = 140.00;
              } else if (diaria >= 10 && diaria <= 15) {
                  valor = 120.00;
              } else {
                  valor = 100.00;
              }
          } else {
              System.out.println("Apartamento inválido!");
              return;
          }

          System.out.println("O total a ser pago é: R$" + valor);
        }
      }
    }
    //Funcionando
    
    