package ClassCreationCalculator;
import java.util.Scanner;
/*public class CalculatorRunner {
    public static void main(String[]args){
Scanner input = new Scanner(System.in);
Calculator calculator = new Calculator();
System.out.println("Please enter your data type. Your options are: double, integer");
String dataType = input.next();
// Code block that handles doubles
if (dataType.equals("double")) {
System.out.println("Input your value for value1");
    double value1 = input.nextDouble(); // your scanner object must be named input to avoid a mismatch or change the input object name to match your scanner object name
  System.out.println("Input your value for value2");
    double value2 = input.nextDouble();
 System.out.println("Input your operatior. +,-,*,/");
    String operator = input.next();
    String result;

    if (operator.equals("+")){
        result = calculator.addition(value1, value2);
        System.out.println(result);
    }
    else if (operator.equals("-")){
        result = calculator.subtraction(value1, value2);
        System.out.println(result);
    }
    else if (operator.equals("*")){
        result = calculator.multiplication(value1, value2);
        System.out.println(result);
    }
    else if (operator.equals("/")){
        result = calculator.division(value1, value2);
        System.out.println(result);
    }
    else {
        System.err.println("Invalid operator.");
        return;
    }
    // Add your result printing statement here
}

// Code block that deals with integers
if (dataType.equals("integer")) {
System.out.println("Input your value for value1");
    int value1 = input.nextInt();
    System.out.println("Input your value for value2");
    int value2 = input.nextInt();
    System.out.println("Input your operatior. +,-,*,/");
    String operator = input.next();
    String result;

    if (operator.equals("+")){
        result = calculator.addition(value1, value2);
         System.out.println(result);
    }
    else if (operator.equals("-")){
        result = calculator.subtraction(value1, value2);
         System.out.println(result);
    }
    else if (operator.equals("*")){
        result = calculator.multiplication(value1, value2);
         System.out.println(result);
    }
    else if (operator.equals("/")){
        result = calculator.division(value1, value2);
         System.out.println(result);
    }
    else {
        System.err.println("Invalid operator.");
        return;
    }
    // Add your result printing statement here
} 

// Code block to deal with a non-valid data type input
else {
    System.err.println("Data type incompatible - exiting program.");
}
    
}
}*/


public class CalculatorRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Input your value for value1:");
        Double value1 = input.nextDouble();

        System.out.println("Input your value for value2:");
        Double value2 = input.nextDouble();

        System.out.println("Input your operator (+, -, *, /):");
        String operator = input.next();
        String result;

        if (operator.equals("+")) {
            result = calculator.addition(value1, value2);
            System.out.println(result);
        } else if (operator.equals("-")) {
            result = calculator.subtraction(value1, value2);
            System.out.println(result);
        } else if (operator.equals("*")) {
            result = calculator.multiplication(value1, value2);
            System.out.println(result);
        } else if (operator.equals("/")) {
            result = calculator.division(value1, value2);
            System.out.println(result);
        } else {
            System.err.println("Invalid operator.");
        }

        input.close();
    }
}