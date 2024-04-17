package calculation;

import javax.swing.*;
import java.awt.*;

public class GehStofForm extends JFrame {

    public GehStofForm(){
        super("Gehandhabte Stofe");
        super.setBounds(500, 500, 500,450);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(7, 1, 2, 2));

        String[] items = {
                "00 - Einsatz = Endprodukt (Lagerstoff)",
                "01 - Einsatz",
                "02 - Zuschlag",
                "03 - Endprodukt",
                "04 - Nebenprodukt",
                "05 - Brennstoff"
        };

        JLabel bezeichnung = new JLabel("Bezeichnung:");
        JTextField  bez_field = new JTextField("", 1);
        JLabel verwendung = new JLabel("Verwendung:");
        JComboBox verComboBox = new JComboBox(items);
        JLabel heizwer = new JLabel("Heizwert Hu (kJ/kg):");
        JLabel mass = new JLabel("Massenstorm");
        JLabel gesch = new JLabel("Betriebs-/Geschäftsgeheimnisse:");
        JCheckBox betribs = new JCheckBox("",false);
        JTextArea grung = new JTextArea();
        JButton save = new JButton("Save");
    }

}
