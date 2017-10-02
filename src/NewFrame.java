
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class NewFrame extends javax.swing.JFrame {

    boolean enableEdit= false; 
    
    JButton[] buttons = new JButton[256];
    ImageIcon wallIcon= new ImageIcon(getClass().getResource("tile_1_2.png"));
    ImageIcon flourIcon= new ImageIcon(getClass().getResource("tile_4_1.png"));
    
    ActionListener al = (ActionEvent e) -> {
        JButton b = (JButton) e.getSource();
        System.out.println(b.getActionCommand());
    };

    NewFrame() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(320, 320);
        setLayout(new GridLayout(16, 16, 0, 0));
        for (int i = 0; i < 256; i++) {
            buttons[i] = new JButton();
            buttons[i].addActionListener(al);
            buttons[i].setSize(16, 16);
            buttons[i].setIcon(flourIcon);
            buttons[i].setActionCommand(String.valueOf(i));

            buttons[i].setBorder(null);
            add(buttons[i]);
        }

    }

}
