package Entities.HUD_ELEMENTS;

import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class togglebtn extends JButton implements ActionListener{

    public togglebtn(){
        setPreferredSize(new Dimension(25,25));
        setText("TOGGLE");
        addActionListener(this);
        setBackground(new Color(160,160,160));
        setForeground(Color.WHITE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
