public class Rectangle {
    double width;
    double length;

    Rectangle (double w, double l)
    {
        width = w;
        length = l;
    }

   double rectPerimeter()
   {
        double perimeter = 2 * (width + length);
        return perimeter;
   }

   double rectArea()
   {
       double area = width * length;
       return area;
   }
}
