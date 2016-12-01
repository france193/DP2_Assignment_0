package com.company.es2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by FLDeviOS on 15/10/2016.
 */

public class GregorianCalendarController {

    private List<GregorianCalendar> istantTimeList;

    public List<GregorianCalendar> importDictionaryFromFile(String filename) throws FileNotFoundException, IOException {

        istantTimeList = new ArrayList<>();

        Integer second, minute, hour, day, month, year;
        String[] myLine;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;

            while( (line = br.readLine()) !=null ) {
                myLine = line.split(" |:|-|/");

                day = Integer.parseInt(myLine[0]);
                month = Integer.parseInt(myLine[1]);
                year = Integer.parseInt(myLine[2]);
                hour = Integer.parseInt(myLine[3]);
                minute = Integer.parseInt(myLine[4]);
                second = Integer.parseInt(myLine[5]);

                istantTimeList.add(new GregorianCalendar(second, minute, hour, day, month, year));
            }

        }

        return istantTimeList;
    }
}
