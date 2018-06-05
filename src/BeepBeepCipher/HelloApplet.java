package AppletPackage;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.io.IOException;
import java.io.InputStream;

public class HelloApplet extends Applet implements ActionListener{
    Button b;
    Button boton;
    TextField tf;
    public static String x;
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.setFont(g.getFont().deriveFont(18.0f));
        g.drawString("Welcome to our program!!", 20, 20);

    }

    public void init(){
        b = new Button("RandomSwap");
        b.setBounds(70,50,250,30);
        tf = new TextField();
        tf.setBounds(70,200,250,30);
        boton = new Button("Base64");
        boton.setBounds(70, 100, 250, 30);
        add(b);add(boton);add(tf);
        b.addActionListener(this);
        setLayout(null);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() ==  b){
            try {
                x = tf.getText();
                BoopBoop.RandomSwap.run();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
/*
<applet code="First.class" width="300" height="300">
</applet>

 */