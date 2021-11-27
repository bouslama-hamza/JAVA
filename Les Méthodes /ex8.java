import java. util. Arrays;
public class ex8 {
    //a method that calcule the rectangle
    public static float rectangle(int longe , int larg){
        return longe *larg;
    }
    //a method to find the min and max of 4 number 
    public static void max_min(int a , int b , int c , int d){
        int max =  Math.max(Math.max(a, b) , Math.max(c, d));
        int min =  Math.min(Math.min(a, b) , Math.min(c, d));
        System.out.println("The max number is : " + max);
        System.out.println("The min number is : " + min);
    }
    //a method to sort 7 number 
    public static void sort_number(int[]array){
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
    }
    // the main function to test our method
    public static void main(String[] args){
        int[] list  = {1 , 5 , 8 , 7 , 9 , 3 , 4};
        int num_one = 2 , num_two = 4 , num_tree = 3 , num_four = 5;
        System.out.println("the surface is : " + rectangle(num_one, num_two));
        max_min(num_one, num_two, num_tree, num_four);
        sort_number(list);
    } 
}
