package EN.P9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CloneListner implements ActionListener {

    JButton first;
    JButton second;

    CloneListner(JButton first,JButton second){
        this.first = first;
        this.second = second;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton pressed = (JButton) e.getSource();
        if(pressed == first){
            second.setText(first.getText());
        }else {
            first.setText(second.getText());
        }
    }
}
