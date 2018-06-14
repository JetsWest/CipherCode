package AppletPackage;

import BoopBoop.Vigenere;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class HelloApplet extends Applet implements ActionListener{
    private Button b, d,boton, eep, binary,bdecode,bencode, vig, vigdec,vigenc;
    private TextField tf;
    public static String x;
    private int i = 0;

    public void paint(Graphics g){
        g.setColor(Color.red);
        Font myFont = new Font("Comic Sans MS", Font.ITALIC | Font.BOLD, 12);
        g.setFont(myFont.deriveFont(15F));
        g.drawString("Welcome to our program!!", 20, 20);
        g.drawString("Hello Mr. Booth. " +
                "We have chosen to not add a decoder for the random swap, " +
                "as it is incredibly unintuitive and it does not make sense to implement. also ya gotta change the window size to see your new stuff.", 20, 40);
        g.drawString("Type your text here and then click the encoder/decoder.", 20, 255);
        g.drawString("Here is your encoded/decoded text:", 20, 305);
        g.drawString("(Top=RandomSwap,middle=Base64", 20, 325);
        g.drawString("3rd=Binary, bottom=vigenere)", 20, 345);
        String y = BoopBoop.Base64Decode.getString();
        g.drawString(y, 295, 345);
        g.drawString(BoopBoop.RandomSwap.getString(), 295, 325);
        g.drawString(BoopBoop.Binary.getString(), 295, 365);
        g.drawString(BoopBoop.Vigenere.getString(), 295, 385);
    }

    public void init(){
        if (i == 0) {
            tf = new TextField();
            tf.setBounds(70, 260, 250, 30);
        }
        b = new Button("RandomSwap");
        b.setBounds(70,50,250,30);
        boton = new Button("Base64");
        boton.setBounds(70, 100, 250, 30);
        vig = new Button("Vigenere");
        vig.setBounds(70, 200, 250, 30);
        d = new Button("Decode");
        d.setBounds(70,50,250,30);
        eep = new Button("Encode");
        eep.setBounds(70, 100, 250, 30);
        binary = new Button("Binary");
        binary.setBounds(70,150,250,30);
        bencode = new Button("Encode");
        bencode.setBounds(70,100,250,30);
        bdecode = new Button("Decode");
        bdecode.setBounds(70,50,250,30);
        vigdec = new Button("Decode");
        vigdec.setBounds(70,50,250,30);
        vigenc = new Button("Encode");
        vigenc.setBounds(70,100,250,30);
        add(b);add(boton);add(tf);add(binary);add(vig);
        b.addActionListener(this);
        eep.addActionListener(this);
        d.addActionListener(this);
        boton.addActionListener(this);
        binary.addActionListener(this);
        vig.addActionListener(this);
        bencode.addActionListener(this);
        bdecode.addActionListener(this);
        vigenc.addActionListener(this);
        vigdec.addActionListener(this);
        setLayout(null);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() ==  b) {
            x=tf.getText();
            try {
                BoopBoop.RandomSwap.run();
                i++;
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        if (e.getSource() == boton){
            remove(b);
            remove(boton);
            remove(binary);
            remove(vig);
            add(d);
            add(eep);
        }
        if (e.getSource() == d){
            x = tf.getText();
            BoopBoop.Base64Decode.setString("1");
            try {
                BoopBoop.Base64Decode.run();
                remove(d);
                remove(eep);
                i++;
                init();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        if (e.getSource() == eep){
            x = tf.getText();
            BoopBoop.Base64Decode.setString("2");
            try {
                BoopBoop.Base64Decode.run();
                remove(d);
                remove(eep);
                i++;
                init();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
         }
    if (e.getSource() == binary) {
        remove(b);
        remove(boton);
        remove(binary);
        remove(vig);
        add(bencode);
        add(bdecode);
    }
    if (e.getSource() == bencode){
            x=tf.getText();
        try {
            BoopBoop.Binary.toBinary(x);
            remove(bencode);
            remove(bdecode);
            i++;
            init();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        }
     if (e.getSource() == bdecode){
            x=tf.getText();
         try {
             BoopBoop.Binary.toText(x);
             remove(bencode);
             remove(bdecode);
             i++;
             init();
         } catch (IOException e1) {
             e1.printStackTrace();
         }

       }
       if (e.getSource() == vig){
            remove(b);
            remove(boton);
            remove(binary);
            remove(vig);
            add(vigenc);
            add(vigdec);
       }
       if (e.getSource() == vigenc){
            x = tf.getText();
            Vigenere v = new Vigenere();
           try {
               v.encrypt(x, "JACKSONISTHEBESTCODER");
               remove(vigenc);
               remove(vigdec);
               i++;
               init();
           } catch (IOException e1) {
               e1.printStackTrace();
           }
       }
       if (e.getSource() == vigdec){
            x = tf.getText();
            Vigenere v = new Vigenere();
           try {
               v.decrypt(x, "JACKSONISTHEBESTCODER");
               remove(vigenc);
               remove(vigdec);
               i++;
               init();
           } catch (IOException e1) {
               e1.printStackTrace();
           }
       }
    }

}
/*
<applet code="First.class" archive = "your_signed.jar" width="300" height="300">
</applet>
 */
