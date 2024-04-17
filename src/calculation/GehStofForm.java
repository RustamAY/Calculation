package calculation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GehStofForm extends JFrame {

    public GehStofForm(){
        super("Gehandhabte Stofe");
        super.setBounds(520, 520, 500,450);
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
        JTextField heiz = new JTextField("",1);
        JLabel mass = new JLabel("Massenstorm");
        JTextField massen = new JTextField("",1);
        JLabel gesch = new JLabel("Betriebs-/Geschäftsgeheimnisse:");
        JLabel grundFur = new JLabel("Grund für Geheimhaltung");
        JTextArea grung = new JTextArea();
        JCheckBox betribs = new JCheckBox("",false);
        JButton back = new JButton("Back");
        JButton save = new JButton("Save");

        container.add(bezeichnung);
        container.add(bez_field);
        container.add(verwendung);
        container.add(verComboBox);
        container.add(heizwer);
        container.add(heiz);
        container.add(mass);
        container.add(massen);
        container.add(gesch);
        container.add(betribs);
        container.add(grundFur);
        container.add(grung);
        container.add(back);
        container.add(save);

        back.addActionListener(new ButtonEventManager());
    }

    static class ButtonEventManager implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

}
