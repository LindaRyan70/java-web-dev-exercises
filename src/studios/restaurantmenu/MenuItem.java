package studios.restaurantmenu;

public class MenuItem {

//  Fields:

    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;


//  Constructor:

    public MenuItem(String name, double price, String description, String category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }


//  Getters/Setters:

//    Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


//    Price:

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


//  Description:

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


//    Category:

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


//    isNew:

    public boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
}
