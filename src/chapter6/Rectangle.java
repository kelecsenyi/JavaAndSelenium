package chapter6;

public class Rectangle {

    //Fields
    private double width;
    private double length;

    //Constructors
    public Rectangle(){
    length = 0;
    width = 0;
    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    // Getters and Setters
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }
   public void setWidth(double width){
        this.length = width;
    }

    //Methods
    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }
    public double calculateArea(){
        return length * width;
    }
}
