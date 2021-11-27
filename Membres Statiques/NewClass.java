public class NewClass {
    public int num_emp ;
    public int num_class ;
    public int step = 1;

    public NewClass(){
        num_class = step++;
    }
    public void show_number(){
        System.out.println("this is the employer : "+num_emp+" with the class number : "+num_class);
    }
}
