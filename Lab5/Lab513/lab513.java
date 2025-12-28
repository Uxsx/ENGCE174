import java.util.Scanner;

class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public int getClearanceLevel() {
        return 1;
    }
}

class Developer extends User {
    protected int projects;

    public Developer(String name, int projects) {
        super(name);
        this.projects = projects;
    }

    @Override
    public int getClearanceLevel() {
        return 2;
    }
}

class Admin extends Developer {
    protected String adminKey;

    public Admin(String name, int projects, String adminKey) {
        super(name, projects);
        this.adminKey = adminKey;
    }

    @Override
    public int getClearanceLevel() {
        return 3;
    }

    public String getAdminKey() {
        return adminKey;
    }
}

public class lab513 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Developer Name: ");
        String devName = sc.nextLine();
        System.out.print("Enter Number of Projects: ");
        int devProjects = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Admin Name: ");
        String adminName = sc.nextLine();
        System.out.print("Enter Admin Projects: ");
        int adminProjects = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Admin Key: ");
        String adminKey = sc.nextLine();

        User u1 = new User("Guest"); 
        Developer d1 = new Developer(devName, devProjects);
        Admin a1 = new Admin(adminName, adminProjects, adminKey);

        User[] users = {u1, d1, a1};

        int totalClearance = 0;
        for (User u : users) {
            totalClearance += u.getClearanceLevel();
        }

        for (User u : users) {
            if (u instanceof Admin) {
                Admin tempAdmin = (Admin) u;
                System.out.println("Admin Key found: " + tempAdmin.getAdminKey());
            }
        }

        System.out.println("Total Clearance: " + totalClearance);
        
        sc.close();
    }
}