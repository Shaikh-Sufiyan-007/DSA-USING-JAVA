public class Contructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sufiyan";
        s1.roll = 123;

        Student s2 = new Student(s1);

    }
}

class Student {
    int roll;
    String name;

    // Copy Contructor 
    Student(Student s1) {
        System.out.print(s1.roll + " " + s1.name);
    }

    Student() {
        System.out.println("Contructor is called...");
    }

    Student(int roll) {
        this.roll = roll;
        System.out.println(roll);
    }

    Student(String name) {
        this.name = name;
        System.out.println(name);
    }
}
