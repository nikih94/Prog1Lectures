package EN.P7;

import javax.swing.*;
import java.awt.event.ActionListener;

public abstract class MyButton extends JButton implements ActionListener {

    Ripple ripple;

    public MyButton(String text, Ripple ripple){
        super(text);
        this.ripple = ripple;
        this.addActionListener(this);
    }

}
