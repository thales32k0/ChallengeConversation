import java.util.Scanner;

public class ConversionChallenge {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first salary: ");
    String Salary1 = scanner.nextLine().replace(",", ".");

        System.out.println("Enter the second salary: ");
    String Salary2 = scanner.nextLine().replace(",", ".");

        System.out.println("Enter the third salary: ");
    String Salary3 = scanner.nextLine().replace(",", ".");

    double salary1 = Double.parseDouble(Salary1);
    double salary2 = Double.parseDouble(Salary2);
    double salary3 = Double.parseDouble(Salary3);

    double sum = salary1 + salary2 + salary3;
    double result = sum / 3;

        System.out.println("The sum of salaries is: "+sum);
        System.out.println("The result of wages divided by 3 is: "+result);

        scanner.close();
  }
}
