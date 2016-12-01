package com.company;

import com.company.es1.Dictionary;
import com.company.es1.DictionaryController;
import com.company.es1.Item;
import com.company.es2.GregorianCalendar;
import com.company.es2.GregorianCalendarController;
import com.company.es3.File;
import com.company.es3.FileController;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    /*
    How Put command line arguments:
        1. ctrl + alt + r
        2. e
        3. Enter
        4. Program arguments: Write your command line parameters (space between each item if you have more than one argument)
        5. Enter
    */

    public static void main(String[] args) throws IOException {
        lab1_es1(args);
        lab1_es2(args);
        lab1_es3(args);
    }

    //ES1
    private static void lab1_es1(String[] args) {
        DictionaryController dictionaryController;

        Dictionary dictionary1 = new Dictionary();
        Dictionary dictionary2 = new Dictionary();

        dictionaryController = new DictionaryController();

        //open file from code
        try {
            dictionary1 = dictionaryController.importDictionaryFromFile("dictionary1.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //open file from argument passed by command line
        try {
            dictionary2 = dictionaryController.importDictionaryFromFile(args[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Element of dictionary_2 not found in dictionary_1: ");
        for (Item item2 : dictionary2.getDictionary()) {

            if (!dictionary1.contains(item2)) {
                System.out.println("- " + item2.toString());
            }
        }

        //System.out.println("Dictionary1: " + dictionary1.toString());
        //System.out.println("Dictionary2: " + dictionary2.toString());
    }

    //ES2
    private static void lab1_es2(String[] args) throws IOException {
        //read file name from property
        String filename = System.getProperty("it.polito.dp2.file");

        List<GregorianCalendar> list = null;
        GregorianCalendarController controller = new GregorianCalendarController();

        System.out.println(filename);

        list = controller.importDictionaryFromFile(filename);

        Collections.sort(list);

        System.out.println("The most recent date is:" + list.get(list.size()-1));
    }

    //ES3
    private static void lab1_es3(String[] args) throws IOException {
        List<File> file1 = null;
        List<File> file2 = null;
        List<File> file3 = null;

        FileController controller = new FileController();

        file1 = controller.importLinesFromFile(args[1]);
        file2 = controller.importLinesFromFile(args[2]);

        file3 = new ArrayList<>();
        file3.addAll(file1);
        file3.addAll(file2);

        Collections.sort(file1);
        Collections.sort(file2);
        Collections.sort(file3);

        System.out.println("FILE 1:");
        System.out.println(file1);
        System.out.println("FILE 2:");
        System.out.println(file2);
        System.out.println("FILE 3:");
        System.out.println(file3);

        controller.writeFile(file3, "output.txt");
    }
}