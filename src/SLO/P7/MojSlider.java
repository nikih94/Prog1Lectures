package SLO.P7;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MojSlider extends JSlider implements ChangeListener {

    Ripple ripple;

    MojSlider(Ripple ripple){
        super(0,500,100);
        this.ripple = ripple;
        ripple.size = 100;
        this.addChangeListener(this);

    }

    @Override
    public void stateChanged(ChangeEvent e) {
        ripple.size = getValue();
    }
}
