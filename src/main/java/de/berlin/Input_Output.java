package de.berlin;


import java.util.Scanner;

/**
 * Created by Stolle Fabian on 14.11.2016.
 *
 */
public class Input_Output {
    private ReadFile asciiCode = new ReadFile(42, "D:\\UNI\\Semester_5\\Software Engineering\\Uebung\\Morse_En-_Decoder\\src\\main\\java\\ASCIIcode.txt");
    private ReadFile morseCode = new ReadFile(42, "D:\\UNI\\Semester_5\\Software Engineering\\Uebung\\Morse_En-_Decoder\\src\\main\\java\\Morsecode.txt");

    public String getAsciiCode(String inputString) {
        String outputString;
        // Erstellen von eines Arrays aus den txt dateien
        String[] asciiArray = asciiCode.getArray();
        String[] morseArray = morseCode.getArray();
        // Eingabe Aufforderung
        // Analyse und Codierung in Morsecode der Eingabe
        SearchAndCode asciiToMorse = new SearchAndCode(inputString, asciiArray.length,asciiArray, morseArray);
        outputString = asciiToMorse.getAsciiCode();
        //System.out.println("\nTEST TEST " +outputString+" TEST TEST Hier ist Asciicode");
    return outputString;
    }
    public String getMorseCode(String inputString) {
        String outputString;
        String[] asciiArray = asciiCode.getArray();
        String[] morseArray = morseCode.getArray();
        int i = 0;
        // Eingabe Aufforderung
        // Analyse und Codierung in Morsecode der Eingabe
        SearchAndCode asciiToMorse = new SearchAndCode(inputString, asciiArray.length, asciiArray, morseArray);
        outputString = asciiToMorse.getMorseCode();
        //System.out.println("\nTEST TEST " +outputString+" TEST TEST Hier ist Morsecode");
        return outputString;
    }
}
