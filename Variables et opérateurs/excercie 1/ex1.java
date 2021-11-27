public class ex1 {
    public static void main(String[] args){
        // Those are the four variables
        float var_one = 3 , var_two = 4 , var_three = 5 , var_four = 7 ;
        // Here is the result
        float sum_result  = var_one + var_two + var_three + var_four;                            //sum
        float div_result = (var_one + var_two + var_three + var_four) / 4;                       //division
        float max_result = Math.max(Math.max(var_one, var_two) ,  Math.max(var_three, var_four));//max
        float min_result = Math.min(Math.min(var_one, var_two) ,  Math.min(var_three, var_four));//min
        // Now we show ou result
        System.out.println("The Sum      : " + sum_result);
        System.out.println("The Division : " + div_result);
        System.out.println("The Max      : " + max_result);
        System.out.println("The Min      : " + min_result);
    }
}