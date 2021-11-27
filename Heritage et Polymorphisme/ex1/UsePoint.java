public class UsePoint {
    public static void main(String args[]){
        PointTest test_first = new PointTest(3,7);
        PointNom test_second = new PointNom(5,7,'N');
        // this objets in gonna call the affcord of PointTest
        test_first.affCoord();
        // this objets in gonna call the affcord of PointNom
        test_second.affCoord();
        // and this is the polymorphisme
    } 
}
