package homework8.mainhomework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("My first window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200, 100, 1000, 500);

        setLayout(new BorderLayout());
        JButton jb = new JButton("OK");
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hey");
            }
        });
        jb.setPreferredSize(new Dimension(200, 100));
        add(jb, BorderLayout.SOUTH);
        jb = new JButton("KO");
        jb.setPreferredSize(new Dimension(50, 25));
        add(jb, BorderLayout.NORTH);

        setVisible(true);
    }
}
