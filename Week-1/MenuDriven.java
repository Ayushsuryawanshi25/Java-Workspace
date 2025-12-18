// menu driven
import java.util.*;

public class MenuDriven{

public static void main(String [] args){
			 
			  Scanner sc = new Scanner(System.in);
			  System.out.print("enter the size of the array");
			  int n = sc.nextInt();
			  int arr[] = new int [n];
			  System.out.print("enter values");
			   for(int i = 0; i < n ;i++){
				 arr[i] = sc.nextInt();
				 }
				 
				 int choice = 0;
				 while(choice != 8){
				  System.out.println("For performing insertion choose 1");
				  System.out.println("For  performing deletion choose 2");
				  System.out.println("For performing Linear search choose 3");
				  System.out.println("For performingbinary search choose 4");
				  System.out.println("For performing find max value choose 5");
				  System.out.println("For performing counting even and odd choose 6");
				  System.out.println("For performing insertion sort choose 7");
				  System.out.println("Enter your choice");
				  choice = sc.nextInt();
				  //INSERTION
				  if (choice==1) {
				  
				  System.out.print("enter the position");
				  
				  int pos= sc.nextInt();
				  
				  System.out.print("enter the value");
				  
				  int val = sc.nextInt();
				  
				  int newarr[] = new int[n+1]; 
				  
				  for (int i = 0; i < pos - 1;  i++) {
				  newarr[i] = arr[i];
				 }
				 
				 newarr[pos - 1] = val;
				 
				 for (int i = pos - 1; i < n; i++) {
				 newarr[i + 1] = arr[i];
			   }
			   
				arr = newarr; 
				n++;
				
				System.out.print("Element inserted");
				} 
				else if (choice == 2){
				
                // DELETE
                System.out.print("Enter position to delete: ");
                int pos = sc.nextInt();

                int[] delArr = new int[n - 1];

                for (int i = 0; i < pos - 1; i++)
                    delArr[i] = arr[i];

                for (int i = pos; i < n; i++)
                    delArr[i - 1] = arr[i];

                arr = delArr;
                n--;
                System.out.println("Element deleted.");

            } else if (choice == 3) {
                // LINEAR SEARCH
                System.out.print("Enter element to search: ");
                int key = sc.nextInt();
                boolean found = false;

                for (int i = 0; i < n; i++) {
                    if (arr[i] == key) {
                        System.out.println("Element found at position " + (i + 1));
                        found = true;
                        break;
                    }
                }
                if (!found)
                    System.out.println("Element not found.");

            } else if (choice == 4) {
                // BINARY SEARCH (array must be sorted)
                System.out.print("Enter element to search: ");
                int key = sc.nextInt();

                int low = 0, high = n - 1;
                boolean found = false;

                while (low <= high) {
                    int mid = (low + high) / 2;

                    if (arr[mid] == key) {
                        System.out.println("Element found at position " + (mid + 1));
                        found = true;
                        break;
                    } else if (arr[mid] < key) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }

                if (!found)
                    System.out.println("Element not found.");

            } else if (choice == 5) {
                // MAX VALUE
                int max = arr[0];
                for (int i = 1; i < n; i++) {
                    if (arr[i] > max)
                        max = arr[i];
                }
                System.out.println("Maximum value: " + max);

            } else if (choice == 6) {
                // EVEN / ODD
                int even = 0, odd = 0;

                for (int i = 0; i < n; i++) {
                    if (arr[i] % 2 == 0)
                        even++;
                    else
                        odd++;
                }
                System.out.println("Even count: " + even);
                System.out.println("Odd count: " + odd);

            } else if (choice == 7) {
                // INSERTION SORT
                for (int i = 1; i < n; i++) {
                    int temp = arr[i];
                    int j = i - 1;

                    while (j >= 0 && arr[j] > temp) {
                        arr[j + 1] = arr[j];
                        j--;
                    }
                    arr[j + 1] = temp;
                }
                System.out.println("Array sorted using Insertion Sort.");

            } else {
                System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}



      