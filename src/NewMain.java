
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yuri Trunov
 */
public class NewMain {
    
       
        
           

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        javax.swing.JFrame f =  new javax.swing.JFrame(); 
        //f.setLayout(
        f.setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE );
        f.setSize(640,480);
        MazePanel mazePanel = new MazePanel();
        f.add(mazePanel);
        f.setVisible(true);
    }
    
}
