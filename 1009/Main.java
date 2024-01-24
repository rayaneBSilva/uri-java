import java.util.*; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double salary = sc.nextDouble();
        double sales = sc.nextDouble();

        double commission = sales * 0.15;
        double finalSalary  = salary + commission;

        System.out.printf("TOTAL = R$ %.2f%n", finalSalary);
    }
}
