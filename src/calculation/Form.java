package calculation;

import javax.swing.*;
import java.awt.*;

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


    }

}
