import java.util.Scanner;

public class Exercicio2ListavIII {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o valor de n: ");
    int n = scanner.nextInt();
    imprimirPadrao(n);
    scanner.close();
  }

  public static void imprimirPadrao(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
