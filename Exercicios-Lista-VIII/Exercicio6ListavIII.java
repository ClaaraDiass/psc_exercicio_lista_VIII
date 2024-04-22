import java.util.Scanner;

public class Exercicio6ListavIII {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char continuar = 'S';
    while (continuar == 'S' || continuar == 's') {
      System.out.print("Digite a hora (formato 24 horas): ");
      int hora = scanner.nextInt();
      System.out.print("Digite os minutos: ");
      int minutos = scanner.nextInt();

      exibirHora(convert24to12(hora, minutos));

      System.out.print("Deseja continuar? (S/N): ");
      continuar = scanner.next().charAt(0);
    }

    scanner.close();
  }

  public static String convert24to12(int hora, int minutos) {
    String periodo;
    if (hora >= 0 && hora < 12) {
      periodo = "A.M.";
    } else {
      periodo = "P.M.";
      hora -= 12;
    }

    return String.format("%d:%02d %s", (hora == 0 ? 12 : hora), minutos, periodo);
  }

  public static void exibirHora(String horaConvertida) {
    System.out.println("Hora convertida: " + horaConvertida);
  }
}
