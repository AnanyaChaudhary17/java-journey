// Write a Java program to get a number from the user and print whether it is positive or negative.
import java.util.*;

//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
       
//        if(num>=0){
//         System.out.println("Positive");
//        }
//        else{
//         System.out.println("Negative");
//        }
//     }
// }

//Write a program to prints You have a fever if your temperature is above 100 and otherwise prints You dont't have a fever.

// public class practiceQuestion{
//     public static void main(String[] args) {
//         double temp = 103.5;
//         if(temp > 100){
//             System.out.println("You have a fever");
//         }
//         else{
//             System.out.println("You don't have a fever");
//         }
//     }
    
// }

// Write a Java Program to input week number(1-7)and print day of week name using switch case.

// public class practiceQuestion{
//     public static void main(String[] args) {
//         int num = 5;
//         switch(num){
//             case 1 : System.out.println("Monday");
//                          break;
//             case 2 : System.out.println("Tuesday");             
//                          break;
//             case 3 : System.out.println("Wednesday");
//                         break;
//             case 4 : System.out.println("Thursday");
//                         break;
//             case 5 : System.out.println("Friday");
//                         break;
//             case 6 : System.out.println("Saturday");
//                         break;            
//             case 7 : System.out.println("Sunday");
//                         break;
//         }                 
//     }
// }                  //output; Friday



// finding value (ternary operator).

// public class practiceQuestion{
//     public static void main(String[] args) {
//         int a = 63, b=36;
//         boolean x = (a<b) ? true : false; //output; false
//         int y = (a>b)? a : b; //output ; a
//     }
// }

//Write a Java program that takes a year from the user and print whether that year is a leap year or not.
   
public class practiceQuestion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter a year: ");
         int year = sc.nextInt();

         if((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)){
               System.out.println("Leap Year");
         } else{
            System.out.println("Not a leap year");
         }
         
        
        
        }    
}              //output; 2024 leap year
