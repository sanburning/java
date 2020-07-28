package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindows extends JFrame
{
    public MyWindows()
    {
        setLocation(650, 200);
        setSize(500, 500);

        GridLayout layout = new GridLayout(1, 2);

        JPanel btnPanel = new JPanel(layout);

        JButton btn1 = new JButton("Button 1");
        btnPanel.add(btn1);

        ActionListener actionListener = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        };

        btn1.addActionListener(actionListener);

        JButton btn2 = new JButton("Button 2");
        btnPanel.add(btn2);

        btn2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                MyWindow2 window = new MyWindow2();
            }
        });

        add(btnPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }
}