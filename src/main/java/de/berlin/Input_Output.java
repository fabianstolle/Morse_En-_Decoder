package de.berlin;


import java.util.Scanner;

/**
 * Created by Stolle Fabian on 14.11.2016.
 *  In dieser Klasse werden mit hilfe der Readfile-Klasse die Txt Datein in dem Systemspeicher eingelesen und zur Verfügung gestellt.
 *  Daraufhin wird die Codierung mit Hilfe der Methoden getAsciiCode bzw getMorseCode aufgerufen. Das Codieren wird mit der Klasse SearchAndCode realisiert.
 */
public class Input_Output {
    private ReadFile asciiCode = new ReadFile(42, "D:\\UNI\\Semester_5\\Software Engineering\\Uebung\\Morse_En-_Decoder\\src\\main\\resources\\ASCIIcode.txt");
    private ReadFile morseCode = new ReadFile(42, "D:\\UNI\\Semester_5\\Software Engineering\\Uebung\\Morse_En-_Decoder\\src\\main\\resources\\Morsecode.txt");
    // Erstellen von eines Arrays aus den txt dateien
    private String[] asciiArray = asciiCode.getArray();
    private String[] morseArray = morseCode.getArray();

    public String getAsciiCode(String inputString) {
        String outputString;
        // Analyse und Codierung in Morsecode der Eingabe
        SearchAndCode asciiToMorse = new SearchAndCode(inputString, asciiArray.length,asciiArray, morseArray);
        outputString = asciiToMorse.getAsciiCode();
        //System.out.println("\nTEST TEST " +outputString+" TEST TEST Hier ist Asciicode");
    return outputString;
    }
    public String getMorseCode(String inputString) {
        String outputString;
        // Analyse und Codierung in Morsecode der Eingabe
        SearchAndCode asciiToMorse = new SearchAndCode(inputString, asciiArray.length, asciiArray, morseArray);
        outputString = asciiToMorse.getMorseCode();
        //System.out.println("\nTEST TEST " +outputString+" TEST TEST Hier ist Morsecode");
        return outputString;
    }
}
