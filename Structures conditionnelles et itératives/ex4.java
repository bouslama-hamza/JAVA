import java.util.Scanner;

public class ex4 {
    // in this function we use for loop
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Giv The number "+i+" : ");
            result += scanner.nextInt();
        }
        System.out.println("The result is : " +result);
    }
    // in this function we use do while loop
    public static void with_while(String[] args){
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int i = 1;
        while (i <= 4) {
            System.out.print("Giv The number "+i+" : ");
            result += scanner.nextInt();
            i += 1;
        }
        System.out.println("The result is : " +result);
    }
    //in this function we use do while loop
    public static void with_do_while(String[] args){
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int i = 1;
        do{
            System.out.print("Giv The number "+i+" : ");
            result += scanner.nextInt();
            i += 1; 
        }while(i <= 4);
        System.out.println("The result is : " +result);
    }
}

