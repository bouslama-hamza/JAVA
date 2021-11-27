public class PointNom extends PointTest{
    public PointNom(int x, int y , char nom) {
        super(x, y);
        this.x = x ;
        this.y = y;
        this.nom = nom;
    }
    public void affCoord(){ 
        System.out.println ("New Coordonnees : "+nom+" "+x+" "+y) ;
    }
    private int x, y ;
    private char nom;
}
    





