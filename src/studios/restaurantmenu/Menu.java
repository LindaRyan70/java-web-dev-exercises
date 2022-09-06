package studios.restaurantmenu;

import java.util.ArrayList;
import java.util.HashMap;

public class Menu {

//  Fields:

    private HashMap<String, ArrayList<MenuItems>> items;


//  Constructor:

    public Menu(HashMap<String, ArrayList<MenuItems>> items) {
        this.items = items;
    }


//  Getters/Setters:

    public HashMap<String, ArrayList<MenuItems>> getItems() {
        return items;
}
    public void setItems(HashMap<String, ArrayList<MenuItems>> items) {
        this.items = items;
    }
}

