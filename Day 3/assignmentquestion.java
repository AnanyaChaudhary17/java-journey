// Question 1 :- Print the largest of 2 Numbers

// public class assignmentquestion {
//     public static void main(String[] args) {
//         int A = 1;
//         int B = 3;
//         if(A > B){
//             System.out.println( "A is largest of 2");
//         } else {
//             System.out.println("B is largest of 2");
//         }
//     }
// }

// Question 2 :- Print if a number is Odd or Even

// import java.util.*;
// public class assignmentquestion {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         if(number % 2 == 0){
//             System.out.println("Even");    
//         } else {
//             System.out.println("Odd");
//         }
//     }
// }

// Question 3 :- Income tax Calculator


// import java.util.*;
// public class assignmentquestion {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int income = sc.nextInt();
//         int tax;

//         if(income < 500000){
//             tax = 0;
//         }
//         else if(income >= 500000 && income < 1000000) {
//             tax = (int) (income * 0.2);
//          } else {
//             tax = (int) (income * 0.3);

//         }

//          System.out.println("your tax is : " + tax);
//         }
//     }


// Question 4:- Print the largest of 3


import java.util.*;
public class assignmentquestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if((A > B) && (A>C)){
                   System.out.println("A is largest of 3");    
        }else if(B>C) {
            System.out.println("B is largest of 3");
            }
        else {
            System.out.println("C is largest of 3");
        }    
        
    }
}