package SLO.PrimerKolokvija;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VajaGui extends JFrame {

    VajaGui(){
        setSize(300,200);
        setTitle("Okno");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(3,1));

        JButton zapri = new JButton("Zapri");
        zapri.addActionListener(new ZapriListener());

        JButton num = new JButton("16");
        num.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = num.getText();

                int vrednost = Integer.parseInt(text);

                if (vrednost > 1) {
                    vrednost /= 2;
                }
                num.setText("" + vrednost);
            }
        });

        JTextField vnos = new JTextField();
        vnos.addActionListener(new VnosListener(num));

        add(zapri);
        add(num);
        add(vnos);

        setVisible(true);
    }

    public static void main(String[] args) {
        new VajaGui();
    }
}
