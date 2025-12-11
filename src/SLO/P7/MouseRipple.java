package SLO.P7;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseRipple extends Ripple implements MouseListener {

    MouseRipple(){
        super();
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
            drawRipple(e.getX(),e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
