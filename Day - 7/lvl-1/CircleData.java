import java.util.Scanner;

class Circle {
    private int radius;
    Circle () {
        this.radius = 10;
    }
    Circle (int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return this.radius;
    }
}

public class CircleData {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int radius = scanner.nextInt();
        Circle circleObj = new Circle();
        System.out.println(circleObj.getRadius());
        Circle circleObje = new Circle(radius);
        System.out.println(circleObje.getRadius());
    } 
}