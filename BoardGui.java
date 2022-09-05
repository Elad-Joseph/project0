import javax.swing.*;

public class BoardGui{
    
    public void main(){
        int boardHight = 800;
        int boardWidth = 800;
        int buttonHight = 100;
        int buttonWidth = 100;
        String player = "x";

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.setSize(boardWidth,boardHight);
        window.setLocationRelativeTo(null);

        JButton b1 = new JButton("");
        JButton b2 = new JButton("");
        JButton b3 = new JButton("");
        JButton b4 = new JButton("");
        JButton b5 = new JButton("");
        JButton b6 = new JButton("");
        JButton b7 = new JButton("");
        JButton b8 = new JButton("");
        JButton b9 = new JButton("");

        window.add(b1);
        window.add(b2);
        window.add(b3);
        window.add(b4);
        window.add(b5);
        window.add(b6);
        window.add(b7);
        window.add(b8);
        window.add(b9);

        b1.setBounds(200,150,buttonWidth,buttonHight);
        b2.setBounds(350,150,buttonWidth,buttonHight);
        b3.setBounds(500,150,buttonWidth,buttonHight);
        b4.setBounds(200,350,buttonWidth,buttonHight);
        b5.setBounds(350,350,buttonWidth,buttonHight);
        b6.setBounds(500,350,buttonWidth,buttonHight);
        b7.setBounds(200,550,buttonWidth,buttonHight);
        b8.setBounds(350,550,buttonWidth,buttonHight);
        b9.setBounds(500,550,buttonWidth,buttonHight);
        
        
    
        while(true){
            if(player == "x"){
                b1.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b1.setText("X");
                }                
            }
            );
            
            b2.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b2.setText("X");
                }                
            });
            b3.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b3.setText("X");
                }
            });
            b4.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b4.setText("X");
                }
            }); 
            player = "o";   
        }
        else{
            b1.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b1.setText("O");
                }                
            }
            ); 
            b2.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b2.setText("O");
                }                
            });
            b3.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b3.setText("O");
                }
            });
            b4.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseClicked(java.awt.event.MouseEvent evt){
                    b4.setText("O");
                }
            });
            player = "x";
        }


           
            

            window.setVisible(true);
        }
        
        
            
    

        
        
    }
}