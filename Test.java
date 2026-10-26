package ClassCreationCalculator;

public class Test {
    
    public static void main(String[]args){
        //welcomes the user
    System.out.println("Welcome to the program");
    //creates the calculator
    Calculator calc = new Calculator();
    //prints the addition, subtration, multiplication, and division methods.
    System.out.println(calc.addition(8,2));
    System.out.println(calc.subtraction(8,2));
    System.out.println(calc.multiplication(8,2));
    System.out.println(calc.division(8,2));
    //prints teh addition, subtraction, multiplication, and division methods as doubles
    System.out.println(calc.addition(4.5,1.5));
    System.out.println(calc.subtraction(4.5,1.5));
    System.out.println(calc.multiplication(4.5,1.5));
    System.out.println(calc.division(4.5,1.5));
    }
}
