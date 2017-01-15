package Gui;

import de.berlin.Encoder;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Stolle Fabian on 14.01.2017.
 * Diese Klasse beinhaltet die GUI der Software. in dieser werden Aussehen und Funktionalität der Benutzeroerfläsche festgelegt.
 * Hier befindet sich ebenfalls die Main mit der das Programm ausgeführt werden soll.
 */
public class MorseCodeGUI {
    private JButton codierenButton;
    private JTextField inputString;
    private JTextField outputString;
    private JPanel anwendung;
    private Encoder encode = new Encoder();
    private String outputBuffer = "";
    public MorseCodeGUI() {
        codierenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputBuffer = encode.getCode(inputString.getText());
                System.out.println(outputBuffer);
                outputString.setText(outputBuffer);
            }
        });
        inputString.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputBuffer = encode.getCode(inputString.getText());
                System.out.println(outputBuffer);
                outputString.setText(outputBuffer);
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Morsecode De-/Encoder");
        frame.setContentPane(new MorseCodeGUI().anwendung);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
