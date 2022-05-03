package com.calegario.defaultwins.twobtnsbox;

import com.calegario.defaultwins.BoxBtn;
import com.calegario.defaultwins.BoxMsg;
import com.calegario.defaultwins.DefaultActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TwoBtnsBox extends JFrame {
  private int DEFAULT_WIDTH = 256;
  private int DEFAULT_HEIGHT = 128;
  private BoxBtn buttonOne;
  private BoxBtn buttonTwo;
  private JPanel mainPanel;

  public TwoBtnsBox(
    String title, String msg, String btnOneAction, String btnTwoAction,
    int width, int height
  ) {
    super(title);
    this.buttonOne =
      new BoxBtn(btnOneAction, new DefaultActionListener(this));
    this.buttonTwo =
      new BoxBtn(btnTwoAction, new DefaultActionListener(this));

    this.mainPanel = new JPanel();
    this.mainPanel.setLayout(new BoxLayout(this.mainPanel, BoxLayout.Y_AXIS));
    this.mainPanel.setSize(width, height);
    this.mainPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
    this.mainPanel.add(new BoxMsg(msg));
    this.mainPanel.add(this.buttonOne);
    this.mainPanel.add(this.buttonTwo);

    add(this.mainPanel);
    setSize(this.mainPanel.getWidth(), this.mainPanel.getHeight());
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public TwoBtnsBox(
    String title, String msg, String btnOneAction, String btnTwoAction
  ) {
    super(title);
    this.buttonOne =
      new BoxBtn(btnOneAction, new DefaultActionListener(this));
    this.buttonTwo =
      new BoxBtn(btnTwoAction, new DefaultActionListener(this));

    this.mainPanel = new JPanel();
    this.mainPanel.setLayout(new BoxLayout(this.mainPanel, BoxLayout.Y_AXIS));
    this.mainPanel.setSize(this.DEFAULT_WIDTH, this.DEFAULT_WIDTH);
    this.mainPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
    this.mainPanel.add(new BoxMsg(msg));
    this.mainPanel.add(this.buttonOne);
    this.mainPanel.add(this.buttonTwo);

    add(this.mainPanel);
    setSize(this.mainPanel.getWidth(), this.mainPanel.getHeight());
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public TwoBtnsBox() {
    super("Sample Title");
    this.buttonOne =
      new BoxBtn("Button one", new DefaultActionListener(this));
    this.buttonTwo =
      new BoxBtn("Button two", new DefaultActionListener(this));

    this.mainPanel = new JPanel();
    this.mainPanel.setLayout(new BoxLayout(this.mainPanel, BoxLayout.Y_AXIS));
    this.mainPanel.setSize(this.DEFAULT_WIDTH, this.DEFAULT_WIDTH);
    this.mainPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
    this.mainPanel.add(new BoxMsg("Two buttons box"));
    this.mainPanel.add(this.buttonOne);
    this.mainPanel.add(this.buttonTwo);

    add(this.mainPanel);
    setSize(this.mainPanel.getWidth(), this.mainPanel.getHeight());
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void setBtnOneListener(ActionListener listener){
    mainPanel.remove(buttonOne);
    String btnAction = buttonOne.getButton().getText();
    buttonOne = new BoxBtn(btnAction, listener);
    mainPanel.add(buttonOne);
  }

  public void setBtnTwoListener(ActionListener listener){
    mainPanel.remove(buttonTwo);
    String btnAction = buttonTwo.getButton().getText();
    buttonTwo = new BoxBtn(btnAction, listener);
    mainPanel.add(buttonTwo);
  }

  public void showBox(){
    setVisible(true);
  }
}
