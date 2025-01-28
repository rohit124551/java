// //take two array of 3d and find the sum.
// public class Q2 {
    
// }
//     public static void main(String[] args) {
//         // Initialize two 3D arrays
//         int[][][] arr1 = {
//             {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
//             {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
//             {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
//         };
        
//         int[][][] arr2 = {
//             {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}},
//             {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}},
//             {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}}
//         };
        
//         // Create array to store sum
//         int[][][] sum = new int[3][3][3];
        
//         // Calculate sum of corresponding elements
//         for(int i = 0; i < 3; i++) {
//             for(int j = 0; j < 3; j++) {
//                 for(int k = 0; k < 3; k++) {
//                     sum[i][j][k] = arr1[i][j][k] + arr2[i][j][k];
//                 }
//             }
//         }
        
//         // Print the resultant sum array
//         System.out.println("Sum of two 3D arrays:");
//         for(int i = 0; i < 3; i++) {
//             for(int j = 0; j < 3; j++) {
//                 for(int k = 0; k < 3; k++) {
//                     System.out.print(sum[i][j][k] + " ");
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//     }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to check if prime: ");
    int num = sc.nextInt();
    
    boolean isPrime = true;
    
    if (num <= 1) {
        isPrime = false;
    } else {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
    }
    
    if (isPrime) {
        System.out.println(num + " is a prime number");
    } else {
        System.out.println(num + " is not a prime number");
    }
    
    sc.close();
}
