package de.berlin;

import java.util.Scanner;

/**
 * Created by Stolle Fabian on 09.01.2017.
 * Diese Klasse dient der Ausfuehrung des Codes. Es werden ausschliesslich Klassen und Methoden aufgerufen. Es wird selektiert ob der eingegebene String ein Morsecode oder ein Asciicode ist.
 */
public class Encoder {
      public String  getCode(String inputString) {
          String outputBuffer = "";
        Input_Output codeIt = new Input_Output();
        char[] inputChar = inputString.toCharArray();
        if (inputChar[0] == '-' || inputChar[0] == '.')
            outputBuffer = codeIt.getAsciiCode(inputString);

        else
            outputBuffer = codeIt.getMorseCode(inputString);
        return outputBuffer;
    }
}
