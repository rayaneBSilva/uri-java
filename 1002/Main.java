import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double pi = 3.14159;
        double ray = scan.nextDouble();
        double area = pi * Math.pow(ray, 2);

        System.out.printf("A=%.4f%n", area);
        scan.close();
        
    }
}
