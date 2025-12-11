package SLO.P7;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Ripple extends JPanel {

    public double scaling = 0.9;
    BufferedImage canvas;
    Color color;
    int size;

    public Ripple(){

        setBackground(Color.BLACK);
        color = Color.GREEN;
        size = 400;
    }

    public void rndRipple(){
        Random r = new Random();
        int x = r.nextInt(this.getWidth());
        int y = r.nextInt(this.getHeight());
        drawRipple(x,y);
    }


    public void drawRipple(int x, int y){
        Graphics2D g2d = canvas.createGraphics();
        g2d.setColor(color);
        ripple(g2d,x,y,size);
        g2d.dispose();
        repaint();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(canvas,0,0,null);
    }


    private void ripple(Graphics g , int x, int y, int size){
        if(size < 1) return;
        g.drawOval(x - size / 2, y -size / 2,size, size);
        ripple(g,x,y,(int) (size * scaling));
    }
    public void newCanvas(){
        canvas = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_RGB);
        repaint();
    }

    public static void main(String[] args) {
        JFrame okno = new JFrame("Ripple");
        okno.setSize(600,600);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Ripple ripple = new Ripple();

        okno.add(ripple);

        okno.setVisible(true);
        ripple.newCanvas();
        ripple.drawRipple(600/2,600/2);
    }


}
