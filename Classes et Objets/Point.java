public class Point {
    public String nom = new String();
    public double abscisse;

    public Point(String nam){
        nom = nam;
    }

    public void affiche(){
        System.out.println("Your Point is : "+nom+"("+abscisse+")");
    }

    public void translate(double arg){
        abscisse = abscisse + arg;
        System.out.println("Your New Point : "+nom+"("+abscisse+")");
    }
}
