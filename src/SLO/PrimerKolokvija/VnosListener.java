package SLO.PrimerKolokvija;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VnosListener implements ActionListener {

    JButton num;

    VnosListener(JButton num){
        this.num = num;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JTextField vnos = (JTextField) e.getSource();
        String text = vnos.getText();
        System.out.println(text);
        vnos.setText("");

        try{
            Integer.parseInt(text);
            num.setText(text);
        }catch (NumberFormatException ex){
            System.out.println("Neveljaven vnos!: "+text);
            System.out.println(ex.getMessage());
        }


    }
}
