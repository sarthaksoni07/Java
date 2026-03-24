
class MathOperations {

    static double PI = 3.14159;

    static double areaOfCircle(double radius) {
        double area = radius * radius * PI;
        return area;
    }

    double circumference(double radius) {
        double circum = PI * radius;
        return 2 * circum;
    }

    public static void main(String[] args) {
        System.out.println(MathOperations.areaOfCircle(5));
        MathOperations circle = new MathOperations();
        System.out.println(circle.circumference(5));
    }
}
