package SLO.P7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class BarvnatiGumb extends MojGumb{

    JFrame okno;

    public BarvnatiGumb( Ripple ripple,JFrame okno) {
        super("Izberi barvo", ripple);
        this.okno = okno;
        setBackground(ripple.color);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color color = JColorChooser.showDialog(okno, "Izberi barvo",ripple.color);
        ripple.color = color;
        setBackground(color);
    }
}
