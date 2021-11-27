public class TstPnt{
    public static void main (String args[]){
        Points a = new Points(3, 5);
        a.absciss() ;
        a.ordonnee();
        a.deplace(2, 0) ; 
        a.absciss() ;
        a.ordonnee();
        Points b = new Points(6, 8) ; 
        b.absciss() ;
        b.ordonnee();
        b.deplace(2, 0) ; 
        b.absciss() ;
        b.ordonnee();
    }
}