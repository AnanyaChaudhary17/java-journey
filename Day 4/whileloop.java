
// public class whileloop {
//     public static void main(String args[]) {
//         int counter = 0;
//         while(counter < 100) {
//             System.out.println("Hello World");
//             counter++;

//         }

//         System.out.println("printer HW 100x");
//     }
// }

// Print number from 1 to 10

// public class whileloop {
//     public static void main(String[] args) {
//         int counter = 1;
//         while(counter <= 10){
//             System.out.print(counter+" " );
//             counter++;
//         }
//         System.out.println();
//     }

// }


// Print number from 1 to n
// import java.util.*;

// public class whileloop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int range = sc.nextInt();
//         int counter = 1;

//         while(counter <= range) {
//             System.out.print(counter + " ");
//             counter++;

//         } 
    
//        }

// }

// Print sum of first n natural numbers
// import java.util.*;
// public class whileloop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         int i=1;
//         while(i<=n){
//             sum += i;
//             i++;

//     } 
//         System.out.println("sum is : " + sum); 
//        }
// }

// Print Reverse of a number

// public class whileloop {
//     public static void main(String[] args) {
//         int n = 10899;

//         while(n>0) {
//             int lastDigit = n % 10;
//             System.out.print(lastDigit);
//             n = n / 10;

//         }
//         System.out.println();
//     }
// }

// Reverse the given number (10899)

public class whileloop {
    public static void main(String[] args) {
        int n = 10899;
        int rev = 0;
        while(n>0) {
            int lastDigit = n % 10;
            rev = (rev*10) + lastDigit;
            n = n / 10;

        }
        System.out.println(rev);
    }
}

