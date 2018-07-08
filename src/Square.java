public class Square {
    double side;

    Square(double s)
    {
        side = s;
    }

    double squareArea()
    {
        double area = side * side;
        return area;
    }
}
