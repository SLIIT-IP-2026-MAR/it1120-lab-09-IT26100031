import java.util.Scanner;

public class IT26100031Lab9Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter value a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter value b: ");
        double b = input.nextDouble();
        
        System.out.print("Enter value c: ");
        double c = input.nextDouble();
        double discriminant = Math.pow(b, 2) - (4 * a * c);
        
        if (discriminant >= 0) {
            System.out.println("Roots are real and different:");
            
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            
            System.out.printf("Root 1: %.2f\n", root1);
            System.out.printf("Root 2: %.2f\n", root2);
        } else {
            System.out.println("The roots are complex and imaginary.");
        }
        
        input.close();
    }
}