import java.util.Scanner;
import java.util.regex.Matcher;

/**
 * Created by Mayank on 9/10/16.
 */
public class Triangle {


    public static void calculateArea(int a, int b, int c ) throws InvalidTriangleException {
        int halfP = (a+b+c)/2;   // half of the perimeter of triangle
        int area;
        if((a+b)>c && (a+c)>b && (b+c)>a) {
            area = halfP*(halfP-a)*(halfP-b)*(halfP-c);
            System.out.println(sqrt(area));
        }else {
            throw new InvalidTriangleException("Inputs cannot form a valid triangle");
        }

    }

    public static double sqrt(int number) {  // method to calculate square root of a number
        double t;

        double squareRoot = number / 2;

        do {
            t = squareRoot;
            squareRoot = (t + (number / t)) / 2;
        } while ((t - squareRoot) != 0);

        return squareRoot;
    }

    public static void main(String[] args) throws InvalidTriangleException {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        String line;
        String[] sidesOfTriangle;

        line = scanner.nextLine(); //read inputs

        //separate all values by comma
        sidesOfTriangle = line.split(",");

        //parsing the values to Integer
        a=Integer.parseInt(sidesOfTriangle[0]);
        b=Integer.parseInt(sidesOfTriangle[1]);
        c=Integer.parseInt(sidesOfTriangle[2]);
        if(sidesOfTriangle.length!=3){
            throw new InvalidTriangleException("A triangle has 3 sides");
        }

        calculateArea(a,b,c);

    }
}
