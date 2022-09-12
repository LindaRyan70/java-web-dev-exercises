package studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {

/*  Studio Part 4a: Create several items and add them to a menu. */
        MenuItem menuItem1 = new MenuItem("hamburger", 5.50,"very tasty", "entree", false);
        MenuItem menuItem2 = new MenuItem("cheeseburger",6.99,"also tasty", "entree", false);
        MenuItem menuItem3 = new MenuItem("cheesecake",4.50,"extremely tasty", "dessert", true);

//      Creating a new ArrayList
        ArrayList<MenuItem> ourMenu = new ArrayList<>();


//      Date Option 1: Create new Date Object and then pass it into the Menu().
      Date updatedDate = new Date();
      Menu newMenu = new Menu(ourMenu, updatedDate);


//      Date Option 2: Instructor create a new Date Object directly when passing it into the Menu().
//        Menu newMenu = new Menu(ourMenu, new Date());

//      My group created an addItem() method in our Menu class to be able to add new items over time.
        newMenu.addItem(menuItem1);
        newMenu.addItem(menuItem2);
        newMenu.addItem(menuItem3);



/*  Studio Part 4b: Print the entire, updated menu to the screen. */
//      Using our printMenu() method from our Menu class to print the newMenu() object after adding additional items.
        newMenu.printMenu();

//      These lines print the reference to location memory for either the 3 MenuItems in ourMenu() or the 1 newMenu().
//        System.out.println(ourMenu);
//        System.out.println(newMenu);


/* Studio Part 4c: Print an individual menu item to the screen. */

//     Printing out 1 menuItem:
        System.out.println(menuItem1.getName() + ": " + menuItem1.getPrice() + ", " + menuItem1.getDescription() + ", "
                + menuItem1.getCategory() + ", " + menuItem1.getIsNew() + "\n");


/*  Studio Part 4d: Delete an item from a menu, then reprint the menu. */

//     My group created a deleteItem() method in our Menu class to be able to remove an item over time.
        newMenu.deleteItem(menuItem2);

//     Printing newMenu() after deleting menuItem2 from the items ArrayList.
        newMenu.printMenu();

    }
}
