public class Constructor {
    
//     public static void main(String[] args) {
//         Student s1 = new Student("Ananya");
//         System.out.println(s1.name);
//     }
// }

// class Student {
//     String name;
//     int roll;

//     public Student(String name) {
//         this.name = name;
//     }
// }


    public static void main(String[] args) {
        Student s1 = new Student();
        // Student s2 = new Student("ananya");
        // Student s3 = new Student(123);
        // Student s4 = new Student("navya", 321); give error

        s1.name = "ananya";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;


        Student s2 = new Student(s1); //copy
        s2.password = "xyz";
        s1.marks[2] = 100;

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];


    //shallow copy constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }

    //deep copy constructor
      Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }

     Student() {
        marks = new int[3];
        System.out.println("constructor is called...");
    } //non-parametrized

    Student(String name){
         marks = new int[3];
        this.name = name;
    }  //parametrized constructor


    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}

