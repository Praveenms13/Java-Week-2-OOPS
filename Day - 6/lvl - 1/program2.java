import java.util.Scanner;

public class Circle {
    int radius = 20;
    public double calculateArea() {
        if (radius<=0) {
            return 0;
        }
        return Math.PI * Math.pow(radius, 2);
    } 
    public double calculateCircumference() {
        if (radius<=0) {
            return 0;
        }
        return 2 * Math.PI * radius;
    }
}

public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circleObj = new Circle();

        System.out.print("Enter Radius of the Circle: ");
        circleObj.radius = scanner.nextInt();

        System.out.printf("Area: %.2f%n", circleObj.calculateArea());
        System.out.printf("Circumference: %.2f%n", circleObj.calculateCircumference());
    }
}