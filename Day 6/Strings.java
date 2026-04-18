//     public static void main(String[] args) {
//         char arr[] = {'a', 'b', 'c', 'd'};
//         String str = "abcd";
//         String str2 = new String("xyz");
        
//         //Strings are IMMUTABLE

//         Scanner sc = new Scanner(System.in);
//         String name;
//         // name = sc.next();
//         name = sc.nextLine();
//         System.out.println(name);
//     }
// }

//String Length

// public class Strings {
//     public static void main(String[] args) {
//         String fullName = "Tony Stark";
//         System.out.println(fullName.length());
//     }    
// }

// String Concatenation 

// public class Strings {
//     public static void main(String[] args) {
//         String firstName = "Ananya";
//         String lastName = "Chaudhary";
//         String fullName = firstName + " " + lastName;
//         System.out.println(fullName);
//     }
// }


//String charAt Method

public class Strings {
    public static void printLetters(String str) {
        for(int i = 0; i<str.length(); i++) {
            System.out.print(str.charAt(i) +  " ");
        }
        System.out.println();
    }
        public static void main(String[] args) {
            
        String firstName = "Ananya";
        String lastName = "Chaudhary";
        String fullName = firstName + " " + lastName;


        printLetters(fullName);
    }
}

