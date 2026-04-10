import javax.swing.*;
import java.awt.*;

public class Modeless {
     public static void main(String[] args) {
         JFrame f = new JFrame("Modeless dialog");
         f.setSize(600,600);
         f.setVisible(true);
         f.setLayout(new FlowLayout());
         JButton btn = new JButton("open modeless dialog");
         f.add(btn);
         btn.setBounds(50,50,50,20);
         btn.addActionListener(e->{
             JDialog dialog = new JDialog(f,"modeless dialog dialog",false);
             dialog.setSize(200,200);
             dialog.setLayout(new FlowLayout());
             dialog.setVisible(true);
             dialog.setLocationRelativeTo(f);
             JLabel label = new JLabel("Welcome to modeless dialog");
             label.setBounds(100,100,60,30);
             dialog.add(label);
             JButton cbtn = new JButton("Close dialog");
             cbtn.addActionListener(ev-> dialog.dispose());
             dialog.add(cbtn);
             cbtn.setBounds(100,60,50,20);
         });
     }
}
