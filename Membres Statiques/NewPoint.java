public class NewPoint {
        public NewPoint (int abs, int ord) {
             x = abs ; 
             y = ord ; 
        }
        public void affiche (){
            System.out.println ("Coordonnees " + x + " " + y) ;
        }
        private double x ; // abscisse
        private double y ; // ordonnee
}
