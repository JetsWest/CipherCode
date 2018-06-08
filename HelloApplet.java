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
        Font myFont = new Font("Comic Sans MS", Font.ITALIC | Font.BOLD, 12);
        g.setFont(myFont.deriveFont(15F));
        g.drawString("Welcome to our program!!", 20, 20);
        g.drawString("Hello Mr. Booth. " +
                "We have chosen to not add a decoder for the random swap, " +
                "as it is incredibly unintuitive and it does not make sense to implement.", 20, 40);
        g.drawString("Type your text here and then click the decoder.", 20, 180);
        g.drawString("Here is your decoded text:", 20, 245);
        g.drawString(BoopBoop.Base64Decode.getString(), 235, 245);

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
                init();
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
                remove(d);
                remove(eep);
                x = "";
                init();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        if (e.getSource() == eep){
            BoopBoop.Base64Decode.setString("2");
            x = tf.getText();
            try {
                BoopBoop.Base64Decode.run();
                remove(d);
                remove(eep);
                x ="";
                init();
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