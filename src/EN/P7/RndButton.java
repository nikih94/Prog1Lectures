package EN.P7;

import java.awt.event.ActionEvent;

public class RndButton extends MyButton{

    public RndButton(Ripple ripple) {
        super("Rnd Ripple", ripple);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ripple.rndDraw();
    }
}
