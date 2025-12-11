package SLO.P7;

import javax.swing.*;
import java.awt.event.ActionListener;

public abstract class MojGumb extends JButton implements ActionListener {

    Ripple ripple;

    public MojGumb(String text,Ripple ripple){
        super(text);
        this.ripple = ripple;
        this.addActionListener(this);
    }

}
