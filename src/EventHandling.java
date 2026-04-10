import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandling extends Frame implements ActionListener {
    TextField textField;
    EventHandling(){
        setSize(500,500);
        JButton btn = new JButton("Click here");
        btn.setBounds(50,50,60,10);
        add(btn);
        setLayout(new FlowLayout());
        setVisible(true);
        btn.addActionListener(this);
        textField = new TextField();

    }
    public void actionPerformed(ActionEvent e){
        add(textField);
        textField.setBounds(100,100,200,20);
        textField.setText("Hello event handling");

    }

    public static void main(String[] args) {
        new EventHandling();
    }
}
