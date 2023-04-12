import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();

        int prod = numberOne * numberTwo;
        
        System.out.println("PROD = " + prod);
    }
}
