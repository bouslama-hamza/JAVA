import java.util.Scanner;
public class ex12 {
    public static void main(String[] args){
        Scanner scanne = new Scanner(System.in);
        int count_a = 0, count_e = 0,  count_i = 0, count_o = 0, count_u = 0, count_y = 0;
        String need_word;
        String arr[];
        System.out.print("Giv Your Sentence : ");
        need_word = scanne.nextLine();
        arr = need_word.split(""); 
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case "a": count_a +=1; break;
                case "e": count_e +=1; break;
                case "i": count_i +=1; break;
                case "o": count_o +=1; break;
                case "u": count_u +=1; break;
                case "y": count_y +=1; break;
            }
        }
        System.out.println("you repeat a "+count_a+" times");
        System.out.println("you repeat e "+count_e+" times");
        System.out.println("you repeat i "+count_i+" times");
        System.out.println("you repeat o "+count_o+" times");
        System.out.println("you repeat u "+count_u+" times");
        System.out.println("you repeat y "+count_y+" times");
    }
}
