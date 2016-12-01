package com.company.es1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by FLDeviOS on 11/10/2016.
 */
public class Dictionary {

    private List<Item> dictionary = null;

    public Dictionary () {
        dictionary = new ArrayList();
    }

    public void addElement(Item i) {
        dictionary.add(i);
    }

    public List<Item> getDictionary () {
        return dictionary;
    }

    @Override
    public String toString() {
        return dictionary.toString();
    }

    public boolean contains (Item item) {
        for( Item i : this.getDictionary() ) {

            if (item.getWord().equals(i.getWord()) ) {
                return true;
            }
        }

        return false;
    }

}
