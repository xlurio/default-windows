package com.calegario.defaultwins;

import java.awt.*;
import javax.swing.*;

public class BoxCombo extends JPanel {
    public BoxCombo(String[] listOfOptions){
        JComboBox combo = new JComboBox(listOfOptions);

        setLayout(new FlowLayout());
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setBorder(new ComponentsGap());
        add(combo);
    }
}
