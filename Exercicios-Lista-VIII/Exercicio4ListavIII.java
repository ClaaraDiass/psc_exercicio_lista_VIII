import java.util.Scanner;

public class Exercicio4ListavIII {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int numero = scanner.nextInt();
    char resultado = verificarPositivoNegativo(numero);
    System.out.println("O número é " + resultado);
    scanner.close();
  }

  public static char verificarPositivoNegativo(int num) {
    if (num > 0) {
      return 'P';
    } else {
      return 'N';
    }
  }
}
