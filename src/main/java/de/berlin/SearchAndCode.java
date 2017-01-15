package de.berlin;


import java.util.Arrays;

/**
 * Created by Stolle Fabian on 27.11.2016.
 * Die Methoden dieser Klasse wandeln den einkommenden String in Morsecode bzw Ascii um. Das Prinzip ist wie folt:
 * - Aufspalten des inputstrings in chars
 * - vergleichen der Zeichen mit einem Array
 * - sobald eine Übereinstimmung ist wird im gegenüberliegenden Array das codierte Äquivalent selektiert und abgespeichert in einem weiteren Array.
 * - Nachdem alle Inputzeichen durchgearbeitet wurden, wird das Ergebnissarray wieder zu einem String zusammengefügt und returned.
 */
public class SearchAndCode {
    String inputString;
    int stringSize;
    String[] asciiArray = new String[stringSize];
    String[] morseArray = new String[stringSize];

    // Analyse , Codierung und Ausgabe in Morsecode
    String getMorseCode() {
        char[] inputChar = inputString.toCharArray();
        String[] outputStringArray = new String[inputChar.length];
        String outputString = "";
        int i = 0;
        int j = 0;
        // Suchalgorythmus: Prüft ob es ein Morsecode oder ein Asciicode ist
        if (inputChar[0] != '-' && inputChar[0] != '.') {
            outputStringArray=createMorseCode(inputChar, i, j);
            i = 0;
            //System.out.print("\nyou wrote:" + inputString + "\n in Morsecode it is :");
            // Ausgabe des Codes
            while (i != outputStringArray.length) {
                //System.out.print(outputStringArray[i] + "_");
                outputString = outputString + outputStringArray[i] + "_";
                i++;
            }
        }
        return outputString;
    }

    private String[] createMorseCode(char[] inputChar, int i, int j) {
        String[] outputString=new String[inputChar.length];
        String compBuffer;
        boolean compareValues;
        do {
            // Die Eingabe ( inputChar ) wird mit dem AsciiArray verglichen bis eine Übereinstimmung ist,
            // wenn keine Übereinstimmung wird das Zeichen als Leerzeichen interpretiert
            compBuffer = Character.toString(inputChar[j]);
            compBuffer = compBuffer.toLowerCase();
            if (i < (asciiArray.length - 1))
                compareValues = compBuffer.equals(asciiArray[i]);
            else compareValues = true;
            // Kopieren des korrespondierenden Morsecodes zum gefundenen Zeichen in den Output
            if (compareValues) {
                outputString[j] = morseArray[i];
                i = 0;
                j++;
            } else {
                i++;
            }
        } while (j != inputChar.length);
        return outputString;
    }

    String getAsciiCode() {
        String inputstringBuffer = inputString + "_";
        char[] inputChar = inputstringBuffer.toCharArray();
        String[] outputStringArray = new String[inputChar.length];
        String compBuffer;
        String outputString = "";
        boolean compareValues = false;
        int i = 0;
        int j = 0;
        int d = 0;
        int k = 0;
        char[] charArrayBuffer;
        String stringBuffer;
        // Suchalgorythmus: Prüft ob es ein Morsecode oder ein Asciicode ist
        if (inputChar[0] == '-' || inputChar[0] == '.') {
            k = createAsciiCode(inputChar, outputStringArray, compareValues, j, d, k);
            i = 0;
           // System.out.print("\nyou wrote:" + inputString + "\n in Morsecode it is :");
            // Ausgabe des Codes
            while (i < (k)) {
                //System.out.print(outputStringArray[i]);
                outputString = outputString + outputStringArray[i];
                i++;
            }
        }
        return outputString;
    }

    private int createAsciiCode(char[] inputChar, String[] outputString, boolean compareValues, int j, int d, int k) {
        String compBuffer;
        char[] charArrayBuffer;
        String stringBuffer;
        int i;
        do {
            // Die Eingabe ( inputChar ) wird mit dem AsciiArray verglichen bis eine Übereinstimmung ist,
            // wenn keine Übereinstimmung wird das Zeichen als Leerzeichen interpretiert
            compBuffer = Character.toString(inputChar[j]);
            if (j < inputChar.length)
                compareValues = compBuffer.equals("_");
            if (compareValues) {
                charArrayBuffer = Arrays.copyOfRange(inputChar, d, j);
                stringBuffer = String.valueOf(charArrayBuffer);
                d = j + 1;
                i = 0;
                do {
                    if (i < morseArray.length)
                        compareValues = stringBuffer.equals(morseArray[i]);
                    else compareValues = true;
                    // Kopieren des korrespondierenden Morsecodes zum gefundenen Zeichen in den Output
                    if (compareValues) {
                        outputString[k] = asciiArray[i];
                        i = morseArray.length;
                        k++;
                    } else {
                        i++;
                    }
                } while (i < morseArray.length);
            }
            j++;
        } while (j < inputChar.length);
        return k;
    }

    public SearchAndCode(String sInputString, int sStringSize, String[] sAsciiArray, String[] sMorseArray) {
        inputString = sInputString;
        stringSize = sStringSize;
        asciiArray = sAsciiArray;
        morseArray = sMorseArray;
    }
}

