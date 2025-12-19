import java.util.*;

public class Reverse{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);   //taking input
System.out.println("enter the size of the array");
int n = sc.nextInt();
int [] arr = new int [n];
for (int i = 0 ; i < n ; i++){
 arr[i] = sc.nextInt();
}
int j = 0;
int [] temp = new int [n];
for (int i = n-1; i>=0; i--){
   temp[j]=arr[i];  
   j++;   
}
System.out.println(Arrays.toString(temp));
}
}