public class Inheritance {
//    public static void main(String[] args) {
    //    Fish shark = new Fish();
    //    shark.eat();
//    } 
// }

// //Base class
// class Animal {
//     String color;

//     void eat(){
//         System.out.println("eats");
//     }

//     void breathe() {
//         System.out.println("breathe");
//     }
// }

//Derived class / subclass
// class Fish extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("swims in water");
//     }
// }


//Multi level inheritance
    
    // public static void main(String[] args) {
        

    //    Dog dobby = new Dog();
    //    dobby.eat();
    //    dobby.legs = 4;
    //    System.out.println(dobby.legs);
//    } 
// }

// //Base class
// class Animal {
//     String color;

//     void eat(){
//         System.out.println("eats");
//     }

//     void breathe() {
//         System.out.println("breathe");
//     }
// }

// class Mammal extends Animal {
//     int legs;
// }

// class Dog extends Mammal {
//     int breed;
// }


// Hierarchial Inheritance
    public static void main(String [] args) {
         Fish shark = new Fish();
       shark.eat();
    

   } 
}

//Base class
class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walk");
   } 
} 

class Fish extends Mammal {
    void swim() {
        System.out.println("swim");
    }
}
class Bird extends Mammal {
    void fly() {
        System.out.println("fly");
   }    
}

//Hybrid Inheritance
  







