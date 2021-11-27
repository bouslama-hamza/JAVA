abstract public class Forme {
    // create all  abstract method
    abstract public void affiche() ;
    abstract public void homothetie(double coeff);
    abstract public void rotation(double angle);

    // homo rot
    public void homoRot(double coeff , double angle){
        homothetie(coeff);
        rotation(angle);
    }
    
    // affcher les figure 
    public  void afficheFigure(){
        affiche();
    }

    // homothetieFigure
    public void homothetieFigure(double coeff){
        homothetie(coeff);
    }

    //rotation of figure
    public void rotationFigure(double angle){
        rotation(angle);
    }

    //the mode Affichable 
    public void Affichable(){
        affiche() ;
    }

    //the mode Transformable
    public void Transformable(){
        homothetie(coeff - 1);
        rotation(angle - 1);
    }
    
}
