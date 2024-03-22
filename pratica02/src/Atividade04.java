import java.util.Scanner;
import java.text.DecimalFormat;

public class Atividade04 {
  public static void main(String[] args) {

    try (Scanner console = new Scanner(System.in)) {
        System.out.print("Informe o cateto a: ");
        double a = console.nextDouble();

        System.out.print("Informe o cateto b: ");
        double b = console.nextDouble();

        DecimalFormat df = new DecimalFormat("#.##");

        double hipotenusa = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.format("A hipotenusa é: " + df.format(hipotenusa));
    }
  }
}
//Funcionando