package exercises.chapter7lesson6inheritance.main;

public class Laptop extends Computer {

    private double weight; // laptop weight in pounds.

    public Laptop(int storage, int ram, boolean hasKeyboard, double weight) {
        super(storage, ram, hasKeyboard);
        this.weight = weight;
    }

    public boolean isClunky() {
        if (weight > 5.0) {
            return true;
        }
        else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "This is laptop is " + this.weight + " grams.";
    }


}
