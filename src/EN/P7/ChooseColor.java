package EN.P7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ChooseColor extends MyButton{

    JFrame frame;

    public ChooseColor( Ripple ripple, JFrame frame) {
        super("Choose color", ripple);
        this.frame = frame;
        setBackground(ripple.color);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color color = JColorChooser.showDialog(frame,"Choose a color",ripple.color);
        setBackground(color);
        ripple.color = color;
    }
}
