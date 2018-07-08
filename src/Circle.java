public class Circle {
    double radius;

    Circle(double r)
    {
        radius = r;
    }

    double circleArea()
    {
        double area = Math.PI * radius * radius;
        return  area;
    }
}
