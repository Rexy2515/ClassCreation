package ClassCreationCalculator;

/*public class Calculator {

   public String addition(int value1, int value2){
    int num3 = (int) value1 + value2;
      return value1 +"+"+value2+"="+num3;
   }
   public String subtraction(int value1, int value2){
   int num3 = (int) value1 - value2;
     return value1 +"-"+value2+"="+num3;
   }
   public String multiplication(int value1, int value2){
   int num3= (int) value1*value2;
      return value1 +"*"+value2+"="+num3;
   }
   public String division(int value1, int value2){
   int num3= (int) value1/value2;
    return value1 +"/"+value2+"="+num3;


   }

      public String addition(double value1, double value2){
      double num3 = (double) value1+value2;
        return value1 +"+"+value2+"="+num3;
   }
   
   
   public String subtraction(double value1, double value2){
     double num3 = (double) value1-value2;
        return value1 +"-"+value2+"="+num3;

   }

   public String multiplication(double value1, double value2){
      double num3 = (double) value1*value2;
        return value1 +"*"+value2+"="+num3;

   }

   public String division(double value1, double value2){
      double num3 = (double) value1/value2;
        return value1 +"/"+value2+"="+num3;

   }


   
}*/
public class Calculator {

    public <T extends Number> String addition(T value1, T value2) {
        double num3 = value1.doubleValue() + value2.doubleValue();
        return value1 + "+" + value2 + "=" + num3;
    }

    public <T extends Number> String subtraction(T value1, T value2) {
        double num3 = value1.doubleValue() - value2.doubleValue();
        return value1 + "-" + value2 + "=" + num3;
    }

    public <T extends Number> String multiplication(T value1, T value2) {
        double num3 = value1.doubleValue() * value2.doubleValue();
        return value1 + "*" + value2 + "=" + num3;
    }

    public <T extends Number> String division(T value1, T value2) {
        double num3 = value1.doubleValue() / value2.doubleValue();
        return value1 + "/" + value2 + "=" + num3;
    }
}