public class Points{
    public Points (int abs, int ord) { 
        x = abs ; 
        y = ord ; 
    }
    public void deplace (int dx, int dy) {
        x += dx ; 
        y += dy ; 
    }
    public void absciss(){
        System.out.println("The Absciss is : "+x);
    }
    public void ordonnee(){
        System.out.println("The ordonne is : "+y);
    }
        private double x ; // abscisse
        private double y ; // ordonnee
}