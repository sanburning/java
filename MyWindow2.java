package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow2 extends JFrame
{
    public MyWindow2()
    {
        setLocation(650, 200);
        setSize(250, 250);

        GridLayout layout = new GridLayout(1, 2);

        JPanel btnPanel = new JPanel(layout);

        JButton btn2 = new JButton("Button 2");
        btnPanel.add(btn2);

        btn2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {

            }
        });

        add(btnPanel, BorderLayout.SOUTH);

        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setVisible(true);

    }

}
