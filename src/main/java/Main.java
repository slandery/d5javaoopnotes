import polymorphism.Shape;
import polymorphism.Square;

public class Main {
    public static void main(String[] args){
        //new instance of an object"pasta"
        Pasta pasta = new Pasta("elbow", "wheat", true);
        //getters are the ideal sense of encapsulation
        System.out.println(pasta.getShape());
        //poly-many morph-change
        //obj can be referred to as another type of object
        Food myPasta = new Pasta("elbow", "wheat", true);
        //but i cannot invoke Pasta methods due to polymorphism
        //myPasta.getShape();
        Shape mySquare = new Square(4,4, true );
        System.out.println(mySquare.toString());
    }
}
