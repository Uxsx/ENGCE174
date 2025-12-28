import java.util.Scanner;

class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class lab51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String inputName = sc.nextLine();
        
        System.out.print("Enter age: ");
        int inputAge = sc.nextInt();

        Dog myDog = new Dog(inputName, inputAge);

        myDog.makeSound();
        myDog.displayInfo();
        
        sc.close();
    }
}