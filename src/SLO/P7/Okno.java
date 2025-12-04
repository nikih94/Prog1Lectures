package SLO.P7;

import javax.swing.*;
import java.awt.*;

public class Okno {

    public static void main(String[] args) {
        JFrame okno = new JFrame("Moje prvo okno");
        okno.setSize(600,400);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        panel.add(new JButton("North"),BorderLayout.NORTH);
        panel.add(new JButton("West"),BorderLayout.WEST);
        panel.add(new JButton("South"),BorderLayout.SOUTH);
        panel.add(new JButton("Eastfgfxdgfdgdxgfxdfgf"),BorderLayout.EAST);
        panel.add(new JButton("Center"));




        okno.add(panel);
        okno.setVisible(true);
    }
}
