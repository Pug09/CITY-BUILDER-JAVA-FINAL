package Entities.HUD_ELEMENTS;

import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class OPGUI extends JMenuBar{
    
    //JMenuBar menubar = new JMenuBar();
    private ImageIcon res, com, Indus, road,FD,PD,Demolish, grass;


    public OPGUI(){
       
        
        //grab menu's
        JMenu file_menu = new JMenu("file");
        JMenu edit_menu = new JMenu("edit");
        JMenu help_menu = new JMenu("help");
        JMenu items_menu = new JMenu("utilities");

        //file menu
        JMenuItem load = new JMenuItem("load");
        JMenuItem save = new JMenuItem("save");
        JMenuItem exit = new JMenuItem("exit");

    
        file_menu.add(load);
        file_menu.add(save);
        file_menu.add(exit);
        //------------------

        //TODO ITEM MENU
        JMenuItem Residential = new JMenuItem("Residential");
        JMenuItem Comercial = new JMenuItem("commercial");
        JMenuItem Industrial = new JMenuItem("Industrial");
        JMenuItem roads = new JMenuItem("Road");
        JMenuItem FireD = new JMenuItem("Fire Department");
        JMenuItem PopoD = new JMenuItem("Police Department");
        JMenuItem Demolisioner = new JMenuItem("Demolish");
        JMenuItem grasses = new JMenuItem("grass");

        items_menu.add(Residential);
        items_menu.add(Comercial);
        items_menu.add(Industrial);
        items_menu.add(roads);
        items_menu.add(FireD);
        items_menu.add(PopoD);
        items_menu.add(Demolisioner);
        items_menu.add(grasses);

        //get Icons
        
        /*TODO get tile sprites!!! */
        road = new ImageIcon("src/Sprites/lowRezROAD.png");
        roads.setIcon(road);

        grass = new ImageIcon("src/Sprites/lowRezGRASS.png");
        grasses.setIcon(grass);

        FD = new ImageIcon("src/Sprites/lowRezFD.png");
        FireD.setIcon(FD);

        PD = new ImageIcon("src/Sprites/lowRezPD.png");
        PopoD.setIcon(PD);

        Demolish = new ImageIcon("src/Sprites/lowRezbomb.png");
        Demolisioner.setIcon(Demolish);

        //add menu's
        this.add(file_menu);
        this.add(edit_menu);
        this.add(help_menu);
        this.add(items_menu);

        this.setVisible(true);
    }
}
