import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade08 {
  public static void main(String[] args) {
    try (Scanner console = new Scanner(System.in)) {

        System.out.print("Digite o valor de a: ");
        double a = console.nextDouble();
        System.out.print("Digite o valor de b: ");
        double b = console.nextDouble();
        System.out.print("Digite o valor de c: ");
        double c = console.nextDouble();
        DecimalFormat df = new DecimalFormat("#.##");

        if (a == 0 && b == 0 && c == 0 ) {
          System.out.println("Igualdade confirmada: 0 = 0");

        } else if (a == 0 && b == 0 && c != 0) {
          System.out.println("Coeficientes informados incorretamente");

        }else if (a == 0 && b != 0) {
          double raiz = (-c/b);
          System.out.println("Esta é uma equação de primeiro grau: x = " + df.format(raiz));

        }else if (a != 0) {
          System.out.println("Esta é uma equação de segundo grau");

          double delta = Math.pow(b, 2) - 4 * a * c;

          if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais (delta < 0): delta = " + df.format(delta));

          }else if (delta == 0) {
            double raiz = (-b / (2 * a));
            System.out.println("Esta equação possui duas raízes iguais: x' = x'' = " + df.format(raiz));

          }else if (delta > 0) {
            double primeira = ((-b + Math.sqrt(delta)) / (2 * a));
            double segunda = ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Esta equação possui duas raízes reais diferentes: delta = " + df.format(delta) + " x' = " + df.format(primeira) + " x'' = " + df.format(segunda));
            }
          }      
        }
      }
    }
    //Funcionando