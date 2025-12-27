import java.util.Scanner;

class Animal {
    protected String name;
    protected int age;

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

public class lab51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับค่าชื่อและอายุ
        System.out.print("Enter name: ");
        String inputName = sc.nextLine();
        System.out.print("Enter age: ");
        int inputAge = sc.nextInt();

        // 1. สร้างออบเจ็กต์ Dog ขึ้นมา
        Dog myDog = new Dog();

        myDog.name = inputName;
        myDog.age = inputAge;

        // 3. เรียกเมธอด makeSound()
        myDog.makeSound();

        // 4. เรียกเมธอด displayInfo() (เพื่อพิสูจน์ว่าเมธอดถูกสืบทอดมา)
        myDog.displayInfo();
        
        sc.close();
    }
}