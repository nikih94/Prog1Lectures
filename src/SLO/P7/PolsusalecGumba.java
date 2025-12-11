package SLO.P7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class PolsusalecGumba implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton gumb = (JButton) e.getSource();
        Random r = new Random();
        gumb.setBackground(new Color( r.nextInt(256),r.nextInt(256),r.nextInt(256)));
    }
}
