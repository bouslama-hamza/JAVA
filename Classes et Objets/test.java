import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Give me Your abscisse : ");

        Point test = new Point("My Point");
        test.abscisse = input.nextDouble();
        
        test.affiche();
        input.close();
    }
}
