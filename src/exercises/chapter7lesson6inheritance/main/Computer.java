package exercises.chapter7lesson6inheritance.main;


public class Computer extends AbstractEntity {  // "extends AbstractEntity" added for Exer. Part 3 Abstract class.
    // computer is my parent class

    private int ram;
    private int storage;
    private boolean hasKeyboard;

    public Computer(int storage, int ram, boolean hasKeyboard) {
        super();    //  This line is added to allow access to AbstractEntity no-argument constructor.
        this.ram = ram;
        this.storage = storage;
        this.hasKeyboard = hasKeyboard;
    }

    public void increaseRAM (int n) {
        this.ram = this.ram + n;
    }

    public void increaseStorage (int x) {
        this.storage = this.storage + x;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public boolean isHasKeyboard() {
        return hasKeyboard;
    }
}
