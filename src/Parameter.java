public class Parameter {
    public static void main(String[] args) {
        calculateArea(2.3,3.6);// these values which are we passing are known as Arguments
        calculateArea(2.5,5.0);
        calculateArea(5,6);
    }
    public static void calculateArea(double length , double width) // the variables which will store the values are known as paramters
    {
        double area = length* width;
        System.out.println(" Area: " +area);
    }
}
