package polymorphism;
//packages are a way to organize code(kinda a folder) and to avoid name collisions
public class Square extends Shape{
    private boolean hasEqualSides;
    private final int amountOfSides =4;

    public Square(int width, int height, boolean hasEqualSides) {
        super(width, height);
        this.hasEqualSides= hasEqualSides;
    }

    public boolean hasEqualSides() {
        return hasEqualSides;
    }

    public int getAmountOfSides() {
        return amountOfSides;
    }
}
