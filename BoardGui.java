import javax.swing.*;

public class BoardGui{
    
    String player;
    int[][] board;
    int[] boardX;
    int[] boardY;
    int[] results;
    JFrame window;
    boolean flag;
    int counter;
    int buttonSize;
    int boardSize = 6;
    JTextField input;
    JButton confirm;
    JButton[] sizeArray = new JButton[boardSize*boardSize];
    public void main(){
        int boardHight = 800;
        int boardWidth = 800;
        buttonSize = 300/boardSize;
        board = new int[boardSize][boardSize];
        boardX = new int[boardSize*100+200];
        boardY = new int[boardSize*100+200];
        results = new int[boardSize*boardSize];
        player = "x"; //which player turn it is
        flag = true;
        counter = 0;

        
    

        window = new JFrame(); // craeting screen
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        window.setLayout(null);
        window.setSize(boardWidth,boardHight);
        window.setLocationRelativeTo(null);
        for(int x = 0; x < boardSize; x++){
            for(int y = 0; y < boardSize; y++,counter++){
                // board[x][y] = 0;
                createButton(x, y,counter);
            }
        }
        counter = 0;
        
       
        input = new JTextField();
        input.setBounds(550,50,100,50);
        window.add(input);
        confirm = new JButton("confirm");
        confirm.setBounds(650,50,100,50);
        window.add(confirm);
        addInputListener(confirm);

        
        window.setVisible(true);
    }
    public void createButton(int x, int y,int counter){
        JButton button = new JButton("");
        window.add(button);
        boardX[x*buttonSize+200] = x;
        boardY[y*buttonSize+150] = y;
        button.setBounds(x*buttonSize+200,y*buttonSize+150,buttonSize,buttonSize);
        AddMouseListener(button);
        sizeArray[counter] = button;
    }
    // checking if a button was pressed
    public void AddMouseListener(JButton Button) {
        Button.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                MouseClicked(Button);
                printboard();
            }
        });
    }
    //shahar
    public void MouseClicked(JButton button) 
    {
        if(button.getText() != "")
            return;

        
        results[8] ++;

        var rec = button.getBounds();  
        
        
        button.setText(player);
        if(player == "x")
        {
            player = "o";
            addToResults(rec.x, rec.y, 9);
        }
        else if(player == "o")
        {
            player = "x";
            addToResults(rec.x, rec.y, 11);
        }
        CheckWin();
    }
    //adding the given input from the MouseClicked method to the results list and the board 2D list
    public void addToResults(int x,int y,int value){
        board[boardY[y]][boardX[x]] = value;
        results[boardY[y] +1] += value;
        results[(boardSize*boardSize-2) - boardX[x]] += value;
        if (boardX[x]+boardY[y] == boardSize-1)
            results[0] += value;
        if (boardX[x] == boardY[y])
            results[boardSize+1] += value;
    }
    //maor
    public void CheckWin()
    {
        for(int i : results){
            if (i == 11*boardSize){
                JOptionPane.showMessageDialog(null, "player O wins");
                window.dispose();
                main();
                break;
                
            }
            else if (i == 9*boardSize){
                JOptionPane.showMessageDialog(null, "player X wins");
                window.dispose();
                main();
                break;
                
            }     
        }
        if (results[8] == boardSize*boardSize){
            JOptionPane.showMessageDialog(null, "no one won");
            window.dispose();
            main();
        }
    }
    public void printboard()
    {
        for(int i = 0;i<boardSize;i++){
            for(int j = 0;j<boardSize;j++)
                System.out.print(board[i][j]);
            System.out.println();
        }
        System.out.println();
    }
    public void addInputListener(JButton Button){
        Button.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                buttonSize = Integer.parseInt(input.getText());
                setSizes();
            }
        });
    }
    public void setSizes(){

    }
} 
/*                (0)
 * (0,0)(0,1)(0,2)(1)
 * (1,0)(1,1)(1,2)(2)
 * (2,0)(2,1)(2,2)(3)
 * (7)   (6)  (5) (4)
 *(8) counter
 */
