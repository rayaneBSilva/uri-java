import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();

        int sum = numberOne + numberTwo;
        
        System.out.println("SOMA = " + sum);
    }
}
