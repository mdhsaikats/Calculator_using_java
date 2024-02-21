import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        System.out.println("Enter an operator (+, -, *, /):");
        String operator = sc.next();
        
        if (operator.equals("+")) {

            int result = num1 + num2;
            System.out.println("Result of addition: " + result);
        }if else (operator.equals("-"))
        {

            //System.out.println("Unsupported operator. This calculator only supports addition (+).");
        }
    }
}

