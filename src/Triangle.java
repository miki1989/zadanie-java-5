public class Triangle {
    double side1;
    double side2;
    double side3;

    Triangle( double s1, double s2, double s3)
    {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    double trianglePerimeter()
    {
        double perimeter = side1 + side2 + side3;
        return  perimeter;
    }
}
