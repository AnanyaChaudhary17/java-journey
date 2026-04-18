// Question 1: Check if a String is a Palindrome.

// public class questionPractice {
//     public static boolean isPalindrome(String str) {
//         for(int i=0; i<str.length()/2; i++) {
//             int n = str.length();
//             if(str.charAt(i) != str.charAt(n-1-i)){
//                 //not a palindrome
//                 return false;

//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         String str = "racecar";
//         System.out.println(isPalindrome(str));
//     }
// }


// Question 2: Given a route containing 4 directions(E,W,N,S), find the shortest path to reach destination.
//    "WNEENESENNN"

// public class questionPractice {
//     public static float getShortestPath(String path) {
//         int x = 0, y=0;

//         for(int i = 0; i<path.length(); i++){
//             char dir = path.charAt(i);
//             //South
//             if(dir == 'S'){
//                 y--;
//             }
//             //North
//             else if(dir == 'N') {
//                 y++;
//             }
//             //West
//             else if(dir == 'W') {
//                 x--;
//             }
//             //East
//             else {
//                 x++;
//             }

//         }
//         int X2 = x*x;
//         int Y2 = y*y;
//         return (float)Math.sqrt(X2 + Y2);
//     }
    
//     public static void main(String[] args) {
//         String path = "WNEENESENNN";
//         System.out.println(getShortestPath(path));
//     }
// }

// Question 3 : For a given set of strings, print the largest string. 
    //    "apple, "mango", "banana"

    // public class questionPractice {
    //     public static void main(String[] args) {
    //         String fruits[] = {"apple", "mango", "banana"};

    //         String largest = fruits[0];
    //         for(int i=1; i<fruits.length; i++) {
    //             if(largest.compareTo(fruits[i]) < 0){
    //                 largest = fruits[i];
    //             }
    //         }

    //         System.out.println(largest);
    //     }
    // }

//Question 4:  For a given String convert each the first letter of each word to uppercase.
     // "hi, i am ananya"

     public class questionPractice{
        public static String toUpperCase(String str) {
            StringBuilder sb = new StringBuilder("");

            char ch = Character.toUpperCase(str.charAt(0));
            sb.append(ch);

            for(int i=1; i<str.length(); i++) {
                if(str.charAt(i)== ' ' && i<str.length()-1) {
                    sb.append(str.charAt(i));    
                    i++;
                    sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
     }
     
     public static void main(String args[]){
        String str = "hi, i am ananya";
        System.out.println(toUpperCase(str));
     }
    }