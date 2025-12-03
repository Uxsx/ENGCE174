public class Car {
    // Attributes
    private String model ;
    private int year ;

    // Constructor
    public Car(String model, int year) {
        this.model = model ;
        this.year = year ;
    }

    public String getModel() {
        return model ;
    }

    public int getYear() {
        return year ;
    }

    public void setYear(int newYear) {
        this.year = newYear ;
    }
}