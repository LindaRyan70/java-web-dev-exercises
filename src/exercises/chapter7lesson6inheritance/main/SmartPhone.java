package exercises.chapter7lesson6inheritance.main;

import java.util.HashMap;

public class SmartPhone extends Computer {

    private int numberOfSelfies;

    private HashMap<String, String> contactBook;

    public SmartPhone(int storage, int ram, boolean hasKeyboard, int numberOfSelfies) {
        super(storage, ram, hasKeyboard);
        this.numberOfSelfies = numberOfSelfies;
    }


    public void addContact(String name, String phoneNumber) {
        this.contactBook.put(name, phoneNumber);
    }



    public void takeSelfie() {
        this.numberOfSelfies = this.numberOfSelfies + 1;
    }

    public int getNumberOfSelfies() {
        return this.numberOfSelfies;
    }



    @Override
    public String toString() {
        return "This is smartphone takes " + this.numberOfSelfies + " selfies.";
    }


}
