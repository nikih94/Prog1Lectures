package EN.P7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ColorListener implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        Random r = new Random();
        b.setBackground(new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256)));
    }
}
