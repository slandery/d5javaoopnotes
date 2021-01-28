//this is a blueprint of our objects
//note pasta is extending Food
//Pasta is acting as a child to the parent class Food
//As such, it inherits all the qualities of Food
//The child can do everything the parent can plus more
public class Pasta extends Food{

    //below are properties of a class in Java,ie fields
    private String shape;
    //shape
    private String flour;
    //flour
    private boolean freshness;
    //fresh or dry

    //we now need a constructor
    //will not return anything so its not a method
    public Pasta(String shape, String flour, boolean freshness){
        super(true);
        this.shape = shape;
        this.flour = flour;
        this.freshness = freshness;

    }
    public String getShape(){
        return shape;
    }
}
