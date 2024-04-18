package calculation;

import javax.swing.*;
import java.awt.*;

public class GehBrenstofe extends JFrame {

    public GehBrenstofe(){

        super("Gehandhabte Brennstofe");
        super.setBounds(520, 520, 500,450);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(7, 1, 2, 2));

        String[] items = {
                "00090221 - Heizöl EL",
                "00090210 - Heizöl S",
                "00090222 - Dieselkraftstoff",
                "00090160 - Petroleum",
                "00091760 - Crackbenzin aus Gasöl",
                "00090290 - Erdgas"
        };

        String[] agg = {
                "g - gasformig",
                "l - flussig",
                "s - staubforming"
        };

        JLabel stofNr = new JLabel("Stof-Nr:");
        JComboBox stof = new JComboBox(items);


        container.add(stofNr);
        container.add(stof);
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

    }

}
