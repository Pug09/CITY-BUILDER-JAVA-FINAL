package Entities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Tile extends JButton implements ActionListener {

    public int tileplacementX = 0;
    public int tileplacementY = 0;
    public int tile_value = 0; /*value: 0 is grass, value: 1 is Residential */
    public ImageIcon HUD_tile_Icon;
    public ImageIcon real_tile_Icon;
    public String tile_type = "GRASS";
    public Tile(){            
        new JButton("");
        setBounds(tileplacementX -100 ,tileplacementY -100,50,50);
        setLayout(new BorderLayout());

        setBorder(BorderFactory.createEmptyBorder());
        addActionListener(this);
        setPreferredSize(new Dimension(35,35));
        setBackground(new Color(50, 104, 39));//50, 104, 39 TODO tile color
        setFocusable(false);
        //setLayout(new GridLayout());
        setBorder(BorderFactory.createLineBorder(new Color(50, 104, 39)));
        
        //Hud tile icon
        HUD_tile_Icon = new ImageIcon("src/Sprites/grass.png");
        
        // REAL tile icon
        real_tile_Icon = new ImageIcon("src/Sprites/lowRezGRASS.png");
        //capture icon image
        setIcon(real_tile_Icon);
    }
    // public void GrabResidential(/*this function will actually do something...at some point👍*/){
    //     Residential NEW_RESIDENTIAL_ZONE = new Residential();
    // }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this){
            StatusHUD GAME_HUD = new StatusHUD(this);
        }
    }
}
