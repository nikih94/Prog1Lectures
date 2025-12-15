package EN.P7;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MySlider extends JSlider implements ChangeListener {

    Ripple ripple;

    MySlider(Ripple ripple){
        super(50,400,100);
        this.ripple = ripple;
        this.ripple.size = 100;
        this.addChangeListener(this);
    }


    @Override
    public void stateChanged(ChangeEvent e) {
        int value = ((MySlider) e.getSource()).getValue();
        ripple.size = value;
    }
}
