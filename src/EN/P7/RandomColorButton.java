package EN.P7;

import javax.swing.*;

public class RandomColorButton extends JFrame {

    public RandomColorButton(){
        setTitle("Random Color Button");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Change bckg color!");
        add(button);

        button.addActionListener(new ColorListener());

        setVisible(true);
    }

    public static void main(String[] args) {
        new RandomColorButton();
    }

}
