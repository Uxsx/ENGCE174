import java.util.Scanner;

class Animal {
    // Attributes เดิมตามโจทย์
    protected String name;
    protected int age;

    // Method เดิมแสดงข้อมูล
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class lab52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cat name: ");
        String inputName = sc.nextLine();
        System.out.print("Enter cat age: ");
        int inputAge = sc.nextInt();

        Cat myCat = new Cat();

        myCat.name = inputName;
        myCat.age = inputAge;

        myCat.displayInfo();

        myCat.makeSound();
        
        sc.close();
    }
}
