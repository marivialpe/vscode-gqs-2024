import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {

    try (Scanner console = new Scanner(System.in)) {
        System.out.print("Informe o raio da esfera: ");
        double raio = console.nextDouble();

        double comprimento = (2 * 3.14 * raio);
        double area = Math.PI * Math.pow(raio, 2);
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        System.out.println("O comprimento da esfera é: " + comprimento);
        System.out.println("A area da esfera é: " +  area);
        System.out.println("O volume da esfera é: " + volume);
    }
  }  
}
