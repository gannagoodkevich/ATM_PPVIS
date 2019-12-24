package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InteractionUser implements Window{
    Controller controller;
    ArrayList<Window> windows;
    private JFrame dialog;

    InteractionUser(Controller contr, ArrayList<Window> wind){
        controller = contr;
        windows = wind;
    }

    @Override
    public void createUI() {
        dialog = new JFrame();

        dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel contentPane = new JPanel();
        JPanel buttons_panel = new JPanel();
        dialog.add(contentPane, BorderLayout.PAGE_END);
        dialog.setSize(1000, 700);
        JButton userButton = new JButton("OK");
        JLabel label = new JLabel("Entered like a user");
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        contentPane.add(label, BorderLayout.CENTER);
        buttons_panel.add(userButton, BorderLayout.EAST);
        contentPane.add(buttons_panel, BorderLayout.WEST);
        //dialog.getRootPane().setDefaultButton(submitButton);

        userButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                windows.get(0).createUI();

            }
        });

        dialog.setVisible(true);
    }
}
