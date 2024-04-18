package calculation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GehBrenstofe extends JFrame {

    public GehBrenstofe(){

        super("Gehandhabte Brennstofe");
        super.setBounds(520, 520, 500,600);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(11, 2, 2, 2));

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
        JLabel aggr = new JLabel("Aggregatzustand");
        JLabel aggrValue = new JLabel("");

//      for (String item : items)
//            if (items[] = )
        JLabel dichte = new JLabel("Dichte (kg/m)");
        JTextField dich = new JTextField("", 1);
        JLabel einsa = new JLabel("Einsatzmenge (m/a)");
        JTextField eins = new JTextField("", 1);
        JLabel heizwert = new JLabel("Heizwert (kJ/kg)");
        JTextField heiz = new JTextField("", 1);
        JLabel schwef = new JLabel("Schwefelgehalt (%)");
        JTextField schwefel = new JTextField("", 1);
        JLabel kohlen = new JLabel("Kohlenstoffgehalt (%)");
        JTextField kohle = new JTextField("", 1);
        JLabel mass = new JLabel("Massenstrom");
        JLabel massValue = new JLabel(" Should be value of massenstrom");
        JLabel gesch = new JLabel("Betriebs-/Geschäftsgeheimnisse:");
        JCheckBox betribs = new JCheckBox("",false);
        JLabel grundFur = new JLabel("Grund für Geheimhaltung");
        JTextArea grung = new JTextArea();
        JButton back = new JButton("Back");
        JButton save = new JButton("Save");


        container.add(stofNr);
        container.add(stof);
        container.add(aggr);
        container.add(aggrValue);
        container.add(dichte);
        container.add(dich);
        container.add(einsa);
        container.add(eins);
        container.add(heizwert);
        container.add(heiz);
        container.add(schwef);
        container.add(schwefel);
        container.add(kohlen);
        container.add(kohle);
        container.add(mass);
        container.add(massValue);
        container.add(gesch);
        container.add(betribs);
        container.add(grundFur);
        container.add(grung);
        container.add(back);
        container.add(save);

        back.addActionListener(new GoBackButton());

    }

    static class GoBackButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

}
