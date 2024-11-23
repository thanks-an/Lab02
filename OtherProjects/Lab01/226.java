import java.util.Scanner;

public class _226 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the type of equation to solve:");
        System.out.println("1. First-degree equation with one variable (ax + b = 0)");
        System.out.println("2. System of first-degree equations with two variables");
        System.out.println("3. Second-degree equation with one variable (ax^2 + bx + c = 0)");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // First-degree equation with one variable
                System.out.println("Solving first-degree equation ax + b = 0");
                System.out.print("Enter a: ");
                double a = scanner.nextDouble();
                System.out.print("Enter b: ");
                double b = scanner.nextDouble();
                if (a != 0) {
                    double x = -b / a;
                    System.out.println("The solution is x = " + x);
                } else {
                    System.out.println("a cannot be 0 in a first-degree equation.");
                }
                break;

            case 2:
                // System of first-degree equations with two variables
                System.out.println("Solving system of first-degree equations:");
                System.out.println("a11 * x1 + a12 * x2 = b1");
                System.out.println("a21 * x1 + a22 * x2 = b2");
                System.out.print("Enter a11: ");
                double a11 = scanner.nextDouble();
                System.out.print("Enter a12: ");
                double a12 = scanner.nextDouble();
                System.out.print("Enter a21: ");
                double a21 = scanner.nextDouble();
                System.out.print("Enter a22: ");
                double a22 = scanner.nextDouble();
                System.out.print("Enter b1: ");
                double b1 = scanner.nextDouble();
                System.out.print("Enter b2: ");
                double b2 = scanner.nextDouble();

                double D = a11 * a22 - a21 * a12;
                double D1 = b1 * a22 - b2 * a12;
                double D2 = a11 * b2 - a21 * b1;

                if (D != 0) {
                    double x1 = D1 / D;
                    double x2 = D2 / D;
                    System.out.println("The solution is x1 = " + x1 + ", x2 = " + x2);
                } else {
                    if (D1 == 0 && D2 == 0) {
                        System.out.println("The system has infinitely many solutions.");
                    } else {
                        System.out.println("The system has no solution.");
                    }
                }
                break;

            case 3:
                // Second-degree equation with one variable
                System.out.println("Solving second-degree equation ax^2 + bx + c = 0");
                System.out.print("Enter a: ");
                double a2 = scanner.nextDouble();
                System.out.print("Enter b: ");
                double b3 = scanner.nextDouble();
                System.out.print("Enter c: ");
                double c = scanner.nextDouble();

                if (a2 != 0) {
                    double delta = b3 * b3 - 4 * a2 * c;
                    if (delta > 0) {
                        double x1 = (-b3 + Math.sqrt(delta)) / (2 * a2);
                        double x2 = (-b3 - Math.sqrt(delta)) / (2 * a2);
                        System.out.println("The solutions are x1 = " + x1 + ", x2 = " + x2);
                    } else if (delta == 0) {
                        double x = -b3 / (2 * a2);
                        System.out.println("The solution is x = " + x);
                    } else {
                        System.out.println("The equation has no real roots.");
                    }
                } else {
                    System.out.println("a cannot be 0 in a second-degree equation.");
                }
                break;

            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                break;
        }

        scanner.close();
    }
}