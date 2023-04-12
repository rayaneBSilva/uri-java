import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int workedHour = sc.nextInt();
        double valuePerHour = sc.nextDouble();
        double salary = workedHour * valuePerHour;
       
        System.out.println("NUMBER = " + number);
        System.out.format("SALARY = U$ %.2f\n", salary);
    }
}
