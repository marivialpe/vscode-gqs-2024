import java.util.Scanner;

public class Atividade06 {

    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
          
          System.out.print("Digite sua idade: ");
          int idade = console.nextInt();

          System.out.print("Digite seu sexo (M/F): ");
          String sexo = console.next();
           
          double mensalidade = 0;

          if (sexo.equalsIgnoreCase("M")) {
              if (idade <= 15) {
                  mensalidade = 60.00;
              } else if (idade <= 18) {
                  mensalidade = 75.00;
              } else if (idade <= 30) {
                  mensalidade = 90.00;
              } else if (idade <= 40) {
                  mensalidade = 85.00;
              } else {
                  mensalidade = 80.00;
              }
          } else if (sexo.equalsIgnoreCase("F")) {
              if (idade <= 18) {
                  mensalidade = 60.00;
              } else if (idade <= 25) {
                  mensalidade = 90.00;
              } else if (idade <= 40) {
                  mensalidade = 85.00;
              } else {
                  mensalidade = 80.00;
              }
          } else {
              System.out.println("Sexo inválido!");
              return;
          }

          System.out.println("Sua mensalidade é de R$" + mensalidade);
        }
    }
}

//Funcionando