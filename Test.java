public class Test{
   public static void main(String[]args){
    int a =5;
    int b = 7;

    System.out.println(a);
System.out.println(b);

    try {
      int result =a/0; //
    } catch (ArithmeticException e) {
      e.printStackTrace();
    }
   finally{

      System.out.println("I want to reach my destination..!");
   }
 
    System.out.println("Program ended...");
   }

}