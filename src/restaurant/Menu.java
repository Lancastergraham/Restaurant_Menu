package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;


public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> theMenu = new ArrayList<>();

    //Constructor
    public Menu(ArrayList<MenuItem> theMenu, Date lastUpdated) {
        this.theMenu = theMenu;
        this.lastUpdated = lastUpdated;
    }

    public Menu() {

    }

    //getters and setters
    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getMenu() {
        return this.theMenu;
    }

    //Methods
    public void addMenuItem(MenuItem item) {
        this.theMenu.add(item);
    }

    public void userAddItem() {

        Scanner input = new Scanner(System.in);
        String itemName;
        String itemDescription;
        double itemPrice;
        String itemCategory;
        boolean itemIsNew;

        System.out.println("What is the name of the item?: ");
        itemName = input.nextLine();
        System.out.println("What is the item's price: ");
        itemPrice = input.nextDouble();
        System.out.println("What is the item's description: ");
        itemDescription = input.nextLine();
        System.out.println("What is the item's category (Appetizer, Entree, " +
                "Dessert): ");
        itemCategory = input.nextLine();
        System.out.println("Is the item new to the menu?: ");
        itemIsNew = input.nextBoolean();

        MenuItem item = new MenuItem(itemName, itemPrice, itemDescription,
                itemCategory, itemIsNew);

    }

    public void removeMenuItem(String name) {
        String itemToBeRemoved = name.toLowerCase();
        for (int i = 0; i < this.theMenu.size(); i++) {
            if (this.theMenu.get(i).getName().toLowerCase().equals(itemToBeRemoved)) {
                this.theMenu.remove(i);
            }
        }

    }

//    @Override
//    public boolean equals(Object toBeCompared) {
//        if(toBeCompared == this) {
//            return true;
//        }
//        if(toBeCompared == null) {
//            return false;
//        }
//        if(toBeCompared.getClass() != getClass()) {
//            return false;
//        }
//
//        //Cast check
//        Menu checkMenu = (Menu) toBeCompared;
//
//        for (int i = 0; i < this.theMenu.size(); i++) {
//            if (this.theMenu.get(i).getName() == checkMenu.theMenu.get(i).getName()) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(theMenu, menu.theMenu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(theMenu);
    }

    @Override
    public String toString() {
        String itemListing = "";
        String itsNew = "";

        for (int i = 0; i < this.theMenu.size(); i++) {
            if (this.theMenu.get(i).isNew()) {
                itsNew = "New!";
                itemListing += String.format("%s %s that is %s \n",
                        itsNew,
                        this.theMenu.get(i).getName(),
                        this.theMenu.get(i).getDescription());
            }
            else {
                itemListing += String.format("%s is %s\n",
                        this.theMenu.get(i).getName(),
                        this.theMenu.get(i).getDescription());
            }

        }
        return itemListing;
    }


}
