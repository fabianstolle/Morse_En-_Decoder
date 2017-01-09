package de.berlin;


import java.util.Scanner;

/**
 * Created by Stolle Fabian on 14.11.2016.
 */
public class Input_Output {
    public String getAsciiCode(String inputString) {
        String outputString;

        // Einlesen von den Textdateien
        ReadFile asciiCode = new ReadFile(42, "D:\\UNI\\Semester_5\\Software Engineering\\Uebung\\Morse_En-_Decoder\\src\\main\\java\\ASCIIcode.txt");
        ReadFile morseCode = new ReadFile(42, "D:\\UNI\\Semester_5\\Software Engineering\\Uebung\\Morse_En-_Decoder\\src\\main\\java\\Morsecode.txt");
        // Erstellen von eines Arrays aus den txt dateien
        String[] asciiArray = asciiCode.getArray();
        String[] morseArray = morseCode.getArray();
        int i = 0;
        // Eingabe Aufforderung
        // Analyse und Codierung in Morsecode der Eingabe
        SearchAndCode asciiToMorse = new SearchAndCode(inputString, asciiArray.length,asciiArray, morseArray);
        outputString = asciiToMorse.getAsciiCode();
        //System.out.println("\nTEST TEST " +outputString+" TEST TEST Hier ist Asciicode");
    return outputString;
    }
    public String getMorseCode(String inputString) {
        String outputString;
        // Einlesen von den Textdateien
        ReadFile asciiCode = new ReadFile(42, "D:\\UNI\\Semester_5\\Software Engineering\\Uebung\\Morse_En-_Decoder\\src\\main\\java\\ASCIIcode.txt");
        ReadFile morseCode = new ReadFile(42, "D:\\UNI\\Semester_5\\Software Engineering\\Uebung\\Morse_En-_Decoder\\src\\main\\java\\Morsecode.txt");
        // Erstellen von eines Arrays aus den txt dateien
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
