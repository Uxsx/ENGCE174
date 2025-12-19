package Lab47;
import java.util.Scanner;

class Resource {
    private String id;

    public Resource(String id) {
        this.id = id;
        System.out.println("Resource " + id + " created.");
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Resource " + id + " finalized (destroyed).");
        } finally {
            super.finalize();
        }
    }
}

public class lab47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String id1 = scanner.next();
        String id2 = scanner.next();
        String id3 = scanner.next();

        Resource r1 = new Resource(id1);
        Resource r2 = new Resource(id2);
        Resource r3 = new Resource(id3);

        r1 = null;
        r2 = null;

        System.gc();

        r3 = null;

        System.gc();

        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        scanner.close();
    }
}
