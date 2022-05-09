package com.calegario.defaultwins.msgbox;

import com.calegario.defaultwins.BoxBtn;
import com.calegario.defaultwins.BoxMsg;
import com.calegario.defaultwins.DefaultActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MsgBox extends JFrame {
  private BoxBtn button;

    public MsgBox() {
        this("Sample Title", "This is a message box!", true, 256, 128);
    }

    public MsgBox(String title, String msg, boolean doExitOnClose) {
        this(title, msg, doExitOnClose, 256, 128);
    }

    public MsgBox(String title, String msg, boolean doExitOnClose, int width, int height) {
        super(title);
        this.button = new BoxBtn("OK", new DefaultActionListener(this));

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setSize(width, height);
        mainPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(new BoxMsg(msg));
        mainPanel.add(this.button);

        add(mainPanel);
        getRootPane().setDefaultButton(this.button.getButton());
        setSize(mainPanel.getWidth(), mainPanel.getHeight());
        setResizable(false);
        if (doExitOnClose) {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } else {
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
        setVisible(true);
    }
}
