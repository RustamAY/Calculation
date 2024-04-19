package calculation;

import javax.management.remote.JMXConnectorFactory;
import javax.swing.*;
import java.awt.*;

public class Emissionen extends JFrame {

    public Emissionen(){

        super("Emissionen form");
        super.setBounds(500,500,600,450);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(13,2,2,10));


    }

}
