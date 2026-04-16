
import java.util.Scanner;

// In a program, input 3 numbers: A, B and C. You have to output the average of these 3 numbers.

// public class practiceQuestion {
//     public static void main(String[] args) {
//         int a = 4;
//         int b = 6;
//         int c = 2;
//         int sum = a + b + c;
//         int avg = sum / 3;
//         System.out.println(sum);
//         System.out.println(avg);
    
//     }
// }

// In a program, input the side of a square. You have to output the area of the square.

// public class practiceQuestion {

//     public static void main(String[] args) {
//         int side1 = 6;
//         int side2 = 6;
//         int area= side1 * side2;
//         System.out.println(area);

//     }
// }

// Enter cost of 3 items from the user(using float data type)- a pencil, a pen and an eraser. You have to output the total cost of the item back to the user as their bill.

public class practiceQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of pencil");
        float pencil = sc.nextFloat();
        System.out.println("Enter the price of pen");
        float pen = sc.nextFloat();
          System.out.println("Enter the price of eraser");
        float eraser = sc.nextFloat();
        
        float total = pencil + pen + eraser;
        System.out.println("Total cost = " + total);
        
    }
}