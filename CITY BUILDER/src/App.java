import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;  

import Entities.*;
public class App extends JFrame implements KeyListener {

    JFrame frame = new JFrame();
    final public int ScreenWidth = 1000;
    final public int ScreenHeight = 1000;
    private ImageIcon game_icon;
    int[][] tileMap = {
            {0, 1, 1, 0, 2},
            {1, 1, 0, 2, 2},
            {0, 0, 1, 1, 0},
            {2, 1, 0, 0, 1}
    };


    public JPanel GAME_FRAME;
    public App() { 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new  FlowLayout());
        frame.setPreferredSize(new Dimension(ScreenWidth,ScreenHeight));
        frame.setTitle("CITY BUILDER");
        frame.setFocusable(true);

        
        GAME_FRAME = new JPanel();
        
        GAME_FRAME.setBackground(new Color(50, 104, 39));
        GAME_FRAME.setBounds(0,0,ScreenWidth * 4,ScreenHeight * 2);
        GAME_FRAME.setVisible(true);
        frame.add(GAME_FRAME);

    
        //get gameIcon
        game_icon = new ImageIcon("src/thingymajig.png");
        frame.setIconImage(game_icon.getImage());

       

        //TILE GENERATION
        for(int y = 0; y <= ScreenWidth * 3; y++){
            Tile tile = new Tile();
            tile.setBounds(0,0, 1,1);
            tile.setLocation(tile.getX(), tile.getY() + 130 * y);


            for(int x = 0; x <= ScreenHeight * 3;  x++){
                tile.setLocation(tile.getX() + 145 * x, tile.getY());
                GAME_FRAME.add(tile, BorderLayout.WEST);
            }
            //tile.setLocation(tile.getX() + 50 * i, tile.getY());

            //tiles tileY = new tiles();
            //tileY.setLocation(tile.getX(), tile.getY() + 50);
            //frame.add(tileY);
            GAME_FRAME.add(tile, BorderLayout.NORTH);
        }

        
        /* TODO Scroll bar

        Scrollbar scrollbarX = new Scrollbar(Scrollbar.HORIZONTAL);
        scrollbarX.setBounds(0,0,ScreenWidth * 4,ScreenHeight * 2);
        scrollbarX.setMaximum(ScreenWidth * 2);
        scrollbarX.setMinimum(0);
        scrollbarX.setValue(0);
        scrollbarX.setVisible(true);
        frame.add(scrollbarX);

        Scrollbar scrollbarY = new Scrollbar(Scrollbar.VERTICAL);
        scrollbarY.setMaximum(ScreenHeight * 2);
        scrollbarY.setMinimum(0);
        scrollbarY.setValue(0);
        frame.add(scrollbarY);

        */

        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
     
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
