package AppletPackage;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class HelloApplet extends Applet implements ActionListener{
    private Button b, d,boton, eep;
    private TextField tf;
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
        d = new Button("Decode");
        d.setBounds(70,50,250,30);
        eep = new Button("Encode");
        eep.setBounds(70, 100, 250, 30);
        add(b);add(boton);add(tf);
        b.addActionListener(this);
        eep.addActionListener(this);
        d.addActionListener(this);
        boton.addActionListener(this);
        setLayout(null);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() ==  b) {
            x = tf.getText();
            try {
                BoopBoop.RandomSwap.run();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        if (e.getSource() == boton){
            remove(b);
            remove(boton);
            add(d);
            add(eep);
        }
        if (e.getSource() == d){
            BoopBoop.Base64Decode.setString("1");
            x = tf.getText();
            try {
                BoopBoop.Base64Decode.run();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        if (e.getSource() == eep){
            BoopBoop.Base64Decode.setString("2");
            x = tf.getText();
            try {
                BoopBoop.Base64Decode.run();
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