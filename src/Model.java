import javax.swing.*;
import java.awt.*;
 class Model {
    public static void main(String[] args) {
        JFrame f = new JFrame("Model dialog");
        f.setVisible(true);
        f.setSize(400,300);
        f.setLayout(null);
        JButton btn = new JButton("Open model diaglog");
        f.add(btn);
        btn.setBounds(50,20,100,30);
        btn.addActionListener(e->{
            JDialog dialog = new JDialog(f,"Model dialog",true);
            dialog.setSize(300,200);
            JLabel label = new JLabel("This is model dialog");
            label.setBounds(50,100,100,20);
            dialog.add(label);
            dialog.setVisible(true);
            dialog.setLayout(null);
            dialog.setLocationRelativeTo(f);
        });
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
