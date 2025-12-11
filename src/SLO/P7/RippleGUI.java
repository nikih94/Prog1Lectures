package SLO.P7;

import javax.swing.*;
import java.awt.*;

public class RippleGUI extends JFrame {

    public RippleGUI(){
        setTitle("Ripple GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,800);

        Ripple ripple = new MouseRipple();
        add(ripple);
        setVisible(true);
        ripple.newCanvas();

        JPanel desniBar = new JPanel(new GridLayout(2,1));

        NakljucniGumb rndGumb = new NakljucniGumb(ripple);
        desniBar.add(rndGumb);
        BarvnatiGumb bg = new BarvnatiGumb(ripple,this);
        desniBar.add(bg);

        MojSlider slider = new MojSlider(ripple);
        add(slider,BorderLayout.SOUTH);


        add(desniBar, BorderLayout.EAST);


    }

    public static void main(String[] args) {
        new RippleGUI();
    }


}
