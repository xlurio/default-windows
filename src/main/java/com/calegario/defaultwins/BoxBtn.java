package com.calegario.defaultwins;

import com.calegario.defaultwins.ComponentsGap;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BoxBtn extends JPanel{
  private JButton button;

  public BoxBtn(String action, ActionListener listener){
    this.button = new JButton(action);
    this.button.addActionListener(listener);

    setLayout(new FlowLayout());
    setAlignmentX(Component.CENTER_ALIGNMENT);
    setBorder(new ComponentsGap());
    add(this.button);
  }

  public JButton getButton() {
     return button;
  }
}
