public class Circle {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle myCircle = new Circle();
        double myRadius = 5.0;
        double area = myCircle.calculateArea(myRadius);
        System.out.println("The area of the circle with radius " + myRadius + " is: " + area);
    }
}