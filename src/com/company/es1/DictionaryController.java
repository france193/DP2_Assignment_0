package com.company.es1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by FLDeviOS on 11/10/2016.
 */
public class DictionaryController {

    //attributes
    private Dictionary dictionary;

    //constructor
    public DictionaryController () {
        dictionary = new Dictionary();
    }

    public Dictionary getDictionary() {
        return dictionary;
    }

    public static Dictionary importDictionaryFromFile (String filename) throws FileNotFoundException, IOException {

        Dictionary dictionary = new Dictionary();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while( (line = br.readLine()) !=null ) {
                dictionary.addElement(new Item(line));
            }

        }

        return dictionary;
    }
}