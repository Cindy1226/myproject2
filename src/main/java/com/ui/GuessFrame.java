package com.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessFrame extends JFrame {
    //fields
    JButton button = new JButton("hi");
    JLabel label = new JLabel("Zzzzzzz");
    //constructions

    public GuessFrame(){
        super();
        setSize(600,400);
        setLocation(300,200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("Hello");
                label.setText("Hello");
            }
        });

        setLayout(new FlowLayout());
        add(button);
        add(label);
        setVisible(true);
    }
    //method






    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();

    }
}
