import java.util.Scanner;
public class ex3 {
    public static void main(String[] args){
        // this variable for the last result
        int result = 1;
        //here is the scanner of our input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Put Your Number : ");
        int number = scanner.nextInt();
        // small if condition
        if (number == 0){
            System.out.println("The Factoriel is : 1");
        }
        else{
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
            System.out.println("The Factoriel is : " + result);
        }
    }
}
