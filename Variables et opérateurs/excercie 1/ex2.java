public class ex2 {
    public static void main(String[] args){
        // here is the variable 
        float a = 1 , b = 4 , c = 3;
        // the delta of our equation
        float Delta = (b*b) - (4 * a *c);
        // the answers
        double answer_one;
        double answer_two;
        // the condition part ..
        if(Delta > 0){
            answer_one = (-b + Math.sqrt(Delta)) / 2 * a ;
            answer_two = (-b - Math.sqrt(Delta)) / 2 * a ;
            System.out.println("The answer is : " +answer_one+ " and " + answer_two);
        } 
        else if(Delta == 0){
            answer_one = -b / 2 * a ;
            System.out.println("The answer is : " +answer_one);
        }
        else {
            System.out.println("This equation can't be solved");
        }
    }
}
