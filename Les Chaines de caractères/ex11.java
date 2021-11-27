import java.util.Scanner;
public class ex11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String need_word;
        String arr[];
        System.out.print("Giv Your Sentence : ");
        need_word = scanner.nextLine();
        arr = need_word.split("");
        System.out.println("The first word is : "+arr[0]+" And the last is : "+arr[(arr.length)-1]);
    }
}
