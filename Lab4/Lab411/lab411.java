package Lab411;
import java.util.Scanner;

class Configuration {
    private final String theme;
    private final int fontSize;
    private final boolean darkMode;

    public Configuration(String theme, int fontSize, boolean darkMode) {
        this.theme = theme;
        
        if (fontSize < 10) {
            this.fontSize = 10;
        } else if (fontSize > 20) {
            this.fontSize = 20;
        } else {
            this.fontSize = fontSize;
        }
        
        this.darkMode = darkMode;
    }

    public Configuration(Configuration base, Configuration user) {
        this.theme = user.theme;
        this.darkMode = user.darkMode;
        this.fontSize = base.fontSize;
    }

    public void displaySettings() {
        System.out.println("Theme: " + theme + ", Size: " + fontSize + ", Dark: " + darkMode + "");
    }
}


public class lab411 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String baseTheme = scanner.next();
        int baseSize = scanner.nextInt();
        boolean baseDark = scanner.nextBoolean();
        Configuration baseConfig = new Configuration(baseTheme, baseSize, baseDark);

        String userTheme = scanner.next();
        int userSize = scanner.nextInt();
        boolean userDark = scanner.nextBoolean();
        Configuration userConfig = new Configuration(userTheme, userSize, userDark);

        Configuration finalConfig = new Configuration(baseConfig, userConfig);

        finalConfig.displaySettings();

        scanner.close();
    }
}  
