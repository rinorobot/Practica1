package com.example.appnewyorktimes

data class Resultado(var url:String, var section: String, var title: String)

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Graphics;

public class Dibujo extends JFrame{

    Dibujo(){
        setLayout(null);
        setBounds(300,300,800,400);

    }

    public static void main(String[] args) {
        Dibujo lienzo = new Dibujo();
        lienzo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lienzo.setVisible(true);

    }

    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.red);
        g.drawLine(200, 100, 250, 200);
        g.drawOval(50, 100, 100, 100);
        g.drawRect(300, 100, 100, 100);
        g.setColor(Color.BLACK);
        g.drawRoundRect(450, 100, 100, 50, 20, 20);

        int v_x [] = {650,600,650,700};
        int v_y [] = {100,150,200,100};
        g.drawPolygon(v_x,v_y,4);

        g.setColor(Color.BLUE);
        g.fillRect(50, 250, 100, 50);
        g.fillOval(200, 250, 150, 100);
        g.fillRoundRect(400, 250, 150, 100,5, 5);

        int vx_t [] = {600,650,700};
        int vy_t [] = {350,250,350};
        g.fillPolygon(vx_t, vy_t, 3);
    }

}