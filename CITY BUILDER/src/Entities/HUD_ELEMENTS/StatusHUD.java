package Entities.HUD_ELEMENTS;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import Entities.Tile;

public class StatusHUD extends JOptionPane{
    public int WIDTH = 100;
    public int HEIGHT = 100;
    public ImageIcon HUD_ICON;
    
    public StatusHUD(Tile tile){

        //get imageIcon
        HUD_ICON = new ImageIcon("src/Sprites/thingymajig.png");
        setIcon(HUD_ICON);
        
        //OPTIONS 
        String[] OPTIONS = {"OK","CHANGE TYPE", "DELETE"};
        if(tile.tile_value == 0){    
        int answer = showOptionDialog(null, "TILE: " + tile.tile_value + " TILE TYPE: " + tile.tile_type , "TILE INFORMATION", YES_NO_OPTION,
        messageType, tile.real_tile_Icon, OPTIONS, 0);
    
        if (answer == 0){
            System.out.println("you clicked OK");
        }
        if(answer == 1){
            System.out.println("you clicked CHANGE TYPE");    
        }
        if(answer == 2){
            System.out.println("you clicked DELETE");
        }
    }   
    }
}