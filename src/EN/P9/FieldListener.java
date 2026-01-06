package EN.P9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FieldListener implements ActionListener {

    JButton number;

    FieldListener(JButton number){
        this.number = number;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JTextField field = (JTextField) e.getSource();
        String text = field.getText();
        System.out.println("Entered: "+text);
        field.setText("");
        if(checkNumber(text)){
            number.setText(text);
        }else{
            System.out.println("Not a Number !!");
        }

    }

    private boolean checkNumber(String text){
        for (int i = 0; i < text.length(); i++) {

            if(i==0 && !Character.isDigit(text.charAt(0))){
                if (!(text.charAt(0)=='+'||text.charAt(0)== '-')){
                    return false;
                }

            }else if(!Character.isDigit(text.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
