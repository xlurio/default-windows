package com.calegario.defaultwins.msgbox;

import com.calegario.defaultwins.BoxBtn;
import com.calegario.defaultwins.BoxMsg;
import com.calegario.defaultwins.DefaultActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MsgBox extends JFrame {
  private int DEFAULT_WIDTH = 256;
  private int DEFAULT_HEIGHT = 128;
  private BoxBtn button;

  public MsgBox(String title, String msg, int width, int height) {
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
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public MsgBox(String title, String msg) {
    super(title);
    this.button = new BoxBtn("OK", new DefaultActionListener(this));

    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
    mainPanel.setSize(this.DEFAULT_WIDTH, this.DEFAULT_HEIGHT);
    mainPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
    mainPanel.add(new BoxMsg(msg));
    mainPanel.add(this.button);

    add(mainPanel);
    getRootPane().setDefaultButton(this.button.getButton());
    setSize(mainPanel.getWidth(), mainPanel.getHeight());
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public MsgBox() {
    super("Sample Title");
    this.button = new BoxBtn("OK", new DefaultActionListener(this));

    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
    mainPanel.setSize(this.DEFAULT_WIDTH, this.DEFAULT_HEIGHT);
    mainPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
    mainPanel.add(new BoxMsg("This is a message box!"));
    mainPanel.add(this.button);

    add(mainPanel);
    getRootPane().setDefaultButton(this.button.getButton());
    setSize(mainPanel.getWidth(), mainPanel.getHeight());
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
}
