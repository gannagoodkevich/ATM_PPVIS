package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InteractionSupport implements Window{
    public Controller controller;
    private JFrame dialog;

    InteractionSupport(Controller contr){
        controller = contr;
    }

    public void createUI() {
        dialog = new JFrame();
        dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel contentPane = new JPanel();
        JPanel buttons_panel = new JPanel();
        dialog.add(contentPane, BorderLayout.PAGE_END);
        dialog.setSize(1000, 700);
        JButton userButton = new JButton("Add paper");
        JButton supportButton = new JButton("Add money");
        JLabel label = new JLabel("Choose your action");
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        contentPane.add(label, BorderLayout.CENTER);
        buttons_panel.add(userButton, BorderLayout.EAST);
        buttons_panel.add(supportButton, BorderLayout.WEST);
        contentPane.add(buttons_panel, BorderLayout.WEST);
        //dialog.getRootPane().setDefaultButton(submitButton);

        dialog.setVisible(true);
    }
}
