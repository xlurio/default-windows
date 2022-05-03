package com.calegario.defaultwins;

import java.awt.*;
import javax.swing.*;

public class BoxCombo extends JPanel {
    private JComboBox combo;

    public BoxCombo(String[] listOfOptions){
        combo = new JComboBox(listOfOptions);

        setLayout(new FlowLayout());
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setBorder(new ComponentsGap());
        add(combo);
    }

    public JComboBox getCombo(){
        return combo;
    }
}
