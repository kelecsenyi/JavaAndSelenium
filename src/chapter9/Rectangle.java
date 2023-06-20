package chapter9;

public class Rectangle {

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
    }

    protected double length;
    protected double width;
    protected double sides = 4;

    public double calculatePerimeter(){
        return (2*length)+(2*width);
    }
    public void print(){
        System.out.println("Hello rectangle");
    }
}