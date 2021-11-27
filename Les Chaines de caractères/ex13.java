import java.util.Scanner;
public class ex13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String need_word;
        String arr[];
        System.out.print("Giv Your Number : ");
        need_word = scanner.nextLine();
        arr = need_word.split("");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        } 
    }
}
