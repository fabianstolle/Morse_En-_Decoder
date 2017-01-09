package de.berlin;

import java.util.Scanner;

/**
 * Created by Stolle Fabian on 09.01.2017.
 */
public class Encoder {
    public static void main (String[] args){
        String inputString;
        System.out.println("Please enter your sequence to be coded:");
        Scanner inputBuffer = new Scanner(System.in);
        inputString = inputBuffer.nextLine();
        Input_Output codeIt = new Input_Output();
        codeIt.getAsciiCode(inputString);
        codeIt.getMorseCode(inputString);

    }
}
