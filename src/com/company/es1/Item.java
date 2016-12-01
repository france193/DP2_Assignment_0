package com.company.es1;

/**
 * Created by FLDeviOS on 11/10/2016.
 */
public class Item {

    private String word;

    public Item(String name) {
        this.word = new String();
        this.word = name;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return word;
    }

    @Override
    public boolean equals(Object o) {

        //if object passed is not an item return false
        if (!(o instanceof Item)) {
            return false;
        }

        //take object as an item
        Item item = (Item) o;

        //if the two strings are equal
        if (this.getWord() == item.getWord()) {
            return true;
        }

        if (this.getWord() != null) {
            //return compraison value
            return this.getWord().equals(item.getWord());
        } else {
            //this.item is null, if also item.getword() is null, return true
            return item.getWord() == null;
        }

        //return getWord() != null ? getWord().equals(item.getWord()) : item.getWord() == null;
    }

}
