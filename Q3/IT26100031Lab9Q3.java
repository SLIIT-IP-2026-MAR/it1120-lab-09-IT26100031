import java.util.Scanner;
public class IT26100031Lab9Q3 {
    public static void main(String[] args) {
        
        int step1_1 = multiply(3, 4);
        int step1_2 = multiply(5, 7);
        int step1_3 = add(step1_1, step1_2);
        int expression1 = square(step1_3);
        
        System.out.println("Result of (3*4+5*7)^2 : " + expression1);
        
        int step2_1 = add(4, 7);
        int step2_2 = add(8, 3);
        int step2_3 = square(step2_1);
        int step2_4 = square(step2_2);
        int expression2 = add(step2_3, step2_4);
        
        System.out.println("Result of (4+7)^2+(8+3)^2 : " + expression2);
    }
    
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    
    public static int square(int num) {
        return num * num;
    }
}