public class PointTest {
    public PointTest (int x, int y){
        this.x = x ; 
        this.y = y ; 
    }
    public void affCoord(){ 
        System.out.println ("Coordonnees : " + x + " " + y) ;
    }
    private int x, y ;
}