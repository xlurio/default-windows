package com.calegario.defaultwins;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DefaultActionListener implements ActionListener {
  private JFrame frame;

  public DefaultActionListener(JFrame frame){
    this.frame = frame;
  }

  public void actionPerformed(ActionEvent e) {
    frame.dispose();
  }
}
