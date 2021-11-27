public class ex10{
    public static void main(String[] args){
        int[] array = {1,2,3,1,4,8,1,4,7,1,3};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1){
                array[i] = 0;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}