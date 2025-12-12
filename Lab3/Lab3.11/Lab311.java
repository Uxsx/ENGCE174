import java.util.Scanner;

class SystemConfig {
    private static SystemConfig instance;
    
    private String serverUrl;
    private int maxConnections;

    private SystemConfig() {
        this.serverUrl = "default.server.com";
        this.maxConnections = 10;
    }

    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String url) {
        this.serverUrl = url;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int count) {
        if (count > 0) {
            this.maxConnections = count;
            System.out.println("Max connections set.");
        } else {
            System.out.println("Invalid count.");
        }
    }
}

public class Lab311 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            for (int i = 0; i < n; i++) {
                String cmd = scanner.next();
                
                SystemConfig config = SystemConfig.getInstance();

                if (cmd.equals("SET_URL")) {
                    String nUrl = scanner.next();
                    config.setServerUrl(nUrl);
                    
                } else if (cmd.equals("SET_MAX")) {
                    int nMax = scanner.nextInt();
                    config.setMaxConnections(nMax);
                    
                } else if (cmd.equals("SHOW")) {
                    System.out.println("----------------------------------");
                    System.out.println("URL: " + config.getServerUrl());
                    System.out.println("MAX: " + config.getMaxConnections());
                    System.out.println("----------------------------------");
                }
            }
        }
        scanner.close();
    }
}