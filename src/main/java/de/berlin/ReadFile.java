package de.berlin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Stolle Fabian on 14.11.2016.
 */
public class ReadFile {
    String file;
    int stringArraySize;
    String[] getArray() {
        String[] stringArray = new String[stringArraySize];
    try

    {
        int i = 0;
        Scanner sccode = new Scanner(new File(file));
        while (sccode.hasNext()) {
            stringArray [i] = sccode.nextLine();
            //System.out.println("Zeichen " + i + " = " + stringArray[i]);
            i++;
        }
    }

        catch(FileNotFoundException e) {}
        return stringArray;
}
public ReadFile(int sStringArraySize,String sFile){
    stringArraySize = sStringArraySize;
    file = sFile;
}
}