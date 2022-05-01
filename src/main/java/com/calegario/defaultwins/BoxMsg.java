package com.calegario.defaultwins;

import com.calegario.defaultwins.ComponentsGap;
import java.awt.*;
import javax.swing.*;

public class BoxMsg extends JPanel {
  public BoxMsg(String msg) {
    JLabel label = new JLabel(msg);
    label.setHorizontalAlignment(JLabel.LEFT);

    setLayout(new FlowLayout());
    setAlignmentX(Component.CENTER_ALIGNMENT);
    setBorder(new ComponentsGap());
    add(label);
  }
}
