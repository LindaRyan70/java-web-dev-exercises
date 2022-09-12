package studios.restaurantmenu;

import java.util.ArrayList;
import java.util.Date;


public class Menu {

//  Fields:

    private ArrayList<MenuItem> items;
    private Date updatedDate;


//  Constructor:

    public Menu(ArrayList<MenuItem> items, Date updatedDate) {
        this.items = items;
        this.updatedDate = updatedDate;
    }


//  Getters/Setters:

//  ArrayList<MenuItem>:

    public ArrayList<MenuItem> getItems() {
        return items;
}

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }


//  Date:

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }


//    Methods:

    public ArrayList<MenuItem> addItem(MenuItem addedItem) {
        this.items.add(addedItem);
        return this.items;
    }

    public ArrayList<MenuItem> deleteItem(MenuItem deleteItem) {
        this.items.remove(deleteItem);
        return this.items;
    }


//    Studio Review with Jayde:
  public void printMenu() {
        String myString = "";
        for (MenuItem item : this.items) {
            myString += item.getName() + ": $" + item.getPrice() + ", " + item.getDescription() + ", " + item.getCategory() + ", " + item.getIsNew() + "\n";
        }
      System.out.println(myString);
  }

}

