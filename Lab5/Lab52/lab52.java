import java.util.Scanner;

class Animal {
    protected String name;
    protected int age;

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class lab52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("cat name: ");
        String n = sc.nextLine();
        System.out.print("cat age: ");
        int a = sc.nextInt();

        Cat myCat = new Cat();
        
        myCat.name = n;
        myCat.age = a;

        myCat.displayInfo();

        myCat.makeSound();
        
        sc.close();
    }
}