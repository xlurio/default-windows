package com.calegario.defaultwins.inputbox;

import com.calegario.defaultwins.ComponentsGap;
import javax.swing.*;
import java.awt.*;

public class InputBoxField extends JPanel {
  JTextField textField;

  public InputBoxField(){
      this.textField = new JTextField(20);
      textField.setHorizontalAlignment(JTextField.LEFT);
      textField.setPreferredSize(new Dimension(192, 20));

      setLayout(new FlowLayout());
      setAlignmentX(Component.CENTER_ALIGNMENT);
      add(textField);
      setBorder(new ComponentsGap());
  }

  public String getUserInput(){
    return textField.getText();
  }
}
