package Entities;
import javax.swing.*;

//import java.awt.Cursor;

import java.awt.event.ActionEvent;
import java.awt.*;
public class Residential extends Tile{

    public ImageIcon Residential_cursor;
    public JButton Res_btn;
    public boolean condition;
    public float radius;
    public Residential(Tile tile){

        //TODO increase cursor radius
        
        //TODO change cursor Image
        //Residential_cursor = new ImageIcon("src/Sprites/res zone.png");
        
  
        addActionListener(this);
        //load custom image
        // Toolkit toolkit = Toolkit.getDefaultToolkit();
        // Image Residential_cursor = toolkit.getImage("src/Sprites/res zone.png");

        // Cursor Res_cursor = toolkit.createCustomCursor(Residential_cursor, new Point(0,0), "Residential Cursor");
        
        //TODO actually 
        tile.tile_value = 1; // set tile value to 1
     

        //get button
        new JButton("residential");
        addActionListener(this);
        setBounds(0,0,100,100);
        setBackground(Color.red);
        setForeground(Color.WHITE);
        setVisible(true);
        this.add(Res_btn);
    
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == Res_btn){
            System.out.println("this works");
       }
    }
}


