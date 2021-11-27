import java.util.Scanner;

public class Twopoint{
    public static void main(String[] args){
        Point p1 = new Point("Point One");
        Point p2 = new Point("Point Two");

        Scanner input = new Scanner(System.in);

        System.out.print("Give absciss for first point : ");
        p1.abscisse = input.nextDouble();

        System.out.print("Give absciss for second point : ");
        p2.abscisse = input.nextDouble();
        input.close();
        double distance  = p1.abscisse - p2.abscisse;
        System.out.println("The Distance between des point is : " + Math.abs(distance));
    }

}