package chapter6;

public class HomeAreaCalculator {
    public static void main(String args[]){
        Rectangle r1 = new Rectangle();
        r1.setLength(50);
        r1.setWidth(25);
        double areaOfRoom = r1.calculateArea();

        Rectangle r2 = new Rectangle(50,25);
        double areaOFRoomTwo = r2.calculateArea();

        double totalArea = areaOfRoom+areaOFRoomTwo;

        System.out.println("Total area: "+totalArea);
    }
}
