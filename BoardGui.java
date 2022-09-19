import javax.swing.*;

public class BoardGui{
    
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    String player;

    public void main(){
        int boardHight = 800;
        int boardWidth = 800;
        int buttonHight = 100;
        int buttonWidth = 100;
        player = "x"; //which player turn it is

        JFrame window = new JFrame(); // craeting screen
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        window.setLayout(null);
        window.setSize(boardWidth,boardHight);
        window.setLocationRelativeTo(null);

        // creating buttons
        b1 = new JButton("");
        b2 = new JButton("");
        b3 = new JButton("");
        b4 = new JButton("");
        b5 = new JButton("");
        b6 = new JButton("");
        b7 = new JButton("");
        b8 = new JButton("");
        b9 = new JButton("");

        // adding the buttons to screen
        window.add(b1);
        window.add(b2);
        window.add(b3);
        window.add(b4);
        window.add(b5);
        window.add(b6);
        window.add(b7);
        window.add(b8);
        window.add(b9);

        // putting the bounds of the buttons
        b1.setBounds(200,150,buttonWidth,buttonHight);
        b2.setBounds(350,150,buttonWidth,buttonHight);
        b3.setBounds(500,150,buttonWidth,buttonHight);
        b4.setBounds(200,350,buttonWidth,buttonHight);
        b5.setBounds(350,350,buttonWidth,buttonHight);
        b6.setBounds(500,350,buttonWidth,buttonHight);
        b7.setBounds(200,550,buttonWidth,buttonHight);
        b8.setBounds(350,550,buttonWidth,buttonHight);
        b9.setBounds(500,550,buttonWidth,buttonHight);
        
        AddMouseListener(b1);
        AddMouseListener(b2);
        AddMouseListener(b3);
        AddMouseListener(b4);
        AddMouseListener(b5);
        AddMouseListener(b6);
        AddMouseListener(b7);
        AddMouseListener(b8);
        AddMouseListener(b9);

        window.setVisible(true);
    }

    public void AddMouseListener(JButton Button) {
        Button.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                MouseClicked(Button);
            }
        });
    }

    public void MouseClicked(JButton button) 
    {
        if(button.getText() != "")
            return;
        button.setText(player);
        if(player == "x")
            player = "o";
        else if(player == "o")
            player = "x";
        }
    public void CheckWin(){

    }        
} 
/*
 * (0,0)(0,1)(0,2)
 * (1,0)(1,1)(1,2)
 * (2,0)(2,1)(2,2)
 */