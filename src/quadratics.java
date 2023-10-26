import java.util.Scanner;

public class quadratics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This calculates the roots of ax^2+bx+c=0");

        System.out.print("Enter coefficient a (and press Enter): ");
        double a = scanner.nextDouble();


        if (a == 0) {
            System.out.println("Invalid input. 'a' cannot be zero.");
            return;
        }

        System.out.print("Enter coefficient b (and press Enter): ");
        double b = scanner.nextDouble();

        System.out.print("Enter coefficient c (and press Enter): ");
        double c = scanner.nextDouble();


        double delta = b * b - 4 * a * c;


        double x1, x2;
        switch ((int) Math.signum(delta)) {
            case 1:
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("For a=" + a + " ,b=" + b + ", c=" + c + " The roots are:\n x1 = %.2f,\n x2 = %.2f\n", x1, x2);
                break;
            case 0:
                x1 = -b / (2 * a);
                System.out.printf("Root: x1 = %.2f\n", x1);
                break;
            case -1:
                System.out.println("No real roots exist.");
                break;

        }
    }
}

