import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner point = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("Enter coordinate 1: ");
        String coord1 = point.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coord2 = point.nextLine();
        int x1 = Integer.parseInt(coord1.substring(1,coord1.indexOf(",")));
        int y1 = Integer.parseInt(coord1.substring(coord1.indexOf(",") + 2,coord1.indexOf(")")));
        int x2 = Integer.parseInt(coord2.substring(1,coord2.indexOf(",")));
        int y2 = Integer.parseInt(coord2.substring(coord2.indexOf(",") + 2,coord2.indexOf(")")));

        System.out.println();
        LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
        System.out.println();
        System.out.println("----- Line info -----");
        if (x1 == x2) {
            System.out.println("These points are on a vertical line: x = " + x1);
            System.exit(0);
        }
        if (y1 == y2) {
            System.out.println("These points are on a horizontal line: y = " + y1);
            System.exit(0);
        }
        System.out.println(equation.lineInfo());
        System.out.println();
        double testX = 4;
        System.out.print("Enter a value for x: ");
        double xval = point.nextDouble();
        System.out.println();
        System.out.println("The point on the line is " + equation.coordinateForX(xval));

    }
}