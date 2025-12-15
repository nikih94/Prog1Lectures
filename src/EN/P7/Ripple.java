package EN.P7;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Ripple extends JPanel {

    double scaling = 0.9;
    BufferedImage canvas;
    Color color;
    int size;

    Ripple(){
        this.setBackground(Color.BLACK);
        this.color = Color.GREEN;
        this.size = 400;
    }

    public void rndDraw(){
        Random r = new Random();
        int x = r.nextInt(this.getWidth());
        int y = r.nextInt(this.getHeight());
        draw(x,y);
    }

    public void draw(int x, int y){
        Graphics2D g2d = canvas.createGraphics();
        g2d.setColor(this.color);
        //draw
        ripple(g2d,x,y,this.size);
        g2d.dispose();
        this.repaint(); //calls paint component
    }

    private void ripple(Graphics g, int x, int y, int size){
        if(size < 1) return;
        g.drawOval(x-size /2,y-size/2,size,size);
        ripple(g,x,y, (int)(size * scaling) );
    }


    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(canvas,0,0,null);
    }

    public void newCanvas(){
        canvas = new BufferedImage(this.getWidth(),this.getHeight(),BufferedImage.TYPE_INT_RGB);
        repaint();
    }



}
