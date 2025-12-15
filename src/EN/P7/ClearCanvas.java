package EN.P7;

import java.awt.event.ActionEvent;

public class ClearCanvas extends MyButton{
    public ClearCanvas( Ripple ripple) {
        super("Clear ripples", ripple);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ripple.newCanvas();
    }
}
