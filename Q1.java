// public class Q1 {
    
// }
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get array size from user
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        
        // Create and populate array
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Find second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        
        if(secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element exists");
        } else {
            System.out.println("Second largest number is: " + secondLargest);
        }
    }
}