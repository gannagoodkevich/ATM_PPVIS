package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinEnter implements Window{
    Controller controller;
    private JFrame dialog;

    PinEnter(Controller contr){
        controller = contr;
    }

    public void onCheck(){

    }

    @Override
    public void createUI() {
        dialog = new JFrame();

        dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel contentPane = new JPanel();
        JPanel buttons_panel = new JPanel();
        dialog.add(contentPane, BorderLayout.PAGE_END);
        dialog.setSize(1000, 700);
        JButton nextButton = new JButton("Next");
        JButton backButton = new JButton("Back");
        JLabel label = new JLabel("Enter your PIN");
        JTextField textField = new JTextField();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        contentPane.add(label, BorderLayout.CENTER);
        buttons_panel.add(nextButton, BorderLayout.EAST);
        buttons_panel.add(backButton, BorderLayout.WEST);
        contentPane.add(buttons_panel, BorderLayout.WEST);
        //dialog.getRootPane().setDefaultButton(submitButton);

        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCheck();
            }
        });

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        dialog.setVisible(true);
    }
}
