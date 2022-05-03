package com.calegario.defaultwins.twocombobox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.calegario.defaultwins.*;

public class TwoComboBox extends JFrame {
    private BoxBtn button;
    private JPanel mainPanel;

    public TwoComboBox() {
        this(
            "Sample window with two combo boxes",
            "Sample window with two combo boxes",
            new String[]{"Dog", "Cat", "Furret"},
            new String[]{"Male", "Female"}
        );
    }

    public TwoComboBox(String title, String msg, String[] listOfOptions1,
                       String[] listOfOptions2) {
        this(title, msg, listOfOptions1, listOfOptions2, 256, 192);
    }

    public TwoComboBox(String title, String msg, String[] listOfOptions1,
                       String[] listOfOptions2, int width, int height) {
        super(title);
        button = new BoxBtn("OK", new DefaultActionListener(this));

        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setSize(width, height);
        mainPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(new BoxMsg(msg));
        mainPanel.add(new BoxCombo(listOfOptions1));
        mainPanel.add(new BoxCombo(listOfOptions2));
        mainPanel.add(button);

        add(mainPanel);
        setSize(mainPanel.getWidth(), mainPanel.getHeight());
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setBtnListener(ActionListener listener){
      mainPanel.remove(button);
      String btnAction = button.getButton().getText();
      button = new BoxBtn(btnAction, listener);
      mainPanel.add(button);
    }

    public void showBox(){
      setVisible(true);
    }
}
