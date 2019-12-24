package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaperSetter implements Window{
    private JFrame dialog;
    public Controller controller;

    public PaperSetter(Controller contr) {
        controller = contr;
    }

    private void onOK() {
        // add your code here
        dialog.dispose();
    }

    @Override
    public void createUI() {
        dialog = new JFrame();

        dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel contentPane = new JPanel();
        JPanel buttons_panel = new JPanel();
        dialog.add(contentPane, BorderLayout.PAGE_END);
        dialog.setSize(1000, 700);
        JButton backButton = new JButton("Back");
        JButton submitButton = new JButton("Submit");
        JLabel label = new JLabel("Add paper");
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        contentPane.add(label, BorderLayout.CENTER);
        buttons_panel.add(backButton, BorderLayout.EAST);
        buttons_panel.add(submitButton, BorderLayout.WEST);
        contentPane.add(buttons_panel, BorderLayout.WEST);
        //dialog.getRootPane().setDefaultButton(submitButton);

        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        dialog.setVisible(true);
    }
}
