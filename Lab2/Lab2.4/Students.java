public class Students {
    private String name;
    private int midtermScore;
    private int finalScore;
    
    public Students(String n, int midtermScore, int finalScore) {
        this.name = n ;
        this.midtermScore = midtermScore ;
        this.finalScore = finalScore ;
    }

    public double calculateAverage(){
        return (midtermScore + finalScore) / 2 ;
    }

    public void displaySummary() {
        double average = calculateAverage();
        String status;

        if (average >= 50.0) {
            status = "Pass";
        } else {
            status = "Fail";
        }

        System.out.println("Name: " + name);
        System.out.println("Average Score: " + average);
        System.out.println("Status: " + status);
    }
}
