// calculator

 import java.util.*;

public class Calculator{

   public static int add(int a, int b){
     return a+b;
   }

   public static int sub(int a, int b){
     return a-b;
   }

   public static int  multi(int a, int b){
     return a*b;
   }
 
   public static int divi(int a, int b){
     return a/b;
   }

   public static int  remain(int a, int b){
     return a%b;
   }

   public static int  square(int a, int b){
     return a*a;
   }


   public static void main(String [] args){ 	
    System.out.print("enter two numbers");
	
    Scanner sc = new Scanner(System.in);
	
    int a = sc.nextInt();
    int b = sc.nextInt(); 
	
    System.out.println(add(a,b));
	
    System.out.println(sub(a,b));
	
    System.out.println(multi(a,b));
	
    System.out.println(divi(a,b));
	
    System.out.println(remain(a,b));
	
    System.out.println(square(a,b));
}
}