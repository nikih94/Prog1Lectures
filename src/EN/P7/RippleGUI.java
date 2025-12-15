package EN.P7;

import javax.swing.*;
import java.awt.*;

public class RippleGUI extends JFrame {

    public RippleGUI(){
        this.setSize(800,600);
        this.setTitle("Ripple GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Ripple ripple = new ClickableRipple();
        ripple.addMouseListener((ClickableRipple) ripple);
        this.add(ripple);

        JPanel rightBar = new JPanel(new GridLayout(3,1));

        RndButton rnd = new RndButton(ripple);
        rightBar.add(rnd);

        ChooseColor cc = new ChooseColor(ripple,this);
        rightBar.add(cc);

        ClearCanvas clear = new ClearCanvas(ripple);
        rightBar.add(clear);

        this.add(rightBar,BorderLayout.EAST);

        MySlider ms = new MySlider(ripple);
        add(ms, BorderLayout.SOUTH);



        this.setVisible(true);
        ripple.newCanvas();
    }

    public static void main(String[] args) {
        new RippleGUI();
    }
}
