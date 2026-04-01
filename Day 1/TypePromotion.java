// public class TypeConversion {
//     public static void main(String[] args) {
//         char a = 'a';
//         char b = 'b';
//         System.out.println((int)(b));
//         System.out.println((int)(a));
//            System.out.println(b - a);

//     }
// }

// public class TypeConversion {
//     public static void main(String[] args) {
//         short a = 5;
//         byte b = 25;
//         char c = 'c';
//         byte bt = (byte) (a + b + c); //Type Casting
//         System.out.println(bt);
//     }
// }
 

// public class TypePromotion {
//     public static void main(String[] args) {
//         int a = 10;
//         float b =  20.25f;
//         long c = 25;
//         double d = 30;
//         double ans = a + b + c + d;
//         System.out.println(ans);
    
//     }
// }


public class TypePromotion {
    public static void main(String[] args) {
        byte b = 5;
        byte a = (byte) (b * 2);  // byte a = b*2; (not allowed)
        System.out.println(a);
    }
}    