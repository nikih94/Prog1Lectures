package SLO.P7;

import java.awt.event.ActionEvent;

public class NakljucniGumb extends MojGumb{


    public NakljucniGumb(Ripple ripple) {
        super("RND ripple", ripple);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ripple.rndRipple();
    }
}
