//Bag.java - Implement a class Bag that stores items represented as strings
// Author:Markintus Morris
// Date: 26-July-2021

import java.util.ArrayList;

public class Bag {

    class Item {

        String itemName;
        int quantity;

    }

    public ArrayList<Item> items= new ArrayList<>();

    public void addItem(String itemName) {
        //What it does: Adds an Item object to the bag
        //How it works: Instantiates a new Item object, and appends it to the Item ArrayList
        Item obj_item= new Item();
        obj_item.itemName= itemName;
        items.add(obj_item);

    }

    public int count(String itemName) {
        //What it does: Counts the number of <itemName> items in the bag
        //How it works: Iterates through the Item ArrayList once to check if each item equals the parameter itemName
        int cnt= 0;
        for (Item item : items) {
            if (itemName.equalsIgnoreCase(item.itemName))
                cnt++ ;
        }

        return cnt;

    }

}
