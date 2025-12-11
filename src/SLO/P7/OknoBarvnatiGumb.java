package SLO.P7;

import javax.swing.*;

public class OknoBarvnatiGumb extends JFrame {

    public OknoBarvnatiGumb(){
        setTitle("Gumb ki spremeni barvo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);

        JButton gumb = new JButton("Nakljucna barva");

        gumb.addActionListener(new PolsusalecGumba());
        add(gumb);


        setVisible(true);
    }

    public static void main(String[] args) {
        new OknoBarvnatiGumb();
    }
}
