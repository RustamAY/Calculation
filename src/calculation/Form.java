package calculation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame {

    public Form(){
        super("General form");
        super.setBounds(500,500,500, 470);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(5, 1, 2, 10));

        JButton gehStofe = new JButton("Gehandhabte stofe");
        JButton gehBrenstofe = new JButton("Gehandhabte Brennstofe");
        JButton gehTierhaltung = new JButton("Tierhaltung");
        JButton emission = new JButton("Emissionen");

        container.add(gehStofe);
        container.add(gehBrenstofe);
        container.add(gehTierhaltung);
        container.add(emission);

        gehStofe.addActionListener(new OpenGSForm());
        gehBrenstofe.addActionListener(new OpenGehBrens());
        gehTierhaltung.addActionListener(new OpenTierhaltung());

    }

    static class OpenGSForm implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            GehStofForm gehStofForm = new GehStofForm();
            gehStofForm.setVisible(true);
        }
    }

    static class OpenGehBrens implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            GehBrenstofe gehBrenstofe = new GehBrenstofe();
            gehBrenstofe.setVisible(true);
        }
    }

    static class OpenTierhaltung implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Tierhaltung tierhaltung = new Tierhaltung();
            tierhaltung.setVisible(true);
        }
    }


}
