package EN.P7;

import javax.swing.*;
import java.awt.*;

public class ExFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My first window!!!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);


        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        JButton b1 = new JButton("My first button");
        panel.add(b1);
        JButton b2 = new JButton("2nd button");
        panel.add(b2);
        JButton b3 = new JButton("Extra long long button");
        panel.add(b3);
        JButton b4 = new JButton("small");
        panel.add(b4);

        JPanel panelContainer = new JPanel(new GridLayout(2,1));
        panelContainer.add(panel);

        int c = 4;
        int r = 4;
        JPanel gridOfButtons = new JPanel(new GridLayout(r,c) );

        for (int i = 0; i < c*r; i++) {
            gridOfButtons.add(new JButton("B: " + i));
        }
        panelContainer.add(gridOfButtons);


        JButton north = new JButton("north");
        JButton south = new JButton("south");
        JButton east = new JButton("east");
        JButton west = new JButton("west");

        frame.add(north, BorderLayout.NORTH);
        frame.add(south, BorderLayout.SOUTH);
        frame.add(east,BorderLayout.EAST);
        frame.add(west,BorderLayout.WEST);

        frame.add(panelContainer);
        frame.setVisible(true);
    }
}
