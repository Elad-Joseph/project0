import javax.swing.*;
import java.awt.*;

public class main{
    
    public static void main(String[] args){
        int boardHight = 800;
        int boardWidth = 800;
        int buttonHight = 88;
        int buttonWidth = 88;
        int buttonX = 140;
        int buttonY = 120;
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.setSize(boardWidth,boardHight);
        JButton b1 = new JButton("X");
        


        window.add(b1);
        b1.setBounds(buttonX,buttonY,buttonWidth,buttonHight);
        
        
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}