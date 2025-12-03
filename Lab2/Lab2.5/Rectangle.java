public class Rectangle {
    private double width ;
    private double height ;

    public Rectangle(double w, double h){
        this.width = w ;
        this.height = h ;
    }

    public double getArea(){
        return width * height ;
    }

    public double getPerimeter(){
        return 2 * (width + height) ;
    }
}