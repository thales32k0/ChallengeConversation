import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro salário: ");
    String Salario1 = scanner.nextLine().replace(",", ".");

        System.out.println("Digite o segundo salário");
    String Salario2 = scanner.nextLine().replace(",", ".");

        System.out.println("Digite o terceiro salário");
    String Salario3 = scanner.nextLine().replace(",", ".");

    double salario1 = Double.parseDouble(Salario1);
    double salario2 = Double.parseDouble(Salario2);
    double salario3 = Double.parseDouble(Salario3);

    double soma = salario1 + salario2 + salario3;
    double resultado = soma / 3;

        System.out.println("A soma dos salários é: "+soma);
        System.out.println("O resultado dos salários divididos por 3 é "+resultado);

        scanner.close();
  }
}
