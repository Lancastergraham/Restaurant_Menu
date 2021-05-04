package restaurant;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Menu testMenu = new Menu();
        MenuItem testItem1 = new MenuItem("Chicken", 10.99, "vast fields of " +
                "flavor",
                "Main Course", true);
        MenuItem testItem2 = new MenuItem("Beef", 9.99, "raised in Japan",
                "Main Course", true);
        MenuItem testItem3 = new MenuItem("Fish", 12.99, "caught last week",
                "Main Course", false);
        MenuItem testItem4 = new MenuItem("Hot Wings", 12.99, "Lip smacking " +
                "good",
                "Appetizer", false);
        MenuItem testItem5 = new MenuItem("Ice Cream", 12.99, "We all scream",
                "Dessert", true);

        Date todayDate = new Date();

        testMenu.setLastUpdated(todayDate);

        System.out.println(testMenu.getLastUpdated());

        //ArrayList<MenuItem> bugs = new ArrayList<>();

        testMenu.addMenuItem(testItem1);
        testMenu.addMenuItem(testItem2);
        testMenu.addMenuItem(testItem3);
        testMenu.addMenuItem(testItem4);
        testMenu.addMenuItem(testItem5);

        Menu anotherTest = new Menu();

        anotherTest.addMenuItem(testItem1);





        testMenu.removeMenuItem("Chicken");

        System.out.println(testMenu.getMenu().get(0).getName());

        System.out.println(testMenu);
        System.out.println("Hey Alphie!");
        System.out.println(testMenu.equals(anotherTest));
    }
}
