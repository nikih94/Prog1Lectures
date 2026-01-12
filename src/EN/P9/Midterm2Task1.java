package EN.P9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Midterm2Task1 extends JFrame {


    Midterm2Task1(){
        this.setSize(300,200);
        this.setTitle("Midterm 2 example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        this.setLayout(new GridLayout(4,1));



        JButton close = new JButton("Close");
        close.addActionListener(new CloseListner());


        this.add(close);
        JButton number = new JButton("16");
        number.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = number.getText();
                int value = Integer.parseInt(text);
                if(value > 1){
                    value /=2;
                    number.setText(""+value);
                }
            }
        });

        this.add(number);
        JTextField field = new JTextField();
        field.addActionListener(new FieldListener(number));
        this.add(field);

        JButton clone = new JButton("100");

        CloneListner cloneListener = new CloneListner(number,clone);
        clone.addActionListener(cloneListener);
        number.addActionListener(cloneListener);

        add(clone);


        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Midterm2Task1();
    }

}
