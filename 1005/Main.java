import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextFloat();
        double B = sc.nextFloat();

        double media = ((A * 3.5) + (B * 7.5)) / 11;

        System.out.format("MEDIA = %.5f\n",media);
    }
    
}
