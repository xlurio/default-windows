package com.calegario.defaultwins.inputbox;

import com.calegario.defaultwins.BoxBtn;
import com.calegario.defaultwins.BoxMsg;
import com.calegario.defaultwins.DefaultActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InputBox extends JFrame{
  int DEFAULT_WIDTH = 256;
  int DEFAULT_HEIGHT = 128;
  private InputBoxField textField;
  private BoxBtn button;
  private JPanel mainPanel;

  public InputBox(String title, String msg, int width, int height){
    super(title);
    this.textField = new InputBoxField();
    this.button = new BoxBtn("OK", new DefaultActionListener(this));

    this.mainPanel = new JPanel();
    this.mainPanel.setLayout(new BoxLayout(this.mainPanel, BoxLayout.Y_AXIS));
    this.mainPanel.setSize(width, height);
    this.mainPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
    this.mainPanel.setAlignmentY(Component.CENTER_ALIGNMENT);
    this.mainPanel.add(new BoxMsg(msg));
    this.mainPanel.add(this.textField);
    this.mainPanel.add(this.button);

    add(this.mainPanel);
    getRootPane().setDefaultButton(this.button.getButton());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setSize(this.mainPanel.getWidth(), this.mainPanel.getHeight());
  }

  public InputBox(String title, String msg) {
    super(title);
    this.textField = new InputBoxField();
    this.button = new BoxBtn("OK", new DefaultActionListener(this));

    this.mainPanel = new JPanel();
    this.mainPanel.setLayout(new BoxLayout(this.mainPanel, BoxLayout.Y_AXIS));
    this.mainPanel.setSize(this.DEFAULT_WIDTH, this.DEFAULT_HEIGHT);
    this.mainPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
    this.mainPanel.add(new BoxMsg(msg));
    this.mainPanel.add(this.textField);
    this.mainPanel.add(this.button);

    add(this.mainPanel);
    getRootPane().setDefaultButton(this.button.getButton());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setSize(this.mainPanel.getWidth(), this.mainPanel.getHeight());
  }

  public InputBox(){
    super("Sample Title");
    this.textField = new InputBoxField();
    this.button = new BoxBtn("OK", new DefaultActionListener(this));

    this.mainPanel = new JPanel();
    this.mainPanel.setLayout(new BoxLayout(this.mainPanel, BoxLayout.Y_AXIS));
    this.mainPanel.setSize(this.DEFAULT_WIDTH, this.DEFAULT_HEIGHT);
    this.mainPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
    this.mainPanel.add(new BoxMsg("This is a input box"));
    this.mainPanel.add(this.textField);
    this.mainPanel.add(this.button);

    add(this.mainPanel);
    getRootPane().setDefaultButton(this.button.getButton());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setSize(this.mainPanel.getWidth(), this.mainPanel.getHeight());
  }

  public void setBtnListener(ActionListener listener){
    mainPanel.remove(button);
    button = new BoxBtn("OK", listener);
    mainPanel.add(button);
    getRootPane().setDefaultButton(button.getButton());
  }

  public String getUserInput() {
    return textField.getUserInput();
  }

  public void showBox(){
    setVisible(true);
  }
}
