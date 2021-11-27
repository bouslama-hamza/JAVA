import java.util.Scanner;
public class ex5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float result  = 1;
        int number;
        System.out.print("Give you number : ");
        number = scanner.nextInt();
        for (int i = 2; i <= number; i++) {
            result += (1 / i);
        }
        System.out.println("The Result is : " + result);
    }
}
 