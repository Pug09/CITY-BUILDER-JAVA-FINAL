import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;  
import Entities.HUD_ELEMENTS.togglebtn;
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
        frame.setLayout(new  GridLayout());
        frame.setPreferredSize(new Dimension(ScreenWidth,ScreenHeight));
        frame.setTitle("CITY BUILDER");
        frame.setFocusable(true);

        
        GAME_FRAME = new JPanel();
        
        GAME_FRAME.setBackground(new Color(50, 104, 39));
        GAME_FRAME.setPreferredSize(new Dimension(ScreenWidth * 2, ScreenHeight * 5));
        GAME_FRAME.setBounds(0,0,ScreenWidth * 2,ScreenHeight * 4);
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
           
            GAME_FRAME.add(tile, BorderLayout.NORTH);
        }

        //grab toggle button
        togglebtn toggle = new togglebtn();
        GAME_FRAME.add(toggle);
        

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
