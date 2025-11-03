package Entities.HUD_ELEMENTS;

import java.awt.Dimension;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class OPGUI extends JMenuBar{
    
   
    public OPGUI(){
        JMenuBar menubar = new JMenuBar();

        JMenu file_menu = new JMenu("file");
        JMenu edit_menu = new JMenu("edit");
        JMenu help_menu = new JMenu("help");
        JMenu items_menu = new JMenu("items");

        JMenuItem load = new JMenuItem("load");
        JMenuItem save = new JMenuItem("save");
        JMenuItem exit = new JMenuItem("exit");

        menubar.add(file_menu);
        menubar.add(edit_menu);
        menubar.add(help_menu);
        menubar.add(items_menu);

        menubar.setPreferredSize(new Dimension(1000,70));
        menubar.setVisible(true);
    }
}
