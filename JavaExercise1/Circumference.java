import java.util.Scanner;

public class Circumference {
    public static final double PI = 3.141;

    public static double circumferencecalc(double r) {

        double circum = 2 * PI * r;
        return circum;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        double r = sc.nextDouble();
        System.out.println(circumferencecalc(r));

    }
}