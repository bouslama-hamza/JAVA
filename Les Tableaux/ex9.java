import java.util.Scanner;
public class ex9 {
    public static void main(String[] args){
        int[] array = new int[5];
        int sum = 0;
        int min;
        int max;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Giv The number "+(i+1)+" : ");
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        max = array[0]; 
        min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
            else if(array[i] < min){
                min = array[i];
            }
        }
        System.out.println("The max number : "+max);
        System.out.println("The min number : "+min);
        System.out.println("Moyen  : "+(sum / 5));
    }
}
