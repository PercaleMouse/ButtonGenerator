
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class MazePanel extends javax.swing.JPanel{

    boolean enableEdit= false; 

    int mazeSize=16;
    int vectorSize = mazeSize*mazeSize;
    JButton[] buttons = new JButton[vectorSize];
    
    ImageIcon wallIcon= new ImageIcon(getClass().getResource("tile_1_2.png"));
    ImageIcon flourIcon= new ImageIcon(getClass().getResource("tile_4_1.png"));
    
    ActionListener al = (ActionEvent e) -> {
        JButton b = (JButton) e.getSource();
        System.out.println(b.getActionCommand());
    };

    MazePanel() {

        setSize(mazeSize*20, mazeSize*20);
        setLayout(new GridLayout(mazeSize, mazeSize, 0, 0));
        for (int i = 0; i < vectorSize; i++) {
            buttons[i] = new JButton();
            buttons[i].addActionListener(al);
            buttons[i].setSize(16, 16);
            buttons[i].setIcon(flourIcon);
            buttons[i].setActionCommand(String.valueOf(i));
            buttons[i].enableInputMethods(false);
            buttons[i].setBorder(null);
            
            add(buttons[i]);
        }

    }
    public void setEditModeON(){
        for (int i = 0; i < vectorSize; i++){
          buttons[i].enableInputMethods(true);
          buttons[i].setBorder(new LineBorder(Color.BLACK));
        }
    }
    
    public void setEditModeOFF(){
        for (int i = 0; i < vectorSize; i++){
          buttons[i].enableInputMethods(false);
          buttons[i].setBorder(null);
        }
    }

}
