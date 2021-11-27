import jdk.javadoc.internal.doclint.Checker.Flag;
public class ex7 {
    public static void main(String[] args){
        //here we declare our variable
        double num_one = 4;
        //here we test the sqrt function
        double sqrt_result = Math.sqrt(num_one);
        System.out.println("The racine of "+num_one+"is : "+sqrt_result);
        //here we test the power function
        double pow_result = Math.pow(num_one, 2);
        System.out.println("The power of "+num_one+"is : "+pow_result);
        //here we test the sin con tan functions
        double sin_result = Math.sin(num_one);
        double cos_result = Math.cos(num_one);
        double tan_result = Math.tan(num_one);
        System.out.println("The sin is : "+sin_result);
        System.out.println("The cos is : "+cos_result);
        System.out.println("The tan is : "+tan_result);
    }
}
