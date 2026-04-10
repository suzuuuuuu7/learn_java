import javax.swing.*;
import java.awt.*;
 class swingprogram {
    swingprogram() {
        JFrame f = new JFrame();
        f.setSize(200,200);
        f.setVisible(true);
        f.setTitle("Swing Program");
        JLabel firstName = new JLabel("First name");
        firstName.setBounds(50,0,100,100);
        f.add(firstName);
        JTextField Firstnametf = new JTextField();
        Firstnametf.setBounds(20,0,100,40);
        Firstnametf.setBounds(120,51,100,10);
        f.add(Firstnametf);
        JLabel lastname = new JLabel("Last name");
        lastname.setBounds(50,50,100,100);
        f.add(lastname);
        TextField tflast = new TextField();
        tflast.setBounds(0,0,10,10);
        f.add(tflast);
        JButton btn = new JButton("submit");
        btn.setBounds(10,100,10,0);
        f.add(btn);
        f.setLayout(null);


    }

    public static void main(String[] args) {
        swingprogram s = new swingprogram();
    }

}
