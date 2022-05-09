package com.calegario.defaultwins.threebtnsbox;

import com.calegario.defaultwins.BoxBtn;
import com.calegario.defaultwins.BoxMsg;
import com.calegario.defaultwins.DefaultActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ThreeBtnsBox extends JFrame {
  private BoxBtn buttonOne;
  private BoxBtn buttonTwo;
  private BoxBtn buttonThree;
  private JPanel mainPanel;

  public ThreeBtnsBox(){
      this("Sample Title", "Three buttons box", true, "Button one",
           "Button two", "Button three", 256, 128);
  }

  public ThreeBtnsBox(
      String title, String msg, boolean doExitOnClose, String btnOneAction,
      String btnTwoAction, String btnThreeAction
  ) {
      this(title, msg, doExitOnClose, btnOneAction, btnTwoAction,
           btnThreeAction, 256, 128);
  }

  public ThreeBtnsBox(
    String title, String msg, boolean doExitOnClose, String btnOneAction,
    String btnTwoAction, String btnThreeAction, int width, int height
  ) {
    super(title);
    this.buttonOne =
      new BoxBtn(btnOneAction, new DefaultActionListener(this));
    this.buttonTwo =
      new BoxBtn(btnTwoAction, new DefaultActionListener(this));
    this.buttonThree =
      new BoxBtn(btnThreeAction, new DefaultActionListener(this));

    this.mainPanel = new JPanel();
    this.mainPanel.setLayout(new BoxLayout(this.mainPanel, BoxLayout.Y_AXIS));
    this.mainPanel.setSize(width, height);
    this.mainPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
    this.mainPanel.add(new BoxMsg(msg));
    this.mainPanel.add(this.buttonOne);
    this.mainPanel.add(this.buttonTwo);
    this.mainPanel.add(this.buttonThree);

    add(this.mainPanel);
    setSize(this.mainPanel.getWidth(), this.mainPanel.getHeight());
    setResizable(false);
    if (doExitOnClose) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } else {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
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

  public void setBtnThreeListener(ActionListener listener){
    mainPanel.remove(buttonThree);
    String btnAction = buttonThree.getButton().getText();
    buttonThree = new BoxBtn(btnAction, listener);
    mainPanel.add(buttonThree);
  }

  public void showBox(){
    setVisible(true);
  }

  public BoxBtn getBtnThree(){
      return buttonThree;
  }

  public void setBtnThree(BoxBtn newBtn){
      mainPanel.remove(buttonThree);
      buttonThree = newBtn;
      mainPanel.add(buttonThree);
      mainPanel.revalidate();
      mainPanel.repaint();
  }
}
