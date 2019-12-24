package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InteractionChooser implements Window{
    InteractionUser interactionUser;
    InteractionSupport interactionSupport;
    InteractionChooser(InteractionUser forUser, InteractionSupport forSupport){
        interactionUser = forUser;
        interactionSupport = forSupport;
    }
    private JFrame dialog;
    public void enterUser(){
        interactionUser.createUI();
    }
    public void enterSupport(){
        interactionSupport.createUI();
    }
    @Override
    public void createUI() {
        dialog = new JFrame();

        dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel contentPane = new JPanel();
        JPanel buttons_panel = new JPanel();
        dialog.add(contentPane, BorderLayout.PAGE_END);
        dialog.setSize(1000, 700);
        JButton userButton = new JButton("Enter like a user");
        JButton supportButton = new JButton("Enter like a support");
        JLabel label = new JLabel("Choose your interaction");
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        contentPane.add(label, BorderLayout.CENTER);
        buttons_panel.add(userButton, BorderLayout.EAST);
        buttons_panel.add(supportButton, BorderLayout.WEST);
        contentPane.add(buttons_panel, BorderLayout.WEST);
        //dialog.getRootPane().setDefaultButton(submitButton);

        supportButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                enterSupport();
            }
        });

        userButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                enterUser();
            }
        });

        dialog.setVisible(true);
    }
}
